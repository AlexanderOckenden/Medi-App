package com.example.healthcare;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class HealthArticlesDetailsActivityTest {

    @Rule
    public ActivityScenarioRule<HealthArticlesDetailsActivity> activityRule =
            new ActivityScenarioRule<>(HealthArticlesDetailsActivity.class);

    @Test
    public void testHealthArticlesDetails() {

        String title = "Walking Daily";
        int imageResId = R.drawable.health1;


        Intent intent = new Intent();
        intent.putExtra("text1", title);
        intent.putExtra("text2", imageResId);
        ActivityScenario<HealthArticlesDetailsActivity> scenario = ActivityScenario.launch(intent);


    }

}
