package uk.gov.harrow.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;

/**
 * Created by Chaitanya
 */
//home test class extends test base class
public class HomeTest extends TestBase {
    //object created for home page to call homepage methods here
    HomePage homePage = new HomePage();

    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToSearchFeature() {
        //below methods calling from pages package
        homePage.clickOnSearchButton();
    }

    @Test(groups = {"sanity","smoke"})
    public void verifyUserShouldNavigateToServicesFeature() {
        //below methods calling from pages package
        homePage.clickOnServiceButton();
    }


}
