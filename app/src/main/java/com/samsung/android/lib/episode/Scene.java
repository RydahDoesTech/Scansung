package com.samsung.android.lib.episode;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Scene implements Parcelable {
    public static final Parcelable.Creator<Scene> CREATOR = new Parcelable.Creator<Scene>() { // from class: com.samsung.android.lib.episode.Scene.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Scene createFromParcel(Parcel parcel) {
            return new Scene(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Scene[] newArray(int i5) {
            return new Scene[i5];
        }
    };
    private final String TAG;
    private byte mDefaultType;
    private Boolean mIsDefault;
    private String mSceneKey;
    private Bundle mSceneValue;

    public static class Builder {
        private final String TAG = "Eternal/Scene.Builder";
        private Bundle mBundle = new Bundle();
        private ArrayList<String> mCompressedAttributes = new ArrayList<>();
        private byte mDefaultType;
        private Boolean mIsDefault;
        private String mKey;

        public Builder(String str) {
            this.mKey = str;
        }

        public Builder addAttribute(String str, Object obj) {
            return addAttribute(str, obj, false);
        }

        public Scene build() {
            ArrayList<String> arrayList = this.mCompressedAttributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                this.mBundle.putString(EternalContract.ATTRIBUTE_COMPRESSED_ETERNAL_ITEMS, EpisodeUtils.convertListToString(this.mCompressedAttributes));
            }
            if (isValid()) {
                return new Scene(this);
            }
            return null;
        }

        @Deprecated
        public Bundle getBundle() {
            return this.mBundle;
        }

        public boolean isValid() {
            Bundle bundle = this.mBundle;
            return (bundle == null || bundle.isEmpty() || TextUtils.isEmpty(this.mKey)) ? false : true;
        }

        public Builder setBundle(Bundle bundle) {
            this.mBundle = bundle;
            return this;
        }

        public Builder setDefault(boolean z4) {
            this.mIsDefault = Boolean.valueOf(z4);
            if (z4) {
                this.mDefaultType = (byte) 1;
            }
            return this;
        }

        public Builder setDefaultType(int i5) {
            this.mDefaultType = (byte) i5;
            if (i5 > 0) {
                this.mIsDefault = Boolean.TRUE;
            }
            return this;
        }

        public Builder setShouldBeRestoreEqually(boolean z4) {
            addAttribute(EternalContract.EXTRA_EXPECTED_RESULT, Boolean.valueOf(z4));
            return this;
        }

        public Builder setValue(Object obj) {
            return setValue(obj, false);
        }

        public Builder addAttribute(String str, Object obj, boolean z4) throws IOException {
            String strValueOf = String.valueOf(obj);
            if (this.mBundle.containsKey(str)) {
                Log.e("Eternal/Scene.Builder", "the value of the attribute (" + str + ") will be replaced with a new one");
                Log.e("Eternal/Scene.Builder", "old : " + this.mBundle.getString(str) + ", new : " + obj);
            }
            if (z4) {
                if (obj instanceof String) {
                    String strCompressString = EpisodeUtils.compressString(strValueOf);
                    if (strCompressString != null) {
                        this.mCompressedAttributes.add(str);
                        strValueOf = strCompressString;
                    } else {
                        Log.e("Eternal/Scene.Builder", this.mKey + " : Compress failed / compressString() failed");
                    }
                } else {
                    Log.e("Eternal/Scene.Builder", this.mKey + " : Compress failed / instance is not String type");
                }
            }
            this.mBundle.putString(str, strValueOf);
            return this;
        }

        public Builder setValue(Object obj, boolean z4) throws IOException {
            String strValueOf = String.valueOf(obj);
            if (this.mBundle.containsKey("value")) {
                Log.e("Eternal/Scene.Builder", "the element value will be replaced with a new one");
                Log.e("Eternal/Scene.Builder", "old : " + this.mBundle.getString("value") + ", new : " + obj);
            }
            if (z4) {
                if (obj instanceof String) {
                    String strCompressString = EpisodeUtils.compressString(strValueOf);
                    if (strCompressString != null) {
                        this.mCompressedAttributes.add("value");
                        strValueOf = strCompressString;
                    } else {
                        Log.e("Eternal/Scene.Builder", this.mKey + " : Compress failed / compressString() failed");
                    }
                } else {
                    Log.e("Eternal/Scene.Builder", this.mKey + " : Compress failed / instance is not String type");
                }
            }
            this.mBundle.putString("value", strValueOf);
            return this;
        }

        public Builder(Scene scene) {
            this.mKey = scene.getKey();
            if (scene.getBundle() != null) {
                for (String str : scene.getBundle().keySet()) {
                    this.mBundle.putString(str, scene.getBundle().getString(str));
                }
            }
            this.mIsDefault = Boolean.valueOf(scene.isDefault());
            this.mDefaultType = (byte) scene.getDefaultType();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAttribute(String str) {
        return getAttribute(str, null, false);
    }

    public boolean getAttributeBoolean(String str, boolean z4) {
        Bundle bundle = this.mSceneValue;
        if (bundle != null && bundle.containsKey(str)) {
            String string = this.mSceneValue.getString(str);
            if (!TextUtils.isEmpty(string)) {
                return Boolean.valueOf(string).booleanValue();
            }
        }
        return z4;
    }

    public double getAttributeDouble(String str, double d5) {
        Bundle bundle = this.mSceneValue;
        if (bundle != null && bundle.containsKey(str)) {
            String string = this.mSceneValue.getString(str);
            try {
                if (!TextUtils.isEmpty(string)) {
                    return Double.valueOf(string).doubleValue();
                }
            } catch (NumberFormatException e5) {
                Log.e("Eternal/Scene", e5.getStackTrace()[0].toString());
            }
        }
        return d5;
    }

    public float getAttributeFloat(String str, float f) {
        Bundle bundle = this.mSceneValue;
        if (bundle != null && bundle.containsKey(str)) {
            String string = this.mSceneValue.getString(str);
            try {
                if (!TextUtils.isEmpty(string)) {
                    return Float.valueOf(string).floatValue();
                }
            } catch (NumberFormatException e5) {
                Log.e("Eternal/Scene", e5.getStackTrace()[0].toString());
            }
        }
        return f;
    }

    public int getAttributeInt(String str, int i5) {
        Bundle bundle = this.mSceneValue;
        if (bundle != null && bundle.containsKey(str)) {
            String string = this.mSceneValue.getString(str);
            try {
                if (!TextUtils.isEmpty(string)) {
                    return Integer.valueOf(string).intValue();
                }
            } catch (NumberFormatException e5) {
                Log.e("Eternal/Scene", e5.getStackTrace()[0].toString());
            }
        }
        return i5;
    }

    public long getAttributeLong(String str, long j5) {
        Bundle bundle = this.mSceneValue;
        if (bundle != null && bundle.containsKey(str)) {
            String string = this.mSceneValue.getString(str);
            try {
                if (!TextUtils.isEmpty(string)) {
                    return Long.valueOf(string).longValue();
                }
            } catch (NumberFormatException e5) {
                Log.e("Eternal/Scene", e5.getStackTrace()[0].toString());
            }
        }
        return j5;
    }

    public String getAttributes(String str, String str2) {
        return getAttribute(str, str2, false);
    }

    public Bundle getBundle() {
        return this.mSceneValue;
    }

    public ArrayList<String> getCompressedAttributes() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (getBundle() != null && getBundle().containsKey(EternalContract.ATTRIBUTE_COMPRESSED_ETERNAL_ITEMS)) {
            arrayList.addAll(EpisodeUtils.convertStringToArrayList(getBundle().getString(EternalContract.ATTRIBUTE_COMPRESSED_ETERNAL_ITEMS)));
        }
        return arrayList;
    }

    public int getDefaultType() {
        return this.mDefaultType;
    }

    public String getKey() {
        return this.mSceneKey;
    }

    public String getValue() {
        return getValue(null);
    }

    public boolean getValueBoolean(boolean z4) {
        Bundle bundle = this.mSceneValue;
        if (bundle != null && bundle.containsKey("value")) {
            String string = this.mSceneValue.getString("value");
            if (!TextUtils.isEmpty(string)) {
                return Boolean.valueOf(string).booleanValue();
            }
        }
        return z4;
    }

    public double getValueDouble(double d5) {
        Bundle bundle = this.mSceneValue;
        if (bundle != null && bundle.containsKey("value")) {
            String string = this.mSceneValue.getString("value");
            try {
                if (!TextUtils.isEmpty(string)) {
                    return Double.valueOf(string).doubleValue();
                }
            } catch (NumberFormatException e5) {
                Log.e("Eternal/Scene", e5.getStackTrace()[0].toString());
            }
        }
        return d5;
    }

    public float getValueFloat(float f) {
        Bundle bundle = this.mSceneValue;
        if (bundle != null && bundle.containsKey("value")) {
            String string = this.mSceneValue.getString("value");
            try {
                if (!TextUtils.isEmpty(string)) {
                    return Float.valueOf(string).floatValue();
                }
            } catch (NumberFormatException e5) {
                Log.e("Eternal/Scene", e5.getStackTrace()[0].toString());
            }
        }
        return f;
    }

    public int getValueInt(int i5) {
        Bundle bundle = this.mSceneValue;
        if (bundle != null && bundle.containsKey("value")) {
            String string = this.mSceneValue.getString("value");
            try {
                if (!TextUtils.isEmpty(string)) {
                    return Integer.valueOf(string).intValue();
                }
            } catch (NumberFormatException e5) {
                Log.e("Eternal/Scene", e5.getStackTrace()[0].toString());
            }
        }
        return i5;
    }

    public long getValueLong(long j5) {
        Bundle bundle = this.mSceneValue;
        if (bundle != null && bundle.containsKey("value")) {
            String string = this.mSceneValue.getString("value");
            try {
                if (!TextUtils.isEmpty(string)) {
                    return Long.valueOf(string).longValue();
                }
            } catch (NumberFormatException e5) {
                Log.e("Eternal/Scene", e5.getStackTrace()[0].toString());
            }
        }
        return j5;
    }

    public boolean isCompressed() {
        return getBundle() != null && getBundle().containsKey(EternalContract.ATTRIBUTE_COMPRESSED_ETERNAL_ITEMS);
    }

    public boolean isDefault() {
        Boolean bool = this.mIsDefault;
        return bool != null && bool.booleanValue();
    }

    public boolean isDefaultNotSet() {
        return this.mIsDefault == null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.mSceneKey);
        parcel.writeBundle(this.mSceneValue);
        parcel.writeByte(isDefault() ? this.mDefaultType : (byte) 0);
    }

    private Scene(Builder builder) {
        this.TAG = "Eternal/Scene";
        this.mSceneKey = builder.mKey;
        this.mSceneValue = builder.mBundle;
        this.mIsDefault = builder.mIsDefault;
        this.mDefaultType = builder.mDefaultType;
    }

    public String getAttribute(String str, String str2, boolean z4) throws IOException {
        Bundle bundle = this.mSceneValue;
        if (bundle == null || !bundle.containsKey(str)) {
            return str2;
        }
        String string = this.mSceneValue.getString(str);
        if (!z4) {
            return string;
        }
        if (!getCompressedAttributes().contains(str)) {
            Log.e("Eternal/Scene", getKey() + " : Decompress failed / not in compressed attribute");
            return string;
        }
        String strDecompressString = EpisodeUtils.decompressString(string);
        if (strDecompressString != null) {
            return strDecompressString;
        }
        Log.e("Eternal/Scene", getKey() + " : Decompress failed / decompressString() failed");
        return str2;
    }

    public String getValue(String str) {
        return getValue(str, false);
    }

    public String getValue(String str, boolean z4) throws IOException {
        Bundle bundle = this.mSceneValue;
        if (bundle == null || !bundle.containsKey("value")) {
            return str;
        }
        String string = this.mSceneValue.getString("value");
        if (!z4) {
            return string;
        }
        if (!getCompressedAttributes().contains("value")) {
            Log.e("Eternal/Scene", getKey() + " : Decompress failed / not in compressed attribute");
            return string;
        }
        String strDecompressString = EpisodeUtils.decompressString(string);
        if (strDecompressString != null) {
            return strDecompressString;
        }
        Log.e("Eternal/Scene", getKey() + " : Decompress failed / decompressString() failed");
        return str;
    }

    public Scene(Parcel parcel) {
        this.TAG = "Eternal/Scene";
        this.mSceneKey = parcel.readString();
        this.mSceneValue = parcel.readBundle();
        byte b2 = parcel.readByte();
        this.mDefaultType = b2;
        this.mIsDefault = Boolean.valueOf(b2 > 0);
    }
}
