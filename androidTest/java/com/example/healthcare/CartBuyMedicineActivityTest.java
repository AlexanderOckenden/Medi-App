package com.example.healthcare;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.hamcrest.core.AllOf;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;

public class CartBuyMedicineActivityTest {

    @Rule
    public ActivityTestRule<CartBuyMedicineActivity> activityRule = new ActivityTestRule<>(CartBuyMedicineActivity.class);

    @Test
    public void testSelectQuantity() {

        Espresso.onView(ViewMatchers.withId(R.id.buttonBMCartDate))
                .perform(ViewActions.click());
        Espresso.onData(AllOf.allOf(IsInstanceOf.instanceOf(String.class), Is.is("5/05/2024")))
                .perform(ViewActions.click());


    }

    @Test
    public void testProceedToCheckoutButton() {

        Espresso.onView(ViewMatchers.withId(R.id.buttonBMCartCheckout))
                .perform(ViewActions.click());


    }
}


