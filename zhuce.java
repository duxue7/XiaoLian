package com.funOfSchool;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


/**
 * Created by Administrator on 2017/6/14.
 */

public class loginTest {
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
    public void login(){
        WebElement e1 = driver.findElement(By.id("com.funOfSchool:id/index_me"));
        e1.click();
        WebElement e2 = driver.findElement(By.name("设置"));
        e2.click();
        WebElement e3 = driver.findElement(By.id("com.funOfSchool:id/Bt_set_submit"));
        e3.click();
        WebElement e4 = driver.findElement(By.id("com.funOfSchool:id/Regist"));
        e4.click();
        WebElement e5 = driver.findElement(By.id("com.funOfSchool:id/line1"));
        e5.sendKeys("15232101136");
        WebElement e6 = driver.findElement(By.id("com.funOfSchool:id/Getnum"));
        e6.click();
        WebElement e7 = driver.findElement(By.id("com.funOfSchool:id/code"));
        e7.sendKeys("1234");
        WebElement e8 = driver.findElement(By.id("com.funOfSchool:id/Et_regist_password"));
        e8.sendKeys("123456");
        WebElement e9 = driver.findElement(By.id("com.funOfSchool:id/Btn_regist"));
        e9.click();
    }

}
