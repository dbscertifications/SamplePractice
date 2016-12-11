package com.junittest.unittests;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dbpb on 4/12/2016.
 */
public class UnitTestsOneTest {

    String message = "NewMessage";
    UnitTestsOne unitTestsOne = new UnitTestsOne(message);

    @Test
    public void canTestPrintMessage() {
        assertEquals(message,unitTestsOne.printMessage());
    }

    @Test
    public void cannotTestPrintMessage() {

    }

}