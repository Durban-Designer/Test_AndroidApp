package com.screenartstudios.test_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.screenartstudios.test_app.R.string.string1;

public class Launch_Activity extends AppCompatActivity {
    int num = 0;
    int taps = 0;
    TextView tView;
    Button clickhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch_activity_layout);

        tView = (TextView) findViewById(R.id.textView1);
        clickhere = (Button) findViewById(R.id.button1);

        clickhere.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (taps == 0) {
                    tView.setText(getString(R.string.string2));
                    taps++;
                } else {
                    tView.setText(getString(R.string.string1));
                    taps--;
                }
            }
        });
    }
}

