
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class Screenshot extends BaseTest
{
    @BeforeMethod
    public void setUp()
    {
        initilization();
    }

    @Test
    public void SearchTest()
    {
        Assert.assertEquals(true, true);
    }

    @Test
    public void ClearText()
    {
        Assert.assertEquals(false, true);
    }

    @Test
    public void FindText()
    {
        Assert.assertEquals(false, true);
    }

    @AfterMethod
    public void tearDown()
    {
        quit();
    }
}
