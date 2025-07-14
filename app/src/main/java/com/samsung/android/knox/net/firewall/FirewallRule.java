package com.samsung.android.knox.net.firewall;

import com.samsung.android.knox.AppIdentity;
import com.samsung.android.knox.net.firewall.Firewall;

/* loaded from: classes.dex */
public class FirewallRule {

    public enum RuleType {
        ALLOW,
        DENY,
        REDIRECT,
        REDIRECT_EXCEPTION
    }

    public enum Status {
        DISABLED,
        ENABLED,
        PENDING
    }

    public FirewallRule(RuleType ruleType, Firewall.AddressType addressType) {
        throw new RuntimeException("Stub!");
    }

    public Firewall.AddressType getAddressType() {
        throw new RuntimeException("Stub!");
    }

    public AppIdentity getApplication() {
        throw new RuntimeException("Stub!");
    }

    public Firewall.Direction getDirection() {
        throw new RuntimeException("Stub!");
    }

    public int getId() {
        throw new RuntimeException("Stub!");
    }

    public String getIpAddress() {
        throw new RuntimeException("Stub!");
    }

    public Firewall.NetworkInterface getNetworkInterface() {
        throw new RuntimeException("Stub!");
    }

    public Firewall.PortLocation getPortLocation() {
        throw new RuntimeException("Stub!");
    }

    public String getPortNumber() {
        throw new RuntimeException("Stub!");
    }

    public Firewall.Protocol getProtocol() {
        throw new RuntimeException("Stub!");
    }

    public RuleType getRuleType() {
        throw new RuntimeException("Stub!");
    }

    public Status getStatus() {
        throw new RuntimeException("Stub!");
    }

    public String getStrNetworkInterface() {
        throw new RuntimeException("Stub!");
    }

    public String getTargetIpAddress() {
        throw new RuntimeException("Stub!");
    }

    public String getTargetPortNumber() {
        throw new RuntimeException("Stub!");
    }

    public void setApplication(AppIdentity appIdentity) {
        throw new RuntimeException("Stub!");
    }

    public void setDirection(Firewall.Direction direction) {
        throw new RuntimeException("Stub!");
    }

    public void setIpAddress(String str) {
        throw new RuntimeException("Stub!");
    }

    public void setNetworkInterface(Firewall.NetworkInterface networkInterface) {
        throw new RuntimeException("Stub!");
    }

    public void setPortLocation(Firewall.PortLocation portLocation) {
        throw new RuntimeException("Stub!");
    }

    public void setPortNumber(String str) {
        throw new RuntimeException("Stub!");
    }

    public void setProtocol(Firewall.Protocol protocol) {
        throw new RuntimeException("Stub!");
    }

    public void setStrNetworkInterface(String str) {
        throw new RuntimeException("Stub!");
    }

    public void setTargetIpAddress(String str) {
        throw new RuntimeException("Stub!");
    }

    public void setTargetPortNumber(String str) {
        throw new RuntimeException("Stub!");
    }
}
