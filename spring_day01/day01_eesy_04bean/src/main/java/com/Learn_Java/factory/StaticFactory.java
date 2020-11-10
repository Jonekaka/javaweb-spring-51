package com.Learn_Java.factory;

import com.Learn_Java.service.IAccountService;
import com.Learn_Java.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类（该类可能是存在于jar包中的，我们无法通过修改源码的方式来提供默认构造函数）
 */
public class StaticFactory {

    public static IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
