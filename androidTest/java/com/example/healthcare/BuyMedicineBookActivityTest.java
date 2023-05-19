package com.example.healthcare;


import androidx.test.espresso.Espresso;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4ClassRunner.class)
public class BuyMedicineBookActivityTest {

    @Rule
    public ActivityScenarioRule<BuyMedicineBookActivity> activityScenarioRule = new ActivityScenarioRule<>(BuyMedicineBookActivity.class);

    @Test
    public void verifyBookingProcess() {

        Espresso.onView(withId(R.id.buttonBMBBooking)).perform(click());


        Espresso.onView(withId(R.layout.activity_home)).check(matches(isDisplayed()));
    }
}
