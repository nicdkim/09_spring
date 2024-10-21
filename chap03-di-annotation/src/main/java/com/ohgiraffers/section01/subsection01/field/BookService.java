package com.ohgiraffers.section01.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceField")
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBook() {
        return bookDAO.selectBookList();
    }

    public BookDTO selectOneBook(int seq) {
        return bookDAO.selectOneBook(seq);
    }

}
