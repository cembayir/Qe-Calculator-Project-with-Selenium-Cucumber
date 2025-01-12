Feature: Kredi Karşılaştırması

  @kredikarsilastirma
  Scenario: Kredi-1 için aylık ödeme hesaplaması
    When Kredi tutarı çarpı aylık faiz oranı hesaplanır
    And Aylık faiz oranı üzerine bir eklenir ve üstel kuvvet alınır
    And Kredi tutarı ile aylık faiz oranı çarpılarak üst kısım hesaplanır
    And Üst kısım alt kısma bölünür ve aylık ödeme bulunur
    Then Sonuç ekranında "106,65" değeri görünmelidir