package org.nativescript.plugins.analyticskithms;

// TODO: Import classes from Analytics Kit.  
import com.huawei.hms.analytics.HiAnalytics; 
import com.huawei.hms.analytics.HiAnalyticsInstance; 

public class AnalyticsKitHMSPlugin {
    private static final String TAG = "AnalyticsKitHMSPlugin";

    public static void registerHiAnalytics(final Activity var0) {
    new Thread() {
      public void run() {
        try {
          String instance = HiAnalyticsInstance.getInstance(var0);

          Log.i(TAG, "INSTANCE "+instance);

        } catch (IOException e) {
          Log.e(TAG, "Error getting instance: " + e.getMessage(), e);
        }
      }
    }.start();
  }
}