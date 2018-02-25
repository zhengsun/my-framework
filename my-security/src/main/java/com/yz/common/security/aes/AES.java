package com.yz.common.security.aes;


public interface AES {

    public String encrypt(String data) throws Exception;

    public String decrypt(String data) throws Exception;
}
