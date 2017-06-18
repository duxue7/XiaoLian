package com.funOfSchool;

import android.widget.Button;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * Created by l on 2017/5/20.
 */

public class search {
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
    public  void  testserch(){
        solo.unlockScreen();
        Button searchBtn1=(Button)solo.getButton("com.funOfSchool:id/map_et_search");
        solo.typeText("河北师范大学");
        Button searchBtn2=(Button)solo.getButton("河北师范大学");
        solo.clickOnView(searchBtn2);

    }
}
