package com.lewish.start.androiddevlib;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.lewish.start.android_lib.activity.BaseActivity;
import com.lewish.start.android_lib.net.CommonOkHttpClient;
import com.lewish.start.android_lib.net.listener.DisposeDataHandle;
import com.lewish.start.android_lib.net.listener.DisposeDataListener;
import com.lewish.start.android_lib.net.request.CommonRequest;
import com.lewish.start.androiddevlib.zxing.app.CaptureActivity;

public class MainActivity extends BaseActivity {
    private static final int REQUEST_QRCODE = 0x01;
    private Button btn_qrcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_qrcode = (Button)findViewById(R.id.btn_qrcode);
        btn_qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hasPermission(Manifest.permission.CAMERA)) {
                    Intent intent = new Intent(MainActivity.this, CaptureActivity.class);
                    startActivityForResult(intent, REQUEST_QRCODE);
                } else {
                    requestPermission(CAMERA_PERMISSION_GROUP, Manifest.permission.CAMERA);
                }
            }
        });
//        testGetNetAcess();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case REQUEST_QRCODE:
                if (resultCode == Activity.RESULT_OK) {
                    String code = data.getStringExtra("SCAN_RESULT");
                    if (code.contains("http") || code.contains("https")) {
//                        Intent intent = new Intent(mContext, AdBrowserActivity.class);
//                        intent.putExtra(AdBrowserActivity.KEY_URL, code);
//                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, code, Toast.LENGTH_SHORT).show();
                    }
                }
                break;
        }
    }

    private void testGetNetAcess() {
        CommonOkHttpClient.get(CommonRequest.createGetRequest("http://10.0.130.54:8080/course_detail.json", null),
                new DisposeDataHandle(new DisposeDataListener() {
                    @Override
                    public void onSuccess(Object responseObj) {
                        CourseDetail courseDetail = (CourseDetail) responseObj;
                    }

                    @Override
                    public void onFailure(Object reasonObj) {

                    }
                }, CourseDetail.class));
    }
}
