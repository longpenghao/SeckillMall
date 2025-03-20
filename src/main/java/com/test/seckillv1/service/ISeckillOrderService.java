package com.test.seckillv1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.seckillv1.pojo.SeckillOrder;
import com.test.seckillv1.pojo.User;

/**
 * <p>
 *  服务类
 * </p>
 * mybatis-plus-generator v3.4.1
 * @author zhoubin
 * @since 2025-03-18
 */
public interface ISeckillOrderService extends IService<SeckillOrder> {

    /**
     * 功能描述: 获取秒杀结果
     *
     * @param:
     * @return:orderId:成功，-1：秒杀失败，0：排队中
     */
    Long getResult(User user, Long goodsId);
}
