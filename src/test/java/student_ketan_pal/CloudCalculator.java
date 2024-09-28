package student_ketan_pal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CloudCalculator {

    private WebDriver driver;

    public CloudCalculator(WebDriver driver) {
        this.driver = driver;
    }

    public void calculateCloudCost() {
        driver.findElement(By.xpath("//span[text()='Add to estimate']")).click();
        // click on compute engine
        driver.findElement(By.xpath("//div[@data-service-form='8']")).click();
        // Fill out the form
        WebElement instances = driver.findElement(By.xpath("//input[@id='input_62']"));
        instances.sendKeys("4");

        WebElement operatingSystem = driver.findElement(By.xpath("//md-select[@id='select_80']"));
        operatingSystem.click();
        driver.findElement(By.xpath("//md-option[@value='free']")).click();

        WebElement provisioningModel = driver.findElement(By.xpath("//md-select[@id='select_88']"));
        provisioningModel.click();
        driver.findElement(By.xpath("//md-option[@value='regular']")).click();

        WebElement machineFamily = driver.findElement(By.xpath("//md-select[@id='select_96']"));
        machineFamily.click();
        driver.findElement(By.xpath("//md-option[@value='n1']")).click();

        WebElement series = driver.findElement(By.xpath("//md-select[@id='select_104']"));
        series.click();
        driver.findElement(By.xpath("//md-option[@value='n1']")).click();

        WebElement machineType = driver.findElement(By.xpath("//md-select[@id='select_112']"));
        machineType.click();
        driver.findElement(By.xpath("//md-option[@id='cp-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']")).click();

        // Add GPUs
        driver.findElement(By.xpath("//div[contains(text(),'Add GPUs')]")).click();

        WebElement gpuType = driver.findElement(By.xpath("//md-select[@id='select_397']"));
        gpuType.click();
        driver.findElement(By.xpath("//md-option[@value='NVIDIA_TESLA_V100']")).click();

        WebElement numberOfGpus = driver.findElement(By.xpath("//md-select[@id='select_405']"));
        numberOfGpus.click();
        driver.findElement(By.xpath("//md-option[@value='1']")).click();

        WebElement localSsd = driver.findElement(By.xpath("//md-select[@id='select_360']"));
        localSsd.click();
        driver.findElement(By.xpath("//md-option[@value='2']")).click();

        WebElement region = driver.findElement(By.xpath("//md-select[@id='select_120']"));
        region.click();
        driver.findElement(By.xpath("//md-option[@id='select_option_212']")).click();

        WebElement committedUseDiscount = driver.findElement(By.xpath("//md-select[@id='select_128']"));
        committedUseDiscount.click();
        driver.findElement(By.xpath("//md-option[@value='1']")).click();

        // Click on Add to Estimate
        driver.findElement(By.xpath("//button[contains(text(),'Add to Estimate')]")).click();

        // Click on Share to see Total estimated cost
        driver.findElement(By.xpath("//button[contains(text(),'Share')]")).click();

        // Open estimate summary in a separate tab
        driver.findElement(By.xpath("//button[contains(text(),'Open estimate summary')]")).click();

    }

}
