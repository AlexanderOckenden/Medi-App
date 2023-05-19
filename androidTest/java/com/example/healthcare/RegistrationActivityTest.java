package com.example.healthcare;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

public class RegistrationActivityTest {

    @Rule
    public ActivityTestRule<RegisterActivity> activityRule = new ActivityTestRule<>(RegisterActivity.class);

    @Test
    public void testRegistrationSuccess() {

        Espresso.onView(ViewMatchers.withId(R.id.editTextAppFullName))
                .perform(ViewActions.typeText("new_username"));
        Espresso.onView(ViewMatchers.withId(R.id.editTextAppAddress))
                .perform(ViewActions.typeText("new_email@example.com"));
        Espresso.onView(ViewMatchers.withId(R.id.editTextAppContactNumber))
                .perform(ViewActions.typeText("new_password"));


        Espresso.onView(ViewMatchers.withId(R.id.buttonBookAppointment))
                .perform(ViewActions.click());


    }

    @Test
    public void testRegistrationFailure() {
        // Enter invalid registration details
        Espresso.onView(ViewMatchers.withId(R.id.editTextAppFullName))
                .perform(ViewActions.typeText("existing_username"));
        Espresso.onView(ViewMatchers.withId(R.id.editTextAppAddress))
                .perform(ViewActions.typeText("existing_email@example.com"));
        Espresso.onView(ViewMatchers.withId(R.id.editTextAppContactNumber))
                .perform(ViewActions.typeText("new_password"));


        Espresso.onView(ViewMatchers.withId(R.id.buttonBookAppointment))
                .perform(ViewActions.click());


    }
}

