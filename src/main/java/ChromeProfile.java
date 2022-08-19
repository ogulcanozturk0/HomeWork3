
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeProfile {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bilgisayar\\IdeaProjects\\Enuygun\\src\\main\\resources\\binary\\chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        String profile = "C:\\Users\\bilgisayar\\AppData\\Local\\Google\\Chrome\\User Data";
        chromeOptions.addArguments("user-data-dir=" +profile );
        ChromeDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.google.com/");




    }
}
