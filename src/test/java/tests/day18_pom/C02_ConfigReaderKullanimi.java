package tests.day18_pom;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanimi {


    @Test
    public void test01 (){
        FacebookPage facebookPage = new FacebookPage();

        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        // cikarsa cookies kabul edin gelmediiiii
        // kullanici mail kutusuna yanlış kullnıcı adı yazdirin
          facebookPage.mailKutusu.sendKeys(ConfigReader.getProperty("facebookWrongUserName"));

        // kullanici sifre kutusuna yanlış password yazdirin
        facebookPage.sifreKutusu.sendKeys(ConfigReader.getProperty("facebookWrongPassword"));

        // login butonuna basin
        facebookPage.loginTusu.click();

        // giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());

        Driver.getDriver();

           }
}
