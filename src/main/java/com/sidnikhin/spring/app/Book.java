package com.sidnikhin.spring.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("look at your house,Angel")
    private String bookName;
    @Value("Thomas Wolf")
    private String author;
    public String getBookName() {
        return bookName;
    }



    public String getAuthor() {
        return author;
    }




}
