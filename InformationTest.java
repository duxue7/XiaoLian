package com.funOfSchool.util;

import android.support.test.InstrumentationRegistry;
import android.widget.Button;

import com.funOfSchool.LoginTest;
import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * Created by yc on 2017/6/1
 */

public class InformationTest extends LoginTest {
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
    public  void  testInformation(){
        Button inforBtn1=(Button)solo.getButton("android.widget.EditText");
        solo.clickOnView(inforBtn1);
        Button inforBtn2=(Button)solo.getButton("个人资料");
        solo.clickOnView(inforBtn2);
        Button nameBtn=(Button)solo.getButton("姓名");
        solo.clickOnView(nameBtn);
        solo.typeText(0,"yc");
        Button yesBtn=(Button)solo.getButton("确定");
        solo.clickOnView(yesBtn);
    }

}
