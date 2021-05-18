package com.ygl.nacos.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 修改密码
 * @author yangaoling
 * @version 1.0
 * @date 2021/4/30 16:29
 */
public class PasswordEncoderUtil {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
