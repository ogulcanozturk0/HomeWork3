import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class LoginPageTest {

    DriverSetup driverSetup;
    LoginTest loginTest;
    List<WebDriver> driverSetupList ;
    public LoginPageTest(){
        driverSetup = new DriverSetup();
        driverSetupList = new ArrayList<>();
        driverSetupList.add(driverSetup.chromeDriver);
        driverSetupList.add(driverSetup.firefoxDriver);
        driverSetupList.add(driverSetup.edgeDriver);
        loginTest = new LoginTest(driverSetupList);

    }


    public void checkOpenWebV2(){
        driverSetup.open("https://www.enuygun.com/");
        String openedWebApp = driverSetup.chromeDriver.getCurrentUrl();
        if(openedWebApp.equals("https://www.enuygun.com/")){
            System.out.println("passed for chrome");
        }

        openedWebApp = driverSetup.firefoxDriver.getCurrentUrl();
        if(openedWebApp.equals("https://www.enuygun.com/")){
            System.out.println("passed for firefox");
        }
    }

    public void checkOpenLogin(){
        loginTest.openLoginPage();
    }
}