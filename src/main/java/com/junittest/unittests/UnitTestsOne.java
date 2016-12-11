package com.junittest.unittests;

/**
 * Created by dbpb on 4/12/2016.
 */
public class UnitTestsOne {

    private String newmessage;

    public UnitTestsOne(String message) {
        this.newmessage = message;
    }

    public String printMessage() {
        System.out.println(newmessage);
        return newmessage ;
    }

}
