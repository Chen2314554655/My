package com.company;

import java.util.ArrayList;

public class SupClass {
    public void printMyMessage(){
        System.out.println("Hi this is my supclass");
    }
    @Deprecated
    public void dosmthing(){
        System.out.println("I do some work");
    }

    private List versions= new ArrayList();
    @SuppressWarnings("unchecked")
    public void addVersion(String version){
        versions.add(version);
    }
}
