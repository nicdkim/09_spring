package com.ohgiraffers.section04.properties;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import com.ohgiraffers.section02.subsection02.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                ContextConfiguration.class);

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


        ((AnnotationConfigApplicationContext) context).close();

    }
}
