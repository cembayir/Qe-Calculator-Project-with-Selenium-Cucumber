Feature: Döviz Dönüşümü

  @dovizdonusumu
  Scenario: TL'den USD'ye Dönüşüm
    When Yüzde sıfır nokta iki komisyon ile otuzaltı bin tlnin komisyon tutarı belirlenir
    And Komisyon tutarı otuzaltı bin tlden çıkartılır ve net tutar bulunur
    And Net tutar dolar kuruna bölünerek otuzaltı bin tlnin dolar karşılığı bulunur
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "1085,44" değeri görünmelidir

  @dovizdonusumu
  Scenario: TL'den EURO'ya Dönüşüm
    When Yüzde sıfır nokta bir komisyon ile otuzaltı bin tlnin komisyon tutarı belirlenir
    And Komisyon tutarı otuzaltı bin tlden çıkartılır ve net tutar bulunur
    And Net tutar euro kuruna bölünerek otuzaltı bin tlnin euro karşılığı bulunur
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "985,32" değeri görünmelidir