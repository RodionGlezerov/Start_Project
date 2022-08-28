import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework240822 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.brammibalsdonuts.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void startFindCss(){
        //id -> #
        driver.findElement(By.cssSelector("#masthead"));
        driver.findElement(By.cssSelector("#content"));
        driver.findElement(By.cssSelector("#primary"));
        driver.findElement(By.cssSelector("#main"));
        driver.findElement(By.cssSelector("#page-2"));
        //className -> .
        driver.findElement(By.cssSelector(".wp-block-cover__inner-container"));
        driver.findElement(By.cssSelector(".site-content.container"));
        driver.findElement(By.cssSelector(".content-area"));
        driver.findElement(By.cssSelector(".site-main"));
        driver.findElement(By.cssSelector(".post-2.page.type-page.status-publish.hentry"));
        //attribute -> []
        driver.findElement(By.cssSelector("[role='main']"));
        driver.findElement(By.cssSelector("[data-pid='213608']"));
        driver.findElement(By.cssSelector("[role='document']"));
        //tag + class
        driver.findElement(By.cssSelector("div.site-content.container"));


    }

    @Test
    public void startFindXpath(){
        //  //*[@att='value']
        driver.findElement(By.xpath("//*[@id='content']"));
        //id -> "//tag[@id='value']
        driver.findElement(By.xpath("//div[@id='content']"));
        driver.findElement(By.xpath("//*[@id='footer']"));
        //className -> "//tag[@class='value']
        driver.findElement(By.xpath("//*[@class='wp-block-buttons is-content-justification-center']"));
        driver.findElement(By.xpath("//article[@class='post-2 page type-page status-publish hentry']"));
        driver.findElement(By.xpath("//*[@class='wp-block-button__link has-fourth-color has-fifth-background-color has-text-color has-background']"));

        //contains -> ("ssw")
        driver.findElement(By.xpath("//*[contains(.,'The best')]"));
        driver.findElement(By.xpath("//h1[contains(.,'And they’re vegan, too.')]"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
