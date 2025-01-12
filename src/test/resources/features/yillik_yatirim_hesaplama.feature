Feature: Yıllık Yatırım Hesaplama

  @yillikyatirimhesaplama
  Scenario: Pozitif Faiz Oranı İle Yıllık Yatırım Hesaplaması
    When Yüzde dört faiz oranı ile bir yıllık yatırım getirisi hesaplanır
    And Yatırım tutarı ikiyüz tl olarak girilir
    And İkiyüz tlnin bir yıllık yatırım getirisi hesaplanır
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "208" değeri görünmelidir

  @yillikyatirimhesaplama
  Scenario: Negatif Yatırım Tutarı İle Yıllık Yatırım Hesaplaması
    When Yüzde dört faiz oranı ile bir yıllık yatırım getirisi hesaplanır
    And Yatırım tutarı eksi ikiyüz tl olarak girilir
    And İkiyüz tlnin bir yıllık yatırım getirisi hesaplanır
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "-208" değeri görünmelidir

  @yillikyatirimhesaplama
  Scenario: Sıfır Faizli Yıllık Yatırım Hesaplaması
    When Yüzde sıfır faiz oranı ile bir yıllık yatırım getirisi hesaplanır
    And Yatırım tutarı ikiyüz tl olarak girilir
    And İkiyüz tlnin bir yıllık yatırım getirisi hesaplanır
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "200" değeri görünmelidir