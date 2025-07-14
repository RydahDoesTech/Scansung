package com.samsung.android.knox.net.firewall;

import com.samsung.android.knox.net.firewall.FirewallRule;
import java.util.List;

/* loaded from: classes.dex */
public class Firewall {
    public static final String ACTION_BLOCKED_DOMAIN = "com.samsung.android.knox.intent.action.BLOCKED_DOMAIN";
    public static final String EXTRA_BLOCKED_DOMAIN_ISFOREGROUND = "com.samsung.android.knox.intent.extra.BLOCKED_DOMAIN_ISFOREGROUND";
    public static final String EXTRA_BLOCKED_DOMAIN_PACKAGENAME = "com.samsung.android.knox.intent.extra.BLOCKED_DOMAIN_PACKAGENAME";
    public static final String EXTRA_BLOCKED_DOMAIN_TIMESTAMP = "com.samsung.android.knox.intent.extra.BLOCKED_DOMAIN_TIMESTAMP";
    public static final String EXTRA_BLOCKED_DOMAIN_UID = "com.samsung.android.knox.intent.extra.BLOCKED_DOMAIN_UID";
    public static final String EXTRA_BLOCKED_DOMAIN_URL = "com.samsung.android.knox.intent.extra.BLOCKED_DOMAIN_URL";
    public static final int FIREWALL_ALLOW_RULE = 1;
    public static final String FIREWALL_ALL_PACKAGES = "*";
    public static final int FIREWALL_ALL_RULES = 15;
    public static final int FIREWALL_DENY_RULE = 2;
    public static final int FIREWALL_REDIRECT_EXCEPTION_RULE = 8;
    public static final int FIREWALL_REDIRECT_RULE = 4;

    public enum AddressType {
        IPV4,
        IPV6
    }

    public enum Direction {
        ALL,
        FORWARD,
        INPUT,
        OUTPUT
    }

    public enum NetworkInterface {
        ALL_NETWORKS,
        MOBILE_DATA_ONLY,
        WIFI_DATA_ONLY
    }

    public enum PortLocation {
        ALL,
        LOCAL,
        REMOTE
    }

    public enum Protocol {
        ALL,
        TCP,
        UDP
    }

    public Firewall() {
        throw new RuntimeException("Stub!");
    }

    public FirewallResponse[] addDomainFilterRules(List<DomainFilterRule> list) {
        throw new RuntimeException("Stub!");
    }

    public FirewallResponse[] addRules(FirewallRule[] firewallRuleArr) {
        throw new RuntimeException("Stub!");
    }

    public FirewallResponse[] clearRules(int i5) {
        throw new RuntimeException("Stub!");
    }

    public FirewallResponse enableDomainFilterOnIptables(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public FirewallResponse enableDomainFilterReport(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public FirewallResponse enableFirewall(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public List<DomainFilterReport> getDomainFilterReport(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public List<DomainFilterRule> getDomainFilterRules(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public FirewallRule[] getRules(int i5, FirewallRule.Status status) {
        throw new RuntimeException("Stub!");
    }

    public boolean isDomainFilterOnIptablesEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDomainFilterReportEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isFirewallEnabled() {
        throw new RuntimeException("Stub!");
    }

    public String[] listIptablesRules() {
        throw new RuntimeException("Stub!");
    }

    public FirewallResponse[] removeDomainFilterRules(List<DomainFilterRule> list) {
        throw new RuntimeException("Stub!");
    }

    public FirewallResponse[] removeRules(FirewallRule[] firewallRuleArr) {
        throw new RuntimeException("Stub!");
    }
}
