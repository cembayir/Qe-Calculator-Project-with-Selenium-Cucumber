package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CalculatorPage;
import utilities.ReusableMethods;

public class DovizDonusumuStepDefs {
    CalculatorPage calculatorPage = new CalculatorPage();
    private String komisyonTutari;
    private String netTutar;
    private String sonuc;

    @When("Yüzde sıfır nokta iki komisyon ile otuzaltı bin tlnin komisyon tutarı belirlenir")
    public void yüzdeSıfırNoktaIkiKomisyonIleOtuzaltıBinTlninKomisyonTutarıBelirlenir() {
        calculatorPage.buttons.threeButton.click();
        calculatorPage.buttons.sixButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.multiplicationButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.commaButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.twoButton.click();
        calculatorPage.buttons.equalsButton.click();
        ReusableMethods.waitFor(1);
        komisyonTutari = calculatorPage.result.getText();
        System.out.println("%0,002 Komisyon Tutarı: " + komisyonTutari);
        ReusableMethods.waitFor(1);
        calculatorPage.buttons.acButton.click();
    }

    @And("Komisyon tutarı otuzaltı bin tlden çıkartılır ve net tutar bulunur")
    public void komisyonTutarıOtuzaltıBinTldenÇıkartılırVeNetTutarBulunur() {
        calculatorPage.buttons.threeButton.click();
        calculatorPage.buttons.sixButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.subtractionButton.click();
        String temizSonuc = komisyonTutari.replaceAll("[^0-9,]", "");

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
        calculatorPage.buttons.equalsButton.click();
        ReusableMethods.waitFor(1);
        netTutar = calculatorPage.result.getText();
        System.out.println("Net Tutar: " + netTutar);
        ReusableMethods.waitFor(1);
        calculatorPage.buttons.acButton.click();
    }

    @And("Net tutar dolar kuruna bölünerek otuzaltı bin tlnin dolar karşılığı bulunur")
    public void netTutarDolarKurunaBölünerekOtuzaltıBinTlninDolarKarşılığıBulunur() {
        String temizSonuc = netTutar.replaceAll("[^0-9,]", "");

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
        calculatorPage.buttons.divisionButton.click();
        calculatorPage.buttons.threeButton.click();
        calculatorPage.buttons.threeButton.click();
        calculatorPage.buttons.commaButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.equalsButton.click();
    }

    @When("Yüzde sıfır nokta bir komisyon ile otuzaltı bin tlnin komisyon tutarı belirlenir")
    public void yüzdeSıfırNoktaBirKomisyonIleOtuzaltıBinTlninKomisyonTutarıBelirlenir() {
        calculatorPage.buttons.threeButton.click();
        calculatorPage.buttons.sixButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.multiplicationButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.commaButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.oneButton.click();
        calculatorPage.buttons.equalsButton.click();
        ReusableMethods.waitFor(1);
        komisyonTutari = calculatorPage.result.getText();
        System.out.println("%0,001 Komisyon Tutarı: " + komisyonTutari);
        ReusableMethods.waitFor(1);
        calculatorPage.buttons.acButton.click();
    }

    @And("Net tutar euro kuruna bölünerek otuzaltı bin tlnin euro karşılığı bulunur")
    public void netTutarEuroKurunaBölünerekOtuzaltıBinTlninEuroKarşılığıBulunur() {
        String temizSonuc = netTutar.replaceAll("[^0-9,]", "");

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
        calculatorPage.buttons.divisionButton.click();
        calculatorPage.buttons.threeButton.click();
        calculatorPage.buttons.sixButton.click();
        calculatorPage.buttons.commaButton.click();
        calculatorPage.buttons.fiveButton.click();
        calculatorPage.buttons.zeroButton.click();
        calculatorPage.buttons.equalsButton.click();
    }
}