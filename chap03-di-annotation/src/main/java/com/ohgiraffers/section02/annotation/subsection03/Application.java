package com.ohgiraffers.section02.annotation.subsection03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();

        for (String bean : beanNames) {
            System.out.println("bean : " + bean );
        }

        PoketmonService poketmonService = context.getBean("poketmonServiceCollection" , PoketmonService.class);

        poketmonService.poketmonAttack();
    }
}
