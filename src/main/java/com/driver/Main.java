package com.driver;

public class Main {
    public static void main(String args[]){
        A method = new B();
        method.meth();
        method.meth();

    }
  }
class A{
    String meth(){
        return "right output";
    }
}
class B extends A{
    @Override
    String meth() {
        return "Method is overridden in Extendend class B";
    }
}