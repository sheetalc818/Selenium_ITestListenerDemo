
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


public class BaseTest
{
    public static WebDriver driver;

    public void initilization()
    {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Reporter.log("====Browser Session Started====", true);
    }


    public void failed(String TestMethodname)
    {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
            //If wants to take screenshot with Class name
            //FileUtils.copyFile(srcFile, new File("/home/admin1/eclipse-workspace/SeleniumProblemStm/FailedTCScreenshots/"+"Fileshot_"+this.getClass().getName()+"_"+".png"));

            //If wants to take screenshot with Test Method name
            FileUtils.copyFile(srcFile, new File("/home/sheetal/IdeaProjects/ITestListenerDemo/Screenshot/"+TestMethodname+"_"+".png"));
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Reporter.log("====Inside failed() method====", true);
    }

    public void quit()
    {
        driver.quit();
        Reporter.log("====Browser Session Ends====", true);
    }
}
