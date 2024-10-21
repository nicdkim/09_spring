package com.ohgiraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Charmander implements Poketmon{


    @Override
    public void attack() {
        System.out.println("파이리 불꽃");
    }
}
