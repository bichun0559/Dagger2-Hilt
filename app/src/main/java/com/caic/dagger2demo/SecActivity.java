package com.caic.dagger2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.caic.dagger2demo.component.DaggerObjectComponent;
import com.caic.dagger2demo.object.SingletonObject;

import javax.inject.Inject;

public class SecActivity extends AppCompatActivity {
    private static final String TAG = "SecActivity";

    @Inject
    SingletonObject mSingletonObject3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        //DaggerObjectComponent.create().inject(this);
        MyApplication.getObjectComponent().inject(this);

        Log.d(TAG, "onCreate: " + "mSingletonObject3 : " + mSingletonObject3.hashCode());
    }
}