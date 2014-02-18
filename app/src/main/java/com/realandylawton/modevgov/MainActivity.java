package com.realandylawton.modevgov;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    public static final String SOME_TEXT = "Swimming Pools";

    protected EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.editText);

    }

    @Override protected void onPause() {
        super.onPause();

        mEditText.setText(SOME_TEXT);

    }
}
