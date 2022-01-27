package com.sidnikhin.spring.app.Aspects;

import com.sidnikhin.spring.app.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class Logging {
    @Before("com.sidnikhin.spring.app.Aspects.MyPointcuts.libraryGetMethods()")
    public void getLog(){
        System.out.println("log: an item is taken from Library");
    }
    @Before("com.sidnikhin.spring.app.Aspects.MyPointcuts.libraryGetMethods()")
    public void joinPointMethod(JoinPoint joinPoint){
        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature.getMethod());
        if(methodSignature.getName().equals("getBook")){
            Object[]arguments=joinPoint.getArgs();
            for (Object obj:arguments){

                if(obj instanceof Book){
                    Book myBook=(Book)obj;
                    System.out.println("берется книга : "+myBook.getBookName());
                }
                else if(obj instanceof String){
                    System.out.println("книгу берет:"+obj);
                }
            }
        }
    }


}
