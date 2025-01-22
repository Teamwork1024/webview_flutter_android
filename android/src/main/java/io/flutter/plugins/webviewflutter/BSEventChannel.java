package io.flutter.plugins.webviewflutter;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.EventChannel;

public class BSEventChannel implements EventChannel.StreamHandler {

    public static final String CHANNEL = "baishunChannel";
    public static EventChannel.EventSink bsSink;

    public static EventChannel channel;

    public static BSEventChannel registerWith(FlutterPlugin.FlutterPluginBinding binding) {
        channel = new EventChannel(binding.getBinaryMessenger(), CHANNEL);
        BSEventChannel instance = new BSEventChannel();
        channel.setStreamHandler(instance);
        return instance;
    }


    @Override
    public void onListen(Object arguments, EventChannel.EventSink events) {
        bsSink = events;
    }

    @Override
    public void onCancel(Object arguments) {
        bsSink = null;
    }

    public void sendEvent(Object o) {
        if (bsSink != null) {
            bsSink.success(o);
        }
    }
}
