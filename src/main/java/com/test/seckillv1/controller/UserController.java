package com.test.seckillv1.controller;


import com.test.seckillv1.pojo.User;
import com.test.seckillv1.rabbitmq.MQSender;
import com.test.seckillv1.vo.RespBean;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private MQSender mqSender;
    /**
     * 功能描述: 用户信息(测试)
     *
     * @param:
     * @return:
     */
    @RequestMapping("/info")
    @ResponseBody
    public RespBean info(User user) {
        return RespBean.success(user);
    }

    // /**
    //  * 功能描述: 测试发送RabbitMQ消息
    //  *
    //  * @param:
    //  * @return:
    //  */
    // @RequestMapping("/mq")
    // @ResponseBody
    // public void mq() {
    // 	mqSender.send("Hello");
    // }
    //
    //
    // /**
    //  * 功能描述: Fanout模式
    //  *
    //  * @param:
    //  * @return:
    //  */
    // @RequestMapping("/mq/fanout")
    // @ResponseBody
    // public void mq01() {
    // 	mqSender.send("Hello");
    // }
    //
    //
    // /**
    //  * 功能描述: Direct模式
    //  *
    //  * @param:
    //  * @return:
    //  */
    // @RequestMapping("/mq/direct01")
    // @ResponseBody
    // public void mq02() {
    // 	mqSender.send01("Hello,Red");
    // }
    //
    // /**
    //  * 功能描述: Direct模式
    //  *
    //  * @param:
    //  * @return:
    //  */
    // @RequestMapping("/mq/direct02")
    // @ResponseBody
    // public void mq03() {
    // 	mqSender.send02("Hello,Green");
    // }
    // //
    // //
    // /**
    //  * 功能描述: Topic模式
    //  *
    //  * @param:
    //  * @return:
    //  */
    // @RequestMapping("/mq/topic01")
    // @ResponseBody
    // public void mq04() {
    // 	mqSender.send03("Hello,Red");
    // }
    //
    //
    // /**
    //  * 功能描述: Topic模式
    //  *
    //  * @param:
    //  * @return:
    //  */
    // @RequestMapping("/mq/topic02")
    // @ResponseBody
    // public void mq05() {
    // 	mqSender.send04("Hello,Green");
    // }
    // //
    // //
    // /**
    //  * 功能描述: Header模式
    //  *
    //  * @param:
    //  * @return:
    //  */
    // @RequestMapping("/mq/header01")
    // @ResponseBody
    // public void mq06() {
    // 	mqSender.send05("Hello,Header01");
    // }
    //
    // /**
    //  * 功能描述: Header模式
    //  *
    //  * @param:
    //  * @return:
    //  */
    // @RequestMapping("/mq/header02")
    // @ResponseBody
    // public void mq07() {
    // 	mqSender.send06("Hello,Header02");
    // }
}
