package com.samsung.android.fotaagent.common.util;

import android.text.TextUtils;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.StringReader;
import java.util.Optional;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* loaded from: classes.dex */
public class Xpath {
    private final String xml;

    public Xpath(String str) {
        this.xml = str;
    }

    public NamedNodeMap getAttributes(String str) {
        try {
            StringReader stringReader = new StringReader(this.xml);
            try {
                Node node = (Node) XPathFactory.newInstance().newXPath().evaluate(str, new InputSource(stringReader), XPathConstants.NODE);
                if (node == null) {
                    stringReader.close();
                    return null;
                }
                NamedNodeMap attributes = node.getAttributes();
                stringReader.close();
                return attributes;
            } finally {
            }
        } catch (XPathExpressionException e5) {
            Log.printStackTrace(e5);
            return null;
        }
    }

    public NodeList getNodeList(String str) {
        try {
            StringReader stringReader = new StringReader(this.xml);
            try {
                NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().evaluate(str, new InputSource(stringReader), XPathConstants.NODESET);
                stringReader.close();
                return nodeList;
            } finally {
            }
        } catch (XPathExpressionException e5) {
            Log.printStackTrace(e5);
            return null;
        }
    }

    public Optional<String> getResultOfString(String str) {
        String resultOfString = getResultOfString(this.xml, str);
        return TextUtils.isEmpty(resultOfString) ? Optional.empty() : Optional.of(resultOfString);
    }

    public static String getResultOfString(String str, String str2) {
        try {
            StringReader stringReader = new StringReader(str);
            try {
                String strEvaluate = XPathFactory.newInstance().newXPath().evaluate(str2, new InputSource(stringReader));
                stringReader.close();
                return strEvaluate;
            } finally {
            }
        } catch (XPathExpressionException e5) {
            Log.printStackTrace(e5);
            return null;
        }
    }
}
