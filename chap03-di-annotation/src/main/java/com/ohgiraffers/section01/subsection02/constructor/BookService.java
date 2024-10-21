package com.ohgiraffers.section01.subsection02.constructor;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("bookServiceConstructor")
public class BookService {

    private final BookDAO bookDAO;

    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }

    public BookDTO selectOneBook(int seq) {
        return bookDAO.selectOneBook(seq);
    }

}
