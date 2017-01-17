package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void FetchJokeTaskTest() throws Exception {
        FetchJokeTask jokeTask = new FetchJokeTask(new FetchJokeTask.Callback() {
            @Override
            public void onFinished(String result) {
                //do nothing
            }

        });
        jokeTask.execute();
        String jokestr = jokeTask.get();
        Log.d("Test: ", "FetchJokeTaskTest : " + jokestr);
        assertNotNull(jokestr);
    }
}