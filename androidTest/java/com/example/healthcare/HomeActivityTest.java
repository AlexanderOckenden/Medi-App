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


@RunWith(AndroidJUnit4.class)
public class HomeActivityTest {

    @Rule
    public ActivityScenarioRule<HomeActivity> activityRule = new ActivityScenarioRule<>(HomeActivity.class);

    @Before
    public void setUp() {
        Intents.init();
    }

    @After
    public void tearDown() {
        Intents.release();
    }

    @Test
    public void testExitButton() {

        Espresso.onView(ViewMatchers.withId(R.id.cardExit))
                .perform(ViewActions.click());


        intended(hasComponent(LoginActivity.class.getName()));
    }

    @Test
    public void testFindDoctorButton() {

        Espresso.onView(ViewMatchers.withId(R.id.cardFindDoctor))
                .perform(ViewActions.click());


        intended(hasComponent(FindDoctorActivity.class.getName()));
    }

    @Test
    public void testLabTestButton() {

        Espresso.onView(ViewMatchers.withId(R.id.cardLabTest))
                .perform(ViewActions.click());


        intended(hasComponent(LabTestActivity.class.getName()));
    }

    @Test
    public void testOrderDetailsButton() {

        Espresso.onView(ViewMatchers.withId(R.id.cardOrderDetails))
                .perform(ViewActions.click());


        intended(hasComponent(OrderDetailsActivity.class.getName()));
    }

    @Test
    public void testBuyMedicineButton() {

        Espresso.onView(ViewMatchers.withId(R.id.cardBuyMedicine))
                .perform(ViewActions.click());


        intended(hasComponent(BuyMedicineActivity.class.getName()));
    }

    @Test
    public void testHealthButton() {

        Espresso.onView(ViewMatchers.withId(R.id.cardHealthDoctor))
                .perform(ViewActions.click());


        intended(hasComponent(HealthArticlesActivity.class.getName()));
    }
}

