
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends BaseTest implements ITestListener
{
    public void onTestFailure(ITestResult result)
    {
        System.out.println("Test failed");
        //if wants to take screenshot with Class name then
        //failed();
        failed(result.getMethod().getMethodName());
    }
}
