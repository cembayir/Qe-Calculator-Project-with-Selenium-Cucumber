package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CalculatorPage;

public class GunlukGiderTakibiStepDefs {
    CalculatorPage calculatorPage = new CalculatorPage();

    @When("Yemek gideri yirmi tl olarak girilir")
    public void yemekGideriYirmiTlOlarakGirilir() {
        calculatorPage.buttons.twoButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.additionButton.click();

    }

    @And("Ulaşım gideri on tl olarak girilir")
    public void ulaşımGideriOnTlOlarakGirilir() {
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.zeroButton.click();
    }

    @And("Kahve gideri beş tl olarak girilir")
    public void kahveGideriBeşTlOlarakGirilir() {
        calculatorPage.buttons.additionButton.click();
        calculatorPage.buttons.fiveButton.click();
    }

    @When("Bir gider kalemi eksi on tl olarak girilir")
    public void birGiderKalemiEksiOnTlOlarakGirilir() {
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.turnNegativeButton.click();
    }
}
