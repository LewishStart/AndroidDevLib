package com.lewish.start.androiddevlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lewish.start.android_lib.net.CommonOkHttpClient;
import com.lewish.start.android_lib.net.listener.DisposeDataHandle;
import com.lewish.start.android_lib.net.listener.DisposeDataListener;
import com.lewish.start.android_lib.net.request.CommonRequest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testGetNetAcess();
    }

    private void testGetNetAcess() {
        CommonOkHttpClient.get(CommonRequest.createGetRequest("http://10.0.130.54:8080/course_detail.json",null),new DisposeDataHandle(new DisposeDataListener() {
            @Override
            public void onSuccess(Object responseObj) {
                CourseDetail courseDetail = (CourseDetail) responseObj;
            }

            @Override
            public void onFailure(Object reasonObj) {

            }
        },CourseDetail.class));
    }
}
