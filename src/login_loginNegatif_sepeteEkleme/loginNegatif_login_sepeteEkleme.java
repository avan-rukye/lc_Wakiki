package login_loginNegatif_sepeteEkleme;



import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginNegatif_login_sepeteEkleme extends BaseDriver {

    @Test
    public void Test1() {
        /*
HESAP AÇMA (Negatif)
1. Kullanıcı https://www.lcw.com/ sitesini tarayıcıda açar.
2. Ana sayfada "Giriş" seçeneğine tıklar.
3. "Üye ol" butonuna tıklar.
4. e posta gönder, şifre (geçersiz) gönder, telefon no gönder, e-posta seçeneğini seç, gizlilik söz seç
   üye ol butonuna tıklar
5."Şifreniz 1 harf, 1 rakam ve en az 6 karakter içermelidir" mesajını görüntülenir.

 */
        driver.get("https://www.lcw.com/");
        MyFunc.Bekle(3);


        WebElement girisYap = driver.findElement(By.xpath("//SPAN[@class='dropdown-label'][text()='Giriş Yap']"));
        girisYap.click();

        WebElement uyeOl = driver.findElement(By.xpath("//SPAN[@id='registerButton']"));
        uyeOl.click();

        WebElement eposta = driver.findElement(By.xpath("//INPUT[@placeholder='E-Posta Adresin']"));
        eposta.sendKeys("avanrukiye3@gmail.com");

// kriterler : en az bir harf, en az bir rakam, en az altı karakter
        WebElement sifre = driver.findElement(By.xpath("//INPUT[@placeholder='Şifreniz']"));
        sifre.sendKeys("111111");
        MyFunc.Bekle(6);

        WebElement telefon = driver.findElement(By.xpath("//INPUT[@class='register__phone text-input']"));
        telefon.sendKeys("466619950");

        WebElement eposta_kutu = driver.findElement(By.xpath("//SPAN[@class='checkbox-span'][text()='E-Posta']"));
        eposta_kutu.click();

        WebElement gizlilik_sozlesme = driver.findElement(By.xpath("(//INPUT[@type='checkbox'])[4]"));
        gizlilik_sozlesme.click();

        WebElement uye_ol_buton = driver.findElement(By.xpath("//BUTTON[@lang='tr-TR'][text()='Üye Ol']"));
        uye_ol_buton.click();}

        @Test
        public void Test2 () {

        /*
HESAP AÇMA
1. Kullanıcı https://www.lcw.com/ sitesini tarayıcıda açar.
2. Ana sayfada "Giriş" seçeneğine tıklar.
3. "Üye ol" butonuna tıklar.
4. e posta gönder, şifre  gönder, telefon no gönder, e-posta seçeneğini seç, gizlilik söz seç
   üye ol butonuna tıklar
5.Başarılı kayıt yapılır.

 */
            driver.get("https://www.lcw.com/");
            MyFunc.Bekle(3);


            WebElement girisYap1 = driver.findElement(By.xpath("//SPAN[@class='dropdown-label'][text()='Giriş Yap']"));
            girisYap1.click();

            WebElement uyeOl1 = driver.findElement(By.xpath("//SPAN[@id='registerButton']"));
            uyeOl1.click();

            WebElement eposta1 = driver.findElement(By.xpath("//INPUT[@placeholder='E-Posta Adresin']"));
            eposta1.sendKeys("avanrukiye3@gmail.com");

// kriterler : en az bir harf, en az bir rakam, en az altı karakter
            WebElement sifre1 = driver.findElement(By.xpath("//INPUT[@placeholder='Şifreniz']"));
            sifre1.sendKeys("test6484");
            MyFunc.Bekle(6);

            WebElement telefon1 = driver.findElement(By.xpath("//INPUT[@class='register__phone text-input']"));
            telefon1.sendKeys("466619950");

            WebElement eposta_kutu1 = driver.findElement(By.xpath("//SPAN[@class='checkbox-span'][text()='E-Posta']"));
            eposta_kutu1.click();

            WebElement gizlilik_sozlesme1 = driver.findElement(By.xpath("(//INPUT[@type='checkbox'])[4]"));
            gizlilik_sozlesme1.click();

            WebElement uye_ol_buton1 = driver.findElement(By.xpath("//BUTTON[@lang='tr-TR'][text()='Üye Ol']"));
            uye_ol_buton1.click();

        }

        @Test
        public void Test3 () {
        /*
SEPETE EKLEME
1. Kullanıcı https://www.lcw.com/ sitesini tarayıcıda açar.
2. Ana sayfada arama "Siyah Kaban" yaz ve butona tıklar.
3. Ürüne tıklar.
4. Beden bilgisi seç (36 beden) ve ödemeye geçer


 */

            WebElement search = driver.findElement(By.xpath("//INPUT[@id='search-form__input-field__search-input']"));
            search.sendKeys("Siyah Kaban");

            WebElement searchButton = driver.findElement(By.xpath("//BUTTON[@class='search-form__input-field__btn-search false'][text()='Ara']"));
            searchButton.click();

            WebElement urunSec = driver.findElement(By.xpath("(//IMG[@class='product-image__image'])[1]"));
            urunSec.click();

            WebElement beden = driver.findElement(By.xpath("(//A[@href='javascript:;'][text()='36'])[2]"));
            beden.click();

            WebElement sepetEkle = driver.findElement(By.xpath("//A[@id='pd_add_to_cart']"));
            sepetEkle.click();
            MyFunc.Bekle(5);

            WebElement sepetGit = driver.findElement(By.xpath("//SPAN[@class='dropdown-label'][text()='Sepetim']"));
            sepetGit.click();
            MyFunc.Bekle(5);

            WebElement odemeGec = driver.findElement(By.xpath("(//A[@href='https://www.lcw.com/checkout#adres'][text()='ÖDEME ADIMINA GEÇ'])[2]"));
            odemeGec.click();




    }

    }
