package cn.aixuxi.mdblog.controller;

import java.util.Arrays;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.aixuxi.mdblog.entity.BlogEntity;
import cn.aixuxi.mdblog.service.BlogService;
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
@RequestMapping("mdblog/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = blogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{blogId}")
    public R info(@PathVariable("blogId") Integer blogId){
		BlogEntity blog = blogService.getById(blogId);

        return R.ok().put("blog", blog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BlogEntity blog){
		blogService.save(blog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BlogEntity blog){
		blogService.updateById(blog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] blogIds){
		blogService.removeByIds(Arrays.asList(blogIds));

        return R.ok();
    }

}
