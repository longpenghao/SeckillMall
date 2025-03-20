package com.test.seckillv1.vo;

import com.test.seckillv1.pojo.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单详情返回对象
 * <p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailVo {
	private Order order;

	private GoodsVo goodsVo;
}
