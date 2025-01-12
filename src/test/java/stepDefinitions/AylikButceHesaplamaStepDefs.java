package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CalculatorPage;
import utilities.ReusableMethods;

public class AylikButceHesaplamaStepDefs {
    CalculatorPage calculatorPage = new CalculatorPage();

    @And("Gider tutarı eksi sekizyüz tl olarak girilir")
    public void giderTutarıEksiSekizyüzTlOlarakGirilir() {
        calculatorPage.buttons.subtractionButton.click();
        calculatorPage.buttons.turnNegativeButton.click();
        calculatorPage.buttons.eightButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
    }

    @When("Gelir tutarı bin tl olarak girilir")
    public void gelirTutarıBinTlOlarakGirilir() {
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
    }

    @And("Gider tutarı sekizyüz tl olarak girilir")
    public void giderTutarıSekizyüzTlOlarakGirilir() {
        calculatorPage.buttons.subtractionButton.click();
        calculatorPage.buttons.eightButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
    }

    @And("Gider tutarı bin tl olarak girilir")
    public void giderTutarıBinTlOlarakGirilir() {
        calculatorPage.buttons.subtractionButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
    }

    @When("Gelir tutarı sıfır tl olarak girilir")
    public void gelirTutarıSıfırTlOlarakGirilir() {
        calculatorPage.buttons.zeroButton.click();
    }
}
