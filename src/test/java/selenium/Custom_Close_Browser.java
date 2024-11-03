package test.java.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Custom_Close_Browser {
    WebDriver driver;
    String projectPath =System.getProperty("user.dir");
    @BeforeClass
    public void beforeClass(){
//        selenium 3.x (non WebDriverManager)
//        System.setProperty("webdriver.chrome.driver", "D:\\Automation_testing\\04-Maven Custom Browser\\maven-selenium-close-browser\\browserDrivers\\chromedriver.exe");
//        driver = new ChromeDriver();

//        Selenim 3.x + WebDriverManager 5.9
        driver= WebDriverManager.chromedriver().create();
        driver.get("https://vnvc.vn/gia-tiem-chung-vac-xin/");
        Assert.assertTrue(false);
    }
    @Test
    public  void TC_01(){
        System.out.println("TC_01");
        System.out.println(projectPath);
    }
    @Test
    public  void TC_02(){
        System.out.println("TC_02");
    }
    @Test
    public  void TC_03(){
        System.out.println("TC_03");
    }
    @AfterClass(alwaysRun = true)
    public void afterClass(){
        driver.quit();
    }
}
