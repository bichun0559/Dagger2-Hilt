package com.bccc.dagger2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.bccc.dagger2demo.component.DaggerCObjectComponent;
import com.bccc.dagger2demo.object.AObject;
import com.bccc.dagger2demo.object.BObject;
import com.bccc.dagger2demo.object.CObject;
import com.bccc.dagger2demo.object.SingletonObject;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    /*父组件提供的被注入对象*/
    @Inject
    AObject mAObject1;
    @Inject
    AObject mAObject2;
    @Inject
    BObject mBObject;
    @Inject
    SingletonObject mSingletonObject1;
    @Inject
    SingletonObject mSingletonObject2;
    @Inject
    Context mContext;

    /*子组件提供的被注入对象*/
    @Inject
    CObject mCObject1;
    @Inject
    CObject mCObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerObjectComponent.create().inject(this);
//        MyApplication.getObjectComponent().inject(this);
//        DaggerObjectComponent.builder()
//                .aObjectModule(new AObjectModule())
//                .bObjectModule(new BObjectModule())
//                .build()
//                .injectMainActivity(this);

        //这里使用ObjectComponent的子组件CObjectComponent执行注入动作，并且可以复用父组件ObjectComponent中定义的对象资源
        DaggerCObjectComponent.builder().objectComponent(MyApplication.getObjectComponent()).build().inject(this);

        Log.d(TAG, "onCreate: "
                + ", mAObject1 : " + mAObject1.hashCode()
                + ", mAObject2 : " + mAObject2.hashCode()
                + ", mBObject : " + mBObject.hashCode()
                + ", mSingletonObject1 : " + mSingletonObject1.hashCode()
                + ", mSingletonObject2 : " + mSingletonObject2.hashCode()
                + ", mCObject1 : " + mCObject1.hashCode()
                + ", mCObject2 : " + mCObject2.hashCode()
                + ", mContext : " + mContext);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(view -> startActivity(new Intent(this, SecActivity.class)));
    }

}