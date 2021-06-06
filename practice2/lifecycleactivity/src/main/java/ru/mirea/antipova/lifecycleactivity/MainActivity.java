package ru.mirea.antipova.lifecycleactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate()");
    }

    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart()");
    }

    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        Log.i(TAG, "onRestoreInstanceState()");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.i(TAG, "onPostCreate()");
    }

    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG, "onPostResume()");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow()");
    }

    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause");
    }
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
        Log.i(TAG, "onSaveInstanceState()");
    }

    protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }
}
