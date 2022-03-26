package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {
    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader cl, String className, Intent intent) {
        Activity instantiateActivity = super.instantiateActivity(cl, className, intent);
        a(instantiateActivity);
        return instantiateActivity;
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader cl, String className) {
        Application instantiateApplication = super.instantiateApplication(cl, className);
        a(instantiateApplication);
        return instantiateApplication;
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader cl, String className, Intent intent) {
        BroadcastReceiver instantiateReceiver = super.instantiateReceiver(cl, className, intent);
        a(instantiateReceiver);
        return instantiateReceiver;
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader cl, String className) {
        ContentProvider instantiateProvider = super.instantiateProvider(cl, className);
        a(instantiateProvider);
        return instantiateProvider;
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader cl, String className, Intent intent) {
        Service instantiateService = super.instantiateService(cl, className, intent);
        a(instantiateService);
        return instantiateService;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
