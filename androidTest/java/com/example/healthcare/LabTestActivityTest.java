package com.example.healthcare;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class LabTestActivityTest {

    @Rule
    public ActivityScenarioRule<LabTestActivity> activityRule = new ActivityScenarioRule<>(LabTestActivity.class);

    @Before
    public void setUp() {
        Intents.init();
    }

    @After
    public void tearDown() {
        Intents.release();
    }

    @Test
    public void testBackButton() {
        Espresso.onView(withId(R.id.buttonBMCartBack))
                .perform(ViewActions.click());

        intended(hasComponent(HomeActivity.class.getName()));
    }

    @Test
    public void testItemClick() {
        Espresso.onData(withId(R.id.listViewBMCart))
                .inAdapterView(withId(R.id.listViewBMCart))
                .atPosition(0)
                .perform(ViewActions.click());

        intended(hasComponent(LabTestDetailsActivity.class.getName()));
    }

    @Test
    public void testGoToCartButton() {
        Espresso.onView(withId(R.id.buttonBMCartCheckout))
                .perform(ViewActions.click());

        intended(hasComponent(CartLabActivity.class.getName()));
    }
}
