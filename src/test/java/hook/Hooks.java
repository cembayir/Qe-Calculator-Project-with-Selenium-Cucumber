package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.CalculatorPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.ByteArrayInputStream;

public class Hooks {
    private static final Logger log = LogManager.getLogger(Hooks.class);
    CalculatorPage calculatorPage = new CalculatorPage();

    @Before
    public void setUp() {
        try {
            log.info("Test başlıyor. URL açılıyor...");
            Driver.getDriver().get(ConfigReader.getProperty("calculatorPageURL"));
            calculatorPage.usernameInput.sendKeys("cembayir");
            calculatorPage.passwordInput.sendKeys("Mavi2023*");
            ReusableMethods.waitFor(1);
            calculatorPage.buttons.multiUseButton.click();
            ReusableMethods.waitFor(1);
            calculatorPage.buttons.multiUseButton.click();
        } catch (Exception e) {
            log.error("Test öncesi adımlarda hata oluştu: ", e);
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        if (scenario.isFailed()) {
            // Mevcut raporlama (Cucumber Attach)
            scenario.attach(screenshot, "image/png", "Screenshot - " + scenario.getName());

            // Allure raporuna ekran görüntüsü ekleme
            Allure.addAttachment(
                    "Failure Screenshot - " + scenario.getName(),
                    "image/png",
                    new ByteArrayInputStream(screenshot),
                    "png"
            );
        }
        Driver.closeDriver();
    }
}