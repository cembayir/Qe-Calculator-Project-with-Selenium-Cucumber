Feature: Günlük Gider Takibi

  @gunlukgiderhesaplama
  Scenario: Tüm Gider Kalemlerinin Toplamı İle Günlük Gider Hesaplanması
    When Yemek gideri yirmi tl olarak girilir
    And Ulaşım gideri on tl olarak girilir
    And Kahve gideri beş tl olarak girilir
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "35" değeri görünmelidir

  @gunlukgiderhesaplama
  Scenario: Negatif Gider Kalemi İle Günlük Gider Hesaplanması
    When Bir gider kalemi eksi on tl olarak girilir
    And Kahve gideri beş tl olarak girilir
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "-5" değeri görünmelidir