package com.idm.fotaagent.restapi.restclient.push.campaign;

import A3.f;
import android.content.Context;
import android.text.TextUtils;
import com.idm.fotaagent.restapi.restclient.push.campaign.CampaignMessage;
import com.idm.fotaagent.restapi.restclient.push.campaign.button.Action;
import com.idm.fotaagent.restapi.restclient.push.campaign.button.ActionType;
import com.idm.fotaagent.restapi.restclient.push.campaign.button.ButtonContent;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.Xpath;
import com.wssyncmldm.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import org.w3c.dom.NamedNodeMap;

/* loaded from: classes.dex */
public class CampaignMessage implements Serializable {
    public static final String KEY_DIALOG_MESSAGE = "cont";
    public static final String KEY_DIALOG_TITLE = "title";
    public static final String KEY_NEUTRAL_BUTTON_TITLE = "neutral";
    public static final String KEY_NOTIFICATION_TEXT = "noti_bar/text";
    public static final String KEY_NOTIFICATION_TITLE = "noti_bar/title";
    public static final String KEY_POSITIVE_BUTTON_TITLE = "positive";
    private static final long serialVersionUID = 6428873535623256053L;
    private ButtonContent neutralButton;
    private ButtonContent okButton;
    private ButtonContent positiveButton;
    private String notificationTitle = "";
    private String notificationText = "";
    private String dialogTitle = "";
    private String dialogContent = "";

    public static class ActionParser {
        private final Xpath xpath;

        /* JADX INFO: Access modifiers changed from: private */
        public Optional<Action> getAction(NamedNodeMap namedNodeMap) {
            if (namedNodeMap == null) {
                return Optional.empty();
            }
            HashMap map = new HashMap();
            for (int i5 = 0; i5 < namedNodeMap.getLength(); i5++) {
                if (TextUtils.isEmpty(namedNodeMap.item(i5).getNodeName()) || TextUtils.isEmpty(namedNodeMap.item(i5).getNodeValue())) {
                    Log.W("nodeName : " + namedNodeMap.item(i5).getNodeName() + ", nodeValue : " + namedNodeMap.item(i5).getNodeValue());
                } else {
                    map.put(namedNodeMap.item(i5).getNodeName(), namedNodeMap.item(i5).getNodeValue());
                }
            }
            return Optional.of(new Action.Builder(ActionType.of((String) map.get("type"))).actionForIntent((String) map.get("intent")).data((String) map.get("data")).packageName((String) map.get(Action.KEY_PACKAGENAME)).build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getActionExpression(String str) {
            return f.o("noti/action[@id='", str, "']");
        }

        private String getIdExpression(String str, String str2) {
            return "noti/msg[@lang='" + str + "']/" + str2 + "/@id";
        }

        public Optional<Action> parse(String str, String str2) {
            final int i5 = 0;
            Optional<U> map = this.xpath.getResultOfString(getIdExpression(str, str2)).map(new Function(this) { // from class: com.idm.fotaagent.restapi.restclient.push.campaign.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CampaignMessage.ActionParser f6354b;

                {
                    this.f6354b = this;
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i6 = i5;
                    CampaignMessage.ActionParser actionParser = this.f6354b;
                    switch (i6) {
                        case 0:
                            return actionParser.getActionExpression((String) obj);
                        default:
                            return actionParser.getAction((NamedNodeMap) obj);
                    }
                }
            });
            Xpath xpath = this.xpath;
            Objects.requireNonNull(xpath);
            final int i6 = 1;
            return map.map(new c(0, xpath)).flatMap(new Function(this) { // from class: com.idm.fotaagent.restapi.restclient.push.campaign.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CampaignMessage.ActionParser f6354b;

                {
                    this.f6354b = this;
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i62 = i6;
                    CampaignMessage.ActionParser actionParser = this.f6354b;
                    switch (i62) {
                        case 0:
                            return actionParser.getActionExpression((String) obj);
                        default:
                            return actionParser.getAction((NamedNodeMap) obj);
                    }
                }
            });
        }

        private ActionParser(String str) {
            this.xpath = new Xpath(str);
        }
    }

    public static class TextParser {
        private final Xpath xpath;

        private String getExpression(String str, String str2) {
            return "noti/msg[@lang='" + str + "']/" + str2;
        }

        public Optional<String> parse(String str, String str2) {
            return this.xpath.getResultOfString(getExpression(str, str2));
        }

        private TextParser(String str) {
            this.xpath = new Xpath(str);
        }
    }

    private CampaignMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$parse$0() {
        return new IllegalArgumentException("Wrong positive button action");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$parse$1(CampaignMessage campaignMessage, ActionParser actionParser, String str, String str2) {
        campaignMessage.positiveButton = new ButtonContent(str2, actionParser.parse(str, KEY_POSITIVE_BUTTON_TITLE).orElseThrow(new d(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException lambda$parse$2() {
        return new IllegalArgumentException("Wrong neutral button action");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$parse$3(CampaignMessage campaignMessage, ActionParser actionParser, String str, String str2) {
        campaignMessage.neutralButton = new ButtonContent(str2, actionParser.parse(str, KEY_NEUTRAL_BUTTON_TITLE).orElseThrow(new d(3)));
    }

    public static CampaignMessage parse(Context context, String str) {
        List<String> listAsList = Arrays.asList(Language.readLocaleCode(), Language.readLanguage(), Language.getDefaultLanguage(str));
        TextParser textParser = new TextParser(str);
        final ActionParser actionParser = new ActionParser(str);
        final CampaignMessage campaignMessage = new CampaignMessage();
        campaignMessage.okButton = new ButtonContent(context.getString(R.string.STR_BTN_OK), Action.generateOkButtonAction());
        for (final String str2 : listAsList) {
            try {
                campaignMessage.notificationTitle = textParser.parse(str2, KEY_NOTIFICATION_TITLE).orElseThrow(new d(2));
                campaignMessage.notificationText = textParser.parse(str2, KEY_NOTIFICATION_TEXT).orElseThrow(new d(2));
                campaignMessage.dialogTitle = textParser.parse(str2, "title").orElseThrow(new d(2));
                campaignMessage.dialogContent = textParser.parse(str2, KEY_DIALOG_MESSAGE).orElseThrow(new d(2));
                Optional<String> optional = textParser.parse(str2, KEY_POSITIVE_BUTTON_TITLE);
                Optional<String> optional2 = textParser.parse(str2, KEY_NEUTRAL_BUTTON_TITLE);
                final int i5 = 0;
                optional.ifPresent(new Consumer(campaignMessage) { // from class: com.idm.fotaagent.restapi.restclient.push.campaign.a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ CampaignMessage f6351e;

                    {
                        this.f6351e = campaignMessage;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        String str3 = (String) obj;
                        switch (i5) {
                            case 0:
                                CampaignMessage.lambda$parse$1(this.f6351e, actionParser, str2, str3);
                                break;
                            default:
                                CampaignMessage.lambda$parse$3(this.f6351e, actionParser, str2, str3);
                                break;
                        }
                    }
                });
                final int i6 = 1;
                optional2.ifPresent(new Consumer(campaignMessage) { // from class: com.idm.fotaagent.restapi.restclient.push.campaign.a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ CampaignMessage f6351e;

                    {
                        this.f6351e = campaignMessage;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        String str3 = (String) obj;
                        switch (i6) {
                            case 0:
                                CampaignMessage.lambda$parse$1(this.f6351e, actionParser, str2, str3);
                                break;
                            default:
                                CampaignMessage.lambda$parse$3(this.f6351e, actionParser, str2, str3);
                                break;
                        }
                    }
                });
                return campaignMessage;
            } catch (NoSuchElementException unused) {
            }
        }
        throw new IllegalArgumentException(g4.f.d("xml : ", str));
    }

    public String dialogContent() {
        return this.dialogContent;
    }

    public String dialogTitle() {
        return this.dialogTitle;
    }

    public ButtonContent neutralButton() {
        return this.neutralButton;
    }

    public String notificationText() {
        return this.notificationText;
    }

    public String notificationTitle() {
        return this.notificationTitle;
    }

    public ButtonContent okButton() {
        return this.okButton;
    }

    public ButtonContent positiveButton() {
        return this.positiveButton;
    }
}
