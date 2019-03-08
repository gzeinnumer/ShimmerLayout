package com.gzeinnumer.shimmerlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShimmerLayout shimmerLayout = findViewById(R.id.shim);
        shimmerLayout.startShimmerAnimation();
    }
}
