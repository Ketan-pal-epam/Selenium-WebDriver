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
        String code = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        pastebinPage.createNewPaste(code, "how to gain dominance among developers","Bash","10 Minutes");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}