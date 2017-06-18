package com.funOfSchool;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * Created by l on 2017/5/20
 */

public class Search {
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
        driver = new AndroidDriver<>(new URL(""),capabilities);
        @After
        public void tearDown()throw Exception{
            driver.quit();
        }
    }
    @Test
    public void Search(){
        WebElement e1 = driver.findElement(By.id("com.funOfSchool:id/map_et_search"));
        e1.sendKeys("河北师范大学");
        WebElement e2 = driver.findElement(By.name("河北师范大学"));
        e2.click("河北师范大学");

    }

}
