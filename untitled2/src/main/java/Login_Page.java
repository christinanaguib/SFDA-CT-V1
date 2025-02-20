import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Login_Page {
    private SHAFT.GUI.WebDriver driver;
    private String Externalurl = "https://outtest.sfda.gov.sa/SFDA_ExternalPortal/Login";
    //*********************Constructor*********************//
    public Login_Page(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    public By Email_txt = By.xpath("//span[@class='input-text']//input");
    public By Password_txt = By.xpath("//span[@class='input-password']//input");
    public By Login_btn = By.xpath("//button[@class='btn btn-primary OSFillParent']");
    public By otp1_txt = By.xpath("(//span[@class='input-text']//input)[2]");
    public By otp2_txt = By.xpath("(//span[@class='input-text']//input)[3]");
    public By otp3_txt = By.xpath("(//span[@class='input-text']//input)[4]");
    public By otp4_txt = By.xpath("(//span[@class='input-text']//input)[5]");
    public By confirm_btn = By.xpath("//button[@class='btn btn-primary']");
    public By MyAccount_Label = By.xpath("//div[@class='ThemeGrid_Width2']");
    public By Account_grid = By.xpath("(//*[contains(text(),'C-0325')])[1]");

//

    public void Login_ExternalUser(String email ,String password) {
        driver.browser().navigateToURL(Externalurl);
        driver.assertThat().element(Email_txt).exists().perform();
        driver.element().type(Email_txt,email)
                        .type(Password_txt,password)
                .click(Login_btn)
                .type(otp1_txt,"1")
                .type(otp2_txt,"2")
                .type(otp3_txt,"3")
                .type(otp4_txt,"4")
                .click(confirm_btn);
        driver.assertThat().element(MyAccount_Label).exists().perform();
        driver.element().click(Account_grid)
        ;




        }
}
