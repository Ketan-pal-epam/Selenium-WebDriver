package student_ketan_pal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PastebinPage {
    private WebDriver driver;

    public PastebinPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createNewPaste(String code, String expiration, String title) {
        WebElement codeInput = driver.findElement(By.id("postform-text"));
        codeInput.sendKeys(code);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-select2-id='3']")));
        element.click();
        driver.findElement(By.xpath("//li[text()='"+expiration+"']")).click();
        driver.findElement(By.id("postform-name")).sendKeys(title);
        driver.findElement(By.xpath("//button[text()='Create New Paste']")).click();
    }
}