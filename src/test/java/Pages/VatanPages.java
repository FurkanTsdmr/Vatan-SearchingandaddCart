package Pages;
import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class VatanPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;


    static By acceptCookies = By.xpath("//div[@class='banner-accept-button']");
    static By clickSearchButton = By.id("navbar-search-input");
    static By returnHomePage = By.xpath("//img[@alt='Vatan Bilgisayar']");
    static By selectFirstProduct = By.xpath("//div[@class='owl-item active']//img[@class='owl-lazy']");
    static By addingCart = By.xpath("//span[normalize-space()='Sepete Ekle']");
    static  By clickTheBasket = By.xpath("//input[@value='SEPETE GİT']\n");

    public VatanPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public static void userIsOnHomePage() {

    }
    public static void clickAcceptCookies() {
        elementHelper.click(acceptCookies);

    }

    public static void clickTheSearchButton() {
        elementHelper.click(clickSearchButton);
    }

    public static void writeProductName() {
        elementHelper.findElement(clickSearchButton).sendKeys("ROBOROCK");
    }

    public static void clickSearchButton() {
        elementHelper.click(clickSearchButton);
    }


    public static void returnTheHomePage() {
        elementHelper.click(returnHomePage);
    }


    public static void selectTheFirstProduct() {
        elementHelper.click(selectFirstProduct);
    }

    public static void addingTheCart() {
        elementHelper.click(addingCart);
    }

    public static void clickTheBasket() {
        elementHelper.click(clickTheBasket);
    }



}
