package com.lewish.start.android_lib.activity;

import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

/**
 * author: sundong
 * created at 2017/4/10 15:58
 */
public class BaseActivity extends AppCompatActivity {

    /**
     * 危险权限组
     */
    public static final int CALENDAR_GROUP_PERMISSION = 0x01;//日历
    public static final int CAMERA_PERMISSION_GROUP = 0x02;//摄像头
    public static final int CONTACT_PERMISSION_GROUP = 0x03;//联系人
    public static final int LOCATION_PERMISSION_GROUP = 0x04;//位置
    public static final int MICROPHONE_PERMISSION_GROUP = 0x05;//麦克风
    public static final int PHONE_PERMISSION_GROUP = 0x06;//电话
    public static final int SENSORS_PERMISSION_GROUP = 0x07;//传感器
    public static final int SMS_PERMISSION_GROUP = 0x08;//短信
    public static final int STORAGE_PERMISSION_GROUP = 0x09;//SD卡


    /**
     * 申请指定的权限.
     */
    public void requestPermission(int code, String... permissions) {

        ActivityCompat.requestPermissions(this, permissions, code);
    }

    /**
     * 判断是否有指定的权限
     */
    public boolean hasPermission(String... permissions) {

        for (String permisson : permissions) {
            if (ContextCompat.checkSelfPermission(this, permisson)
                    != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case CALENDAR_GROUP_PERMISSION:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    doCalendarPermission();
                }
                break;
            case CAMERA_PERMISSION_GROUP:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    doCalendarPermission();
                }
                break;
            case CONTACT_PERMISSION_GROUP:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    doCalendarPermission();
                }
                break;
            case LOCATION_PERMISSION_GROUP:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    doCalendarPermission();
                }
                break;
            case MICROPHONE_PERMISSION_GROUP:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    doCalendarPermission();
                }
                break;
            case PHONE_PERMISSION_GROUP:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    doCalendarPermission();
                }
                break;
            case SENSORS_PERMISSION_GROUP:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    doCalendarPermission();
                }
                break;
            case SMS_PERMISSION_GROUP:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    doCalendarPermission();
                }
                break;
            case STORAGE_PERMISSION_GROUP:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    doCalendarPermission();
                }
                break;
        }
    }

    protected void doCalendarPermission() {}

    protected void doCameraPermission(){}

    protected void doContactPermission(){}

    protected void doLocationPermission(){}

    protected void doMicroPhonePermission(){}

    protected void doPhonePermission(){}

    protected void doSensorsPermission(){}

    protected void doSMSPermission(){}

    protected void doStoragePermission(){}
}
