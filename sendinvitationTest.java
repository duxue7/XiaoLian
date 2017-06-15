package androidTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * Created by Administrator on 2017/6/15.
 */

public class sendinvitationTest {
    private AndroidDriver driver;

    @Before
    public void setUp() throws Exception{
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot,"../../../apps/app-release");
        File app =new File(appDir,"app-release.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformVersion","4.4");
        capabilities.setCapability("app",app.getAbsolutePath());
        capabilities.setCapability("appPackage","com.funOfSchool");
        capabilities.setCapability("appActivity",".funOfSchool");
        driver = new AndroidDriver<>(new URL("http://115.159.43.207"),capabilities);

        @After
        public void tearDown()throw Exception{
            driver.quit();
        }
    }
    @Test
    public void login(){
        WebElement e1 = driver.findElement(By.id("com.funOfSchool:id/index_me"));
        e1.click();
        WebElement e3 = driver.findElement(By.name("设置"));
        e3.click();
        WebElement e4 = driver.findElement(By.id("com.funOfSchool:id/Bt_set_submit"));
        e4.click();
        List<AndroidElement> e2 = driver.findElements(By.className("android.widget.EditText"));
        e2.get(1).sendKeys("18920102119");
        e2.get(2).sendKeys("123456a");
        e1.findElementByName("登录").click();
        WebElement e5 = driver.findElement(By.id("com.funOfSchool:id/map_et_search"));
        e5.sendKeys("河北师范大学");
        WebElement e6 = driver.findElement(By.id("com.funOfSchool:id/map_cannot_invite"));
        e6.click();
    }
}
