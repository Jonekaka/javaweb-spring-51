package com.Learn_Java.dao;

import com.Learn_Java.domain.Account;

import java.util.List;

/**
 * java学习中
 * 先想后看，边看边想
 */
public interface IAccountDao {

    /**
     * 查询所有账户，同时还要获取到当前账户的所属用户信息
     * @return
     */
    List<Account> findAll();

    /**
     * 根据用户id查询账户信息
     * @param uid
     * @return
     */
    List<Account> findAccountByUid(Integer uid);

}
