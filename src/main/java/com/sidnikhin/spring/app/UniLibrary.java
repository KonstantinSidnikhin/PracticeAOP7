package com.sidnikhin.spring.app;

import org.springframework.stereotype.Component;

@Component ("uniLibraryBean")
public class UniLibrary {
    public void getBook(){
        System.out.println("A book is taken from UniLibrary");
    }
    public void getMagazine(){
        System.out.println("A magazine is taken from UniLibrary");
    }
    public void returnMagazine(){
        System.out.println("A magazine is returned to UniLibrary");
    }
    public void returnBook(){
        System.out.println("A book is returned to UniLibrary");
    }
}
