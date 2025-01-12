package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CalculatorPage;
import utilities.ReusableMethods;

public class YillikYatirimHesaplamaStepDefs {
    CalculatorPage calculatorPage = new CalculatorPage();
    private String sonuc;

    @When("Yüzde dört faiz oranı ile bir yıllık yatırım getirisi hesaplanır")
    public void yüzdeDörtFaizOranıIleBirYıllıkYatırımGetirisiHesaplanır() {
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.commaButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.fourButton.click();
        calculatorPage.buttons.multiplicationButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.equalsButton.click();
        ReusableMethods.waitFor(1);
        calculatorPage.buttons.additionButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.equalsButton.click();
        sonuc = calculatorPage.result.getText();
        System.out.println("Hesaplama sonucu: " + sonuc);
        ReusableMethods.waitFor(1);
        calculatorPage.buttons.acButton.click();
    }

    @And("Yatırım tutarı ikiyüz tl olarak girilir")
    public void yatırımTutarıIkiyüzTlOlarakGirilir() {
        calculatorPage.buttons.twoButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
    }

    @And("İkiyüz tlnin bir yıllık yatırım getirisi hesaplanır")
    public void ikiyüzTlninBirYıllıkYatırımGetirisiHesaplanır() {
        calculatorPage.buttons.multiplicationButton.click();
        String temizSonuc = sonuc.replaceAll("[^0-9,]", "");

        System.out.println("Temizlenmiş sonuç: " + temizSonuc);

        if (temizSonuc.isEmpty()) {
            throw new IllegalArgumentException("Sonuç geçersiz veya rakam içermiyor!");
        }

        // Karakterlere böl
        char[] rakamlar = temizSonuc.toCharArray();

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
                case '+':
                    calculatorPage.buttons.additionButton.click();
                    break;

                case '-':
                    calculatorPage.buttons.subtractionButton.click();
                    break;
                case '*':
                    calculatorPage.buttons.multiplicationButton.click();
                    break;
                case '/':
                    calculatorPage.buttons.divisionButton.click();
                    break;
                default:
                    throw new IllegalArgumentException("Geçersiz rakam: " + rakam);
            }
        }
    }

    @And("Yatırım tutarı eksi ikiyüz tl olarak girilir")
    public void yatırımTutarıEksiIkiyüzTlOlarakGirilir() {
        calculatorPage.buttons.twoButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.turnNegativeButton.click();
    }

    @When("Yüzde sıfır faiz oranı ile bir yıllık yatırım getirisi hesaplanır")
    public void yüzdeSıfırFaizOranıIleBirYıllıkYatırımGetirisiHesaplanır() {
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.multiplicationButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.equalsButton.click();
        ReusableMethods.waitFor(1);
        calculatorPage.buttons.additionButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.equalsButton.click();
        sonuc = calculatorPage.result.getText();
        System.out.println("Hesaplama sonucu: " + sonuc);
        ReusableMethods.waitFor(1);
        calculatorPage.buttons.acButton.click();
    }
}
