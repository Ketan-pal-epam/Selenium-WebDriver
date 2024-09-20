package student_ketan_pal;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PastebinTest {
    private WebDriver driver;
    private PastebinPage pastebinPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverSingleton.getDriver();
        driver.get("https://pastebin.com");
        pastebinPage = new PastebinPage(driver);
    }

    @Test
    public void testCreateNewPaste() {
        pastebinPage.createNewPaste("Hello from WebDriver", "10 Minutes", "helloweb");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}