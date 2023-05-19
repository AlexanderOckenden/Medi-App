package com.example.healthcare;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4ClassRunner.class)
public class BookAppointmentActivityTest {

    @Rule
    public ActivityScenarioRule<BookAppointmentActivity> activityScenarioRule = new ActivityScenarioRule<>(BookAppointmentActivity.class);

    @Test
    public void verifyBackButtonClick() {

        Espresso.onView(withId(R.id.buttonAppBack)).perform(click());



        Espresso.onView(withId(R.layout.activity_find_doctor))
                .check(matches(isDisplayed()));
    }

    @Test
    public void verifyBookAppointmentButtonClick() {

        Espresso.onView(withId(R.id.buttonBookAppointment)).perform(click());



        Espresso.onView(withId(R.layout.activity_home))
                .check(matches(isDisplayed()));
    }
}

