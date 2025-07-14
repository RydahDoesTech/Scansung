package com.idm.fotaagent.restapi.restclient.push.campaign;

import android.content.Context;
import android.content.Intent;
import com.idm.fotaagent.database.room.data.repository.CampaignQueueRepository;
import com.idm.fotaagent.restapi.restclient.push.campaign.ui.CampaignMessageActivity;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class CampaignMessageHelper {
    private final Context context;
    private final CampaignQueueRepository repository;

    public static class CampaignMessagePeekFailedException extends Exception {
        public CampaignMessagePeekFailedException(Throwable th) {
            super(th);
        }
    }

    public static class EmptyCampaignQueueException extends Exception {
    }

    public CampaignMessageHelper(Context context) {
        this.context = context;
        this.repository = new CampaignQueueRepository(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CampaignMessage lambda$peek$0(String str) {
        return CampaignMessage.parse(this.context, str);
    }

    public void deleteCurrentMessage() {
        this.repository.remove();
    }

    public List<CampaignMessage> getAllMessages() {
        List<String> listPeekAll = this.repository.peekAll();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listPeekAll.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(CampaignMessage.parse(this.context, it.next()));
            } catch (IllegalArgumentException e5) {
                Log.printStackTrace(e5);
            }
        }
        return arrayList;
    }

    public CampaignMessage peek() throws CampaignMessagePeekFailedException {
        try {
            return (CampaignMessage) this.repository.peek().map(new c(1, this)).orElseThrow(new d(0));
        } catch (EmptyCampaignQueueException e5) {
            throw new CampaignMessagePeekFailedException(e5);
        } catch (IllegalArgumentException e6) {
            Log.printStackTrace(e6);
            deleteCurrentMessage();
            return peek();
        }
    }

    public void showCampaignDialog() {
        try {
            CampaignMessage campaignMessagePeek = peek();
            Log.I("");
            Intent intent = new Intent(this.context, (Class<?>) CampaignMessageActivity.class);
            intent.addFlags(872415232);
            intent.putExtra(CampaignMessageActivity.KEY_BUNDLE, campaignMessagePeek);
            this.context.startActivity(intent);
        } catch (CampaignMessagePeekFailedException e5) {
            Log.printStackTrace(e5);
        }
    }
}
