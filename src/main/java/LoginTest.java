import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginTest {
    WebDriver driverChrome;
    WebDriver driverFirefox;
    WebDriver driverEdge;
    public void LoginTest(){


    }
    public LoginTest(List<WebDriver> driverList){
        this.driverChrome = driverList.get(0);
        this.driverFirefox = driverList.get(1);
        this.driverEdge = driverList.get(2);

    }
    public void openLoginPage(){
        this.driverChrome.findElement(By.id("ctx-LoginBtn")).click();
        this.driverFirefox.findElement(By.id("ctx-LoginBtn")).click();
    }
}
