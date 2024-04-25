package com.atguigu.cloud.controller;

import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.service.StorageService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: administrator
 * @Date: 2024/4/23 22:19
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public ResultData decrease(Long productId,Integer count){
        storageService.decrease(productId, count);
        return ResultData.success("扣减库存成功!");
    }
}
