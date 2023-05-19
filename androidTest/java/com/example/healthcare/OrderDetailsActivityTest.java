package com.example.healthcare;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

    public class OrderDetailsActivityTest {

        @Rule
        public ActivityTestRule<OrderDetailsActivity> activityRule = new ActivityTestRule<>(OrderDetailsActivity.class);

        @Test
        public void testCancelButton() {

            Espresso.onView(ViewMatchers.withId(R.id.buttonODBack))
                    .perform(ViewActions.click());


        }


    }


