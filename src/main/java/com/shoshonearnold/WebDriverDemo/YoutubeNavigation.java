package com.shoshonearnold.WebDriverDemo;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class YoutubeNavigation implements CommandLineRunner {
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(WebDriverDemoApplication.class);

    @Override
    public void run(String... args) throws Exception {
        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            Selenide.sleep(2000);
            driver.get("https://google.com");
            WebElement googleSearchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
            Selenide.sleep(2000);
            googleSearchBox.sendKeys("What is love? Baby don't hurt me");
            googleSearchBox.sendKeys(Keys.ENTER);
            driver.findElement(By.className("hide-focus-ring")).click(); // Clicks on "videos" tab
            driver.findElement(By.partialLinkText("[Official] - YouTube")).click();
            // Dance :)
        } catch (Throwable t) {
            LOG.error("Could not access driver", t);
        }
    }
}
