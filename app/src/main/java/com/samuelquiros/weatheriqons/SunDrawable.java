package com.samuelquiros.weatheriqons;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;

public class SunDrawable {

    public static Drawable getSunDrawable(Context context) {
        return ContextCompat.getDrawable(context, R.drawable.weather_clear_day);
    }
}