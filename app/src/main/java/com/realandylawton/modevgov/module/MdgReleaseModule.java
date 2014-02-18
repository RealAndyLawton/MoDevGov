package com.realandylawton.modevgov.module;

import android.content.Context;
import android.location.LocationManager;
import com.realandylawton.modevgov.activity.MainActivity;
import dagger.Module;
import dagger.Provides;

@Module(
    library = true,
    injects = MainActivity.class
)
public class MdgReleaseModule {

    private Context mContext;

    public MdgReleaseModule(Context context) {
        mContext = context;
    }

    @Provides Context provideContext() {
        return mContext;
    }

    @Provides LocationManager provideLocationManager() {
        return (LocationManager) mContext.getSystemService(Context.LOCATION_SERVICE);
    }

}
