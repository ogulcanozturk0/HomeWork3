import java.nio.file.Path;
import java.nio.file.Paths;

public class Utility {

    public static void BrowsersPath(Enum drivertype){
        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();

        try {

            if (drivertype.equals(DriverType.CHROME)){
                System.setProperty("webdriver.chrome.driver", absolutePath+"/binary/chromedriver");
            }if (drivertype.equals(DriverType.FIREFOX)){
                System.setProperty("webdriver.gecko.driver", absolutePath+"/binary/geckodriver");
            }
            if (drivertype.equals(DriverType.EDGE)){
                System.setProperty("webdriver.edge.driver", absolutePath+"/binary/msedgedriver");
            }
        }catch (IllegalStateException e){
            System.out.println("Hasan hoca driverları yükleyin ");
        }


    }
}
