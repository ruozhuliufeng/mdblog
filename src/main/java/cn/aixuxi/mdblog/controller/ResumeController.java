package cn.aixuxi.mdblog.controller;

import java.util.Arrays;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.aixuxi.mdblog.entity.ResumeEntity;
import cn.aixuxi.mdblog.service.ResumeService;
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
@RequestMapping("mdblog/resume")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = resumeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{resumeId}")
    public R info(@PathVariable("resumeId") Integer resumeId){
		ResumeEntity resume = resumeService.getById(resumeId);

        return R.ok().put("resume", resume);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ResumeEntity resume){
		resumeService.save(resume);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ResumeEntity resume){
		resumeService.updateById(resume);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] resumeIds){
		resumeService.removeByIds(Arrays.asList(resumeIds));

        return R.ok();
    }

}
