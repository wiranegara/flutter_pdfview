package io.endigo.plugins.pdfviewflutter;

import io.flutter.plugin.common.PluginRegistry.Registrar;

import io.flutter.embedding.engine.plugins.FlutterPlugin;

public class PDFViewFlutterPlugin implements FlutterPlugin {
    @Override
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
         binding.getPlatformViewRegistry().registerViewFactory("plugins.endigo.io/pdfview", new PDFViewFactory(binding.	getBinaryMessenger()));
    }
    @Override
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) { }
}

