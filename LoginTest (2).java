package com.funOfSchool;

import android.support.test.InstrumentationRegistry;
import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class LoginTest {
    @Rule
    public ActivityTestRule<CheckoutActivity> activityTestRule = new ActivityTestRule<>(CheckoutActivity.class);
    private Solo solo ;
    @Before
    public void login(){
        solo = new Solo (InstrumentationRegistry.getInstrumentation(),activityTestRule.getActivity());
    }
    @After
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    @Test
    public  void  testLogin(){
        solo.unlockScreen();
        Button loginBtn1=(Button)solo.getButton("android.widget.EditText");
        solo.clickOnView(loginBtn1);
        solo.typeText(0,"152132158003");
        solo.typeText(1,"ycy960229");
        Button loginBtn2=(Button)solo.getButton("登录");
        solo.clickOnView(loginBtn2);
    }



}
