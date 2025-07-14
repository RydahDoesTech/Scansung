package com.idm.adapter.handler;

import com.idm.adapter.deviceinfo.IDMDeviceInfoAdapter;
import com.idm.adapter.networkinfo.IDMNetworkInfoAdapter;
import com.idm.agent.dl.IDMDlBaseDownload;
import com.idm.agent.dl.IDMDlConnectInterface;
import com.idm.agent.dm.IDMDmAuthValidInterface;
import com.idm.agent.dm.IDMDmCommandInterface;
import com.idm.agent.dm.IDMDmConnectInterface;
import com.idm.agent.dm.IDMDmContinueProcess;

/* loaded from: classes.dex */
public abstract class AdaptersHolder {
    private final IDMDlBaseDownload baseDownloadAdapter;
    private final IDMDmCommandInterface commandAdapter;
    private final IDMDmContinueProcess continueProcessAdapter;
    private final IDMDeviceInfoAdapter deviceInfoAdapter;
    private final IDMDlConnectInterface dlConnectAdapter;
    private final IDMDmAuthValidInterface dmAuthAdapter;
    private final IDMDmConnectInterface dmConnectAdapter;
    private final IDMNetworkInfoAdapter networkAdapter;

    public AdaptersHolder(IDMDeviceInfoAdapter iDMDeviceInfoAdapter, IDMNetworkInfoAdapter iDMNetworkInfoAdapter, IDMDmCommandInterface iDMDmCommandInterface, IDMDlConnectInterface iDMDlConnectInterface, IDMDlBaseDownload iDMDlBaseDownload, IDMDmContinueProcess iDMDmContinueProcess, IDMDmConnectInterface iDMDmConnectInterface, IDMDmAuthValidInterface iDMDmAuthValidInterface) {
        this.deviceInfoAdapter = iDMDeviceInfoAdapter;
        this.networkAdapter = iDMNetworkInfoAdapter;
        this.commandAdapter = iDMDmCommandInterface;
        this.dlConnectAdapter = iDMDlConnectInterface;
        this.baseDownloadAdapter = iDMDlBaseDownload;
        this.continueProcessAdapter = iDMDmContinueProcess;
        this.dmConnectAdapter = iDMDmConnectInterface;
        this.dmAuthAdapter = iDMDmAuthValidInterface;
    }

    public IDMDlBaseDownload getBaseDownloadAdapter() {
        return this.baseDownloadAdapter;
    }

    public IDMDmCommandInterface getCommandAdapter() {
        return this.commandAdapter;
    }

    public IDMDmContinueProcess getContinueProcessAdapter() {
        return this.continueProcessAdapter;
    }

    public IDMDeviceInfoAdapter getDeviceInfoAdapter() {
        return this.deviceInfoAdapter;
    }

    public IDMDlConnectInterface getDlConnectAdapter() {
        return this.dlConnectAdapter;
    }

    public IDMDmAuthValidInterface getDmAuthAdapter() {
        return this.dmAuthAdapter;
    }

    public IDMDmConnectInterface getDmConnectAdapter() {
        return this.dmConnectAdapter;
    }

    public IDMNetworkInfoAdapter getNetworkAdapter() {
        return this.networkAdapter;
    }
}
