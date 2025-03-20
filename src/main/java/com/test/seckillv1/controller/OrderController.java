package com.test.seckillv1.controller;


import com.test.seckillv1.pojo.User;
import com.test.seckillv1.service.IOrderService;
import com.test.seckillv1.vo.OrderDetailVo;
import com.test.seckillv1.vo.RespBean;
import com.test.seckillv1.vo.RespBeanEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 * mybatis-plus-generator v3.4.1
 */
@Controller
@RequestMapping("//order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    /**
     * 功能描述: 订单详情
     *
     * @param:
     * @return:
     */
    @RequestMapping("/detail")
    @ResponseBody
    public RespBean detail(User user, Long orderId) {
        if (user == null) {
            return RespBean.error(RespBeanEnum.SESSION_ERROR);
        }
        OrderDetailVo detail = orderService.detail(orderId);
        return RespBean.success(detail);
    }
}
