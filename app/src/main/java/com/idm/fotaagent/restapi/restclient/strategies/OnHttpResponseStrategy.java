package com.idm.fotaagent.restapi.restclient.strategies;

import C2.a;
import android.text.TextUtils;
import com.idm.fotaagent.restapi.exception.XmlParseException;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.response.Result;
import com.idm.fotaagent.restapi.restclient.exception.ParseFailedException;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/* loaded from: classes.dex */
public interface OnHttpResponseStrategy {
    public static final OnHttpResponseStrategy DO_NOTHING = new a(0);
    public static final OnHttpResponseStrategy PARSE_FOR_SUCCESS = new a(1);
    public static final OnHttpResponseStrategy PARSE_FOR_FAILURE = new a(2);
    public static final OnHttpResponseStrategy STORE_BODY = new a(3);
    public static final OnHttpResponseStrategy STORE_RESULT_FROM_RESPONSE_CODE = new a(4);

    static <T extends Response> T castResponse(Response response, Class<T> cls) {
        try {
            T tCast = cls.cast(response);
            Objects.requireNonNull(tCast);
            return tCast;
        } catch (ClassCastException | NullPointerException e5) {
            Log.printStackTrace(e5);
            throw new IllegalArgumentException(e5);
        }
    }

    static void checkParser(XmlParser xmlParser) {
        if (xmlParser == null) {
            throw new IllegalArgumentException("parser is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(HttpURLConnection httpURLConnection, XmlParser xmlParser, Response response) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$1(HttpURLConnection httpURLConnection, XmlParser xmlParser, Response response) throws ParseFailedException, IOException {
        try {
            String str = read(httpURLConnection);
            checkParser(xmlParser);
            Response.WithAttributes withAttributes = (Response.WithAttributes) castResponse(response, Response.WithAttributes.class);
            try {
                withAttributes.setAttributes(xmlParser.parseForSuccess(str));
            } catch (XmlParseException e5) {
                Log.printStackTrace(e5);
                withAttributes.getAttributes().clear();
                throw new ParseFailedException(e5, true);
            }
        } catch (IllegalArgumentException e6) {
            throw new ParseFailedException(e6, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$2(HttpURLConnection httpURLConnection, XmlParser xmlParser, Response response) throws ParseFailedException, IOException {
        try {
            String str = read(httpURLConnection);
            checkParser(xmlParser);
            Response.WithAttributes withAttributes = (Response.WithAttributes) castResponse(response, Response.WithAttributes.class);
            try {
                withAttributes.setAttributes(xmlParser.parseForError(str));
                withAttributes.setResult(Result.getResultFrom(withAttributes.getErrorCode()));
            } catch (XmlParseException e5) {
                Log.printStackTrace(e5);
                withAttributes.getAttributes().clear();
                throw new ParseFailedException(e5, false);
            }
        } catch (IllegalArgumentException e6) {
            throw new ParseFailedException(e6, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$3(HttpURLConnection httpURLConnection, XmlParser xmlParser, Response response) throws ParseFailedException, IOException {
        try {
            ((Response.WithBody) castResponse(response, Response.WithBody.class)).setBody(read(httpURLConnection));
        } catch (IllegalArgumentException e5) {
            throw new ParseFailedException(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$4(HttpURLConnection httpURLConnection, XmlParser xmlParser, Response response) {
        try {
            response.setResult(Result.getResultFrom(httpURLConnection.getResponseCode()));
        } catch (IOException e5) {
            Log.printStackTrace(e5);
        }
    }

    static String read(HttpURLConnection httpURLConnection) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(200 == httpURLConnection.getResponseCode() ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream(), StandardCharsets.UTF_8));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                }
                String string = sb.toString();
                if (TextUtils.isEmpty(string)) {
                    Log.W("message is empty.");
                    throw new IllegalArgumentException("empty body");
                }
                Log.H("<< Body: " + string);
                bufferedReader.close();
                return string;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | NullPointerException e5) {
            Log.printStackTrace(e5);
            throw new IllegalArgumentException(e5);
        }
    }

    void parse(HttpURLConnection httpURLConnection, XmlParser xmlParser, Response response);
}
