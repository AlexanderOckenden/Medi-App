package com.example.healthcare;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

public class BuyMedicineDetailsActivityTest {

    @Rule
    public ActivityTestRule<BuyMedicineDetailsActivity> activityRule = new ActivityTestRule<>(BuyMedicineDetailsActivity.class);

    @Test
    public void testAddToCartButton() {

        Espresso.onView(ViewMatchers.withId(R.id.buttonBMDAddToCart))
                .perform(ViewActions.click());


    }

    @Test
    public void testIncreaseQuantityButton() {

        Espresso.onView(ViewMatchers.withId(R.id.buttonBMDAddToCart))
                .perform(ViewActions.click());


    }

    @Test
    public void testDecreaseQuantityButton() {

        Espresso.onView(ViewMatchers.withId(R.id.buttonBMDAddToCart))
                .perform(ViewActions.click());


    }
}

