package com.example.platformer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class PlatformActivity extends Activity {
    // Our object to handle the View
    private PlatformView platformView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get a Display object to access screen details

        Display display = getWindowManager().getDefaultDisplay();
        // Load the resolution into a Point object

        Point resolution = new Point();
        display.getSize(resolution);

        // And finally set the view for our game
        // Also passing in the screen resolution
        platformView = new PlatformView
                (this, resolution.x, resolution.y);
        // Make our platformView the view for the Activity
        setContentView(platformView);
        }
    @Override
    protected void onPause() {
        super.onPause();
        platformView.pause();
    }
    // If the Activity is resumed make sure to resume our thread
    @Override
    protected void onResume() {
        super.onResume();
        platformView.resume();
    }
}