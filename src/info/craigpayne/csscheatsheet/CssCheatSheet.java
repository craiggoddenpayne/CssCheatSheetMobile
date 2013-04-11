package info.craigpayne.csscheatsheet;

import android.os.Bundle;
import org.apache.cordova.*;

public class CssCheatSheet extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
        super.setIntegerProperty("splashscreen", R.drawable.splash);
        super.loadUrl(Config.getStartUrl());
        //super.loadUrl("file:///android_asset/www/index.html")
    }
}

