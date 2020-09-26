package cn.aixuxi.mdblog.controller;

import java.util.Arrays;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.aixuxi.mdblog.entity.TagEntity;
import cn.aixuxi.mdblog.service.TagService;
import cn.aixuxi.mdblog.util.PageUtils;
import cn.aixuxi.mdblog.util.R;



/**
 * 
 *
 * @author ruozhuliufeng
 * @email ruozhuliufeng@aixuxi.cn
 * @date 2020-09-26 13:46:16
 */
@RestController
@RequestMapping("mdblog/tag")
public class TagController {
    @Autowired
    private TagService tagService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tagService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{tagId}")
    public R info(@PathVariable("tagId") Integer tagId){
		TagEntity tag = tagService.getById(tagId);

        return R.ok().put("tag", tag);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TagEntity tag){
		tagService.save(tag);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TagEntity tag){
		tagService.updateById(tag);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] tagIds){
		tagService.removeByIds(Arrays.asList(tagIds));

        return R.ok();
    }

}
