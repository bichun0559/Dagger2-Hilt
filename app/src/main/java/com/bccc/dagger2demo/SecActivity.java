package com.bccc.dagger2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.bccc.dagger2demo.component.DaggerCObjectComponent;
import com.bccc.dagger2demo.object.AInterface;
import com.bccc.dagger2demo.object.DObject;
import com.bccc.dagger2demo.object.EObject;
import com.bccc.dagger2demo.object.SingletonObject;

import javax.inject.Inject;
import javax.inject.Named;

public class SecActivity extends AppCompatActivity {
    private static final String TAG = "SecActivity";

    @Inject
    SingletonObject mSingletonObject3;

    @Inject
    DObject mDObject;

    //注入接口实例，不需要关心接口的具体实现
    @Inject
    AInterface mAInterface;

    /**{@link com.bccc.dagger2demo.module.EObjectModule}**/
    @Named("WithoutName")
    @Inject
    EObject mEObject1;

    /**{@link com.bccc.dagger2demo.module.EObjectModule}**/
    @Named("WithName")
    @Inject
    EObject mEObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        //DaggerObjectComponent.create().inject(this);
        //MyApplication.getObjectComponent().inject(this);

        MyApplication.getObjectComponent().dObjectComponent().create().inject(this);

        Log.d(TAG, "onCreate: "
                + "mSingletonObject3 : " + mSingletonObject3.hashCode()
                + ", mDObject : " + mDObject.hashCode()
                + ", mAInterface : " + mAInterface.getString()
                + ", mEObject1 : " + mEObject1.getName()
                + ", mEObject2 : " + mEObject2.getName());

    }
}