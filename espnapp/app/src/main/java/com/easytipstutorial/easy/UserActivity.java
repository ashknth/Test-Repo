package com.easytipstutorial.easy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class UserActivity extends AppCompatActivity {
    private static String TAG="UserActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onStart");
        setContentView(R.layout.activity_user);
    }
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}