package com.realandylawton.modevgov.activity;

import android.app.Activity;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.realandylawton.modevgov.MdgApplication;
import com.realandylawton.modevgov.R;
import javax.inject.Inject;

public class MainActivity extends Activity {

    public static final String SOME_TEXT = "Swimming Pools";

    @Inject protected LocationManager mLocationManager;
    protected EditText mEditText;
    protected TextView mLocationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Activities are not created by the Android system via Constructors
        // We must explicitly inject into the ObjectGraph
        MdgApplication.inject(this);

        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.editText);
        mLocationText = (TextView) findViewById(R.id.locationTextView);

        showLocationText();

    }

    @Override protected void onPause() {
        super.onPause();
        mEditText.setText(SOME_TEXT);

    }

    private void showLocationText() {

        Location location = mLocationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        mLocationText.setText(location.toString());

    }

}
