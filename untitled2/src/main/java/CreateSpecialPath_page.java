import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class CreateSpecialPath_page {
    private SHAFT.GUI.WebDriver driver;

    //*********************Constructor*********************//
    public CreateSpecialPath_page(SHAFT.GUI.WebDriver driver) {this.driver = driver;}

    //********************* Step 1 *********************//
    //tab 1

    public By SpecialPath_radio = By.xpath("//*[text()='Special Path / مسار الوصول الخاص']");
    public By Next_btn = By.xpath("//button[@class='btn btn-primary']");
    public By IsProgramApproved_btn = By.xpath("(//button[text()='نعم'])[1]");
    public By IsDrugRegistered_btn = By.xpath("(//button[text()='نعم'])[2]");
    public By IsDrugSubmitted_btn = By.xpath("(//button[text()='نعم'])[3]");
    public By StringentRegulatory_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[1]");
    public By StringentRegulatory_Value = By.xpath("//span[contains(text(),'جهة رقابية 1 - Stringent Regulatory Authority 1')]");
    public By StringentRegulatory2_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By ScientificTitleAR_txt = By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By ScientificTitleEN_txt = By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By ProtocolNumber_txt = By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By ProtocolVersion_txt = By.xpath("(//input[@class='form-control OSFillParent'])[4]");
    public By Protocol_Date= By.xpath("(//input[@class='form-control date-g OSFillParent is-calendarsPicker'])[1]");
    public By today_Date = By.xpath("//a[contains(@class,'calendars-today')]");

    public By TherapeuticArea_DropDown = By.xpath("(//div[@class='vscomp-toggle-button'])[3]");
    public By TherapeuticArea_Option = By.xpath("//span[contains(text(),'عنصر1 - element1')]");


    public By DiseaseName_DropDown = By.xpath("(//div[@class='vscomp-toggle-button'])[4]");
    public By DiseaseName_Option = By.xpath("//span[contains(text(),'تجربة 1 - test 1')]");
    // tab 2
    public By DoesItInvolves_btn = By.xpath("(//button[text()='نعم'])[4]");
    public By Specify_txt = By.xpath("(//textarea[@class='form-control  OSFillParent'])[2]");
    public By PlannedNo_txt = By.xpath("//input[@class='form-control OSFillParent not-valid']");
    public By AddInclusionExclusion_btn = By.xpath("(//div[@class='display-flex vertical-align'])[2]");
    public By InclusionCriteria_txt = By.xpath("(//textarea[@class='form-control  OSFillParent'])[3]");
    public By ExclusionCriteria_txt = By.xpath("(//textarea[@class='form-control  OSFillParent'])[4]");
    public By add_btn = By.xpath("(//button[@class='btn btn-primary ThemeGrid_MarginGutter'])[1]");

    //third tab
    public By PlannedStart_Date = By.xpath("(//input[@class='form-control date-g OSFillParent is-calendarsPicker'])[2]");
    public By todays_Date = By.xpath("//*[contains(@class,'calendars-today')]");
    public By PlannedEnd_Date = By.xpath("(//input[@class='form-control date-g OSFillParent is-calendarsPicker'])[3]");
    public By CollectingSample_btn = By.xpath("(//button[text()='نعم'])[5]");
    public By SampleName_txt = By.xpath("(//span[@class='input-text']/input)[9]");
    public By FateSample_txt = By.xpath("(//span[@class='input-text']/input)[10]");
    public By Tissue_txt = By.xpath("(//span[@class='input-text']/input)[11]");
    public By Notes_txt = By.xpath("(//textarea[@class='form-control  OSFillParent'])[3]");
    public By IsThereGeneticTesting_btn = By.xpath("(//button[text()='نعم'])[6]");
    public By Specify_txt2 = By.xpath("(//textarea[@class='form-control  OSFillParent'])[4]");
    public By IsThereFutureResearch_btn = By.xpath("(//button[text()='نعم'])[7]");
    public By Specify_txt3 = By.xpath("(//textarea[@class='form-control  OSFillParent'])[5]");
    public By IsThereDataCollection_btn = By.xpath("(//button[text()='نعم'])[8]");
    public By Ownership_txt = By.xpath("(//textarea[@class='form-control  OSFillParent'])[6]");
    public By AddObjective_btn = By.xpath("(//div[@class='display-flex vertical-align'])[3]");
    public By Objective_txt = By.xpath("(//textarea[@class='form-control  OSFillParent'])[7]");

    //********************* Step 2 *********************//
    public By RequestNum_txt = By.xpath("(//input[@class='form-control margin_bottom_none margin-bottom-none margin-top-xs OSFillParent'])");
    public By Search_btn = By.xpath("(//button[@class='btn btn-primary OSFillParent'])");
    public By DrugCategory_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])");
    public By DrugCategory_Value = By.xpath("(//span[@class='checkbox-icon'])[1]");

    //  public By DrugCategory_dropdown = By.xpath("//*[@id=\"vscomp-ele-wrapper-6555\"]/div");
    public By DrugSuCategory_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By HastheUseOfDrug_btn = By.xpath("(//button[text()='نعم'])[1]");
    public By HastheUseOfDrug2_btn = By.xpath("(//button[text()='نعم'])[2]");
    public By SCTR_txt = By.xpath("(//input[@class='form-control OSFillParent'])[8]");
    public By AddSCTR_btn = By.xpath("(//div[@class='display-flex vertical-align'])[1]");
    public By Next_btn2 = By.xpath("//button[@class='btn btn-primary ']");

    //********************* Step 3 *********************//

    public By InvolvesConcurrent_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[1]");
    public By InvolvesConcurrent_Value = By.xpath("//span[@data-tooltip=\"الدواء المصاحب - Concomitant Drug\"]");

    public By Addnewmedicine_btn = By.xpath("(//div[@class='display-flex vertical-align'])[1]");
    public By IsthedrugregisteredinSFDA_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By NoButRegisteredIn_Option = By.xpath("(//span[contains(text(),'لا ولكن مسجل في - No but registered in')])[1]");

    public By Registeredin_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[3]");//
    public By Drugregistrationnumber_txt = By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By ActiveIngredient_txt = By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By BrandName_txt = By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By DosageForm_txt = By.xpath("(//input[@class='form-control OSFillParent'])[4]");
    public By Strength_txt = By.xpath("(//input[@class='form-control OSFillParent'])[5]");
    public By RouteofAdministration_txt = By.xpath("(//input[@class='form-control OSFillParent'])[6]");
    public By PharmacologicalClass_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[4]");
    public By PharmacologicalClass_value = By.xpath("//span[@data-tooltip='فئة دوائية 1 - Pharmacological Class 1']");

    public By Next_btn3 = By.xpath("(//button[@class='btn btn-primary'])[2]");


    //********************* Step 4 *********************//

    public By IsClinicalTrialToBeConducted_btn = By.xpath("(//button[text()='نعم'])[1]");
    public By Addnewlocalservice_btn = By.xpath("//div[@class='display-flex vertical-align']");
    public By Companyname_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[1]");
    public By Contactpersonname_txt = By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By ContactpersonEmail_txt = By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By Contactpersonmobile_txt = By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By PleaselistthetypesofServicesEngaged_menu = By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By search_checkbox = By.xpath("(//span[@class='checkbox-icon vscomp-toggle-all-checkbox'])");
    public By details_txt = By.xpath("(//textarea[@class='form-control  OSFillParent'])");
    public By IstheLocalCROalsotheLocalSponsor_button = By.xpath("(//button[text()='نعم'])[2]");
    public By DelegationLetter_upload = By.xpath("(//input[@type='file'])[1]");
    public By confirmupload_label = By.xpath("(//*[contains(text(),'تم الرفع')])[1]");
// next btn 3

    //*********************ٍStep5 *********************//
    public By Doesthesponsor_button = By.xpath("//button[@class='button-group-item']");
    public By CompanyName_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[1]");
    public By NameContactPerson_txt = By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By Designation_txt = By.xpath("(//input[@class='form-control OSFillParent'])[4]");
    public By Email_txt = By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By Telephone_txt = By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    //screen 2
    public By SecondarySponsorinformation_tab = By.xpath("(//span[@class='text-primary '])[2]");
    public By AddSecondarySponsorinformation_btn = By.xpath("//span[contains(text(),'راعي فرعي')]");
    public By Doesthesponsor2_button = By.xpath("(//button[text()='نعم'])[2]");
    public By CompanyName2_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By NameContactPerson2_txt = By.xpath("(//input[@class='form-control OSFillParent'])[5]");
    public By Designation2_txt = By.xpath("(//input[@class='form-control OSFillParent'])[8]");
    public By Email2_txt = By.xpath("(//input[@class='form-control OSFillParent'])[6]");
    public By Telephone2_txt = By.xpath("(//input[@class='form-control OSFillParent'])[7]");
    //next btn 3


    //*********************ٍStep 6 *********************//

    //*********************ٍStep7 *********************//
    public By final_checkBox = By.xpath("//input[@class='checkbox']");
    public By submit_btn = By.xpath("//button[contains(text(),'تقديم')]");
    public By confirm_btn = By.xpath("//button[contains(text(),'تأكيد')]");




    public void CreateSpecialPath() {
        //********************* Step 1 *********************//
        // tab 1
        driver.element().hover(SpecialPath_radio)
                .click(SpecialPath_radio)
                .click(Next_btn);
        driver.element().click(IsProgramApproved_btn)
                .hover(StringentRegulatory_dropdown)
                .click(StringentRegulatory_dropdown)
                .clickUsingJavascript(StringentRegulatory_Value)
                .click(StringentRegulatory_dropdown)
                .click(IsDrugRegistered_btn)
                .select(StringentRegulatory2_dropdown, "جهة رقابية 1 - Stringent Regulatory Authority 1")
                .click(IsDrugSubmitted_btn)
                .type(ScientificTitleAR_txt,"عنوان البرنامج العلمي")
                .type(ScientificTitleEN_txt,"Scientific Title")
                .type(ProtocolNumber_txt,"212")
                .type(ProtocolVersion_txt,"2.1")
                .click(Protocol_Date)
                .clickUsingJavascript(today_Date)
                .click(TherapeuticArea_DropDown)
                .click(TherapeuticArea_Option)
                .click(DiseaseName_DropDown)
                .click(DiseaseName_Option)
                .click(Next_btn)

                //Tab 2 from first screen
                .click(DoesItInvolves_btn)
                .type(Specify_txt,"Details1")
                .type(PlannedNo_txt,"50")
                .click(AddInclusionExclusion_btn)
                .type(InclusionCriteria_txt,"Inclusion Criteria")
                .type(ExclusionCriteria_txt,"Exclusion Criteria")
                .click(add_btn)
                .click(Next_btn)

                //third tab from first screen

                .click(PlannedStart_Date);
        // to make selection of date easier as i can't choose today's date, get text of today's date '20' then ++
        // this for the current month for less than 29th of current month
        String TodaysDate = driver.element().getText(todays_Date);
        Integer TodaysDateInt = Integer.parseInt(TodaysDate);
        TodaysDateInt = TodaysDateInt + 1; // this is planned start date '21'
        String StartDate = String.valueOf(TodaysDateInt);
        driver.element().click(By.xpath("//*[text()='" + StartDate + "']"))
                .click(PlannedEnd_Date);
        if(TodaysDateInt<30)
        {
            TodaysDateInt = TodaysDateInt + 1;}
        else{
            TodaysDateInt = 1;

        }        String EndDate = String.valueOf(TodaysDateInt);
        driver.element()
                .hover(By.xpath("//*[text()='" + EndDate + "']"))
                .click(By.xpath("//*[text()='" + EndDate + "']"))
                .click(CollectingSample_btn)
                .type(SampleName_txt, "Sample Name")
                .type(FateSample_txt, "Fate Sample")
                .type(Tissue_txt, "Tissue")
                .type(Notes_txt, "Notes")
                .click(IsThereGeneticTesting_btn)
                .type(Specify_txt2, "Specify2_txt Istheregenetictesting")
                .click(IsThereFutureResearch_btn)
                .type(Specify_txt3, "Istherefutureresearch")
                .click(IsThereDataCollection_btn)
                .type(Ownership_txt, "Ownership")
                .click(AddObjective_btn)
                .type(Objective_txt, "Objective")
                .click(add_btn)
                .click(Next_btn);
        //********************* End of Step 1 *********************//


        //********************* Step 2 *********************//

        driver.element().type(RequestNum_txt,"100")
                .click(Search_btn)
                .click(HastheUseOfDrug_btn)
                .click(HastheUseOfDrug2_btn)
                .type(SCTR_txt,"120")
                .click(AddSCTR_btn)
                .hover(DrugCategory_dropdown)
                .click(DrugCategory_dropdown)
                .click(DrugCategory_Value)
                .click(DrugSuCategory_dropdown)
                .clickUsingJavascript(By.xpath("//span[contains(text(),'Somatic cell therapy medicinal product')]"))
                .click(DrugSuCategory_dropdown)
                .click(Next_btn2);
        //********************* END of Step 2 *********************//

        //********************* Step 3 *********************//
        driver.element().click(By.xpath("//span[contains(text(),'Concomitant Drug(s) to be used')]"));//click anywhere at screen
        System.out.println(driver.element().isElementClickable(InvolvesConcurrent_dropdown));
        driver.element()
                .hover(InvolvesConcurrent_dropdown)
                .click(InvolvesConcurrent_dropdown)
                .hover(InvolvesConcurrent_Value)
                .clickUsingJavascript(InvolvesConcurrent_Value)
                .click(Addnewmedicine_btn)
                .click(IsthedrugregisteredinSFDA_dropdown)
                .clickUsingJavascript(NoButRegisteredIn_Option)
                .select(Registeredin_dropdown, "وكالة الأدوية الأوروبية - EMA")
                .type(Drugregistrationnumber_txt, "Drugregistrationnumber123")
                .type(ActiveIngredient_txt, "ActiveIngredient")
                .type(BrandName_txt, "BrandName")
                .type(DosageForm_txt, "DosageForm")
                .type(Strength_txt, "Strength")
                .click(PharmacologicalClass_dropdown)
                .hover(PharmacologicalClass_value)
                .click(PharmacologicalClass_value)
                .type(RouteofAdministration_txt, "Route of Administration_txt")
                .click(add_btn)
                .click(Next_btn3);

        //********************* END of Step 3 *********************//

        //********************* Step 4 *********************//
        driver.element().click(IsClinicalTrialToBeConducted_btn)
                .click(Addnewlocalservice_btn)
                .hover(Companyname_dropdown)
                .select(Companyname_dropdown, "Al haram")
                .type(Contactpersonname_txt, "Contactpersonname")
                .type(ContactpersonEmail_txt, "cnaguibfahmy@gmail.com")
                .type(Contactpersonmobile_txt, "0512365478")
                .click(PleaselistthetypesofServicesEngaged_menu)
                .click(search_checkbox)
               // .click(PleaselistthetypesofServicesEngaged_menu)
                .click(details_txt)
                .type(details_txt, "details details_txt ")
                .click(IstheLocalCROalsotheLocalSponsor_button)
                .typeFileLocationForUpload(DelegationLetter_upload,"src/test/resources/testDataFiles/Test-Doc1.pdf");
        System.out.println(driver.element().isElementDisplayed(confirmupload_label));
        driver.element().click(add_btn)
                .click(Next_btn3);

        //********************* END of Step 4 *********************//

        //********************* Step 5 *********************//

        // screen 1
        driver.element().click(By.xpath("//span[contains(text(),'Concomitant Drug(s) to be used')]"))//click anywhere at screen
                .hover(Doesthesponsor_button)
                .click(Doesthesponsor_button)// tessssssssssssssssssssssssssttt
                //  .click(Doesthesponsor_button)
                .hover(CompanyName_dropdown)
                .click(CompanyName_dropdown)
                .clickUsingJavascript(By.xpath("//span[contains(text(),'Al rajaj')]"))
                .type(NameContactPerson_txt, "NameContactPerson")
                .type(Designation_txt, "Designation")
                .type(Email_txt, "cnaguib@gf.com")
                .type(Telephone_txt, "0514555555")
                //screen2
                .click(SecondarySponsorinformation_tab)
                .click(AddSecondarySponsorinformation_btn)
                .click(Doesthesponsor2_button)
                .select(CompanyName2_dropdown, "Al rajaj")
                .type(NameContactPerson2_txt, "NameContactPerson1")
                .type(Designation2_txt, "Designation1")
                .type(Email2_txt, "cnaguib@gf.com1")
                .type(Telephone2_txt, "05145555555")
                .click(add_btn)
                .click(Next_btn3);
        //********************* END of Step 5 *********************//


        //********************* Step 6 *********************//
        driver.element().hover(By.xpath("(//input[@type='file'])[1]"));
        for (int i = 1; i < 8; i++) {
            driver.element().typeFileLocationForUpload
                    (By.xpath("(//input[@type='file'])[" + i + "]"), "src/test/resources/testDataFiles/Test-Doc1.pdf");
            System.out.println(driver.element().isElementDisplayed(By.xpath("(//*[contains(text(),'تم الرفع')])[" + i + "]")));

        }
        driver.element().click(Next_btn);

        //********************* END of Step 6 *********************//



        //********************* Step 7 *********************//
        driver.element().clickUsingJavascript(final_checkBox)
                .click(submit_btn)
                .click(confirm_btn);
        //********************* END of Step 7 *********************//

    }

}
