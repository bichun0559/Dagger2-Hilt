package com.caic.dagger2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.caic.dagger2demo.component.DaggerObjectComponent;
import com.caic.dagger2demo.object.AObject;
import com.caic.dagger2demo.object.BObject;
import com.caic.dagger2demo.object.SingletonObject;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Inject
    AObject mAObject1;

    @Inject
    AObject mAObject2;

    @Inject
    BObject mBObject;

    //SingletonObject创建的对象实例是局部单例, mSingletonObject1和mSingletonObject2是同一个对象
    @Inject
    SingletonObject mSingletonObject1;

    @Inject
    SingletonObject mSingletonObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerObjectComponent.create().inject(this);
        MyApplication.getObjectComponent().inject(this);
//        DaggerObjectComponent.builder()
//                .aObjectModule(new AObjectModule())
//                .bObjectModule(new BObjectModule())
//                .build()
//                .injectMainActivity(this);

        Log.d(TAG, "onCreate: "
                + ", mAObject1 : " + mAObject1.hashCode()
                + ", mAObject2 : " + mAObject2.hashCode()
                + ", mBObject : " + mBObject.hashCode()
                + ", mSingletonObject1 : " + mSingletonObject1.hashCode()
                + ", mSingletonObject2 : " + mSingletonObject2.hashCode());

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(view -> startActivity(new Intent(this, SecActivity.class)));
    }

}