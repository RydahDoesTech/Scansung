package com.samsung.android.lib.episode;

import A3.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class SceneResult implements Parcelable {
    public static final Parcelable.Creator<SceneResult> CREATOR = new Parcelable.Creator<SceneResult>() { // from class: com.samsung.android.lib.episode.SceneResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SceneResult createFromParcel(Parcel parcel) {
            return new SceneResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SceneResult[] newArray(int i5) {
            return new SceneResult[i5];
        }
    };
    private static final String TAG = "Eternal/SceneResult";
    private ErrorType mErrorType;
    private String mKey;
    private ResultType mResultType;

    public enum ResultType {
        RESULT_OK("RESULT_OK"),
        RESULT_FAIL("RESULT_FAIL"),
        RESULT_SKIP("RESULT_SKIP"),
        RESULT_UNDEFINED("RESULT_UNDEFINED");

        private String mResultType;

        ResultType(String str) {
            this.mResultType = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mResultType;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<String> getErrorReason() {
        ErrorType errorType = this.mErrorType;
        if (errorType == null) {
            return null;
        }
        return errorType.getErrorMessageReason();
    }

    public ErrorType getErrorType() {
        return this.mErrorType;
    }

    public String getKey() {
        return this.mKey;
    }

    public ResultType getResultType() {
        return this.mResultType;
    }

    public boolean hasError() {
        return this.mResultType == ResultType.RESULT_FAIL;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.mKey);
        ResultType resultType = this.mResultType;
        parcel.writeInt(resultType == null ? -1 : resultType.ordinal());
        ErrorType errorType = this.mErrorType;
        parcel.writeInt(errorType != null ? errorType.ordinal() : -1);
    }

    public static class Builder {
        private ErrorType mErrorType;
        private String mKey;
        private ResultType mResultType = ResultType.RESULT_UNDEFINED;

        public Builder(String str) {
            this.mKey = str;
        }

        private boolean isValid() {
            ErrorType errorType;
            ResultType resultType = this.mResultType;
            if (resultType == ResultType.RESULT_UNDEFINED) {
                Log.e(SceneResult.TAG, "[" + this.mKey + "] mResultType is undefined");
                throw new IllegalArgumentException(f.p(new StringBuilder("["), this.mKey, "] mResultType is undefined. Need setResultType(ResultType)"));
            }
            if (resultType != ResultType.RESULT_FAIL) {
                if (resultType != ResultType.RESULT_SKIP || (errorType = this.mErrorType) == ErrorType.DEFAULT_VALUE || errorType == ErrorType.FAST_TRACK) {
                    return true;
                }
                throw new IllegalArgumentException(f.p(new StringBuilder("["), this.mKey, "] If result type is RESULT_SKIP, ErrorType must be one of DEFAULT_VALUE or FAST_TRACK"));
            }
            ErrorType errorType2 = this.mErrorType;
            if (errorType2 == null) {
                Log.e(SceneResult.TAG, "[" + this.mKey + "] ErrorType is null");
                throw new IllegalArgumentException(f.p(new StringBuilder("["), this.mKey, "] ErrorType is null. Need setErrorType(ErrorType)"));
            }
            if (errorType2 != ErrorType.NO_PERMISSION && errorType2 != ErrorType.TEMPORARY_BLOCK) {
                return true;
            }
            if (errorType2.mErrorReasonList != null && !this.mErrorType.mErrorReasonList.isEmpty()) {
                return true;
            }
            Log.e(SceneResult.TAG, "[" + this.mKey + "] mErrorReasonList is null");
            throw new IllegalArgumentException(f.p(new StringBuilder("["), this.mKey, "] mErrorReasonList is null. Need setErrorReason(List)"));
        }

        public SceneResult build() {
            if (isValid()) {
                return new SceneResult(this.mKey, this.mResultType, this.mErrorType);
            }
            return null;
        }

        public Builder setErrorReason(String str) {
            ErrorType errorType = this.mErrorType;
            if (errorType != null) {
                errorType.setErrorReason(str);
            }
            return this;
        }

        public Builder setErrorType(ErrorType errorType) {
            this.mErrorType = errorType;
            return this;
        }

        public Builder setResult(ResultType resultType) {
            this.mResultType = resultType;
            return this;
        }

        public Builder setErrorReason(List<String> list) {
            ErrorType errorType = this.mErrorType;
            if (errorType != null) {
                errorType.setErrorReason(list);
            }
            return this;
        }
    }

    private SceneResult(String str, ResultType resultType, ErrorType errorType) {
        this.mKey = str;
        this.mResultType = resultType;
        this.mErrorType = errorType;
    }

    public enum ErrorType {
        FAST_TRACK("FAST_TRACK"),
        INVALID_DATA("INVALID_DATA"),
        STORAGE_FULL("STORAGE_FULL"),
        UNKNOWN_ERROR("UNKNOWN_ERROR"),
        DEFAULT_VALUE("DEFAULT_VALUE"),
        NOT_SUPPORTED("NOT_SUPPORTED"),
        NO_PERMISSION("NO_PERMISSION"),
        TEMPORARY_BLOCK("TEMPORARY_BLOCK"),
        DEVICE_TYPE_MISMATCH("DEVICE_TYPE_MISMATCH");

        private List<String> mErrorReasonList = new ArrayList();
        private String mReason;

        ErrorType(String str) {
            this.mReason = str;
        }

        public List<String> getErrorMessageReason() {
            return this.mErrorReasonList;
        }

        public void setErrorReason(String str) {
            if (TextUtils.isEmpty(str)) {
                Log.d(SceneResult.TAG, "ErrorType.setErrorReason is empty");
            } else {
                this.mErrorReasonList.add(str);
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mReason;
        }

        public void setErrorReason(List<String> list) {
            if (list != null && !list.isEmpty()) {
                this.mErrorReasonList.addAll(list);
            } else {
                Log.d(SceneResult.TAG, "ErrorType.setErrorReason is empty");
            }
        }
    }

    public SceneResult(Parcel parcel) {
        this.mKey = parcel.readString();
        int i5 = parcel.readInt();
        this.mResultType = i5 == -1 ? null : ResultType.values()[i5];
        int i6 = parcel.readInt();
        this.mErrorType = i6 != -1 ? ErrorType.values()[i6] : null;
    }
}
