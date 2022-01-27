package com.sidnikhin.spring.app;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook(Book book, String readersName){
        System.out.println("A book is taken from Library");
    }
    public void getMagazine(){
        System.out.println("A magazine is taken from Library");
    }
    public void returnMagazine(){
        System.out.println("A magazine is returned to Library");
    }
    public void returnBook(){
        System.out.println("A book is returned to Library");
    }
}
