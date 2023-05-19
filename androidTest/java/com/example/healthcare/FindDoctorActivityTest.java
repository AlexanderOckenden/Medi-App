package com.example.healthcare;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class FindDoctorActivityTest {

    @Rule
    public IntentsTestRule<FindDoctorActivity> intentsTestRule = new IntentsTestRule<>(FindDoctorActivity.class);

    @Test
    public void clickFamilyPhysician_opensDoctorDetailsActivity() {
        Espresso.onView(withId(R.id.cardFDFamilyPhysician)).perform(click());

    }

    @Test
    public void clickDietician_opensDoctorDetailsActivity() {
        Espresso.onView(withId(R.id.cardFDDietician)).perform(click());

    }

    @Test
    public void clickDentist_opensDoctorDetailsActivity() {
        Espresso.onView(withId(R.id.cardFDDentist)).perform(click());

    }

    @Test
    public void clickSurgeon_opensDoctorDetailsActivity() {
        Espresso.onView(withId(R.id.cardFDSurgeon)).perform(click());

    }

    @Test
    public void clickCardiologists_opensDoctorDetailsActivity() {
        Espresso.onView(withId(R.id.cardFDCardiologists)).perform(click());

    }
}
