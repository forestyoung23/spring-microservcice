package com.forest.dubbo.consumer.controller;

import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import cn.hutool.crypto.symmetric.AES;

/**
 * @author Forest Dong
 * @date 2022年05月15日 14:33
 */
public class DubboController {
    public static void main(String[] args) {
        AES aes = new AES(Mode.ECB, Padding.PKCS5Padding, "1111111111111111".getBytes());
        String 这是中文 = aes.encryptHex("这是中文");
        AES aesw = new AES(Mode.ECB, Padding.PKCS5Padding, "1111111111111111".getBytes());
        System.err.println(这是中文);
        System.err.println(aesw.decryptStr("C05AE6390008EBD6BC91B9F9DE6FDACE"));
    }
}
