package com.example.healthcare;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.contrib.PickerActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.Calendar;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.core.IsNot.not;

import android.widget.DatePicker;
import android.widget.TimePicker;

@RunWith(AndroidJUnit4ClassRunner.class)
public class CartLabActivityTest {

    @Rule
    public ActivityScenarioRule<CartLabActivity> activityScenarioRule = new ActivityScenarioRule<>(CartLabActivity.class);

    @Test
    public void verifyDateSelection() {

        Espresso.onView(ViewMatchers.withId(R.id.buttonBMCartDate)).perform(click());

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        Espresso.onView(withClassName(Matchers.equalTo(DatePicker.class.getName())))
                .perform(PickerActions.setDate(year, month + 1, dayOfMonth));
        Espresso.onView(withId(android.R.id.button1)).perform(click());


        String selectedDate = String.format("%02d/%02d/%04d", dayOfMonth, month + 1, year);
        Espresso.onView(withId(R.id.buttonBMCartDate)).check(matches(withText(selectedDate)));
    }

    @Test
    public void verifyTimeSelection() {

        Espresso.onView(withId(R.id.buttonCartTime)).perform(click());


        int hourOfDay = 10;
        int minute = 30;
        Espresso.onView(withClassName(Matchers.equalTo(TimePicker.class.getName())))
                .perform(PickerActions.setTime(hourOfDay, minute));
        Espresso.onView(withId(android.R.id.button1)).perform(click());


        String selectedTime = String.format("%02d:%02d", hourOfDay, minute);
        Espresso.onView(withId(R.id.buttonCartTime)).check(matches(withText(selectedTime)));
    }


    @Test
    public void verifyCheckoutButton() {

        Espresso.onView(withId(R.id.buttonBMCartCheckout)).perform(click());


        Espresso.onView(withId(R.id.buttonBMCartCheckout)).check(matches(isDisplayed()));
    }

    @Test
    public void verifyBackButton() {

        Espresso.onView(withId(R.id.buttonBMCartBack)).perform(click());


        Espresso.onView(withId(R.id.buttonBMCartBack)).check(matches(isDisplayed()));
    }
}
