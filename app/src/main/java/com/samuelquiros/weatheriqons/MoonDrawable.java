package com.samuelquiros.weatheriqons;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;

public class MoonDrawable {

    public static Drawable getMoonDrawable(Context context) {
        return ContextCompat.getDrawable(context, R.drawable.weather_clear_night);
    }
}