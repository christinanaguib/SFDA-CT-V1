import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

import java.util.List;

public class CreateNonInterventional_Page {
    private SHAFT.GUI.WebDriver driver;

    //*********************Constructor*********************//
    public CreateNonInterventional_Page(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    //*********************ٍStep 1*********************//

    public By ClinicalTrials_radio = By.xpath("//input[@class='radio-button margin-left-xxl']");
    public By NonInterventional_radio = By.xpath("(//input[@class='radio-button margin-left-xxl'])[2]");
    public By Next_btn = By.xpath("//button[@class='btn btn-primary']");
    public By ScientificTitle_txt = By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By PublicTitleAR_txt = By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By PublicTitleInEn_txt = By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By ProtocolNumber_txt = By.xpath("(//input[@class='form-control OSFillParent'])[4]");
    public By ProtocolVersion_txt = By.xpath("(//input[@class='form-control OSFillParent'])[5]");
    public By ProtocolDate_txt = By.xpath("(//span[@class='input-text']/input)[6]");
    //a[@title='Show the previous month']
    public By todays_Date = By.xpath("//*[contains(@class,'calendars-today')]");
    public By nextmonth_button = By.xpath("//a[@title='Show the previous month']");

    public By OtherIdentificationNumber_txt = By.xpath("(//input[@class='form-control OSFillParent'])[6]");
    public By AddIdentificationNumber_btn= By.xpath("(//div[@class='display-flex vertical-align'])[1]");
    public By Describe_txt = By.xpath("(//textarea[@class='form-control OSFillParent'])[1]");
    public By PhaseofClinicalTrial_DropDown = By.xpath("(//div[@class='vscomp-toggle-button'])[1]");
    public By Clinicaltrialsdesign_DropDown = By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By TherapeuticArea_DropDown = By.xpath("(//div[@class='vscomp-toggle-button'])[3]");
    public By DiseaseName_DropDown = By.xpath("(//div[@class='vscomp-toggle-button'])[4]");
    public By Next_btn2 = By.xpath("(//button[@class='btn btn-primary '])");
//second screen
    public By doesitInvolves = By.xpath("(//button[@class='button-group-item'])[1]");
    public By spcify_txt = By.xpath("(//textarea[@class='form-control OSFillParent'])[2]");
    public By Participants_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[5]");
    public By Randomization_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[6]");
    public By PlannedNo_txt = By.xpath("//input[@class='form-control OSFillParent not-valid']");
    public By LocationofTrialSites_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[7]");
    public By Blinding_dropdown = By.xpath("(//div[@class='vscomp-toggle-button'])[8]");
    public By AddInclusionExclusion_btn = By.xpath("(//div[@class='display-flex vertical-align'])[2]");
    public By  InclusionCriteria_txt =By.xpath("(//textarea[@class='form-control OSFillParent'])[4]");
    public By ExclusionCriteria_txt=By.xpath("(//textarea[@class='form-control OSFillParent'])[5]");
    public By Add_btn = By.xpath("(//button[@class='btn btn-primary ThemeGrid_MarginGutter'])");
    public By Next_btn3 = By.xpath("(//button[@class='btn btn-primary'])");
//third screen
    public By PlannedStart_Date= By.xpath("(//input[@class='form-control date-g OSFillParent is-calendarsPicker'])[2]");
    public By today_Date=By.xpath("//a[@title='Select الثلاثاء, 12 31, 2024']");
    public By PlannedEnd_Date= By.xpath("(//input[@class='form-control date-g OSFillParent is-calendarsPicker'])[3]");
    public By today2_Date=By.xpath("//a[@title='Select الثلاثاء, 12 31, 2024']");
    public By Collectingsample_btn=By.xpath("(//button[@class='button-group-item'])[2]");
    public By IsthereIndependentData_btn=By.xpath("(//button[@class='button-group-item'])[3]");
    public By SampleName_txt=By.xpath("(//span[@class='input-text']/input)[11]");
    public By Fatesample_txt=By.xpath("(//input[@class='form-control OSFillParent'])[9]");
    public By Tissue_txt=By.xpath("(//input[@class='form-control OSFillParent'])[10]");
    public By Notes_txt=By.xpath("(//input[@class='form-control OSFillParent'])[11]");
    public By Istheregenetictesting_btn=By.xpath("(//button[@class='button-group-item'])[4]");
    public By Specify_txt=By.xpath("(//textarea[@class='form-control OSFillParent'])[4]");
    public By Istherefutureresearch_btn=By.xpath("(//button[@class='button-group-item'])[5]");
    public By Specify2_txt=By.xpath("(//textarea[@class='form-control OSFillParent'])[3]");
    public By AddSourceMonetary_btn=By.xpath("(//div[@class='display-flex vertical-align'])[3]");
    public By AddSourceMonetary_dropdown=By.xpath("(//div[@class='vscomp-toggle-button'])[9]");//جهة حكومية - Governmental Agency
    public By Name_txt=By.xpath("(//span[@class='input-text']/input)[15]");
    public By Add_btn4=By.xpath("//button[@class='btn btn-primary ThemeGrid_MarginGutter']");
    public By TypeofAid_btn=By.xpath("(//div[@class='display-flex vertical-align'])[4]");
    public By Typeofaid_dropdown=By.xpath("(//div[@class='vscomp-toggle-button'])[9]");
    public By Details_txt=By.xpath("    //input[@id='b4-b4-b11-InText_TypeOfAidDetails']");
    public By Add_btn8=By.xpath("(//button[@class='btn btn-primary ThemeGrid_MarginGutter'])");
    public By Othersources_txt=By.xpath("//textarea[@id='b4-b4-b11-TextArea_OtherSourcesAndTypesOfAids']");
    public By Ownership_txt=By.xpath("//textarea[@id='b4-b4-b11-TextArea_OwnershipOfTheData']");
    public By AddObjectiveSignificance_btn=By.xpath("(//div[@class='display-flex vertical-align'])[5]");
    public By AddObjectiveSignificance_txt=By.xpath("//textarea[@id='b4-b4-b11-TextArea_ObjectiveAndSignificance']");
    public By Add_btn5=By.xpath("//button[@class='btn btn-primary ThemeGrid_MarginGutter']");
    public By PrimarySecondary_btn=By.xpath("(//button[@class='btn'])[4]");
    public By PrimaryEndPoint_txt=By.xpath("//textarea[@id='b4-b4-b11-TextArea_PrimaryEndPoint']");
    public By SecondaryEndPoint_txt=By.xpath("//textarea[@id='b4-b4-b11-TextArea_SecondaryEndPoint']");
    public By add_btn6=By.xpath("//button[@class='btn btn-primary ThemeGrid_MarginGutter']");
    public By Next_btn4 =By.xpath("//button[@class='btn btn-primary']");
    //*********************ٍStep 2*********************//
    public By InvolvesConcurrent_dropdown =By.xpath("//div[@class='vscomp-toggle-button']");
    public By Addnewmedicine_btn =By.xpath("//div[@class='display-flex vertical-align']");
    public By IsthedrugregisteredinSFDA_dropdown =By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By Registeredin_dropdown =By.xpath("(//div[@class='vscomp-toggle-button'])[3]");//
    public By Drugregistrationnumber_txt =By.xpath("//input[@id='b4-b4-b12-Input_DrugRegisterationNumberNoButRegisteredOther2']");
    public By ActiveIngredient_txt =By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By BrandName_txt =By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By DosageForm_txt =By.xpath("(//input[@class='form-control OSFillParent'])[4]");
    public By Strength_txt =By.xpath("(//input[@class='form-control OSFillParent'])[5]");
    public By RouteofAdministration_txt =By.xpath("(//input[@class='form-control OSFillParent'])[6]");
    public By PharmacologicalClass_dropdown=By.xpath("(//div[@class='vscomp-toggle-button'])[4]");
    public By PharmacologicalClass_value=By.xpath("    //span[@data-tooltip='فئة دوائية 1 - Pharmacological Class 1']");
    public By DrugType_dropdown =By.xpath("(//div[@class='vscomp-toggle-button'])[5]");
    public By DrugType_value=By.xpath("//span[@data-tooltip='حيوي / تقنية حيوية - Biological / Biotechnological']");

    public By DrugCategory_dropdown =By.xpath("(//div[@class='vscomp-toggle-button'])[6]");
    public By search_txt=By.xpath("(//input[@class='vscomp-search-input'])[3]");
    public By value_checkbox=By.xpath("(//span[@class='checkbox-icon vscomp-toggle-all-checkbox'])[2]");
    public By Details2_txt=By.xpath("(//input[@class='form-control OSFillParent'])[7]");
    public By DrugSuCategory_dropdown=By.xpath("(//div[@class='vscomp-toggle-button'])[7]");
    public By search2_txt=By.xpath("(//input[@class='vscomp-search-input'])[7]");
    public By value2_checkbox=By.xpath("(//span[@class='checkbox-icon'])[18]");
    public By add_btn7=By.xpath("(//button[@class='btn btn-primary ThemeGrid_MarginGutter'])[2]");
    public By Next_btn5 =By.xpath("//button[@class='btn btn-primary']");
    //*********************ٍStep3 and 4*********************//
    public By Addnewmedicine3_btn =By.xpath("//div[@class='display-flex vertical-align']");
    public By IsthedrugregisteredinSFDA3_dropdown=By.xpath("//div[@class='vscomp-toggle-button']");
    public By Registeredin3_dropdown =By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By value3_checkbox =By.xpath("(//span[@class='checkbox-icon'])[1]");
    public By Drugregistrationnumber3_txt =By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By ActiveIngredient3_txt =By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By BrandName3_txt =By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By DosageForm3_txt =By.xpath("(//input[@class='form-control OSFillParent'])[4]");
    public By Strength3_txt =By.xpath("(//input[@class='form-control OSFillParent'])[5]");
    public By RouteofAdministration3_txt =By.xpath("(//input[@class='form-control OSFillParent'])[6]");
    public By PharmacologicalClass3_dropdown =By.xpath("(//div[@class='vscomp-toggle-button'])[3]");
    public By PharmacologicalClass3_value =By.xpath("//span[@data-tooltip='فئة دوائية 1 - Pharmacological Class 1']");
    public By add_btn8=By.xpath("//button[@class='btn btn-primary ThemeGrid_MarginGutter']");
    //*********************ٍStep5*********************//
    public By NoofTrialSitesinKSA_dropdown=By.xpath("//div[@class='vscomp-toggle-button']");
    public By NameofTrialSite_dropdown=By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By NameofPrincipalInvestigator_txt=By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By SaudiHealthSpecialtiesCommission_txt=By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By verify_btn=By.xpath("(//button[@class='btn btn-primary OSFillParent'])");
    public By GCPCertified_btn=By.xpath("//button[@class='button-group-item']");
    public By QualifiedArea_txt=By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By PlacePractice_txt=By.xpath("(//input[@class='form-control OSFillParent'])[4]");
    public By Department_txt=By.xpath("(//input[@class='form-control OSFillParent'])[5]");
    public By AddressPractice_txt=By.xpath("(//input[@class='form-control OSFillParent'])[6]");
    public By Designation_txt=By.xpath("(//input[@class='form-control OSFillParent'])[7]");
    public By TelephoneNumber_txt=By.xpath("(//input[@class='form-control OSFillParent'])[8]");
    public By EmailAddress_txt=By.xpath("(//input[@class='form-control OSFillParent'])[9]");
    public By PlannedTrialSubjects_txt=By.xpath("(//input[@class='form-control OSFillParent'])[10]");
    public By AddressTrial_txt=By.xpath("(//input[@class='form-control OSFillParent'])[11]");
    public By NameIRB_txt=By.xpath("(//input[@class='form-control OSFillParent'])[12]");
    public By NCBEregistration_txt=By.xpath("(//input[@class='form-control OSFillParent'])[13]");
    public By GCPCertificate_upload=By.xpath("(//input[@type='file'])[1]");
    public By Localethics_upload=By.xpath("//*[@id=\"b4-b4-b15-b19-b3-FileUploadInput\"]");
    public By confirmupload_label=By.xpath("(//*[contains(text(),'تم الرفع')])[2]");

    //*********************ٍStep6*********************//
    public By Addnewlocalservice_btn=By.xpath("//div[@class='display-flex vertical-align']");
    public By Companyname_dropdown=By.xpath("//div[@class='vscomp-toggle-button']");
    public By Companyname_value=By.xpath("//span[@data-tooltip='Al haram']");
    public By Contactpersonname_txt=By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By ContactpersonEmail_txt=By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By Contactpersonmobile_txt=By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By PleaselistthetypesofServicesEngaged_menu=By.xpath("(//div[@class='vscomp-toggle-button'])[2]");
    public By search_checkbox=By.xpath("(//span[@class='checkbox-icon vscomp-toggle-all-checkbox'])");
    public By details_txt=By.xpath("(//textarea[@class='form-control  OSFillParent'])");
    public By IstheLocalCROalsotheLocalSponsor_button=By.xpath("//button[@id='b4-b4-b16-Yes2']");
    public By delegationletter_txt=By.xpath("//input[@id='b4-b4-b16-b13-b3-FileUploadInput']");
    public By confirmupload2_label=By.xpath("//span[@class='filesizest']");
    //*********************ٍStep7*********************//
    public By Doesthesponsor_button=By.xpath("//button[@id='b4-b4-b17-Yes2']");
    public By Scientificofficename_dropdown=By.xpath("(//div[@class='vscomp-toggle-button'])");
    public By Scientificofficename_txt=By.xpath("(//input[@class='form-control OSFillParent'])[1]");
    public By CompanyAddress_txt=By.xpath("(//input[@class='form-control OSFillParent'])[2]");
    public By TelephoneNo_txt=By.xpath("(//input[@class='form-control OSFillParent'])[3]");
    public By mobilenumber_txt=By.xpath("(//input[@class='form-control OSFillParent'])[4]");
    public By NameContactPerson_txt=By.xpath("(//input[@class='form-control OSFillParent'])[5]");
    public By Designation2_txt=By.xpath("(//input[@class='form-control OSFillParent'])[6]");
    public By Email_txt=By.xpath("(//input[@class='form-control OSFillParent'])[7]");
    public By Telephone_txt=By.xpath("(//input[@class='form-control OSFillParent'])[8]");
    public By Next_btn7 = By.xpath("(//button[@class='btn btn-primary'])");
//screen 2
    public By SecondarySponsorinformation_tab = By.xpath("(//span[@class='text-primary '])[2]");
    public By AddSecondarySponsorinformation_btn = By.xpath("//button[@class='btn btn-primary auto-width ThemeGrid_MarginGutter']");
    public By Scientificofficename2_txt=By.xpath("(//input[@class='form-control OSFillParent'])[9]");
    public By CompanyAddress2_txt=By.xpath("(//input[@class='form-control OSFillParent'])[10]");
    public By TelephoneNo2_txt=By.xpath("(//input[@class='form-control OSFillParent'])[11]");
    public By mobilenumber2_txt=By.xpath("(//input[@class='form-control OSFillParent'])[12]");
    public By NameContactPerson2_txt=By.xpath("(//input[@class='form-control OSFillParent'])[13]");
    public By Designation3_txt=By.xpath("(//input[@class='form-control OSFillParent'])[14]");
    public By Email2_txt=By.xpath("(//input[@class='form-control OSFillParent'])[15]");
    public By Telephone2_txt=By.xpath("(//input[@class='form-control OSFillParent'])[16]");
    //*********************ٍStep9*********************//
    public By acceptterms_txt=By.xpath("//input[@class='checkbox']");
    public By listing_label=By.xpath("(//*[contains(text(),'قائمة طلبات البرامج / الدراسات السريرية')])[1]");

    /*
*/


    public void CreateNonInterventional() {
        //*********************ٍStep 1*********************//

        driver.element().click(ClinicalTrials_radio)
                    .click(NonInterventional_radio)
                    .click(Next_btn)
                    .type(ScientificTitle_txt, "ScientificTitle")
                    .type(PublicTitleAR_txt, "عنوان الدراسة العام باللغة العربية")
                    .type(PublicTitleInEn_txt, "PublicTitleInEn")
                    .type(ProtocolNumber_txt, "123456")
                    .type(ProtocolVersion_txt, "ProtocolVersion")
                    .click(ProtocolDate_txt)
                .hover(todays_Date)
                .clickUsingJavascript(todays_Date)
                    .type(OtherIdentificationNumber_txt, "1212121212")
                    .click(AddIdentificationNumber_btn)
                    .type(Describe_txt, "Describtion")
                    .select(PhaseofClinicalTrial_DropDown, "تكافؤ حيوي - Bioequivalence")
                    .select(Clinicaltrialsdesign_DropDown, "تقرير الحالة - Case report")
                    .select(TherapeuticArea_DropDown, "عنصر1 - element1")
                    .select(DiseaseName_DropDown, "تجربة 1 - test 1")
                    .click(Next_btn2)
                    //scond screen
                    .click(doesitInvolves)
                    .type(spcify_txt, "spcify txt")
                    .select(Participants_dropdown, "متطوعين أصحاء - Healthy Volunteers")
                    .select(Randomization_dropdown, "توزيع عشوائي - Randomized")
                    .type(PlannedNo_txt, "123")
                    .select(LocationofTrialSites_dropdown, "بالمملكة العربية السعودية فقط - Only KSA")
                    .select(Blinding_dropdown, "تعمية فردية - Single Blind")
                    .click(AddInclusionExclusion_btn)
                    .type(InclusionCriteria_txt, "InclusionCriteria")
                    .type(ExclusionCriteria_txt, "ExclusionCriteria")
                    .click(Add_btn)
                    .click(Next_btn3)
                    //third screen
                    .click(PlannedStart_Date);
        String TodaysDate = driver.element().getText(todays_Date);
        Integer TodaysDateInt = Integer.parseInt(TodaysDate);
        if(TodaysDateInt<30) {
            TodaysDateInt = TodaysDateInt + 1;
        }


        else{
            driver.element().click(nextmonth_button);
            TodaysDateInt = 1;

        }
        String StartDate = String.valueOf(TodaysDateInt);
        driver.element().click(By.xpath("//*[text()='" + StartDate + "']"))
                    .click(PlannedEnd_Date);
        driver.element().click(By.xpath("//*[text()='" + StartDate + "']"))
                    .click(Collectingsample_btn)
                    .click(IsthereIndependentData_btn)
                    .type(SampleName_txt, "SampleName")
                    .type(Fatesample_txt, "Fatesample")
                    .type(Tissue_txt, "Tissue")
                    .type(Notes_txt, "Notes")
                    .click(Istheregenetictesting_btn)
                    .type(Specify2_txt, "Specify2_txt Istheregenetictesting")
                    .click(Istherefutureresearch_btn)
                    .type(Specify_txt, "Istherefutureresearch")
                    .click(AddSourceMonetary_btn)
                    .select(AddSourceMonetary_dropdown, "جهة حكومية - Governmental Agency")
                    .type(Name_txt, "Name")
                    .click(Add_btn4)
                    .click(TypeofAid_btn)
                    .select(Typeofaid_dropdown,"دعم مالي  - Monetary Support")
                    .type(Details_txt,"Typeofaid Details_txt")
                     .click(Add_btn8)
                     .type(Othersources_txt,"Othersources")
                     .type(Ownership_txt,"Ownership")
                     .click(AddObjectiveSignificance_btn)
                     .type(AddObjectiveSignificance_txt,"AddObjectiveSignificance")
                     .click(Add_btn5)
                     .click(PrimarySecondary_btn)
                     .type(PrimaryEndPoint_txt,"PrimaryEndPoint")
                     .type(SecondaryEndPoint_txt,"SecondaryEndPoint")
                     .click(add_btn6)
                     .click(Next_btn4)
        //*********************ٍStep 2*********************//
                .select(InvolvesConcurrent_dropdown,"الدواء المصاحب - Concomitant Drug")
                .click(Addnewmedicine_btn)
                .select(IsthedrugregisteredinSFDA_dropdown,"غير مسجل بأي مكان - Not Registered anywhere")
                .select(Registeredin_dropdown,"وكالة الأدوية الأوروبية - EMA")
               .type(Drugregistrationnumber_txt,"Drugregistrationnumber123")
                .type(ActiveIngredient_txt,"ActiveIngredient")
                .type(BrandName_txt,"BrandName")
                .type(DosageForm_txt,"DosageForm")
                .type(Strength_txt,"Strength")
                .click(PharmacologicalClass_dropdown)
                .click(PharmacologicalClass_value)
                .type(RouteofAdministration_txt,"Route of Administration_txt")
                .click(DrugType_dropdown)//," حيوي / تقنية حيوية - Biological / Biotechnological")
                .click(DrugType_value)
                .click(DrugCategory_dropdown)
                .setValueUsingJavaScript(search_txt,"Advanced Therapy IMP (ATIMP)")
                .click(value_checkbox)
                .type(Details2_txt,"Details2")
                .clickUsingJavascript(DrugSuCategory_dropdown)
                .type(search2_txt,"Somatic cell therapy medicinal product")
                .click(value2_checkbox)
                .click(add_btn7)
                .click(Next_btn5);
        //*********************ٍStep 3*********************//
                for(int i=0;i<2;i++) {
                    driver.element().click(Addnewmedicine3_btn)
                            .select(IsthedrugregisteredinSFDA3_dropdown, "لا ولكن مسجل في - No but registered in")
                            .click(Registeredin3_dropdown)
                            .click(value3_checkbox)
                            .type(Drugregistrationnumber3_txt, "Drugregistrationnumber1234")
                            .type(ActiveIngredient3_txt, "ActiveIngredient3")
                            .type(BrandName3_txt, "BrandName3")
                            .type(DosageForm3_txt, "DosageForm3")
                            .type(Strength3_txt, "Strength3")
                            .type(RouteofAdministration3_txt, "RouteofAdministration3_txt")
                            .click(PharmacologicalClass3_dropdown)
                            .click(PharmacologicalClass3_value)
                            .click(add_btn8)
                            .click(Next_btn5);
                    i++;
                }
                //step5
        driver.element().select(NoofTrialSitesinKSA_dropdown,"موقع واحد فقط - Single Site")
                .click(Addnewmedicine3_btn)
                .select(NameofTrialSite_dropdown,"اجراء 1 - action 1")
                .type(NameofPrincipalInvestigator_txt,"NameofPrincipalInvestigator")
                .type(SaudiHealthSpecialtiesCommission_txt,"456")
                .click(verify_btn)
                .click(GCPCertified_btn)
                .type(QualifiedArea_txt,"QualifiedArea")
                .type(PlacePractice_txt,"PlacePractice")
                .type(Department_txt,"Department")
                .type(AddressPractice_txt,"AddressPractice")
                .type(Designation_txt,"Designation")
                .type(TelephoneNumber_txt,"TelephoneNumber")
                .type(EmailAddress_txt,"Email@test.com")
                .type(PlannedTrialSubjects_txt,"123123")
                .type(AddressTrial_txt,"AddressTrial")
                .type(NameIRB_txt,"NameIRB")
                .type(NCBEregistration_txt,"NCBEregistration")
                .typeFileLocationForUpload(GCPCertificate_upload,"src/test/resources/testDataFiles/Test-Doc1.pdf")
                .typeFileLocationForUpload(Localethics_upload,"src/test/resources/testDataFiles/Test-Doc1.pdf");
        System.out.println(driver.element().isElementDisplayed(confirmupload_label));
                driver.element().click(add_btn8)
                        .click(Next_btn)
                //step6
                        .click(GCPCertified_btn)
                        .click(Addnewlocalservice_btn);
        driver.element().isElementClickable(Companyname_dropdown);
        driver.element().hover(Companyname_dropdown)
                .click(Companyname_dropdown)
                .click(Companyname_value)
                        .type(Contactpersonname_txt,"Contactpersonname")
                        .type(ContactpersonEmail_txt,"cnaguibfahmy@gmail.com")
                        .type(Contactpersonmobile_txt,"0512365478")
                        .click(PleaselistthetypesofServicesEngaged_menu)
                        .click(search_checkbox)
                        .type(details_txt ,"details details_txt ")
                        .click(IstheLocalCROalsotheLocalSponsor_button)
                        .typeFileLocationForUpload(delegationletter_txt,"src/test/resources/testDataFiles/Test-Doc1.pdf");
        System.out.println(driver.element().isElementDisplayed(confirmupload2_label));
        driver.element().click(add_btn8)
                .click(Next_btn)

        /// ///////
                //.click(Doesthesponsor_button)
                //.select(Scientificofficename_dropdown,"Al rajaj")
                .type(Scientificofficename_txt,"Scientificofficename")
                .type(CompanyAddress_txt,"CompanyAddress")
                .type(TelephoneNo_txt,"0514552522")
                .type(mobilenumber_txt,"05444444444")
                .type(NameContactPerson_txt,"NameContactPerson")
                .type(Designation2_txt,"Designation")
                .type(Email_txt,"cnaguib@gf.com")
                .type(Telephone_txt,"0514555555")
                //.click(Next_btn7)
                .click(SecondarySponsorinformation_tab)
                .click(AddSecondarySponsorinformation_btn)
                .type(Scientificofficename2_txt,"Scientificofficename2")
                .type(CompanyAddress2_txt,"CompanyAddress2")
                .type(TelephoneNo2_txt,"0514552523")
                .type(mobilenumber2_txt,"054444444441")
                .type(NameContactPerson2_txt,"NameContactPerson1")
                .type(Designation3_txt,"Designation1")
                .type(Email2_txt,"cnaguib@gf.com1")
                .type(Telephone2_txt,"05145555555")
                .click(Add_btn)
                .click(Next_btn7);
        driver.element().hover(By.xpath("(//input[@type='file'])[1]"));
        for (int i = 1; i < 22; i++) {
            driver.element().typeFileLocationForUpload
                    (By.xpath("(//input[@type='file'])[" + i + "]"), "src/test/resources/testDataFiles/Test-Doc1.pdf");
            System.out.println(driver.element().isElementDisplayed(By.xpath("(//*[contains(text(),'تم الرفع')])[" + i + "]")));

        }
                driver.element().click(Next_btn)
                        //step9
                        .click(acceptterms_txt)
                        .click(Next_btn);
        driver.assertThat().element(listing_label).exists().perform();
        }


        ;

    }

