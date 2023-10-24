package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class Nested_Frames_Text_Automation {
    ChromeDriver driver;

    public Nested_Frames_Text_Automation(){
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();
    }

    public void  testCase01() {

//        Navigate to URL  https://the-internet.herokuapp.com/nested_frames
        driver.get("https://the-internet.herokuapp.com/nested_frames");
//        Switch to Top frame Using Locator "Name" frame-top | using switchTo().frame()
        driver.switchTo().frame("frame-top");
//        Switch to Left Frame Using Locator "Name" frame-left | using switchTo().frame()
//        Get the Text Using Locator "XPath" frame-left | using switchTo().frame()
        driver.switchTo().frame("frame-left");
        System.out.println("Get the Text inside of Frame " +driver.findElement(By.xpath("//body")).getText());
//        Switch to parent Frame Top  driver.switchTo().parentFrame()
//        Switch to Middle Frame Using Locator "Name" frame-middle | using switchTo().frame()
//        Get the Text Using Locator "XPath" //body | getText()
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        System.out.println("Get the Text inside of Frame " +driver.findElement(By.xpath("//body")).getText());

//        Switch to parent Frame Top  driver.switchTo().parentFrame()
//        Switch to Right Frame Using Locator "ID" frame-right | using switchTo().frame()
//        Get the Text Using Locator "XPath" //body | getText()
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        System.out.println("Get the Text inside of Frame " +driver.findElement(By.xpath("//body")).getText());
//        Switch to main Frame   driver.switchTo().defaultContext()
//        Switch to Bottom frame Using Locator "Name" frame-bottom | using switchTo().frame()
//        Get the Text Using Locator "XPath" //body | getText()
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        System.out.println("Get the Text inside of Frame " +driver.findElement(By.xpath("//body")).getText());
//        Switch to main Frame   driver.switchTo().defaultContext()
        driver.switchTo().defaultContent();
    }
}