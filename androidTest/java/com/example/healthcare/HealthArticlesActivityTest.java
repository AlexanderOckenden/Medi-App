package com.example.healthcare;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.intent.Intents;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class HealthArticlesActivityTest {

    @Rule
    public ActivityScenarioRule<HealthArticlesActivity> activityRule = new ActivityScenarioRule<>(HealthArticlesActivity.class);

    @Before
    public void setUp() {
        Intents.init();
    }

    @After
    public void tearDown() {
        Intents.release();
    }

    @Test
    public void testListItemClick() {

        activityRule.getScenario();


        Espresso.onData(allOf())
                .inAdapterView(withId(R.id.listViewHA))
                .atPosition(0)
                .perform(ViewActions.click());

        intended(hasComponent(HealthArticlesDetailsActivity.class.getName()));
    }
}

