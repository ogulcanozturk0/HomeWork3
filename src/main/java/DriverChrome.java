import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverChrome {

    public WebDriver driver;

    public DriverChrome(){
        Utility.BrowsersPath(DriverType.CHROME);
        this.driver = new ChromeDriver();

    }
    public void open(String url) {


        try{

            String[] args = {"start-maximized"};

            Utility.BrowsersPath(DriverType.CHROME);


            WebDriver driver = new ChromeDriver();
            driver.get(url);
        }catch (SessionNotCreatedException e){
            System.out.println(" sesssion not created version error  during chromedriver instance in open method\n"+ e.getLocalizedMessage());
        }


    }
}