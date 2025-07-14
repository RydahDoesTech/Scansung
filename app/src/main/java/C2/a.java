package C2;

import D3.c;
import J.InterfaceC0060q;
import J.p0;
import K0.b;
import Q0.f;
import R1.A;
import a2.e;
import a2.s;
import android.app.Notification;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import com.idm.core.ddf.DDFParsingStrategy;
import com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationBuilderStrategy;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.restclient.exception.ParseFailedException;
import com.idm.fotaagent.restapi.restclient.strategies.OnHttpResponseStrategy;
import com.wssyncmldm.R;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnHttpResponseStrategy, f, A, e, DDFParsingStrategy, InterfaceC0060q, NotificationBuilderStrategy.Action, NotificationBuilderStrategy.BigText, NotificationBuilderStrategy.SmallIcon {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f348d;

    public /* synthetic */ a(int i5) {
        this.f348d = i5;
    }

    @Override // J.InterfaceC0060q
    public p0 Z(View view, p0 p0Var) {
        return WindowInsetsBaseActivity.lambda$onCreate$0(view, p0Var);
    }

    @Override // Q0.f
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                c cVarA = b.a();
                cVarA.o(cursorRawQuery.getString(1));
                cVarA.f508g = T0.a.b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                cVarA.f = string == null ? null : Base64.decode(string, 0);
                arrayList.add(cVarA.b());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationBuilderStrategy.Action
    public Notification.Action getAction(Context context, String str, NotificationType notificationType) {
        switch (this.f348d) {
            case 21:
                return NotificationBuilderStrategy.Action.lambda$static$0(context, str, notificationType);
            case 22:
                return NotificationBuilderStrategy.Action.lambda$static$1(context, str, notificationType);
            case 23:
                return NotificationBuilderStrategy.Action.lambda$static$2(context, str, notificationType);
            case 24:
                return NotificationBuilderStrategy.Action.lambda$static$3(context, str, notificationType);
            case 25:
                return NotificationBuilderStrategy.Action.lambda$static$4(context, str, notificationType);
            default:
                return NotificationBuilderStrategy.Action.lambda$static$5(context, str, notificationType);
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationBuilderStrategy.BigText
    public Notification.BigTextStyle getBigTextStyle(NotificationType notificationType, String str) {
        switch (this.f348d) {
            case 27:
                return NotificationBuilderStrategy.BigText.lambda$static$0(notificationType, str);
            default:
                return NotificationBuilderStrategy.BigText.lambda$static$1(notificationType, str);
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationBuilderStrategy.SmallIcon
    public int getSmallIcon() {
        return R.drawable.stat_fota;
    }

    @Override // a2.e
    public Object j(s sVar) {
        return TransportRegistrar.lambda$getComponents$0(sVar);
    }

    @Override // com.idm.fotaagent.restapi.restclient.strategies.OnHttpResponseStrategy
    public void parse(HttpURLConnection httpURLConnection, XmlParser xmlParser, Response response) throws ParseFailedException, IOException {
        switch (this.f348d) {
            case 0:
                OnHttpResponseStrategy.lambda$static$0(httpURLConnection, xmlParser, response);
                break;
            case 1:
                OnHttpResponseStrategy.lambda$static$1(httpURLConnection, xmlParser, response);
                break;
            case 2:
                OnHttpResponseStrategy.lambda$static$2(httpURLConnection, xmlParser, response);
                break;
            case 3:
                OnHttpResponseStrategy.lambda$static$3(httpURLConnection, xmlParser, response);
                break;
            default:
                OnHttpResponseStrategy.lambda$static$4(httpURLConnection, xmlParser, response);
                break;
        }
    }

    @Override // com.idm.core.ddf.DDFParsingStrategy
    public String parseValue(XmlPullParser xmlPullParser) {
        switch (this.f348d) {
            case 17:
                return DDFParsingStrategy.lambda$static$0(xmlPullParser);
            case 18:
                return DDFParsingStrategy.lambda$static$1(xmlPullParser);
            default:
                return DDFParsingStrategy.lambda$static$2(xmlPullParser);
        }
    }
}
