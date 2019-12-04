package com.dicoding.javafundamental.belajar.enumbelajar;

public enum ZodiakEnum {

    LIBRA(5, "aziz"),
    GEMINI(7, "arthur"),
    ARIES(9, "milan"),
    VIRGO(1, "hafiz");

    private Integer intProperties;
    private String roro;

    ZodiakEnum(int props, String nama){
        this.intProperties = props;
        this.roro = nama;
    }

    public String test(){
        return "hello world";
    }
}
