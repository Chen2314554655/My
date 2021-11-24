package com.company;

public class SubClass extends SupClass{
   // @MyNewAnnotation(name = "steve",id=2)
   public int x;
    @Override
    @MyNewAnnotation()
      public void printMyMessage(){
        System.out.println("This is the subclass");
    }
}
