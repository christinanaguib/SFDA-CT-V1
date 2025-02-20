import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class OpenCTforMedicineRequest_Page {

    private SHAFT.GUI.WebDriver driver;
    //*********************Constructor*********************//

    public OpenCTforMedicineRequest_Page(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    public By Account_grid = By.xpath("(//*[contains(text(),'C-0325')])[1]");
    //public By Services_tab = By.xpath("(//span[@class='margin-left-s text-neutral-8 white-space-nowrap font-size-base ThemeGrid_MarginGutter'])[2]");
    public By Services_tab = By.xpath("    //*[contains(text(),'الخدمات')]\n");
    public By Medecine_tab = By.xpath("(//span[@class='font-size-xs margin-left-s ThemeGrid_MarginGutter'])[4]");
    public By CT_box = By.xpath("(//*[contains(text(),'الدراسات السريرية')])[2]");
    public By StartService_btn = By.xpath("//*[contains(text(),'ابدأ الخدمة')]");

    public By activity_radiobox = By.xpath("(//input[@class='radio-button'])[1]");
    public By Confirmation_btn = By.xpath("(//button[@class='btn btn-primary'])[2]");



public void OpenCTforMedicineRequest() {
    driver.element()
            //.click(Account_grid)
            .click(Services_tab).click(Medecine_tab)
            .click(CT_box);
    System.out.println(driver.element().isElementClickable(StartService_btn));
            driver.element().hover(StartService_btn)

                    .click(StartService_btn);
    System.out.println(driver.element().isElementDisplayed(activity_radiobox));
    driver.element().click(activity_radiobox)
            .click(activity_radiobox)

            .click(Confirmation_btn)

            ;
}

}
