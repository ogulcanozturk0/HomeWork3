import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverEdge {
    WebDriver driver;
    public DriverEdge(){
        Utility.BrowsersPath(DriverType.EDGE
        );
        this.driver = new EdgeDriver();

    }
    public void open(String url) {

        String[] args={"start-maximized", "headless"};
        System.out.println(args[0]);
        Utility.BrowsersPath(DriverType.EDGE);



        WebDriver driver = new EdgeDriver();
        driver.get(url);

    }
}
