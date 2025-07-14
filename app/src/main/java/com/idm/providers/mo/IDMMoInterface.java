package com.idm.providers.mo;

import android.net.Uri;

/* loaded from: classes.dex */
public interface IDMMoInterface {
    public static final String IDM_ACL_ADD = "Add=*";
    public static final String IDM_ACL_ADD_REPLACE = "Add=*&Replace=*";
    public static final String IDM_ACL_ADD_REPLACE_DELETE = "Add=*&Replace=*&Delete=*";
    public static final String IDM_ACL_DEFAULT = "Get=*&Add=*&Replace=*&Delete=*";
    public static final String IDM_ACL_DELETE = "Delete=*";
    public static final String IDM_ACL_EXEC = "Exec=*";
    public static final String IDM_ACL_GET = "Get=*";
    public static final String IDM_ACL_GET_ADD = "Get=*&Add=*";
    public static final String IDM_ACL_GET_REPLACE = "Get=*&Replace=*";
    public static final String IDM_ACL_REPLACE = "Replace=*";
    public static final String IDM_AUTHORITY = "com.idm.providers.dm";
    public static final String IDM_DEFUALT_DMACC_APPADDR_X_ADDR = "./DMAcc/x/AppAddr/1/Addr";
    public static final String IDM_DEFUALT_DMACC_APPADDR_X_PORT_X_PORTNUMBER = "./DMAcc/x/AppAddr/1/Port/1/PortNbr";
    public static final String IDM_DEFUALT_DMACC_APPAUTH_CLIENT_AAUTDATA = "./DMAcc/x/AppAuth/client/AAuthData";
    public static final String IDM_DEFUALT_DMACC_APPAUTH_CLIENT_AAUTHNAME = "./DMAcc/x/AppAuth/client/AAuthName";
    public static final String IDM_DEFUALT_DMACC_APPAUTH_CLIENT_AAUTHTYPE = "./DMAcc/x/AppAuth/client/AAuthType";
    public static final String IDM_DEFUALT_DMACC_APPAUTH_CLIENT_AAUTSECRET = "./DMAcc/x/AppAuth/client/AAuthSecret";
    public static final String IDM_DEFUALT_DMACC_APPAUTH_SERVER_AAUTDATA = "./DMAcc/x/AppAuth/server/AAuthData";
    public static final String IDM_DEFUALT_DMACC_APPAUTH_SERVER_AAUTHNAME = "./DMAcc/x/AppAuth/server/AAuthName";
    public static final String IDM_DEFUALT_DMACC_APPAUTH_SERVER_AAUTHTYPE = "./DMAcc/x/AppAuth/server/AAuthType";
    public static final String IDM_DEFUALT_DMACC_APPAUTH_SERVER_AAUTSECRET = "./DMAcc/x/AppAuth/server/AAuthSecret";
    public static final String IDM_DEFUALT_DMACC_NAME = "./DMAcc/x/Name";
    public static final String IDM_DEFUALT_DMACC_SERVERID = "./DMAcc/x/ServerID";
    public static final String IDM_DEFUALT_DMACC_X = "./DMAcc/x";
    public static final String IDM_MO_INBOX_PATH = "./Inbox";
    public static final String IDM_MO_ROOT_PATH = ".";
    public static final String IDM_MO_TYPE_DEVDETAIL = "urn:oma:mo:oma-dm-devdetail:1.0";
    public static final String IDM_MO_TYPE_DEVINFO = "urn:oma:mo:oma-dm-devinfo:1.0";
    public static final String IDM_MO_TYPE_DMACC = "urn:oma:mo:oma-dm-dmacc:1.0";
    public static final String IDM_MO_TYPE_INBOX = "urn:oma:mo:oma-dm-inbox:1.0";
    public static final int IDM_SCOPE_DEFAULT = 0;
    public static final int IDM_SCOPE_DYNAMIC = 2;
    public static final int IDM_SCOPE_PERMANENT = 1;
    public static final Uri IDM_MO_CONTENT_URI = Uri.parse("content://com.idm.providers.dm/mo");
    public static final Uri IDM_XNODE_CONTENT_URI = Uri.parse("content://com.idm.providers.dm/xnode");
}
