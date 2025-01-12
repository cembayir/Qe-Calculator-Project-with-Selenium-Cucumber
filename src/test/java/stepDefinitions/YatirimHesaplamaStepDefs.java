package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CalculatorPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class YatirimHesaplamaStepDefs {
    CalculatorPage calculatorPage = new CalculatorPage();

    @When("Yüz tl yatırım tutarı girilir")
    public void yuz_tl_yatirim_tutari_girilir() {
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
    }

    @When("Yüzde beş faiz oranı girilir")
    public void yuzde_bes_faiz_orani_girilir() {
        calculatorPage.buttons.multiplicationButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.commaButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.fiveButton.click();
    }

    @When("Yüzde sıfır faiz oranı girilir")
    public void yuzde_sifir_faiz_orani_girilir() {
        calculatorPage.buttons.multiplicationButton.click();
        calculatorPage.buttons.zeroButton.click();
    }

    @When("Eşittir butonuna tıklanır")
    public void esittir_butonuna_tiklanir() {
        calculatorPage.buttons.equalsButton.click();
        ReusableMethods.waitFor(2);
    }

    @When("Eksi yüz tl yatırım tutarı girilir")
    public void eksi_yuz_tl_yatirim_tutari_girilir() {
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.turnNegativeButton.click();
    }

    @Then("Sonuç ekranında {string} değeri görünmelidir")
    public void sonuc_ekraninda_degerler_gorunmeli(String beklenenDeger) {
        String gorunenDeger = calculatorPage.result.getText();
        System.out.println("Ekranda görünen değer: " + gorunenDeger);

        if (gorunenDeger.startsWith("=")) {
            gorunenDeger = gorunenDeger.substring(1).trim();
        }

        // Beklenen değerle karşılaştırma
        if (!gorunenDeger.equals(beklenenDeger.trim())) {
            System.out.println("Test Hatası: Beklenen değer: " + beklenenDeger + ", Ancak görünen değer: " + gorunenDeger);
            Assert.fail("Beklenen değer ile görünen değer eşleşmiyor!");
        }

        System.out.println("Test Başarılı: Beklenen değer " + beklenenDeger + " görünen değerle eşleşiyor.");
    }


    @When("Hesaplama sonrasnda sayfa kapatılır")
    public void sayfa_kapatilir() {
        Driver.closeDriver();
    }
}
