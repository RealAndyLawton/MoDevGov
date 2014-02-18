package com.realandylawton.modevgov;

import android.app.Activity;
import android.app.Application;
import com.realandylawton.modevgov.module.MdgReleaseModule;
import dagger.ObjectGraph;

/**
 * Created by realandylawton on 2/20/14.
 */
public class MdgApplication extends Application {

    private ObjectGraph mObjectGraph;

    @Override public void onCreate() {
        super.onCreate();

        // Construct the module
        MdgReleaseModule module = new MdgReleaseModule(getApplicationContext());

        // Create the ObjectGraph by passing a Module
        mObjectGraph = ObjectGraph.create(module);
    }

    public static void inject(Activity activity) {

        // Activity instances are handle by the Android framework
        // and not created with constructors.
        // We must manually inject our Activity instances.
        ((MdgApplication) activity.getApplication())
            .getObjectGraph().inject(activity);
    }

    public ObjectGraph getObjectGraph() {
        return mObjectGraph;
    }
}
