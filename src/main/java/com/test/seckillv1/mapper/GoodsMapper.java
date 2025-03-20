package com.test.seckillv1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.seckillv1.pojo.Goods;
import com.test.seckillv1.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 * mybatis-plus-generator v3.4.1
 */
public interface GoodsMapper extends BaseMapper<Goods> {

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
     * @param goodsId
     */
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
