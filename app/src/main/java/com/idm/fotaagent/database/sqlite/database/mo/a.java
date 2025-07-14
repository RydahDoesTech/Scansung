package com.idm.fotaagent.database.sqlite.database.mo;

import androidx.preference.Preference;
import androidx.preference.n;
import androidx.preference.o;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.DownloadType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallPostponeType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.ServiceType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.UpdateType;
import com.idm.fotaagent.enabler.feature.Operator;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6274a;

    public /* synthetic */ a(int i5) {
        this.f6274a = i5;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f6274a) {
            case 0:
                ((AdminRepository) obj).setDownloadType((DownloadType) obj2);
                break;
            case 1:
                ((AdminRepository) obj).setInstallPostponeType((InstallPostponeType) obj2);
                break;
            case 2:
                ((AdminRepository) obj).setInstallType((InstallType) obj2);
                break;
            case 3:
                ((AdminRepository) obj).setServiceType((ServiceType) obj2);
                break;
            case 4:
                ((AdminRepository) obj).setUpdateType((UpdateType) obj2);
                break;
            case 5:
                ((AdminRepository) obj).setWifiOnlyDevice((AdminRepository.WifiOnlyDevice) obj2);
                break;
            case 6:
                ((AdminRepository) obj).setOperator((Operator) obj2);
                break;
            case 7:
                ((Preference) obj).f4605i = (o) obj2;
                break;
            case 8:
                Preference preference = (Preference) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (preference.f4614s != zBooleanValue) {
                    preference.f4614s = zBooleanValue;
                    preference.k(preference.A());
                    preference.j();
                    break;
                }
                break;
            default:
                ((Preference) obj).f4604h = (n) obj2;
                break;
        }
    }
}
