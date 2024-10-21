package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDAO {

    // 도서 목록 전체 조회
    List<BookDTO> selectBookList();

    // 도서 번호로 도서 조회
    BookDTO selectOneBook(int seq);

}
