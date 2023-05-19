package com.example.healthcare;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.app.Activity;
import android.content.Intent;

import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


@RunWith(AndroidJUnit4.class)
public class LabTestDetailsActivity extends Activity {

    @Rule
    public ActivityScenarioRule<LabTestDetailsActivity> activityRule = new ActivityScenarioRule<>(LabTestDetailsActivity.class);

    @Before
    public void setUp() {
        Intents.init();
    }

    @After
    public void tearDown() {
        Intents.release();
    }

    @Test
    public void testAddToCartButton() {

        Intent intent = new Intent();
        intent.putExtra("text1", "Package 1 : Full Body Checkup");
        intent.putExtra("text2", "Blood Glucose Fasting\nComplete Hemogram\nHbA1c\nIron Studies\nKidney Function Test\nLDH Lactate Dehydrogenase, Serum\nLipid Profile\nLiver Function Test");
        intent.putExtra("text3", "200");


        activityRule.getScenario().onActivity(activity -> activity.setIntent(intent));


        Espresso.onView(withId(R.id.buttonLDAddToCart))
                .perform(ViewActions.click());



        intended(hasComponent(LabTestActivity.class.getName()));
    }
}
