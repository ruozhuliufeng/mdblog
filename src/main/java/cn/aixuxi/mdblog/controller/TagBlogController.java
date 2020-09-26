package cn.aixuxi.mdblog.controller;

import java.util.Arrays;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.aixuxi.mdblog.entity.TagBlogEntity;
import cn.aixuxi.mdblog.service.TagBlogService;
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
@RequestMapping("mdblog/tagblog")
public class TagBlogController {
    @Autowired
    private TagBlogService tagBlogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tagBlogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{tagBlogId}")
    public R info(@PathVariable("tagBlogId") Integer tagBlogId){
		TagBlogEntity tagBlog = tagBlogService.getById(tagBlogId);

        return R.ok().put("tagBlog", tagBlog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TagBlogEntity tagBlog){
		tagBlogService.save(tagBlog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TagBlogEntity tagBlog){
		tagBlogService.updateById(tagBlog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] tagBlogIds){
		tagBlogService.removeByIds(Arrays.asList(tagBlogIds));

        return R.ok();
    }

}
