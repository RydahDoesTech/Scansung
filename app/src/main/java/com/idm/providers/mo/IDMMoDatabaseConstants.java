package com.idm.providers.mo;

/* loaded from: classes.dex */
public interface IDMMoDatabaseConstants {
    public static final String DM_MO_CREATE = "CREATE TABLE IF NOT EXISTS '%s' (path TEXT NOT NULL PRIMARY KEY, name TEXT NOT NULL, acl TEXT, scope INTEGER  NOT NULL, format TEXT, type TEXT, depth INTEGER NOT NULL, value TEXT, largeobjsize INTEGER NOT NULL DEFAULT 0);";
    public static final String DM_XFUMO_CREATE = "CREATE TABLE IF NOT EXISTS xfumo (server_id TEXT NOT NULL PRIMARY KEY, xfumo TEXT);";
    public static final String DM_XNODE_CREATE = "CREATE TABLE IF NOT EXISTS xnode (server_id TEXT NOT NULL PRIMARY KEY, xdmacc TEXT NOT NULL, xcon TEXT, xaddr TEXT NOT NULL, xport TEXT, xclientaddr TEXT NOT NULL, xserveraddr TEXT NOT NULL, xfumo TEXT);";
    public static final String IDM_ACL = "acl";
    public static final String IDM_DEPTH = "depth";
    public static final String IDM_FORMAT = "format";
    public static final String IDM_ID = "_id";
    public static final String IDM_LARGEOBGSIZE = "largeobjsize";
    public static final String IDM_NAME = "name";
    public static final String IDM_PATH = "path";
    public static final String IDM_SCOPE = "scope";
    public static final String IDM_SERVERID = "server_id";
    public static final String IDM_TABLE_NAME_DMMO = "dmmos";
    public static final String IDM_TABLE_NAME_XFUMO = "xfumo";
    public static final String IDM_TABLE_NAME_XNODE = "xnode";
    public static final String IDM_TYPE = "type";
    public static final String IDM_VALUE = "value";
    public static final String IDM_XADDR = "xaddr";
    public static final String IDM_XCLIENTADDR = "xclientaddr";
    public static final String IDM_XCON = "xcon";
    public static final String IDM_XDMACC = "xdmacc";
    public static final String IDM_XFUMO = "xfumo";
    public static final String IDM_XPORT = "xport";
    public static final String IDM_XSERVERADDR = "xserveraddr";
}
