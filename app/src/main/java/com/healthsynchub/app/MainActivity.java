package com.healthsynchub.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Typeface;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(40, 40, 40, 40);

        TextView title = new TextView(this);
        title.setText("HealthSync Hub");
        title.setTextSize(28);
        title.setTypeface(Typeface.DEFAULT_BOLD);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("Your simple health dashboard is ready for testing.");
        subtitle.setTextSize(16);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 24, 0, 0);

        layout.addView(title);
        layout.addView(subtitle);

        setContentView(layout);
    }
}
