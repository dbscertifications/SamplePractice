package com.test.sample;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.ie.InternetExplorerDriver;
    import org.testng.annotations.AfterClass;
    import org.testng.annotations.BeforeClass;
    import org.testng.annotations.Test;

    public class Test1 {

        WebDriver driver = null;

        @BeforeClass
        public void setUp() {
            String url = "www.google.com";
//        System.setProperty("webdriver.chrome.driver", "C:\\PathFiles\\ChromeDriver\\ChromeDriver.exe");
            System.setProperty("webdriver.ie.driver", "C:\\PathFiles\\ChromeDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();

            // Open the Google Application
            driver.get(url);
        }

        @Test
        public void Test1test() {
            driver.findElement(By.name("q")).sendKeys("Melbourne");
            System.out.println("test1");
        }

        @AfterClass
        public void afterTest() {
            //Close the browser
            System.out.println("aftertest");
            driver.quit();
        }

    }
