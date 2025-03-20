package com.test.seckillv1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.seckillv1.mapper.GoodsMapper;
import com.test.seckillv1.pojo.Goods;
import com.test.seckillv1.service.IGoodsService;
import com.test.seckillv1.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 * mybatis-plus-generator v3.4.1
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 功能描述: 获取商品列表
     *
     * @param:
     * @return:
     */
    @Override
    public List<GoodsVo> findGoodsVo() {
        return goodsMapper.findGoodsVo();
    }



    /**
     * 功能描述: 获取商品详情
     *
     * @param:
     * @return:
     */
    @Override
    public GoodsVo findGoodsVoByGoodsId(Long goodsId) {
        return goodsMapper.findGoodsVoByGoodsId(goodsId);
    }
}
