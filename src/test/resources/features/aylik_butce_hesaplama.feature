Feature: Aylık Bütçe Hesaplama

  @aylikbutcehesaplama
  Scenario: Pozitif Gelir ve Gider İle Aylık Bütçe Hesaplaması
    When Gelir tutarı bin tl olarak girilir
    And Gider tutarı sekizyüz tl olarak girilir
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "200" değeri görünmelidir

  @aylikbutcehesaplama
  Scenario: Gelir Ve Gider Eşit Olduğunda Aylık Bütçe Hesaplaması
    When Gelir tutarı bin tl olarak girilir
    And Gider tutarı bin tl olarak girilir
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "0" değeri görünmelidir

  @aylikbutcehesaplama
  Scenario: Gelir Sıfırken Gider Girildiğinde Aylık Bütçe Hesaplaması
    When Gelir tutarı sıfır tl olarak girilir
    And Gider tutarı sekizyüz tl olarak girilir
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "-800" değeri görünmelidir

  @aylikbutcehesaplama
  Scenario: Negatif Gider Girildiğinde Aylık Bütçe Hesaplaması
    When Gelir tutarı bin tl olarak girilir
    And Gider tutarı eksi sekizyüz tl olarak girilir
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "1800" değeri görünmelidir