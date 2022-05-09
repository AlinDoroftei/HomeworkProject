import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    public void validRegisterTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Alin");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Alin");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Doro");
        driver.findElement(By.id("email_address")).sendKeys("alin.doroftei@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("confirmation")).sendKeys("123456");
        driver.findElement(By.cssSelector("#is_subscribed")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
//        driver.close();
    }

    public void invalidEmailRegisterTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Alin");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Alin");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Doro");
        driver.findElement(By.id("email_address")).sendKeys("alin.dorofteiyahoo.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("confirmation")).sendKeys("123456");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        driver.close();
    }

    public void invalidPassRegisterTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Alin");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Alin");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Doro");
        driver.findElement(By.id("email_address")).sendKeys("alin.dorofteiyahoo.com");
        driver.findElement(By.id("password")).sendKeys("1");
        driver.findElement(By.id("confirmation")).sendKeys("1");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        driver.close();
    }

    public void invalidConfirmPassRegisterTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Alin");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Alin");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Doro");
        driver.findElement(By.id("email_address")).sendKeys("alin.dorofteiyahoo.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("confirmation")).sendKeys("1");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        driver.close();
    }
}
