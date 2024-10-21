package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator() {
        return new PersonalAccount(20,"110-233-2222");
    }

    @Bean
    public MemberDTO memberGenerator() {
        MemberDTO member = new MemberDTO(
                30,"홍석천","0102222-3333", "hong@gmail.com", accountGenerator());

        return member;
    }

}
