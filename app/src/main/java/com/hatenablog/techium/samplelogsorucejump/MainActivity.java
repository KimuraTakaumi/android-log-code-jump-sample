package com.hatenablog.techium.samplelogsorucejump;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new com.hatenablog.techium.samplelogsorucejump.sample1.Sample().show();
        new com.hatenablog.techium.samplelogsorucejump.sample2.Sample().show();

    }
}
