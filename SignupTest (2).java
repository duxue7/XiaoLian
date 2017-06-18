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
        Button loginBtn1=(Button)solo.getButton("com.funOfSchool:id/index_me");
        solo.clickOnView(loginBtn1);
        //solo.typeText(0,"15232101136");
        //solo.typeText(1,"556630lzz");
        Button loginBtn2=(Button)solo.getButton("设置");
        solo.clickOnView(loginBtn2);
        Button loginBtn4=(Button)solo.getButton("com.funOfSchool:id/Bt_set_submit");
        solo.clickOnView(loginBtn4);
        Button loginBtn5=(Button)solo.getButton("com.funOfSchool:id/Regist");
        solo.clickOnView(loginBtn5);
        Button loginBtn6=(Button)solo.getButton("com.funOfSchool:id/line1");
        solo.typeText("15232101136");
        Button loginBtn7=(Button)solo.getButton("com.funOfSchool:id/Getnum");
        solo.clickOnView(loginBtn7);
        Button loginBtn8=(Button)solo.getButton("com.funOfSchool:id/code");
        solo.typeText("1234");
        Button loginBtn9=(Button)solo.getButton("com.funOfSchool:id/Et_regist_password");
        solo.typeText("123456");
        Button loginBtn10=(Button)solo.getButton("com.funOfSchool:id/Btn_regist");
        solo.clickOnView(loginBtn10);
    }



}
