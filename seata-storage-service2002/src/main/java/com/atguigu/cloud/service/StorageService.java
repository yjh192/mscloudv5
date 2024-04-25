package com.atguigu.cloud.service;

/**
 * @Author: administrator
 * @Date: 2024/4/23 22:06
 */
public interface StorageService {
    /**
     *
     * 扣减库存
     */

    void decrease(Long productId, Integer count);
}
