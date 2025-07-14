package com.idm.fotaagent.restapi.request;

import com.samsung.android.fotaagent.common.log.Log;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.function.Consumer;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* loaded from: classes.dex */
public abstract class FOTABody {

    public static class ForDeviceRegistration extends FOTABody {
        static final String NODE_FUMO_DEVICE = "FumoDeviceVO";

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doGenerate$0(Document document, Element element, Node node, String str) throws DOMException {
            addElement(document, element, node.tag(), str);
        }

        @Override // com.idm.fotaagent.restapi.request.FOTABody
        public void doGenerate(final Document document, final Element element, final Node node) {
            node.content().ifPresent(new Consumer() { // from class: com.idm.fotaagent.restapi.request.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) throws DOMException {
                    Document document2 = document;
                    Element element2 = element;
                    this.f6346d.lambda$doGenerate$0(document2, element2, node, (String) obj);
                }
            });
        }

        @Override // com.idm.fotaagent.restapi.request.FOTABody
        public String getMainNode() {
            return NODE_FUMO_DEVICE;
        }
    }

    public static abstract class ForHeartbeat extends FOTABody {
        @Override // com.idm.fotaagent.restapi.request.FOTABody
        public void doGenerate(Document document, Element element, Node node) throws DOMException {
            addElement(document, element, node.tag(), node.content().orElse(""));
        }
    }

    public static class ForPush extends FOTABody {
        static final String NODE_PUSH_INFO = "PushInfoVO";

        @Override // com.idm.fotaagent.restapi.request.FOTABody
        public void doGenerate(Document document, Element element, Node node) throws DOMException {
            addElement(document, element, node.tag(), node.content().orElse(""));
        }

        @Override // com.idm.fotaagent.restapi.request.FOTABody
        public String getMainNode() {
            return NODE_PUSH_INFO;
        }
    }

    public static class OneShot extends ForHeartbeat {
        static final String NODE_ONESHOT_HEARTBEAT = "DeviceHeartbeatForPushVO";

        @Override // com.idm.fotaagent.restapi.request.FOTABody
        public String getMainNode() {
            return NODE_ONESHOT_HEARTBEAT;
        }
    }

    public static class Periodic extends ForHeartbeat {
        static final String NODE_PERIODIC_HEARTBEAT = "DeviceHeartbeatVO";

        @Override // com.idm.fotaagent.restapi.request.FOTABody
        public String getMainNode() {
            return NODE_PERIODIC_HEARTBEAT;
        }
    }

    public void addElement(Document document, Element element, String str, String str2) throws DOMException {
        Element elementCreateElement = document.createElement(str);
        elementCreateElement.setTextContent(str2);
        element.appendChild(elementCreateElement);
    }

    public abstract void doGenerate(Document document, Element element, Node node);

    public String generate(DeviceInfo deviceInfo) throws TransformerException, DOMException {
        try {
            Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element elementCreateElement = documentNewDocument.createElement(getMainNode());
            documentNewDocument.appendChild(elementCreateElement);
            Iterator<Node> it = deviceInfo.getNodes().iterator();
            while (it.hasNext()) {
                doGenerate(documentNewDocument, elementCreateElement, it.next());
            }
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            StringWriter stringWriter = new StringWriter();
            transformerNewTransformer.transform(new DOMSource(documentNewDocument), new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (ParserConfigurationException | TransformerException | DOMException e5) {
            Log.printStackTrace(e5);
            return null;
        }
    }

    public abstract String getMainNode();
}
