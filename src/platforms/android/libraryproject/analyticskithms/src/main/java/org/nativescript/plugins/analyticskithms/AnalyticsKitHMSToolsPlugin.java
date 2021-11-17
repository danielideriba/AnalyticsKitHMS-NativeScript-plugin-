package org.nativescript.plugins.analyticskithms;

import com.huawei.hms.analytics.HiAnalyticsTools;

public class AnalyticsKitHMSToolsPlugin {
    private static final String TAG = "AnalyticsKitHMSToolsPlugin";

    public static void enableLog() {
        HiAnalyticsTools.enableLog(); 
    }
}