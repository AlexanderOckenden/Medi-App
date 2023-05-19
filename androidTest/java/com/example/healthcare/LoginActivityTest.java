package com.example.healthcare;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> activityRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void testLoginSuccess() {

        Espresso.onView(ViewMatchers.withId(R.id.editTextLoginUsername))
                .perform(ViewActions.typeText("your_username"));
        Espresso.onView(ViewMatchers.withId(R.id.editTextLoginPassword))
                .perform(ViewActions.typeText("your_password"));


        Espresso.onView(ViewMatchers.withId(R.id.buttonLogin))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.buttonLogin))
                .perform(ViewActions.click());



    }

    @Test
    public void testLoginFailure() {

        Espresso.onView(ViewMatchers.withId(R.id.editTextLoginUsername))
                .perform(ViewActions.typeText("invalid_username"));
        Espresso.onView(ViewMatchers.withId(R.id.editTextLoginPassword))
                .perform(ViewActions.typeText("invalid_password"));


        Espresso.onView(ViewMatchers.withId(R.id.buttonLogin))
                .perform(ViewActions.click());


        Espresso.onView(ViewMatchers.withId(R.id.buttonLogin))
                .perform(ViewActions.click());



    }
    }

