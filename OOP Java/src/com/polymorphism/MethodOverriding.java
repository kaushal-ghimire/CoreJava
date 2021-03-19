package com.polymorphism;

public class MethodOverriding extends NextOverriding{



    //overriding method...
    public String methodOverriding() {
        System.out.println("Return place...");
                return  "BIRATNAGAR";
    }
    public static void main(String[] args){
        NextOverriding  override = new MethodOverriding();

        System.out.println(override.methodOverriding());
    }

}
