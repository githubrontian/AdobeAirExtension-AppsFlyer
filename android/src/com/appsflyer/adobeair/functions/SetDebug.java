package com.appsflyer.adobeair.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.appsflyer.AppsFlyerLib;

public class SetDebug implements FREFunction {
    @Override
    public FREObject call(FREContext freContext, FREObject[] freObjects) {
        Boolean debugLog = false;
        try {
            debugLog = freObjects[0].getAsBool();
            AppsFlyerLib.getInstance().setDebugLog(debugLog);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
