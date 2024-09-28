package student_ketan_pal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CloudCalculatorTest {
    private WebDriver driver;
    private CloudCalculator cloudCalculator;

    @BeforeClass
    public void setUp() {
        driver = WebDriverSingleton.getDriver();
        driver.get("https://cloud.google.com/products/calculator");
        cloudCalculator = new CloudCalculator(driver);
    }

    @Test
    public void testCalculateCloudCost() {
        cloudCalculator.calculateCloudCost();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
