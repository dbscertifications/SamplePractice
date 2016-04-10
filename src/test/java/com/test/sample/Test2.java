package com.test.sample;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

/**
 * Created by my computers on 4/10/2016.
 */
public class Test2 extends Test1 {

    @Test
    public void Test2test() throws InterruptedException {
        driver.findElement(By.id("lst-ib")).sendKeys("Sydney");
        sleep(2);
        System.out.println("test2");
    }

    @AfterTest
    public void afterTest() {
        //Close the browser
        System.out.println("aftertest");
        driver.quit();
    }

}
