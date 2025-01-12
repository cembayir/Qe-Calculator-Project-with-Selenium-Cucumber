Feature: Kısa Vadeli Yatırım Hesaplama

  @kisavadeyatirimhesaplama
  Scenario: Kısa Vadeli Pozitif Yatırımlı Yatırım Hesaplaması
    When Yüzde üç faiz oranı ile altı aylık yatırım getirisi hesaplanır
    And Yatırım tutarı beşyüz tl olarak girilir
    And Beşyüz tlnin altı aylık yatırım getirisi hesaplanır
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "507,5" değeri görünmelidir

  @kisavadeyatirimhesaplama
  Scenario: Kısa Vadeli Negatif Yatırımlı Yatırım Hesaplaması
    When Yüzde üç faiz oranı ile altı aylık yatırım getirisi hesaplanır
    And Yatırım tutarı eksi beşyüz tl olarak girilir
    And Beşyüz tlnin altı aylık yatırım getirisi hesaplanır
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "-507,5" değeri görünmelidir

  @kisavadeyatirimhesaplama
  Scenario: Kısa Vadeli Sıfır Faizli Yatırım Hesaplaması
    When Yüzde sıfır faiz oranı ile altı aylık yatırım getirisi hesaplanır
    And Yatırım tutarı beşyüz tl olarak girilir
    And Beşyüz tlnin altı aylık yatırım getirisi hesaplanır
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "500" değeri görünmelidir

  @kisavadeyatirimhesaplama
  Scenario: Kısa Vadeli Negatif Süreli Yatırım Hesaplaması
    When Yüzde üç faiz oranı ile eksi altı aylık yatırım getirisi hesaplanır
    When Yatırım tutarı beşyüz tl olarak girilir
    And Beşyüz tlnin altı aylık yatırım getirisi hesaplanır
    And Eşittir butonuna tıklanır
    Then Sonuç ekranında "492,5" değeri görünmelidir