package com.test.seckillv1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.seckillv1.pojo.Order;
import com.test.seckillv1.pojo.User;
import com.test.seckillv1.vo.GoodsVo;
import com.test.seckillv1.vo.OrderDetailVo;

/**
 * <p>
 *  服务类
 * </p>
 * mybatis-plus-generator v3.4.1
 */
public interface IOrderService extends IService<Order> {

    /**
     * 功能描述: 秒杀
     *
     * @param:
     * @return:
     *
     */
    Order seckill(User user, GoodsVo goods);

    OrderDetailVo detail(Long orderId);


    /**
     * 功能描述: 订单详情
     *
     * @param:
     * @return:
     *
     */
    // OrderDetailVo detail(Long orderId);

    /**
     * 功能描述: 获取秒杀地址
     *
     * @param:
     * @return:
     *
     */
    String createPath(User user, Long goodsId);

    /**
     * 校验秒杀地址
     * @param user
     * @param goodsId
     * @param path
     * @return
     */
    boolean checkPath(User user, Long goodsId, String path);


    /**
     * 功能描述: 校验验证码
     *
     * @param:
     * @return:
     */
    boolean checkCaptcha(User user, Long goodsId, String captcha);
}
