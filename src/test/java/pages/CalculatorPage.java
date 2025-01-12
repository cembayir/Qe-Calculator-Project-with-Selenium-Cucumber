package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CalculatorPage {
    public CalculatorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        PageFactory.initElements(Driver.getDriver(), buttons);
    }

    public Buttons buttons = new Buttons();

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//span[contains(text(), '=')]")
    public WebElement result;

    public static class Buttons {
        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93']")
        public WebElement multiUseButton;

        @FindBy(xpath = "//div[text()='AC']")
        public WebElement acButton;

        @FindBy(xpath = "//div[text()='+/-']")
        public WebElement turnNegativeButton;

        @FindBy(xpath = "//div[text()='+']")
        public WebElement additionButton;

        @FindBy(xpath = "//div[text()='-']")
        public WebElement subtractionButton;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-adyw6z r-vw2c0b' and text()='*']")
        public WebElement multiplicationButton;

        @FindBy(xpath = "//div[text()='/']")
        public WebElement divisionButton;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-adyw6z r-vw2c0b' and text()='=']")
        public WebElement equalsButton;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-adyw6z r-vw2c0b' and text()='0']")
        public WebElement zeroButton;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-adyw6z r-vw2c0b' and text()='1']")
        public WebElement oneButton;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-adyw6z r-vw2c0b' and text()='2']")
        public WebElement twoButton;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-adyw6z r-vw2c0b' and text()='3']")
        public WebElement threeButton;

        @FindBy(xpath = "//div[text()='4']")
        public WebElement fourButton;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-adyw6z r-vw2c0b' and text()='5']")
        public WebElement fiveButton;

        @FindBy(xpath = "//div[text()='6']")
        public WebElement sixButton;

        @FindBy(xpath = "//div[text()='7']")
        public WebElement sevenButton;

        @FindBy(xpath = "//div[text()='8']")
        public WebElement eightButton;

        @FindBy(xpath = "//div[text()='9']")
        public WebElement nineButton;

        @FindBy(xpath = "//div[text()=',']")
        public WebElement commaButton;
    }
}
