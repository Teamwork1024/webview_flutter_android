package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.content.Context;

import androidx.annotation.NonNull;

public class NativeBridge {
    private Context ctx;

    NativeBridge(Context ctx) {
        this.ctx = ctx;
    }

    @JavascriptInterface
    public void getConfig(String msg) {
        Handler mainHandler = new Handler(Looper.getMainLooper());
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                WebViewFlutterPlugin.bsEventChannel.sendEvent(msg);
            }
        });
    }

    @JavascriptInterface
    public void destroy(String msg) {
        Handler mainHandler = new Handler(Looper.getMainLooper());
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                WebViewFlutterPlugin.bsEventChannel.sendEvent(msg);
            }
        });
    }

    @JavascriptInterface
    public void gameRecharge(String msg) {
        Handler mainHandler = new Handler(Looper.getMainLooper());
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                WebViewFlutterPlugin.bsEventChannel.sendEvent(msg);
            }
        });
    }

    @JavascriptInterface
    public void gameLoaded(String msg) {
        Handler mainHandler = new Handler(Looper.getMainLooper());
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                WebViewFlutterPlugin.bsEventChannel.sendEvent(msg);
            }
        });
    }

}
