package com.realandylawton.modevgov.test;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.realandylawton.modevgov.MainActivity;
import com.realandylawton.modevgov.R;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertEquals;

/**
 * Created by realandylawton on 2/17/14.
 */

@RunWith(RobolectricTestRunner.class)
public class MainActivityTests {

    @Test
    public void pausingActivity_shouldChangeText() {

        ActivityController<MainActivity> activityController = Robolectric.buildActivity(MainActivity.class);
        MainActivity activity = activityController
            .create()
            .visible()
            .get();

        assertEquals("Edit Text was not empty",
            "", getText(activity));

        // Pause and confirm the text changed
        activity = activityController
            .pause()
            .get();

        assertEquals("Text wasn't changed",
            MainActivity.SOME_TEXT, getText(activity));

    }

    private String getText(MainActivity activity) {

        return ((EditText) activity.findViewById(R.id.editText))
                .getText().toString();

    }

}
