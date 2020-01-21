import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UITestExample {

    WebDriver driver = new ChromeDriver();

    @Test
    public void uiTest() {

        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div//a[@class='blockbestsellers']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

    @Test
    public void uiTest2(){
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div//input[@id='search_query_top']")).sendKeys("doll");
        driver.close();
    }

    @Test
    public void uiTest3(){
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = driver.findElement(By.xpath("//div[@class='rte']")).getText();
        driver.close();
        System.out.println(text);
    }

}
