package cn.lightina.managebooks.service;

import cn.lightina.managebooks.pojo.*;

import java.util.List;

public interface BookService {
    /*user*/
    List<BookList> getlist();

    List<BookList> getlistByQuery(String query);

    List<Book> getlistByuId(int userId);

    int deleteByBId(int bookId);

    void processRes(String ISBN, User user);

    List<ReservationDetail> getResById(User user);

    /*admin*/
    int addBookList(BookList booklist);

    Book insertBorrow(BookList booklist, int userId);

    List<Reservation> getResInfo();

    List<BorrowDetail> getBorInfo(User user);

    List<ReservationDetail> getResList();

    List<BorrowDetail> getBorList();
}
