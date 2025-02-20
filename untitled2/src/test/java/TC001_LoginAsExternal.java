import com.shaft.driver.SHAFT;
import lombok.SneakyThrows;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC001_LoginAsExternal {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON userCredentials;

    @SneakyThrows
    @Test(description = "Login As Admin")
    public void LoginAsExternal_Test() {
        new Login_Page(driver).Login_ExternalUser("bakhit889@gmail.com","P@ssw0rd");
        new OpenCTforMedicineRequest_Page(driver).OpenCTforMedicineRequest();
       // new CreateNonInterventional_Page(driver).CreateNonInterventional();
      //  new OpenCTforMedicineRequest_Page(driver).OpenCTforMedicineRequest();
      // new CreateInterventional_page(driver).CreateInterventional();
      //  new OpenCTforMedicineRequest_Page(driver).OpenCTforMedicineRequest();
        new CreateSpecialPath_page(driver).CreateSpecialPath();

    }

       @BeforeClass(description = "Setup Test Data.")
    public void beforeClass() {
        driver = new SHAFT.GUI.WebDriver();
       //userCredentials = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/userCredentials.json");
    }
}




