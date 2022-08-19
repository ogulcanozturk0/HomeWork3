import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverFirefox {

    WebDriver driver;
    public DriverFirefox(){
        Utility.BrowsersPath(DriverType.FIREFOX);
        this.driver = new FirefoxDriver();

    }
    public void open(String url) {

        String[] args={"start-maximized", "headless"};
        System.out.println(args[0]);
        Utility.BrowsersPath(DriverType.FIREFOX);


        WebDriver driver = new FirefoxDriver();
        driver.get(url);

    }
}