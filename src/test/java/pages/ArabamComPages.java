package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ArabamComPages {

    public ArabamComPages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='header__container']/a")
    public WebElement arabamComTitle;


    @FindBy(xpath = "//a[@aria-label='Giriş Yap']")
    public WebElement girisYapButon;


    @FindBy(xpath = "//button[@id='btnLoginWithGoogle']")
    public WebElement googleGirisButtom;

    @FindBy(xpath = "//h1[@id='headingText']/span")
    public WebElement googleMailEkranı;

    @FindBy(xpath = "//div[@id='selectionc1']")
    public WebElement googleSifreEkrani;


    @FindBy(xpath = "(//div[@class='Xb9hP']/input)[1]")
    public WebElement emailAlani;

    @FindBy(xpath= "//div[@aria-live='assertive']//span")
    public WebElement hatalıMailUyarısı;

    @FindBy(xpath= "//div[@jsname='B34EJ']/span")
    public WebElement hatalıSifreUyarısı;



    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordAlani;

    @FindBy(xpath = "//span[contains(text(),'Sonraki')]")
    public WebElement sonrakiButon;

    @FindBy(xpath = "(//*[@class='check-mark'])[1]")
    public WebElement ilkOnayButonu;


    @FindBy(xpath = "//button[contains(text(),'Tamam')]")
    public WebElement tamamButonu;



    @FindBy(xpath = "(//*[@class='check-mark'])[2]")
    public WebElement ikinciOnayButonu;

   @FindBy(xpath = "//button[contains(text(),'Üyeliğimi Oluştur')]")
    public WebElement uyeligimiOlustur;



    @FindBy(xpath = "//input[@class='input']")
    public WebElement aramaAlanı;


    @FindBy(xpath = "//h2[contains(text(),'Son Bir Adım Kaldı')]")
    public WebElement uyelikAdimi;



    @FindBy(xpath = "//button[@class='search-button']")
    public WebElement searchButton;

    @FindBy(css = "tbody tr:nth-child(2) td:nth-child(5) ")
    public WebElement birinciSıradakiArac;

    @FindBy(xpath= "(//tr[@class='listing-list-item pr should-hover bg-white'])[1]")
    public WebElement ilkAraba;
    @FindBy(xpath= "(//tr[@class='listing-list-item pr should-hover bg-white'])[2]")
    public WebElement ikinciAraba;
    @FindBy(xpath = "(//tr[@class='listing-list-item pr should-hover bg-white'])[3]")
    public WebElement ücüncüAraba;

    @FindBy(css = "tbody tr:nth-child(3) td:nth-child(5) ")
    public WebElement ikinciSıradakiArac;
    @FindBy(css = "tbody tr:nth-child(4) td:nth-child(5) ")
    public WebElement ücüncüSıradakiArac;


    @FindBy(xpath = "(//span[contains(text(),'Hyundai')])[2]")
    public WebElement HundaiMarka;

    @FindBy(css = "Sonuç")
    public WebElement ArabaSonuc;


    @FindBy(css = "tbody tr:nth-child(2) td:nth-child(2)")
    public WebElement ilkMarkaKontrol;


    @FindBy(xpath = "//div[@class='product-price']")
    public WebElement seçilenAraba;

}
