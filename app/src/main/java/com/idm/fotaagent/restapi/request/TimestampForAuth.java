package com.idm.fotaagent.restapi.request;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.TimestampRepository;
import com.idm.fotaagent.restapi.exception.InvalidTimestampException;
import com.idm.fotaagent.restapi.exception.TimestampNotFetchedException;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.restapi.restclient.time.TimeRestClient;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;
import java.util.Objects;

/* loaded from: classes.dex */
public class TimestampForAuth {
    private static final long VALUE_RANGE = TimeConstants.DAY_IN_SECOND;
    private final Context context;
    private final TimestampRepository repository;

    public TimestampForAuth(Context context) {
        this.repository = new TimestampRepository(context);
        this.context = context;
    }

    private boolean withinRange(long j5, long j6) {
        long j7 = VALUE_RANGE;
        if (j5 + j7 >= j6 && j5 - j7 <= j6) {
            return true;
        }
        Log.W("Out of the 1 day range");
        return false;
    }

    public long calculateTimestamp() throws InvalidTimestampException {
        long serverTimeInSecond = this.repository.getServerTimeInSecond();
        long clientTimeInSecond = this.repository.getClientTimeInSecond();
        long jCurrentTimeMillis = System.currentTimeMillis() / TimeConstants.SECOND_IN_MILLIS;
        if (serverTimeInSecond == 0 || !withinRange(clientTimeInSecond, jCurrentTimeMillis)) {
            throw new InvalidTimestampException();
        }
        return (jCurrentTimeMillis - clientTimeInSecond) + serverTimeInSecond;
    }

    public void clear() {
        this.repository.deleteAll();
    }

    public void fetchTimestamp() throws TimestampNotFetchedException, NumberFormatException {
        TimeRestClient timeRestClient = new TimeRestClient(this.context);
        if (!timeRestClient.execute()) {
            clear();
            throw new TimestampNotFetchedException();
        }
        try {
            String str = timeRestClient.getResponse().getAttributes().get(XmlParser.Time.TIME_SERVER_TIME);
            Objects.requireNonNull(str);
            long j5 = Long.parseLong(str);
            Log.H("initializeResult/currentServerTime = " + j5);
            new TimestampForAuth(this.context).setTimestamp(j5);
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
            throw new TimestampNotFetchedException();
        }
    }

    public long getTimestamp() throws TimestampNotFetchedException, NumberFormatException {
        try {
            return calculateTimestamp();
        } catch (InvalidTimestampException unused) {
            fetchTimestamp();
            return calculateTimestamp();
        }
    }

    public void setTimestamp(long j5) {
        this.repository.setTimes(j5);
    }
}
