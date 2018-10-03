package com.ztoais.androidcodeanalysis.androidcodeanalysis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void someMethod(int variable) {
        switch (variable) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }
    }

    private void someMethod(int a, int b, int c, int d) {
        if (a > b) {
            if (b > c) {
                if (c > d) {
                    if (d > a) {
                        // some logic
                    }
                }
            }
        }
    }
}
