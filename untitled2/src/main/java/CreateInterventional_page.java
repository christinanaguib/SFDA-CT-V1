import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class CreateInterventional_page {
    private SHAFT.GUI.WebDriver driver;

    //*********************Constructor*********************//
    public CreateInterventional_page(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //First screen

    public By ClinicalTrials_radio = By.xpath("//input[@class='radio-button margin-left-xxl']");
    public By Interventional_radio = By.xpath("(//input[@class='radio-button'])[2]");
    public By Next_btn = By.xpath("//button[@class='btn btn-primary']");
    public By ScientificTitle_txt = By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By PublicTitleAR_txt = By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By PublicTitleInEn_txt = By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By ProtocolNumber_txt = By.xpath("(//input[@class='form-control OSFillParent'])[4]");
    public By ProtocolVersion_txt = By.xpath("(//input[@class='form-control OSFillParent'])[5]");
    public By ProtocolDate_txt = By.xpath("(//input[@class='form-control date-g OSFillParent is-calendarsPicker'])[1]");
    //public By TodayDate_txt = By.xpath("//a[@class='jd2460662.5 calendars-today']");
    public By TodayDate_txt = By.xpath("//a[contains(@class,'calendars-today')]");
    public By OtherIdentificationNumber_txt = By.xpath("(//input[@class='form-control OSFillParent'])[6]");
    public By AddIdentificationNumber_btn = By.xpath("(//div[@class='display-flex vertical-align'])[1]");
    public By Describe_txt = By.xpath("(//textarea[@class='form-control OSFillParent'])[1]");
    public By PhaseofClinicalTrial_DropDown = By.xpath("(//div[@class='vscomp-toggle-button'])[1]");
    public By PhaseofClinicalTrial_value = By.xpath("//span[@data-tooltip='تكافؤ حيوي - Bioequivalence']");

    public By Clinicaltrialsdesign_DropDown = By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By NonTraditionalDesign_Option = By.xpath("//span[contains(text(),'Non-Traditional')]"); // this is selection from the drop-down list

    public By TypeOfNonTraditionalClinicalTrial_DropDown = By.xpath("(//div[@class='vscomp-toggle-button'])[3]");
    public By NewDesign_Option = By.xpath("//span[contains(text(),'تصميم مستحدث - New design')]");
    public By NewDesign_txt = By.xpath("(//textarea[@class='form-control OSFillParent'])[2]");

    public By TypeOfSponsorship_DropDown = By.xpath("(//div[@class='vscomp-toggle-button'])[4]");
    public By Commercial_Option = By.xpath("//span[contains(text(),'تجاري  - Commercial')]");

    public By TherapeuticArea_DropDown = By.xpath("(//div[@class='vscomp-toggle-button'])[5]");
    public By TherapeuticArea_Option = By.xpath("//span[contains(text(),'عنصر1 - element1')]");


    public By DiseaseName_DropDown = By.xpath("(//div[@class='vscomp-toggle-button'])[6]");
    public By DiseaseName_Option = By.xpath("//span[contains(text(),'تجربة 1 - test 1')]");

    public By Yes_Button = By.xpath("(//button[text()='نعم'])[1]");



    //second sub tab from first screen
    //public By doesitInvolves = By.xpath("(//button[@class='button-group-item'])[1]"); i will change it to contains yes
    public By doesItInvolves = By.xpath("(//button[text()='نعم'])[2]");
    public By specify_txt = By.xpath("(//textarea[@class='form-control OSFillParent'])[3]");
    public By Participants_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[7]");
    public By Randomization_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[8]");
    public By PlannedNo_txt = By.xpath("//input[@class='form-control OSFillParent not-valid']");
    public By LocationOfTrialSites_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[10]");
    public By LocationOfTrialSites_value = By.xpath("//span[@data-tooltip='بالمملكة العربية السعودية فقط - Only KSA']");

    //span[@data-tooltip='بالمملكة العربية السعودية فقط - Only KSA']
    public By Countries_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[11]");
    public By Blinding_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[9]");
    public By Blinding_option = By.xpath("//span[contains(text(),'أخرى - Others')]");
    public By specify_txt2 = By.xpath("(//textarea[@class='form-control OSFillParent'])[4]");
    public By AddInclusionExclusion_btn = By.xpath("(//div[@class='display-flex vertical-align'])[2]");
    public By InclusionCriteria_txt = By.xpath("(//textarea[@class='form-control OSFillParent'])[6]");
    public By ExclusionCriteria_txt = By.xpath("(//textarea[@class='form-control OSFillParent'])[7]");
    public By Add_btn = By.xpath("(//button[@class='btn btn-primary ThemeGrid_MarginGutter'])");

    //third sub tab from first screen
    public By PlannedStart_Date = By.xpath("(//input[@class='form-control date-g OSFillParent is-calendarsPicker'])[2]");
    public By today_Date = By.xpath("//span[contains(@class,'calendars-today')]");
    public By PlannedEnd_Date = By.xpath("(//input[@class='form-control date-g OSFillParent is-calendarsPicker'])[3]");


    public By Collectingsample_btn = By.xpath("(//button[text()='نعم'])[4]");
    public By IsthereIndependentData_btn = By.xpath("(//button[text()='نعم'])[3]");
    public By SampleName_txt = By.xpath("(//span[@class='input-text']/input)[11]");
    public By Fatesample_txt = By.xpath("(//input[@class='form-control OSFillParent'])[9]");
    public By Tissue_txt = By.xpath("(//input[@class='form-control OSFillParent'])[10]");
    public By Notes_txt = By.xpath("(//input[@class='form-control OSFillParent'])[11]");
    public By Istheregenetictesting_btn = By.xpath("(//button[text()='نعم'])[5]");
    public By Specify_txt3 = By.xpath("(//textarea[@class='form-control OSFillParent'])[5]");
    public By Istherefutureresearch_btn = By.xpath("(//button[text()='نعم'])[6]");
    public By Specify_txt4 = By.xpath("(//textarea[@class='form-control OSFillParent'])[6]");
    public By AddSourceMonetary_btn = By.xpath("(//div[@class='display-flex vertical-align'])[3]");
    public By AddSourceMonetary_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[11]");//جهة حكومية - Governmental Agency
    public By Name_txt = By.xpath("(//span[@class='input-text']/input)[15]");
    public By Add_btn4 = By.xpath("//button[@class='btn btn-primary ThemeGrid_MarginGutter']");
    public By TypeofAid_btn = By.xpath("(//div[@class='display-flex vertical-align'])[4]");
    public By Typeofaid_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[11]");

    public By Details_txt = By.xpath("//*[@id=\"b4-b3-b11-InText_TypeOfAidDetails\"]"); // issue in id

    public By Add_btn8 = By.xpath("(//button[@class='btn btn-primary ThemeGrid_MarginGutter'])");
    public By Othersources_txt = By.xpath("(//textarea[@class='form-control OSFillParent'])[7]");

    public By Ownership_txt = By.xpath("//*[@id=\"b4-b3-b11-TextArea_OwnershipOfTheData\"]"); //issue in id

    public By AddObjectiveSignificance_btn = By.xpath("(//div[@class='display-flex vertical-align'])[5]");
    public By AddObjectiveSignificance_txt = By.xpath("(//textarea[@class='form-control OSFillParent'])[9]");
    public By Add_btn5 = By.xpath("//button[@class='btn btn-primary ThemeGrid_MarginGutter']");
    public By PrimarySecondary_btn = By.xpath("(//button[@class='btn'])[4]");
    public By PrimaryEndPoint_txt = By.xpath("//*[@id=\"b4-b3-b11-TextArea_PrimaryEndPoint\"]");
    //public By SecondaryEndPoint_txt=By.xpath("//textarea[@id='b4-b4-b11-TextArea_SecondaryEndPoint']");
    //public By PrimaryEndPoint_txt=By.xpath("(//textarea[@class='form-control OSFillParent'])[8]");
    public By SecondaryEndPoint_txt = By.xpath("(//textarea[@class='form-control OSFillParent'])[10]");
    public By add_btn6 = By.xpath("//button[@class='btn btn-primary ThemeGrid_MarginGutter']");
    // public By Next_btn4 =By.xpath("//button[@class='btn btn-primary']");

    //*********************ٍStep 2 & 3 & 4 *********************//
    public By InvolvesConcurrent_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[1]");
    //public By InvolvesConcurrent_dropdown =By.xpath("//*[@id=\"vscomp-ele-wrapper-9169\"]/div/div[1]");
    public By Placebo_Option = By.xpath("//span[contains(text(),'Comparator Drug')]");

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
    public By PharmacologicalClass_value=By.xpath("    //span[@data-tooltip='فئة دوائية 1 - Pharmacological Class 1']");

    public By DrugType_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[5]");
    public By Chemical_option = By.xpath("//span[contains(text(),'كيميائي  - Chemical')]");
    public By DrugCategory_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[6]");
    public By search_txt = By.xpath("(//input[@class='vscomp-search-input'])[3]");
    public By value_checkbox = By.xpath("(//span[@class='checkbox-icon vscomp-toggle-all-checkbox'])[2]");
    public By ManufacturerOfActiveIngredientNAME_txt = By.xpath("(//input[@class='form-control OSFillParent'])[7]");
    public By ManufacturerOfActiveIngredientADDRESS_txt = By.xpath("(//input[@class='form-control OSFillParent'])[8]");
    public By ManufacturerOfFinalProductNAME_txt = By.xpath("(//input[@class='form-control OSFillParent'])[9]");
    public By ManufacturerOfFinalProductADDRESS_txt = By.xpath("(//input[@class='form-control OSFillParent'])[10]");
    public By LocationNAME_txt = By.xpath("(//input[@class='form-control OSFillParent'])[11]");
    public By LocationADDRESS_txt = By.xpath("(//input[@class='form-control OSFillParent'])[12]");
    public By DrugSuCategory_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[7]");
    public By search2_txt = By.xpath("(//input[@class='vscomp-search-input'])[7]");
    public By value2_checkbox = By.xpath("(//span[@class='checkbox-icon'])[18]");
    public By IsManufactureRegistered_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[8]");
    public By SecondRegisteredIn_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[9]");
    public By HastheUseOfTheIMP_btn = By.xpath("(//button[text()='نعم'])[1]");
    public By HastheUseOfTheIMP2_btn = By.xpath("(//button[text()='نعم'])[2]");
    public By Country_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[10]");
    public By SCTR_txt = By.xpath("(//input[@class='form-control OSFillParent'])[13]");
    public By AddSCTR_btn = By.xpath("(//div[@class='display-flex vertical-align'])[2]");
    public By add_btn7 = By.xpath("(//button[@class='btn btn-primary ThemeGrid_MarginGutter'])[2]");
    public By Next_btn5 = By.xpath("//button[@class='btn btn-primary']");

    //*********************ٍStep5*********************//
    public By NoofTrialSitesinKSA_dropdown = By.xpath("//div[@class='vscomp-toggle-button'][1]");
    public By addLocation_btn = By.xpath("(//div[@class='display-flex vertical-align'])[1]");
    public By NameofTrialSite_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By NameofPrincipalInvestigator_txt = By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By SaudiHealthSpecialtiesCommission_txt = By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By verify_btn = By.xpath("(//button[@class='btn btn-primary OSFillParent'])");
    public By GCPCertified_btn = By.xpath("//button[@class='button-group-item']");
    public By QualifiedArea_txt = By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By PlacePractice_txt = By.xpath("(//input[@class='form-control OSFillParent'])[4]");
    public By Department_txt = By.xpath("(//input[@class='form-control OSFillParent'])[5]");
    public By AddressPractice_txt = By.xpath("(//input[@class='form-control OSFillParent'])[6]");
    public By Designation_txt = By.xpath("(//input[@class='form-control OSFillParent'])[7]");
    public By TelephoneNumber_txt = By.xpath("(//input[@class='form-control OSFillParent'])[8]");
    public By EmailAddress_txt = By.xpath("(//input[@class='form-control OSFillParent'])[9]");
    public By PlannedTrialSubjects_txt = By.xpath("(//input[@class='form-control OSFillParent'])[10]");
    public By AddressTrial_txt = By.xpath("(//input[@class='form-control OSFillParent'])[11]");
    public By NameIRB_txt = By.xpath("(//input[@class='form-control OSFillParent'])[12]");
    public By NCBEregistration_txt = By.xpath("(//input[@class='form-control OSFillParent'])[13]");
    public By GCPCertificate_upload = By.xpath("(//input[@type='file'])[1]");
    public By Localethics_upload = By.xpath("(//input[@type='file'])[1]");
    public By confirmupload_label = By.xpath("(//*[contains(text(),'تم الرفع')])[2]");

    //*********************ٍStep6*********************//
    public By Addnewlocalservice_btn = By.xpath("//div[@class='display-flex vertical-align']");
    public By Companyname_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[1]");
    public By Contactpersonname_txt = By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By ContactpersonEmail_txt = By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By Contactpersonmobile_txt = By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By PleaselistthetypesofServicesEngaged_menu = By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By search_checkbox = By.xpath("(//span[@class='checkbox-icon vscomp-toggle-all-checkbox'])");
    public By details_txt = By.xpath("(//textarea[@class='form-control  OSFillParent'])");
    public By IstheLocalCROalsotheLocalSponsor_button = By.xpath("(//button[text()='نعم'])[2]");


    //*********************ٍStep7*********************//
    public By Doesthesponsor_button = By.xpath("(//button[text()='نعم'])[1]");
    public By Scientificofficename_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[1]");
    public By NameContactPerson_txt = By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By Designation2_txt = By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By Email_txt = By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By Telephone_txt = By.xpath("(//input[@class='form-control OSFillParent'])[4]");
    public By Next_btn7 = By.xpath("(//button[@class='btn btn-primary'])");
    //screen 2
    public By SecondarySponsorinformation_tab = By.xpath("(//span[@class='text-primary '])[2]");
    public By AddSecondarySponsorinformation_btn = By.xpath("//span[contains(text(),'راعي فرعي')]");
    public By Doesthesponsor2_button = By.xpath("(//button[text()='نعم'])[2]");
    public By Scientificofficename2_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By NameContactPerson2_txt = By.xpath("(//input[@class='form-control OSFillParent'])[5]");
    public By Designation3_txt = By.xpath("(//input[@class='form-control OSFillParent'])[6]");
    public By Email2_txt = By.xpath("(//input[@class='form-control OSFillParent'])[7]");
    public By Telephone2_txt = By.xpath("(//input[@class='form-control OSFillParent'])[8]");
    //*********************ٍStep8*********************//

    //*********************ٍStep9*********************//
    public By final_checkBox = By.xpath("//input[@class='checkbox']");
    public By submit_btn = By.xpath("//*[contains(text(),'تقديم الطلب')]");
    public By confirm_btn = By.xpath("//button[contains(text(),'تأكيد')]");


    // method to open the Interventional page and fill all fields

    public void CreateInterventional() {
        driver.element().click(ClinicalTrials_radio)
                .click(Interventional_radio)
                .click(Next_btn)
                .type(ScientificTitle_txt, "ScientificTitle")
                .type(PublicTitleAR_txt, "عنوان الدراسة العام باللغة العربية")
                .type(PublicTitleInEn_txt, "PublicTitleInEn")
                .type(ProtocolNumber_txt, "123456")
                .type(ProtocolVersion_txt, "ProtocolVersion")
                .click(ProtocolDate_txt)
                .clickUsingJavascript(TodayDate_txt)
                .type(OtherIdentificationNumber_txt, "1212121212")
                .click(AddIdentificationNumber_btn)
                .type(Describe_txt, "Description")
                .hover(PhaseofClinicalTrial_DropDown)
                .click(PhaseofClinicalTrial_DropDown)
                .click(PhaseofClinicalTrial_value)
                .click(Clinicaltrialsdesign_DropDown)
                .click(NonTraditionalDesign_Option)
                .click(TypeOfNonTraditionalClinicalTrial_DropDown)
                .click(NewDesign_Option)
                .type(NewDesign_txt, "Description")
                .click(TypeOfSponsorship_DropDown)
                .click(Commercial_Option)
                .click(TherapeuticArea_DropDown)
                .click(TherapeuticArea_Option)
                .click(DiseaseName_DropDown)
                .click(DiseaseName_Option)
                .click(Yes_Button)// for question "Do you want scientific Consult regarding the trial protocol"
                .click(Next_btn)

                //second sub tab from first screen
                .click(doesItInvolves)
                .type(specify_txt, "specify txt")
                .select(Participants_dropdown, "متطوعين أصحاء - Healthy Volunteers")
                .select(Randomization_dropdown, "توزيع عشوائي - Randomized")
                .type(PlannedNo_txt, "123")
                .click(Blinding_dropdown)
                .click(Blinding_option)
                .type(specify_txt2, "specify")
                .hover(LocationOfTrialSites_dropdown)
                .click(LocationOfTrialSites_dropdown)
                .click(LocationOfTrialSites_value)
                //.select(Countries_dropdown, "\n" +
                  //      "            الجزائر - Algeria\n" +
                    //    "          ")
                //.click(LocationOfTrialSites_dropdown)
                .click(AddInclusionExclusion_btn)
                .type(InclusionCriteria_txt, "InclusionCriteria")
                .type(ExclusionCriteria_txt, "ExclusionCriteria")
                .click(Add_btn)
                .click(Next_btn)


                //third tab from first screen

                .click(PlannedStart_Date);
        // to make selection of date easier as i can't choose today's date, get text of today's date '20' then ++
        String TodaysDate = driver.element().getText(today_Date);
        Integer TodaysDateInt = Integer.parseInt(TodaysDate);
        TodaysDateInt = TodaysDateInt + 1; // this is planned start date '21'
        String StartDate = String.valueOf(TodaysDateInt);
        TodaysDateInt = TodaysDateInt + 5;  // this for planned end date '26'
        String EndDate = String.valueOf(TodaysDateInt);


        driver.element().click(By.xpath("//*[text()='" + StartDate + "']"))
                .click(PlannedEnd_Date)
                .click(By.xpath("//*[text()='" + EndDate + "']"))
                .click(Collectingsample_btn)
                .click(IsthereIndependentData_btn)
                .type(SampleName_txt, "SampleName")
                .type(Fatesample_txt, "Fatesample")
                .type(Tissue_txt, "Tissue")
                .type(Notes_txt, "Notes")
                .click(Istheregenetictesting_btn)
                .type(Specify_txt3, "Specify2_txt Istheregenetictesting")
                .click(Istherefutureresearch_btn)
                .type(Specify_txt4, "Istherefutureresearch")
                .click(AddSourceMonetary_btn)
                .select(AddSourceMonetary_dropdown, "جهة حكومية - Governmental Agency")
                .type(Name_txt, "Name")
                .click(Add_btn4)
                .click(TypeofAid_btn)
                .select(Typeofaid_dropdown, "دعم مالي  - Monetary Support")
                .type(Details_txt, "Typeofaid Details_txt")
                .click(Add_btn8)
                .type(Othersources_txt, "Othersources")
                .type(Ownership_txt, "Ownership")
                .click(AddObjectiveSignificance_btn)
                .type(AddObjectiveSignificance_txt, "AddObjectiveSignificance")
                .click(Add_btn5)
                .click(PrimarySecondary_btn)
                .type(PrimaryEndPoint_txt, "PrimaryEndPoint")
                .type(SecondaryEndPoint_txt, "SecondaryEndPoint")
                .click(add_btn6)
                .click(Next_btn)

                //*********************ٍStep 2 & 3 & 4 *********************//
                .click(InvolvesConcurrent_dropdown)
//.clickUsingJavascript(Placebo_Option)
                .click(InvolvesConcurrent_dropdown)
                //  .select(InvolvesConcurrent_dropdown,"الدواء المصاحب - Concomitant Drug")
                .click(Addnewmedicine_btn)
                .click(IsthedrugregisteredinSFDA_dropdown)
                .clickUsingJavascript(NoButRegisteredIn_Option)
                .select(Registeredin_dropdown, "وكالة الأدوية الأوروبية - EMA")
                .type(Drugregistrationnumber_txt, "Drugregistrationnumber123")
                .type(ActiveIngredient_txt, "ActiveIngredient")
                .type(BrandName_txt, "BrandName")
                .type(DosageForm_txt, "DosageForm")
                .type(Strength_txt, "Strength")
                .click(PharmacologicalClass_dropdown)//, "فئة دوائية 1 - Pharmacological Class 1")
                .click(PharmacologicalClass_value)
                .type(RouteofAdministration_txt, "Route of Administration_txt")
                .click(DrugType_dropdown)
                .clickUsingJavascript(Chemical_option)
                .click(DrugCategory_dropdown)
                .clickUsingJavascript(By.xpath("//span[contains(text(),'Advanced Therapy IMP (ATIMP)')]"))
                .click(DrugCategory_dropdown)
                .type(ManufacturerOfActiveIngredientNAME_txt, "Manufacturer Name")
                .type(ManufacturerOfActiveIngredientADDRESS_txt, "Manufacturer Address")

                .click(DrugSuCategory_dropdown)
                .clickUsingJavascript(By.xpath("//span[contains(text(),'Somatic cell therapy medicinal product')]"))
                .click(DrugSuCategory_dropdown)

                .type(ManufacturerOfFinalProductNAME_txt, "Manufacturer Name")
                .type(ManufacturerOfFinalProductADDRESS_txt, "Manufacturer Address")
                .select(IsManufactureRegistered_dropdown, "غير مسجل بأي مكان - Not Registered anywhere") // this make choice لا و لكن مسجل فى and needs to be handled
                //  .select(SecondRegisteredIn_dropdown,"وكالة الأدوية الأوروبية - EMA")
                .type(LocationNAME_txt, "Location")
                .type(LocationADDRESS_txt, "Location")
                .click(HastheUseOfTheIMP_btn)
                .select(Country_dropdown, "\n" +
                        "            الجزائر - Algeria\n" +
                        "          ")
                .click(Country_dropdown)
                .click(HastheUseOfTheIMP2_btn)
                .type(SCTR_txt, "1234")
                .click(AddSCTR_btn)
                .click(SecondRegisteredIn_dropdown)
                .click(By.xpath("(//span[@class='checkbox-icon'])[22]"))
                //.clickUsingJavascript(By.xpath("(//span[contains(text(),'وكالة الأدوية الأوروبية - EMA')])[3]"))
                .click(add_btn7)
                .select(InvolvesConcurrent_dropdown, "دواء وهمي - Placebo")
                .click(Next_btn5);
        //*********************END of Step 2 & 3 & 4 *********************//


        //*********************ٍStep 5 *********************//
        driver.element().click(NoofTrialSitesinKSA_dropdown)
                .clickUsingJavascript(By.xpath("//span[contains(text(),'موقع واحد فقط - Single Site')]"))
                .click(addLocation_btn)
                .select(NameofTrialSite_dropdown, "العنصر - element")
                .type(NameofPrincipalInvestigator_txt, "NameofPrincipalInvestigator")
                .type(SaudiHealthSpecialtiesCommission_txt, "456")
                .click(verify_btn)
                .click(GCPCertified_btn)
                .type(QualifiedArea_txt, "QualifiedArea")
                .type(PlacePractice_txt, "PlacePractice")
                .type(Department_txt, "Department")
                .type(AddressPractice_txt, "AddressPractice")
                .type(Designation_txt, "Designation")
                .type(TelephoneNumber_txt, "TelephoneNumber")
                .type(EmailAddress_txt, "Email@test.com")
                .type(PlannedTrialSubjects_txt, "123123")
                .type(AddressTrial_txt, "AddressTrial")
                .type(NameIRB_txt, "NameIRB")
                .type(NCBEregistration_txt, "NCBEregistration")
                .typeFileLocationForUpload(GCPCertificate_upload, "src/test/resources/testDataFiles/Test-Doc1.pdf")
                .typeFileLocationForUpload(Localethics_upload, "src/test/resources/testDataFiles/Test-Doc1.pdf");
        System.out.println(driver.element().isElementDisplayed(confirmupload_label));
        driver.element().click(Add_btn)
                .click(Next_btn);
        //********************* END of Step 5 *********************//


        //*********************ٍStep 6 *********************//
        driver.element().click(GCPCertified_btn)
                .click(Addnewlocalservice_btn);
        driver.element().isElementClickable(Companyname_dropdown);

        driver.element().hover(Companyname_dropdown)
                .select(Companyname_dropdown, "Al haram")
                .type(Contactpersonname_txt, "Contactpersonname")
                .type(ContactpersonEmail_txt, "cnaguibfahmy@gmail.com")
                .type(Contactpersonmobile_txt, "0512365478")
                .click(PleaselistthetypesofServicesEngaged_menu)
                .click(search_checkbox)
                .click(details_txt)
                .type(details_txt, "details details_txt ")
                .click(IstheLocalCROalsotheLocalSponsor_button)
                .click(add_btn7)
                .click(Next_btn);

        //*********************END of Step 6 *********************//

        //********************* Step 7 *********************//

        // screen 1
        driver.element().hover(Doesthesponsor_button)
                .click(Doesthesponsor_button) // tessssssssssssssssssssssssssttt
                .clickUsingJavascript(Scientificofficename_dropdown)
                .clickUsingJavascript(By.xpath("//span[contains(text(),'Al rajaj')]"))
                .type(NameContactPerson_txt, "NameContactPerson")
                .type(Designation2_txt, "Designation")
                .type(Email_txt, "cnaguib@gf.com")
                .type(Telephone_txt, "0514555555")
                //screen2
                .click(SecondarySponsorinformation_tab)
                .click(AddSecondarySponsorinformation_btn)
                .click(Doesthesponsor2_button)
                .select(Scientificofficename2_dropdown, "Al rajaj")
                .type(NameContactPerson2_txt, "NameContactPerson1")
                .type(Designation3_txt, "Designation1")
                .type(Email2_txt, "cnaguib@gf.com1")
                .type(Telephone2_txt, "05145555555")
                .click(add_btn7)
                .click(Next_btn7);

        //*********************END of Step 7 *********************//
        //********************* Step 8 *********************//

        driver.element().hover(By.xpath("(//input[@type='file'])[1]"));
        for (int i = 1; i < 22; i++) {
            driver.element().typeFileLocationForUpload
                    (By.xpath("(//input[@type='file'])[" + i + "]"), "src/test/resources/testDataFiles/Test-Doc1.pdf");
            System.out.println(driver.element().isElementDisplayed(By.xpath("(//*[contains(text(),'تم الرفع')])[" + i + "]")));

        }
        driver.element().click(Next_btn7);
        //*********************END of Step 8 *********************//


        //********************* Step 9 *********************//
        driver.element().clickUsingJavascript(final_checkBox)
                .click(submit_btn)
                .click(confirm_btn);

        //*********************END of Step 9 *********************//
    }

}

