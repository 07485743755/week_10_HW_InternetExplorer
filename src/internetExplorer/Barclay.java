package internetExplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Barclay {


    public static void main(String[] args) {

        String baseUrl = "https://www.barclays.co.uk/";

        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println("Title : " + driver.getTitle());
        boolean verifyTitle = title.equals("Personal banking | Barclays");
        System.out.println("Length of title : " + title.length());
        boolean verifyTitleContain = title.contains("Login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);

        driver.close();


    }
}
