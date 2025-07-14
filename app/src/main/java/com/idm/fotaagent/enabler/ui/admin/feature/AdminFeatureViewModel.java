package com.idm.fotaagent.enabler.ui.admin.feature;

import android.content.Context;
import androidx.lifecycle.X;
import com.idm.fotaagent.database.sqlite.database.mo.Feature;
import com.idm.fotaagent.enabler.feature.Operator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AdminFeatureViewModel extends X {
    public List<Feature<?>> getFeatureList(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Operator.MockOperator(context));
        arrayList.add(new Feature.MockServiceType(context));
        arrayList.add(new Feature.MockDownloadType(context));
        arrayList.add(new Feature.MockUpdateType(context));
        arrayList.add(new Feature.MockInstallType(context));
        arrayList.add(new Feature.MockInstallPostponeType(context));
        arrayList.add(new Feature.MockWifiOnlyDevice(context));
        return arrayList;
    }
}
