package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ArabamComPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReasuableMethods;

import java.util.Objects;


public class StepDefinitions {


    ArabamComPages arabamComPages = new ArabamComPages();


    @Given("Kullanici arabamCom anasayfasina gider")
    public void kullanici_arabam_com_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("arabamcomUrl"));


    }


    @When("Ana sayfanın açıldığı kontrol edilir.")
    public void ana_sayfanın_açıldığı_kontrol_edilir() {

        arabamComPages.arabamComTitle.isDisplayed();
        ReasuableMethods.waitFor(1);

    }


    @And("Kullanici giriş yap butonuna tıklar")
    public void kullaniciGirişYapButonunaTıklar() {

        arabamComPages.girisYapButon.click();
        ReasuableMethods.waitFor(1);

    }

    @And("Kullanıcı Google ile devam et butonuna tıklar.")
    public void kullanıcıGoogleIleDevamEtButonunaTıklar() {

        arabamComPages.googleGirisButtom.click();
        ReasuableMethods.waitFor(2);

        ReasuableMethods.switchToWindow("Oturum açın - Google Hesapları - Google Chrome");

        ReasuableMethods.waitFor(2);

    }


    @Then("Kullanıcı Google mail ekranında olduğunu görür")
    public void kullanıcıGoogleMailEkranındaOlduğunuGörür() {


        Assert.assertTrue(arabamComPages.googleMailEkranı.isDisplayed());
    }


    @And("Kullanıc hatalı bir mail adresi girer.")
    public void kullanıchatalıBirMailAdresiGirer() {



        arabamComPages.emailAlani.sendKeys("semiharpacik99@gmail.com");
        ReasuableMethods.waitFor(2);

    }

    @Then("Kullanıcı hatalı mail uyarısını görür")
    public void kullanıcıHatalıMailUyarısınıGörür() {

        Assert.assertTrue(arabamComPages.hatalıMailUyarısı.isDisplayed());
    }


    @And("Kullanıcı Açılan mail ekranına doğru bir email girer.")
    public void kullanıcıAçılanMailEkranınadogruBirEmailGirer() {

        //ReasuableMethods.switchToWindow("Oturum açın - Google Hesapları - Google Chrome");

        // ReasuableMethods.waitFor(2);

        arabamComPages.emailAlani.clear();
        ReasuableMethods.waitFor(1);
        arabamComPages.emailAlani.sendKeys("semiharpacik82@gmail.com");
        ReasuableMethods.waitFor(2);
    }

    @And("Kullanıcı Sonraki butonuna tıklar.")
    public void kullanıcıSonrakiButonunaTıklar() {

        arabamComPages.sonrakiButon.click();
        ReasuableMethods.waitFor(1);
    }

    @And("Kullanıcı şifre ekranında olduğunu görür")
    public void kullanıcıŞifreEkranındaOlduğunuGörür() {

        arabamComPages.googleSifreEkrani.isDisplayed();
    }


    @And("Kullanıcı hatalı  şifre girer.")
    public void kullanıcıhatalıŞifreGirer() {

        ReasuableMethods.waitFor(3);
        arabamComPages.passwordAlani.sendKeys(" ");
        ReasuableMethods.waitFor(1);

    }

    @Then("Kullanıcı Hatalı şifre uyarısını görür.")
    public void kullanıcıHatalıŞifreUyarısınıGörür() {


        Assert.assertTrue(arabamComPages.hatalıSifreUyarısı.isDisplayed());
    }


    @And("Kullanıcı maile ait doğru sifreyi girer.")
    public void kullanıcıSifreGirer() {

        ReasuableMethods.waitFor(2);

        arabamComPages.passwordAlani.clear();
        ReasuableMethods.waitFor(1);
        arabamComPages.passwordAlani.sendKeys("Baterist91.");
        ReasuableMethods.waitFor(3);
    }



    @And("Kullanıcı için üye girişi ekranı açılır")
    public void kullanıcıIçinÜyeGirişiEkranıAçılır() {


        ReasuableMethods.switchToWindow("Üye Girişi");
        ReasuableMethods.waitFor(2);

    }

    @And("Kullanıcı üyeligimi olusturur.")
    public void kullanıcıÜyeligimiOlusturur() {

        WebElement uyelikElement = null;
        try {
            uyelikElement = Driver.getDriver().findElement(By.xpath("//h2[contains(text(),'Son Bir Adım Kaldı')]"));
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Element bulunmazsa gelmez
        }


        if (uyelikElement != null) {

            System.out.println(uyelikElement.getText());
            ReasuableMethods.waitFor(2);
            arabamComPages.ilkOnayButonu.click();
            ReasuableMethods.waitFor(1);
            arabamComPages.tamamButonu.click();
            ReasuableMethods.waitFor(2);
            arabamComPages.ikinciOnayButonu.click();
            ReasuableMethods.waitFor(2);
            arabamComPages.uyeligimiOlustur.click();
        } else
            arabamComPages.aramaAlanı.sendKeys("hyundai");
        arabamComPages.aramaAlanı.clear();

    }

    @And("Kullanıcı arabamcom anasayfasına yönderilir.")
    public void kullanıcıArabamcomAnasayfasınaYönderilir() {

        arabamComPages.arabamComTitle.isDisplayed();
    }

    @Then("Kullanıcı arabamcom anasayfasına geldiğini doğrular.")
    public void kullanıcıArabamcomAnasayfasınaGeldiğiniDoğrular() {

        Assert.assertTrue(arabamComPages.arabamComTitle.isDisplayed());

    }


    @When("Kullanıcı {string} Araba markası aratır.")
    public void kullanıcıArabaMarkasıAratır(String arg0) {

        arabamComPages.aramaAlanı.sendKeys("Hyundai");
        arabamComPages.searchButton.click();

        ReasuableMethods.JSEScrollBy();
        ReasuableMethods.waitFor(1);

    }


    @And("Aranılan markanın listelendiği görülür.")
    public void aranılanMarkanınListelendiğiGörülür() {


        Assert.assertTrue(arabamComPages.HundaiMarka.isDisplayed());
        // Assert.assertTrue(arabamComPages.ArabaSonuc.isDisplayed());
        Assert.assertTrue(arabamComPages.ilkMarkaKontrol.getText().contains("Hyundai"));


    }


    @And("Kullanıcı ilk üç sıradaki arabaların en ucuz olanına tıklanir.")
    public void kullanıcıIlkÜçSıradakiArabalarınEnUcuzOlanınaTıklanir() {

        String birincisayı = arabamComPages.birinciSıradakiArac.getText();
        System.out.println(birincisayı);
        int birinciSSAYI = Integer.parseInt(birincisayı.substring(0, 3) + birincisayı.substring(4, 7));

        System.out.println(birinciSSAYI);

        String ikincisayı = arabamComPages.ikinciSıradakiArac.getText();
        System.out.println(ikincisayı);
        int ikinciSSAYI = Integer.parseInt(ikincisayı.substring(0, 3) + ikincisayı.substring(4, 7));
        System.out.println(ikinciSSAYI);

        String ücüncüSayı = arabamComPages.ücüncüSıradakiArac.getText();
        System.out.println(ücüncüSayı);
        int ücüncüSSAYI = Integer.parseInt(ücüncüSayı.substring(0, 3) + ikincisayı.substring(4, 7));
        System.out.println(ücüncüSSAYI);


        if (birinciSSAYI < ikinciSSAYI && birinciSSAYI < ücüncüSSAYI) {
            arabamComPages.ilkAraba.click();
            System.out.println(birinciSSAYI);
        } else if (ikinciSSAYI < birinciSSAYI && ikinciSSAYI < ücüncüSSAYI) {
            System.out.println(ikinciSSAYI);
            arabamComPages.ikinciAraba.click();
        } else if (ücüncüSSAYI < birinciSSAYI && ücüncüSSAYI < ikinciSSAYI) {
            System.out.println(ücüncüSSAYI);
            arabamComPages.ücüncüAraba.click();
        } else {
            arabamComPages.ilkAraba.click();
        }


    }

    @And("En ucuz arabanın açıldığı görülür.")
    public void enUcuzArabanınAçıldığıGörülür() {

        Assert.assertTrue(arabamComPages.seçilenAraba.isDisplayed());

        ReasuableMethods.waitFor(1);

       // Driver.CloseDriver();

        Driver.getDriver().quit();
    }



}
