package internetExplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class X_Cart {


    public static void main(String[] args) {

        String baseUrl = "https://www.x-cart.com/";

        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println("Title : " + driver.getTitle());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        System.out.println("Length of title : " + title.length());

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        boolean verifyTitle = title.equals("X-Cart | The Last Ecommerce Platform You Will Ever Need");

        boolean verifyTitleContain = title.contains("Homepage");
        System.out.println(verifyTitle);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println("Title contains 'Homepage': \t"+ verifyTitleContain);

        //driver.close();

        driver.quit();
    }
}
