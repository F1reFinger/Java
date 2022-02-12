package com.base;

public class Orider{

    private final String code;

    public Orider(String code){
        this.code = code;
    }

    @Override
    public String toString(){
        return "Order={" + "code='" + code + "'" + "}";
    }
}