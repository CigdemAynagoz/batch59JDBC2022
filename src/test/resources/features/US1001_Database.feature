Feature:  US1001 kullanici dogru bilgilerle database baglanabilmeli

  Scenario: TC01 Kullanici database'deki bilgileri okur

    Given kullanici HMC veri tabanina baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici "Price" sutunundaki verileri okur