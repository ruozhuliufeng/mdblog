package cn.aixuxi.mdblog.controller;

import java.util.Arrays;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.aixuxi.mdblog.entity.UpdateRecodEntity;
import cn.aixuxi.mdblog.service.UpdateRecodService;
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
@RequestMapping("mdblog/updaterecod")
public class UpdateRecodController {
    @Autowired
    private UpdateRecodService updateRecodService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = updateRecodService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{recordId}")
    public R info(@PathVariable("recordId") Integer recordId){
		UpdateRecodEntity updateRecod = updateRecodService.getById(recordId);

        return R.ok().put("updateRecod", updateRecod);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UpdateRecodEntity updateRecod){
		updateRecodService.save(updateRecod);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UpdateRecodEntity updateRecod){
		updateRecodService.updateById(updateRecod);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] recordIds){
		updateRecodService.removeByIds(Arrays.asList(recordIds));

        return R.ok();
    }

}
