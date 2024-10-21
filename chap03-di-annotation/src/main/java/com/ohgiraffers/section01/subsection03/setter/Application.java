package com.ohgiraffers.section01.subsection03.setter;

import com.ohgiraffers.section01.common.BookDTO;
import com.ohgiraffers.section01.subsection01.field.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
          "com.ohgiraffers.section01");
        BookService bookService = context.getBean("bookServiceSetter",BookService.class);

        List<BookDTO> bookList = bookService.selectAllBook();
        for (BookDTO book : bookList) {
            System.out.println("book : " + book);
        }
    }
}
