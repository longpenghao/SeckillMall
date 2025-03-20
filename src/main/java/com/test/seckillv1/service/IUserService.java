package com.test.seckillv1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.seckillv1.pojo.User;
import com.test.seckillv1.vo.LoginVo;
import com.test.seckillv1.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 * mybatis-plus-generator v3.4.1
 * @author
 * @since 2025-03-17
 */
public interface IUserService extends IService<User> {

    /**
     * 功能描述: 登录
     *
     * @param:
     * @return:
     * @since: 1.0.0
     */
    RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);


    /**
     * 功能描述: 根据cookie获取用户
     *
     * @param:
     * @return:
     */
    User getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response);


    /**
     * 功能描述:
     *
     * @param: 更新密码
     * @return:
     */
    RespBean updatePassword(String userTicket, String password, HttpServletRequest request,
                            HttpServletResponse response);
}
