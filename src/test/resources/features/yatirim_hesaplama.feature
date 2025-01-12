Feature: Yatırım Hesaplama

  @yatirimhesaplama
  Scenario: Pozitif Yatırım Hesaplaması
    When Yüz tl yatırım tutarı girilir
    And Yüzde beş faiz oranı girilir
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "105" değeri görünmelidir

  @yatirimhesaplama
  Scenario: Sıfır Faizli Yatırım Hesaplaması
    When Yüz tl yatırım tutarı girilir
    And Yüzde sıfır faiz oranı girilir
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "0" değeri görünmelidir

  @yatirimhesaplama
  Scenario: Negatif Yatırım Tutarı İle Yatırım Hesaplaması
    When Eksi yüz tl yatırım tutarı girilir
    And Yüzde beş faiz oranı girilir
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "-105" değeri görünmelidir