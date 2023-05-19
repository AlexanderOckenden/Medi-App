package com.example.healthcare;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class DoctorDetailsActivityTest {

    @Rule
    public IntentsTestRule<DoctorDetailsActivity> intentsTestRule = new IntentsTestRule<>(DoctorDetailsActivity.class);

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
        Intents.release();
    }

    @Test
    public void backButtonClicked_opensFindDoctorActivity() {
        Espresso.onView(withId(R.id.buttonBMCartBack)).perform(click());
        intended(hasComponent(FindDoctorActivity.class.getName()));
    }

    @Test
    public void doctorItemClicked_opensBookAppointmentActivity() {
        Espresso.onView(withId(R.id.listViewBMCart)).perform(click());
        intended(hasComponent(BookAppointmentActivity.class.getName()));
    }

    @Test
    public void doctorDetailsDisplayed() {
        Espresso.onView(withId(R.id.listViewBMCart)).check(matches(isDisplayed()));
    }
}
