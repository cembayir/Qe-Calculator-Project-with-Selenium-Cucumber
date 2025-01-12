package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CalculatorPage;
import utilities.ReusableMethods;

public class KrediKarsilastirmaStepDefs {
    CalculatorPage calculatorPage = new CalculatorPage();
    private String ustKisimSonuc; // Üst kısım sonucu
    private String altKisimSonuc; // Alt kısım sonucu
    private String faizSonuc;     // Faiz hesaplama sonucu
    private String aylikOdemeSonuc; // Aylık ödeme sonucu

    @When("Kredi tutarı çarpı aylık faiz oranı hesaplanır")
    public void krediTutariCarpiAylikFaizOraniHesaplanir() {
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.twoButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.multiplicationButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.commaButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.equalsButton.click();
        ReusableMethods.waitFor(1);
        faizSonuc = calculatorPage.result.getText();
        System.out.println("Kredi x Aylık Faiz Sonucu: " + faizSonuc);
        calculatorPage.buttons.acButton.click();
    }

    @And("Aylık faiz oranı üzerine bir eklenir ve üstel kuvvet alınır")
    public void aylikFaizOraniUzerineBirEklenirVeUstelKuvvetAlinir() {
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.commaButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.oneButton.click();

        calculatorPage.buttons.multiplicationButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.commaButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.equalsButton.click();
        ReusableMethods.waitFor(2);

        for (int i = 2; i <= 12; i++) {
            calculatorPage.buttons.multiplicationButton.click();
            ReusableMethods.waitFor(1);
            calculatorPage.buttons.oneButton.click();
            ReusableMethods.waitFor(1);
            calculatorPage.buttons.commaButton.click();
            ReusableMethods.waitFor(1);
            calculatorPage.buttons.zeroButton.click();
            ReusableMethods.waitFor(1);
            calculatorPage.buttons.oneButton.click();
            ReusableMethods.waitFor(1);
            calculatorPage.buttons.equalsButton.click();
            ReusableMethods.waitFor(1);
        }

        ustKisimSonuc = calculatorPage.result.getText();
        System.out.println("1.01'in 12. kuvveti: " + ustKisimSonuc);
        calculatorPage.buttons.acButton.click();
    }

    @And("Kredi tutarı ile aylık faiz oranı çarpılarak üst kısım hesaplanır")
    public void krediTutariIleAylikFaizOraniCarpilir() {
        // 1. Adım: Kredi tutarını gir
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.twoButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();

        calculatorPage.buttons.multiplicationButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.commaButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.equalsButton.click();
        ReusableMethods.waitFor(1);

        String araSonuc = calculatorPage.result.getText();
        System.out.println("Kredi Tutarı x Aylık Faiz Oranı: " + araSonuc);

        calculatorPage.buttons.multiplicationButton.click();

        char[] rakamlar = ustKisimSonuc.replaceAll("[^0-9,]", "").toCharArray();
        for (char rakam : rakamlar) {
            switch (rakam) {
                case '0':
                    calculatorPage.buttons.zeroButton.click();
                    break;
                case '1':
                    calculatorPage.buttons.oneButton.click();
                    break;
                case '2':
                    calculatorPage.buttons.twoButton.click();
                    break;
                case '3':
                    calculatorPage.buttons.threeButton.click();
                    break;
                case '4':
                    calculatorPage.buttons.fourButton.click();
                    break;
                case '5':
                    calculatorPage.buttons.fiveButton.click();
                    break;
                case '6':
                    calculatorPage.buttons.sixButton.click();
                    break;
                case '7':
                    calculatorPage.buttons.sevenButton.click();
                    break;
                case '8':
                    calculatorPage.buttons.eightButton.click();
                    break;
                case '9':
                    calculatorPage.buttons.nineButton.click();
                    break;
                case ',':
                    calculatorPage.buttons.commaButton.click();
                    break;
            }
        }

        calculatorPage.buttons.equalsButton.click();
        ReusableMethods.waitFor(1);

        ustKisimSonuc = calculatorPage.result.getText();
        System.out.println("Üst Kısım Sonucu: " + ustKisimSonuc);
    }


    @And("Üst kısım alt kısma bölünür ve aylık ödeme bulunur")
    public void ustKisimAltKismaBolunurVeAylikOdemeBulunur() {
        char[] rakamlar = ustKisimSonuc.replaceAll("[^0-9,]", "").toCharArray();
        for (char rakam : rakamlar) {
            switch (rakam) {
                case '0':
                    calculatorPage.buttons.zeroButton.click();
                    break;
                case '1':
                    calculatorPage.buttons.oneButton.click();
                    break;
                case '2':
                    calculatorPage.buttons.twoButton.click();
                    break;
                case '3':
                    calculatorPage.buttons.threeButton.click();
                    break;
                case '4':
                    calculatorPage.buttons.fourButton.click();
                    break;
                case '5':
                    calculatorPage.buttons.fiveButton.click();
                    break;
                case '6':
                    calculatorPage.buttons.sixButton.click();
                    break;
                case '7':
                    calculatorPage.buttons.sevenButton.click();
                    break;
                case '8':
                    calculatorPage.buttons.eightButton.click();
                    break;
                case '9':
                    calculatorPage.buttons.nineButton.click();
                    break;
                case ',':
                    calculatorPage.buttons.commaButton.click();
                    break;
            }
        }

        calculatorPage.buttons.divisionButton.click();

        // Alt kısmı manuel olarak yaz
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.commaButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.twoButton.click();
        calculatorPage.buttons.sixButton.click();
        calculatorPage.buttons.eightButton.click();
        calculatorPage.buttons.twoButton.click();
        calculatorPage.buttons.fiveButton.click();
        calculatorPage.buttons.equalsButton.click();
        ReusableMethods.waitFor(1);

        aylikOdemeSonuc = calculatorPage.result.getText();
        System.out.println("Aylık Ödeme (PMT): " + aylikOdemeSonuc);
    }

    @And("Hesap makinesi sıfırlanıp Kredi 2 testine başlanır")
    public void hesapMakinesiSıfırlanıpKrediTestineBaşlanır() {
        calculatorPage.buttons.acButton.click();
        ReusableMethods.waitFor(2);
    }
}
