Feature: Wask

  @Wask
  Scenario: ArabamCom sitesine Google ile giriş yapılıp aratılan markanın en ucuz fiyatlı arabanın seçilmesi testi

    Given Kullanici arabamCom anasayfasina gider
    When Ana sayfanın açıldığı kontrol edilir.
    And Kullanici giriş yap butonuna tıklar
    And Kullanıcı Google ile devam et butonuna tıklar.
    Then Kullanıcı Google mail ekranında olduğunu görür
    And Kullanıc hatalı bir mail adresi girer.
    And Kullanıcı Sonraki butonuna tıklar.
    Then Kullanıcı hatalı mail uyarısını görür
    When Kullanıcı Açılan mail ekranına doğru bir email girer.
    And Kullanıcı Sonraki butonuna tıklar.
    And Kullanıcı şifre ekranında olduğunu görür
    And Kullanıcı hatalı  şifre girer.
    And Kullanıcı Sonraki butonuna tıklar.
    Then Kullanıcı Hatalı şifre uyarısını görür.
    When Kullanıcı maile ait doğru sifreyi girer.
    And Kullanıcı Sonraki butonuna tıklar.
    And Kullanıcı için üye girişi ekranı açılır
    And Kullanıcı üyeligimi olusturur.
    And Kullanıcı arabamcom anasayfasına yönderilir.
    Then Kullanıcı arabamcom anasayfasına geldiğini doğrular.
    When Kullanıcı "Hyundai" Araba markası aratır.
    And Aranılan markanın listelendiği görülür.
    And Kullanıcı ilk üç sıradaki arabaların en ucuz olanına tıklanir.
    Then En ucuz arabanın açıldığı görülür.

