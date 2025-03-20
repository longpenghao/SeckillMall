package com.test.seckillv1.utils;


import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;


/**
 * MD5工具类
 */
@Component
public class MD5Util {

    public static String md5(String src){
        return DigestUtils.md5DigestAsHex(src.getBytes());
    }

    // salt
    private static final String salt="1a2b3c4d";


    // inputPass to fromPass，前端加密，将输入转换成后端接收的数据，即form表单提交的数据
    public static String inputPassToFromPass(String inputPass){
        String str = "" +salt.charAt(0)+salt.charAt(2)+inputPass+salt.charAt(5)+salt.charAt(4);
        return md5(str);
    }

    // formPass to dbPass，后端加密，将form表单提交的数据转换成数据库存储的数据
    public static String formPassToDBPass(String formPass,String salt){
        String str = "" +salt.charAt(0)+salt.charAt(2)+formPass+salt.charAt(5)+salt.charAt(4);
        return md5(str);
    }

    // inputPass to dbPass，前端加密，后端加密，将输入转换成数据库存储的数据
    public static String inputPassToDBPass(String inputPass,String salt){
        String fromPass = inputPassToFromPass(inputPass);
        String dbPass = formPassToDBPass(fromPass, salt);
        return dbPass;
    }


    public static void main(String[] args) {
        // d3b1294a61a07da9b49b6e22b2cbd7f9
        System.out.println(inputPassToFromPass("123456"));
        System.out.println(formPassToDBPass("d3b1294a61a07da9b49b6e22b2cbd7f9","1a2b3c4d"));
        System.out.println(inputPassToDBPass("123456","1a2b3c4d"));
    }
}
