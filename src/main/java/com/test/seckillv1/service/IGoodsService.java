package com.test.seckillv1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.seckillv1.pojo.Goods;
import com.test.seckillv1.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 * mybatis-plus-generator v3.4.1
 */
public interface IGoodsService extends IService<Goods> {


    /**
     * 功能描述: 获取商品列表
     *
     * @param:
     * @return:
     *
     */
    List<GoodsVo> findGoodsVo();


    /**
     * 功能描述: 获取商品详情
     *
     * @param:
     * @return:
     *
     */
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
