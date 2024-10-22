package com.ohgiraffers.section01.subsection01.scope;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {


        /*
        * bean scope 란? 빈이 생성될 때 생성되는 인스턴스의 범위를 의미한다.
        * 스프링에서는 다양한 스코프를 제공한다.
        *
        * 1. singleton  하나의 인스턴스만 생성하고, 모든 빈이 해당 인스턴스를 공유한다.
        * 2. prototype  매번 새로운 인스턴스를 생성한다.
        * 3. request    http 요청을 처리할 때 마다 새로운 인스턴스를 생성하고, 요청
        *               처리가 끝나면 인스턴스를 폐기한다.
        * 4. session    http 세션 당 하나의 인스턴스를 생성하고, 세션이 종료되면
        *               인스턴스를 폐기한다.
        * */

        ApplicationContext context = new AnnotationConfigApplicationContext(
                ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean : beanNames) {
            System.out.println("bean : " + bean);
        }

        Product carpBread = context.getBean("carpBread", Product.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        // 첫 번째 손님이 쇼핑 카트를 꺼낸다..
        ShoppingCart cart = context.getBean("cart", ShoppingCart.class);
        cart.addItem(carpBread);
        cart.addItem(milk);
        cart.addItem(water);
        System.out.println("cart에 담긴 물품 : " + cart.getItems());

        // 두 번째 손님이 카트를 꺼낸다
        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart2.addItem(water);
        System.out.println("cart2 에 담긴 물품 : " + cart2.getItems());

        System.out.println("cart : " + cart.hashCode());
        System.out.println("cart2 : " + cart2.hashCode());
    }
}
