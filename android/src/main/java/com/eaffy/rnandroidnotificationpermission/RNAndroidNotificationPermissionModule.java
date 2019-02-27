package com.eaffy.rnandroidnotificationpermission;

import android.net.Uri;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

import java.util.Map;
import java.lang.Integer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.v7.app.NotificationCompat;

import com.facebook.react.ReactActivity;

public class RNAndroidNotificationPermissionModule extends ReactContextBaseJavaModule {

    ReactApplicationContext reactContext;

    public RNAndroidNotificationPermissionModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNAndroidNotificationPermissionModule";
    }

    @ReactMethod
    public void checkNoticficationPermission(Promise promise) {
        boolean returnValue = NotificationManagerCompat.from(reactContext).areNotificationsEnabled();
        promise.resolve(returnValue);
    }
}
