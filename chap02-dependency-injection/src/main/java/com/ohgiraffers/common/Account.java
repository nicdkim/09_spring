package com.ohgiraffers.common;

public interface Account {

    String getBalance();        // 잔액
    String deposit(int money);  // 입금
    String withdraw(int money); // 출금



}
