package com.samsung.android.knox.location;

import java.util.List;

/* loaded from: classes.dex */
public class Geofencing {
    public static final String ACTION_DEVICE_INSIDE_GEOFENCE = "com.samsung.android.knox.intent.action.DEVICE_INSIDE_GEOFENCE";
    public static final String ACTION_DEVICE_LOCATION_UNAVAILABLE = "com.samsung.android.knox.intent.action.DEVICE_LOCATION_UNAVAILABLE";
    public static final String ACTION_DEVICE_OUTSIDE_GEOFENCE = "com.samsung.android.knox.intent.action.DEVICE_OUTSIDE_GEOFENCE";
    public static final String EXTRA_ID = "com.samsung.android.knox.intent.extra.ID";
    public static final String EXTRA_USER_ID = "com.samsung.android.knox.intent.extra.USER_ID";
    public static final int TYPE_CIRCLE = 1;
    public static final int TYPE_LINEAR = 3;
    public static final int TYPE_POLYGON = 2;

    public Geofencing() {
        throw new RuntimeException("Stub!");
    }

    public int createGeofence(Geofence geofence) {
        throw new RuntimeException("Stub!");
    }

    public boolean destroyGeofence(int i5) {
        throw new RuntimeException("Stub!");
    }

    public List<Geofence> getGeofences() {
        throw new RuntimeException("Stub!");
    }

    public float getMinDistanceParameter() {
        throw new RuntimeException("Stub!");
    }

    public long getMinTimeParameter() {
        throw new RuntimeException("Stub!");
    }

    public List<Integer> isDeviceInsideGeofence() {
        throw new RuntimeException("Stub!");
    }

    public boolean isGeofencingEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean setMinDistanceParameter(float f) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMinTimeParameter(long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean startGeofencing() {
        throw new RuntimeException("Stub!");
    }

    public boolean stopGeofencing() {
        throw new RuntimeException("Stub!");
    }
}
