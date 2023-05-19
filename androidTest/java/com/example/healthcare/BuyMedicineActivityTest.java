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
import static org.hamcrest.Matchers.anything;

@RunWith(AndroidJUnit4ClassRunner.class)
public class BuyMedicineActivityTest {

    @Rule
    public ActivityScenarioRule<BuyMedicineActivity> activityScenarioRule = new ActivityScenarioRule<>(BuyMedicineActivity.class);

    @Test
    public void verifyItemClick() {

        Espresso.onData(anything())
                .inAdapterView(withId(R.id.listViewBM))
                .atPosition(0)
                .perform(click());



        Espresso.onView(withId(R.layout.activity_buy_medicine_details))
                .check(matches(isDisplayed()));
    }

    @Test
    public void verifyGoToCartButtonClick() {

        Espresso.onView(withId(R.id.buttonBMGoToCart)).perform(click());



        Espresso.onView(withId(R.layout.activity_cart_buy_medicine))
                .check(matches(isDisplayed()));
    }

    @Test
    public void verifyBackButtonClick() {

        Espresso.onView(withId(R.id.buttonBMBack)).perform(click());

        Espresso.onView(withId(R.layout.activity_home))
                .check(matches(isDisplayed()));
    }
}
