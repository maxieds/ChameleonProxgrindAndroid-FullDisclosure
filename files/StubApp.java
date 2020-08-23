package com.stub;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.qihoo.util.C0002;
import dalvik.system.DexFile;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class StubApp extends Application {
    private static boolean loadFromLib = false;
    private static boolean needX86Bridge = false;
    public static String strEntryApplication = "entryRunApplication";

    /* renamed from: ᵢˋ */
    private static Application f2 = null;

    /* renamed from: ᵢˎ */
    private static Application f3 = null;

    /* renamed from: ᵢˏ */
    private static String f4 = "libjiagu";

    /* renamed from: ᵢˑ */
    private static Context f5;

    /* renamed from: ᵢי */
    private static String f6 = null;

    /* renamed from: ᵢـ */
    private static String f7 = null;

    /* renamed from: ᵢٴ */
    private static String f8 = null;

    /* renamed from: ᵢᐧ */
    private static String f9 = null;

    /* renamed from: ᵢᴵ */
    private static String f10 = null;

    /* renamed from: ᵢᵎ */
    private static Map<Integer, String> f11 = new ConcurrentHashMap();

    public static native void interface11(int i);

    public static native Enumeration<String> interface12(DexFile dexFile);

    public static native long interface13(int i, long j, long j2, long j3, int i2, int i3, long j4);

    public static native String interface14(int i);

    public static native AssetFileDescriptor interface17(AssetManager assetManager, String str);

    public static native InputStream interface18(Class cls, String str);

    public static native InputStream interface19(ClassLoader classLoader, String str);

    public static native void interface20();

    public static native void interface21(Application application);

    public static native void interface22(int i, String[] strArr, int[] iArr);

    public static native void interface5(Application application);

    public static native String interface6(String str);

    public static native boolean interface7(Application application, Context context);

    public static native boolean interface8(Application application, Context context);

    public static native Location mark(LocationManager locationManager, String str);

    public static native void mark();

    public static native void mark(Location location);

    public static native synchronized void n0100();

    public static native synchronized Object n010133(int i, Object obj);

    public static native synchronized Object n0103();

    public static native synchronized Object n01033(Object obj);

    public static native void n0110();

    public static native int n0111();

    public static native void n01110(int i);

    public static native int n01111(int i);

    public static native void n011110(int i, int i2);

    public static native int n011111(int i, float f);

    public static native boolean n0111111(boolean z, boolean z2, boolean z3);

    public static native int n01111111(int i, int i2, boolean z, int i3);

    public static native int n011111111(int i, int i2, int i3, int i4, int i5);

    public static native float n0111111111(float f, float f12, float f13, float f14, float f15, float f16);

    public static native Object n0111111113(int i, int i2, int i3, int i4, boolean z, boolean z2);

    public static native Object n01111111133(int i, int i2, int i3, int i4, int i5, int i6, Object obj);

    public static native Object n011111113(int i, int i2, int i3, int i4, boolean z);

    public static native Object n01111113(int i, int i2, int i3, int i4);

    public static native Object n0111113(int i, int i2, boolean z);

    public static native void n01111130(int i, int i2, int i3, Object obj);

    public static native int n01111131(int i, int i2, int i3, Object obj);

    public static native void n011111311310(int i, int i2, int i3, Object obj, int i4, int i5, Object obj2, int i6);

    public static native Object n01111133(int i, int i2, int i3, Object obj);

    public static native void n0111113310(int i, int i2, int i3, Object obj, Object obj2, int i4);

    public static native Object n011111333(byte b, byte b2, byte b3, Object obj, Object obj2);

    public static native long n011112(int i, int i2);

    public static native Object n011113(int i, float f);

    public static native boolean n0111131(float f, float f12, Object obj);

    public static native Object n01111313(int i, int i2, Object obj, float f);

    public static native Object n0111133(int i, int i2, Object obj);

    public static native double n01112(int i);

    public static native Object n0111221232323(int i, long j, long j2, float f, long j3, Object obj, long j4, Object obj2, long j5);

    public static native Object n01112212323233(int i, long j, long j2, float f, long j3, Object obj, long j4, Object obj2, long j5, Object obj3);

    public static native Object n011123(int i, long j);

    public static native Object n01113(int i);

    public static native void n011130(int i, Object obj);

    public static native int n011131(int i, Object obj);

    public static native boolean n0111311(int i, Object obj, int i2);

    public static native Object n0111313(int i, Object obj, float f);

    public static native void n01113130(int i, Object obj, int i2, Object obj2);

    public static native Object n011133(int i, Object obj);

    public static native boolean n0111331(int i, Object obj, Object obj2);

    public static native void n01113310(int i, Object obj, Object obj2, int i2);

    public static native Object n011133113(int i, Object obj, Object obj2, int i2, int i3);

    public static native boolean n01113331(int i, Object obj, Object obj2, Object obj3);

    public static native Object n01113333(int i, Object obj, Object obj2, Object obj3);

    public static native long n0112();

    public static native void n01120(double d);

    public static native int n01121(long j);

    public static native int n011211(long j, int i);

    public static native double n01122(double d);

    public static native boolean n011221(long j, long j2);

    public static native int n0112221(double d, double d2, double d3);

    public static native double n0112222(double d, double d2, double d3);

    public static native void n01122230(double d, double d2, double d3, Object obj);

    public static native void n0112230(long j, long j2, Object obj);

    public static native void n011230(long j, Object obj);

    public static native void n0112310(long j, Object obj, int i);

    public static native Object n0113();

    public static native void n01130(Object obj);

    public static native int n01131(Object obj);

    public static native void n011310(Object obj, boolean z);

    public static native int n011311(Object obj, int i);

    public static native void n0113110(Object obj, int i, int i2);

    public static native int n0113111(Object obj, int i, float f);

    public static native void n01131110(Object obj, int i, int i2, int i3);

    public static native boolean n01131111(Object obj, float f, float f12, float f13);

    public static native void n011311110(Object obj, int i, int i2, int i3, int i4);

    public static native int n011311111(Object obj, int i, int i2, int i3, int i4);

    public static native int n0113111111(Object obj, int i, char c, int i2, boolean z, int i3);

    public static native void n0113111111110(Object obj, float f, float f12, float f13, float f14, float f15, float f16, float f17, float f18);

    public static native void n01131111111110(Object obj, float f, float f12, float f13, float f14, float f15, float f16, float f17, boolean z, boolean z2);

    public static native Object n011311113(Object obj, int i, int i2, int i3, int i4);

    public static native boolean n0113111131(Object obj, int i, int i2, int i3, int i4, Object obj2);

    public static native boolean n01131111311(Object obj, int i, int i2, int i3, int i4, Object obj2, int i5);

    public static native void n011311113130(Object obj, int i, int i2, int i3, int i4, Object obj2, int i5, Object obj3);

    public static native Object n011311113313(Object obj, int i, int i2, int i3, int i4, Object obj2, Object obj3, int i5);

    public static native Object n01131113(Object obj, int i, int i2, int i3);

    public static native Object n011311133(Object obj, int i, int i2, int i3, Object obj2);

    public static native Object n01131123(Object obj, int i, int i2, long j);

    public static native Object n0113113(Object obj, int i, int i2);

    public static native void n01131130(Object obj, int i, int i2, Object obj2);

    public static native Object n01131133(Object obj, int i, int i2, Object obj2);

    public static native boolean n011311331(Object obj, int i, int i2, Object obj2, Object obj3);

    public static native boolean n0113113311(Object obj, int i, int i2, Object obj2, Object obj3, int i3);

    public static native int n0113121(Object obj, int i, long j);

    public static native Object n0113123(Object obj, int i, long j);

    public static native void n01131230(Object obj, int i, long j, Object obj2);

    public static native Object n011313(Object obj, int i);

    public static native void n0113130(Object obj, int i, Object obj2);

    public static native int n0113131(Object obj, int i, Object obj2);

    public static native Object n011313133(Object obj, int i, Object obj2, int i2, Object obj3);

    public static native Object n01131313313(Object obj, int i, Object obj2, int i2, Object obj3, Object obj4, boolean z);

    public static native Object n0113133(Object obj, int i, Object obj2);

    public static native void n01131330(Object obj, int i, Object obj2, Object obj3);

    public static native Object n01131333(Object obj, int i, Object obj2, Object obj3);

    public static native void n011313330(Object obj, int i, Object obj2, Object obj3, Object obj4);

    public static native long n01132(Object obj);

    public static native void n011320(Object obj, long j);

    public static native double n011322(Object obj, double d);

    public static native void n01132222222220(Object obj, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9);

    public static native Object n011323(Object obj, long j);

    public static native void n0113230(Object obj, long j, Object obj2);

    public static native void n01132330(Object obj, long j, Object obj2, Object obj3);

    public static native Object n01133(Object obj);

    public static native void n011330(Object obj, Object obj2);

    public static native boolean n011331(Object obj, Object obj2);

    public static native void n0113310(Object obj, Object obj2, int i);

    public static native boolean n0113311(Object obj, Object obj2, boolean z);

    public static native void n01133110(Object obj, Object obj2, int i, int i2);

    public static native boolean n01133111(Object obj, Object obj2, int i, boolean z);

    public static native void n011331110(Object obj, Object obj2, int i, int i2, int i3);

    public static native boolean n011331111(Object obj, Object obj2, int i, int i2, boolean z);

    public static native void n0113311110(Object obj, Object obj2, int i, int i2, int i3, int i4);

    public static native void n01133111110(Object obj, Object obj2, int i, int i2, int i3, int i4, int i5);

    public static native void n011331111110(Object obj, Object obj2, int i, int i2, int i3, boolean z, boolean z2, boolean z3);

    public static native Object n0113311111133(Object obj, Object obj2, int i, int i2, float f, float f12, float f13, float f14, Object obj3);

    public static native void n011331111130(Object obj, Object obj2, int i, int i2, int i3, int i4, int i5, Object obj3);

    public static native Object n01133113(Object obj, Object obj2, boolean z, boolean z2);

    public static native void n011331130(Object obj, Object obj2, int i, int i2, Object obj3);

    public static native boolean n011331131(Object obj, Object obj2, int i, int i2, Object obj3);

    public static native void n0113311310(Object obj, Object obj2, int i, int i2, Object obj3, int i3);

    public static native Object n0113313(Object obj, Object obj2, int i);

    public static native void n01133130(Object obj, Object obj2, int i, Object obj3);

    public static native int n01133131(Object obj, Object obj2, int i, Object obj3);

    public static native void n011331310(Object obj, Object obj2, boolean z, Object obj3, boolean z2);

    public static native void n011331311130(Object obj, Object obj2, int i, Object obj3, int i2, int i3, int i4, Object obj4);

    public static native Object n011331313(Object obj, Object obj2, int i, Object obj3, int i2);

    public static native Object n01133133(Object obj, Object obj2, int i, Object obj3);

    public static native void n011331330(Object obj, Object obj2, float f, Object obj3, Object obj4);

    public static native long n011331333112(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, int i2, int i3);

    public static native long n011332(Object obj, Object obj2);

    public static native void n0113320(Object obj, Object obj2, long j);

    public static native Object n0113323(Object obj, Object obj2, long j);

    public static native void n01133230(Object obj, Object obj2, double d, Object obj3);

    public static native Object n011333(Object obj, Object obj2);

    public static native void n0113330(Object obj, Object obj2, Object obj3);

    public static native boolean n0113331(Object obj, Object obj2, Object obj3);

    public static native void n01133310(Object obj, Object obj2, Object obj3, int i);

    public static native int n01133311(Object obj, Object obj2, Object obj3, int i);

    public static native void n011333110(Object obj, Object obj2, Object obj3, int i, int i2);

    public static native boolean n011333111(Object obj, Object obj2, Object obj3, int i, boolean z);

    public static native void n0113331110(Object obj, Object obj2, Object obj3, int i, int i2, boolean z);

    public static native Object n011333113(Object obj, Object obj2, Object obj3, int i, int i2);

    public static native void n0113331130(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4);

    public static native boolean n0113331131(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4);

    public static native Object n0113331133(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4);

    public static native Object n0113331133113(Object obj, Object obj2, Object obj3, int i, float f, Object obj4, Object obj5, int i2, boolean z);

    public static native Object n011333113313(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4, Object obj5, boolean z);

    public static native Object n01133313(Object obj, Object obj2, Object obj3, int i);

    public static native void n011333130(Object obj, Object obj2, Object obj3, float f, Object obj4);

    public static native boolean n011333131(Object obj, Object obj2, Object obj3, int i, Object obj4);

    public static native boolean n01133321(Object obj, Object obj2, Object obj3, long j);

    public static native long n01133322(Object obj, Object obj2, Object obj3, long j);

    public static native Object n0113333(Object obj, Object obj2, Object obj3);

    public static native void n01133330(Object obj, Object obj2, Object obj3, Object obj4);

    public static native boolean n01133331(Object obj, Object obj2, Object obj3, Object obj4);

    public static native void n011333310(Object obj, Object obj2, Object obj3, Object obj4, int i);

    public static native boolean n011333311(Object obj, Object obj2, Object obj3, Object obj4, int i);

    public static native Object n01133331113(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i, int i2);

    public static native Object n0113333113(Object obj, Object obj2, Object obj3, Object obj4, float f, boolean z);

    public static native Object n011333313(Object obj, Object obj2, Object obj3, Object obj4, int i);

    public static native void n0113333130(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5);

    public static native Object n0113333133(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5);

    public static native Object n01133333(Object obj, Object obj2, Object obj3, Object obj4);

    public static native void n011333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native boolean n011333331(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native int n0113333311(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z);

    public static native int n01133333111(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, boolean z2);

    public static native Object n0113333313(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i);

    public static native Object n01133333133(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, float f, Object obj6);

    public static native Object n011333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native void n0113333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native boolean n0113333331(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native Object n011333333113(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, float f);

    public static native Object n01133333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native void n0113333333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static native Object n0113333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public native synchronized void n1100();

    public native synchronized boolean n1101();

    public native synchronized void n11010(int i);

    public native synchronized void n110110(int i, int i2);

    public native synchronized Object n1103();

    public native synchronized void n11030(Object obj);

    public native synchronized Object n1103113(Object obj, int i, boolean z);

    public native synchronized Object n110313(Object obj, int i);

    public native synchronized Object n110323(Object obj, long j);

    public native synchronized boolean n1103231(Object obj, long j, Object obj2);

    public native synchronized Object n11033(Object obj);

    public native synchronized void n110330(Object obj, Object obj2);

    public native synchronized Object n1103313(Object obj, Object obj2, int i);

    public native void n1110();

    public native int n1111();

    public native void n11110(boolean z);

    public native int n11111(int i);

    public native void n111110(int i, float f);

    public native boolean n111111(int i, int i2);

    public native void n1111110(int i, int i2, int i3);

    public native float n1111111(int i, int i2, int i3);

    public native void n11111110(int i, int i2, int i3, int i4);

    public native boolean n11111111(int i, int i2, int i3, int i4);

    public native void n111111110(int i, int i2, int i3, int i4, int i5);

    public native int n111111111(int i, int i2, int i3, int i4, int i5);

    public native void n1111111110(float f, float f12, float f13, float f14, float f15, float f16);

    public native boolean n1111111111(int i, int i2, int i3, int i4, int i5, int i6);

    public native void n11111111110(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5);

    public native void n111111111110(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f);

    public native boolean n1111111111111(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);

    public native void n11111111111110(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public native Object n11111111113(int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public native void n111111111330(int i, int i2, int i3, int i4, int i5, int i6, Object obj, Object obj2);

    public native Object n11111113(char c, char c2, int i, int i2);

    public native boolean n111111131(int i, int i2, int i3, int i4, Object obj);

    public native boolean n1111111311(int i, int i2, int i3, int i4, Object obj, int i5);

    public native Object n1111111313(int i, int i2, int i3, int i4, Object obj, int i5);

    public native void n11111113130(int i, int i2, int i3, int i4, Object obj, int i5, Object obj2);

    public native boolean n11111113131(int i, int i2, int i3, int i4, Object obj, int i5, Object obj2);

    public native void n11111113310(int i, int i2, int i3, int i4, Object obj, Object obj2, int i5);

    public native void n1111111331110(int i, int i2, int i3, int i4, Object obj, Object obj2, int i5, int i6, int i7);

    public native Object n1111113(int i, boolean z, int i2);

    public native void n11111130(int i, int i2, int i3, Object obj);

    public native int n11111131(int i, int i2, int i3, Object obj);

    public native void n111111310(boolean z, int i, int i2, Object obj, float f);

    public native Object n111111313131313(float f, float f12, float f13, Object obj, int i, Object obj2, int i2, Object obj3, int i3, Object obj4, int i4);

    public native Object n11111133(int i, int i2, int i3, Object obj);

    public native void n111111330(int i, int i2, int i3, Object obj, Object obj2);

    public native Object n111111333(int i, int i2, boolean z, Object obj, Object obj2);

    public native int n111111333131(int i, int i2, int i3, Object obj, Object obj2, Object obj3, int i4, Object obj4);

    public native Object n11111133333(float f, float f12, float f13, Object obj, Object obj2, Object obj3, Object obj4);

    public native long n111112(int i, int i2);

    public native Object n1111123(int i, boolean z, long j);

    public native Object n111113(int i, boolean z);

    public native void n1111130(int i, int i2, Object obj);

    public native boolean n1111131(int i, int i2, Object obj);

    public native void n11111310(int i, int i2, Object obj, boolean z);

    public native int n11111311(int i, int i2, Object obj, boolean z);

    public native int n1111131111(float f, float f12, Object obj, int i, int i2, int i3);

    public native Object n11111313(int i, boolean z, Object obj, boolean z2);

    public native Object n1111133(int i, int i2, Object obj);

    public native void n11111330(int i, int i2, Object obj, Object obj2);

    public native boolean n11111331(int i, int i2, Object obj, Object obj2);

    public native boolean n111113311(int i, int i2, Object obj, Object obj2, int i3);

    public native Object n11111333(int i, boolean z, Object obj, Object obj2);

    public native void n111113330(boolean z, boolean z2, Object obj, Object obj2, Object obj3);

    public native long n11112(int i);

    public native void n111120(int i, long j);

    public native boolean n111121(int i, long j);

    public native Object n11112123(int i, long j, float f, long j2);

    public native Object n1111213(int i, long j, float f);

    public native boolean n1111221(int i, long j, long j2);

    public native void n111122121323230(int i, long j, long j2, float f, long j3, int i2, Object obj, long j4, Object obj2, long j5, Object obj3);

    public native Object n111123(int i, long j);

    public native Object n11113(int i);

    public native void n111130(int i, Object obj);

    public native boolean n111131(int i, Object obj);

    public native void n1111310(int i, Object obj, int i2);

    public native boolean n1111311(int i, Object obj, int i2);

    public native void n11113110(int i, Object obj, float f, float f12);

    public native void n111131110(int i, Object obj, boolean z, int i2, boolean z2);

    public native Object n111131113(int i, Object obj, boolean z, int i2, boolean z2);

    public native Object n11113113(int i, Object obj, int i2, int i3);

    public native Object n1111313(int i, Object obj, boolean z);

    public native Object n11113133(int i, Object obj, boolean z, Object obj2);

    public native void n111131330(int i, Object obj, int i2, Object obj2, Object obj3);

    public native boolean n1111313311(boolean z, Object obj, int i, Object obj2, Object obj3, boolean z2);

    public native Object n111133(int i, Object obj);

    public native void n1111330(int i, Object obj, Object obj2);

    public native boolean n1111331(int i, Object obj, Object obj2);

    public native void n11113310(int i, Object obj, Object obj2, int i2);

    public native boolean n11113311(int i, Object obj, Object obj2, int i2);

    public native Object n1111333(int i, Object obj, Object obj2);

    public native void n11113330(int i, Object obj, Object obj2, Object obj3);

    public native Object n11113333(int i, Object obj, Object obj2, Object obj3);

    public native void n111133330(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public native void n11113333311110(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i2, boolean z2, boolean z3);

    public native long n1112();

    public native void n11120(long j);

    public native int n11121(long j);

    public native void n111210(double d, int i);

    public native Object n1112113(long j, int i, boolean z);

    public native double n111212(double d, int i);

    public native long n11122(long j);

    public native void n111220(long j, long j2);

    public native long n111222(long j, long j2);

    public native void n1112220(long j, double d, double d2);

    public native void n1112230(long j, long j2, Object obj);

    public native Object n11123(long j);

    public native void n111230(long j, Object obj);

    public native boolean n111231(long j, Object obj);

    public native boolean n1112311(long j, Object obj, float f);

    public native Object n111233(long j, Object obj);

    public native void n1112330(long j, Object obj, Object obj2);

    public native boolean n1112331(long j, Object obj, Object obj2);

    public native Object n1113();

    public native void n11130(Object obj);

    public native boolean n11131(Object obj);

    public native void n111310(Object obj, int i);

    public native int n111311(Object obj, boolean z);

    public native void n1113110(Object obj, int i, boolean z);

    public native boolean n1113111(Object obj, float f, float f12);

    public native void n11131110(Object obj, int i, int i2, int i3);

    public native int n11131111(Object obj, int i, int i2, int i3);

    public native void n111311110(Object obj, int i, int i2, int i3, int i4);

    public native int n111311111(Object obj, int i, int i2, int i3, boolean z);

    public native void n1113111110(Object obj, int i, int i2, int i3, int i4, int i5);

    public native boolean n1113111111(Object obj, boolean z, int i, int i2, int i3, int i4);

    public native void n11131111110(Object obj, int i, int i2, float f, float f12, float f13, float f14);

    public native void n1113111111110(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public native int n1113111111111(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public native Object n11131111113(Object obj, int i, int i2, int i3, boolean z, boolean z2, boolean z3);

    public native void n11131111130(Object obj, int i, int i2, int i3, int i4, int i5, Object obj2);

    public native Object n111311113(Object obj, int i, int i2, int i3, int i4);

    public native void n1113111130(Object obj, int i, int i2, int i3, int i4, Object obj2);

    public native int n1113111131(Object obj, int i, int i2, int i3, int i4, Object obj2);

    public native void n11131111310(Object obj, int i, int i2, int i3, int i4, Object obj2, int i5);

    public native long n11131112(Object obj, int i, float f, float f12);

    public native int n111311121(Object obj, int i, int i2, int i3, long j);

    public native Object n11131113(Object obj, int i, boolean z, int i2);

    public native void n111311130(Object obj, int i, int i2, boolean z, Object obj2);

    public native boolean n11131121(Object obj, int i, int i2, long j);

    public native Object n1113113(Object obj, int i, int i2);

    public native void n11131130(Object obj, int i, int i2, Object obj2);

    public native boolean n11131131(Object obj, int i, int i2, Object obj2);

    public native void n111311310(Object obj, int i, int i2, Object obj2, int i3);

    public native void n1113113110(Object obj, int i, boolean z, Object obj2, int i2, int i3);

    public native boolean n1113113111(Object obj, int i, int i2, Object obj2, int i3, boolean z);

    public native Object n11131133(Object obj, int i, boolean z, Object obj2);

    public native void n111311330(Object obj, int i, int i2, Object obj2, Object obj3);

    public native void n11131133330(Object obj, int i, int i2, Object obj2, Object obj3, Object obj4, Object obj5);

    public native Object n1113123(Object obj, int i, long j);

    public native void n11131230(Object obj, int i, long j, Object obj2);

    public native Object n111313(Object obj, int i);

    public native void n1113130(Object obj, int i, Object obj2);

    public native boolean n1113131(Object obj, int i, Object obj2);

    public native void n11131310(Object obj, int i, Object obj2, int i2);

    public native boolean n11131311(Object obj, int i, Object obj2, int i2);

    public native boolean n111313111(Object obj, int i, Object obj2, int i2, int i3);

    public native void n1113131110(Object obj, int i, Object obj2, int i2, int i3, int i4);

    public native void n11131311130(Object obj, int i, Object obj2, int i2, int i3, int i4, Object obj3);

    public native void n111313130(Object obj, int i, Object obj2, int i2, Object obj3);

    public native Object n1113133(Object obj, int i, Object obj2);

    public native void n11131330(Object obj, int i, Object obj2, Object obj3);

    public native Object n11131333(Object obj, int i, Object obj2, Object obj3);

    public native void n111313330(Object obj, int i, Object obj2, Object obj3, Object obj4);

    public native void n1113133310(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2);

    public native void n11131333110(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2, int i3);

    public native void n111313331331111111111110(Object obj, boolean z, Object obj2, Object obj3, Object obj4, boolean z2, Object obj5, Object obj6, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7, float f12, boolean z5);

    public native void n1113133330(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5);

    public native long n11132(Object obj);

    public native void n111320(Object obj, long j);

    public native boolean n111321(Object obj, long j);

    public native void n1113210(Object obj, long j, float f);

    public native void n1113211130(Object obj, long j, int i, int i2, float f, Object obj2);

    public native long n111322(Object obj, long j);

    public native void n111322211130(Object obj, long j, long j2, long j3, int i, int i2, float f, Object obj2);

    public native Object n111323(Object obj, long j);

    public native void n1113230(Object obj, long j, Object obj2);

    public native Object n1113233(Object obj, long j, Object obj2);

    public native Object n11133(Object obj);

    public native void n111330(Object obj, Object obj2);

    public native boolean n111331(Object obj, Object obj2);

    public native void n1113310(Object obj, Object obj2, int i);

    public native int n1113311(Object obj, Object obj2, int i);

    public native void n11133110(Object obj, Object obj2, int i, int i2);

    public native boolean n11133111(Object obj, Object obj2, int i, int i2);

    public native void n111331110(Object obj, Object obj2, int i, int i2, boolean z);

    public native boolean n111331111(Object obj, Object obj2, int i, int i2, int i3);

    public native void n1113311110(Object obj, Object obj2, boolean z, int i, int i2, int i3);

    public native boolean n1113311111(Object obj, Object obj2, boolean z, boolean z2, boolean z3, boolean z4);

    public native void n11133111111130(Object obj, Object obj2, int i, int i2, float f, float f12, float f13, float f14, int i3, Object obj3);

    public native Object n111331113(Object obj, Object obj2, float f, float f12, float f13);

    public native boolean n111331121(Object obj, Object obj2, int i, int i2, long j);

    public native Object n11133113(Object obj, Object obj2, int i, int i2);

    public native void n111331130(Object obj, Object obj2, boolean z, int i, Object obj3);

    public native int n111331131(Object obj, Object obj2, int i, int i2, Object obj3);

    public native void n1113311311330(Object obj, Object obj2, boolean z, boolean z2, Object obj3, float f, float f12, Object obj4, Object obj5);

    public native void n11133113133310(Object obj, Object obj2, boolean z, boolean z2, Object obj3, boolean z3, Object obj4, Object obj5, Object obj6, boolean z4);

    public native Object n111331133(Object obj, Object obj2, int i, int i2, Object obj3);

    public native void n1113311330(Object obj, Object obj2, int i, int i2, Object obj3, Object obj4);

    public native void n111331133110(Object obj, Object obj2, int i, float f, Object obj3, Object obj4, int i2, int i3);

    public native Object n11133113313(Object obj, Object obj2, int i, float f, Object obj3, Object obj4, int i2);

    public native void n11133113330(Object obj, Object obj2, boolean z, boolean z2, Object obj3, Object obj4, Object obj5);

    public native void n111331133330(Object obj, Object obj2, boolean z, boolean z2, Object obj3, Object obj4, Object obj5, Object obj6);

    public native void n11133120(Object obj, Object obj2, int i, long j);

    public native boolean n11133121(Object obj, Object obj2, int i, long j);

    public native Object n1113313(Object obj, Object obj2, int i);

    public native void n11133130(Object obj, Object obj2, int i, Object obj3);

    public native boolean n11133131(Object obj, Object obj2, int i, Object obj3);

    public native void n111331310(Object obj, Object obj2, int i, Object obj3, int i2);

    public native void n11133131110(Object obj, Object obj2, int i, Object obj3, int i2, int i3, int i4);

    public native void n111331311130(Object obj, Object obj2, int i, Object obj3, int i2, int i3, int i4, Object obj4);

    public native Object n111331313(Object obj, Object obj2, int i, Object obj3, int i2);

    public native void n1113313130(Object obj, Object obj2, int i, Object obj3, int i2, Object obj4);

    public native Object n11133133(Object obj, Object obj2, int i, Object obj3);

    public native void n111331330(Object obj, Object obj2, int i, Object obj3, Object obj4);

    public native boolean n111331331(Object obj, Object obj2, int i, Object obj3, Object obj4);

    public native void n11133133310(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, int i2);

    public native void n11133133330(Object obj, Object obj2, boolean z, Object obj3, Object obj4, Object obj5, Object obj6);

    public native void n1113320(Object obj, Object obj2, long j);

    public native boolean n1113321(Object obj, Object obj2, long j);

    public native Object n111333(Object obj, Object obj2);

    public native void n1113330(Object obj, Object obj2, Object obj3);

    public native int n1113331(Object obj, Object obj2, Object obj3);

    public native void n11133310(Object obj, Object obj2, Object obj3, boolean z);

    public native boolean n11133311(Object obj, Object obj2, Object obj3, boolean z);

    public native void n111333110(Object obj, Object obj2, Object obj3, int i, int i2);

    public native boolean n111333111(Object obj, Object obj2, Object obj3, float f, float f12);

    public native void n1113331110(Object obj, Object obj2, Object obj3, boolean z, int i, int i2);

    public native boolean n1113331111(Object obj, Object obj2, Object obj3, float f, float f12, boolean z);

    public native void n11133311110(Object obj, Object obj2, Object obj3, int i, int i2, int i3, int i4);

    public native void n111333111110(Object obj, Object obj2, Object obj3, int i, int i2, int i3, int i4, int i5);

    public native void n111333111111133113330(Object obj, Object obj2, Object obj3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Object obj4, Object obj5, int i, int i2, Object obj6, Object obj7, Object obj8);

    public native void n11133311130(Object obj, Object obj2, Object obj3, int i, int i2, int i3, Object obj4);

    public native boolean n11133311131(Object obj, Object obj2, Object obj3, int i, int i2, int i3, Object obj4);

    public native void n1113331130(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4);

    public native void n11133311310(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4, int i3);

    public native void n11133311330(Object obj, Object obj2, Object obj3, boolean z, int i, Object obj4, Object obj5);

    public native Object n11133313(Object obj, Object obj2, Object obj3, float f);

    public native void n111333130(Object obj, Object obj2, Object obj3, int i, Object obj4);

    public native boolean n111333131(Object obj, Object obj2, Object obj3, int i, Object obj4);

    public native void n1113331310(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2);

    public native void n1113331330(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5);

    public native Object n1113333(Object obj, Object obj2, Object obj3);

    public native void n11133330(Object obj, Object obj2, Object obj3, Object obj4);

    public native int n11133331(Object obj, Object obj2, Object obj3, Object obj4);

    public native void n111333310(Object obj, Object obj2, Object obj3, Object obj4, boolean z);

    public native boolean n111333311(Object obj, Object obj2, Object obj3, Object obj4, int i);

    public native void n1113333110(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2);

    public native boolean n1113333111(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2);

    public native void n11133331110(Object obj, Object obj2, Object obj3, Object obj4, int i, float f, float f12);

    public native Object n111333311113(Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, boolean z3, boolean z4);

    public native void n1113333111130(Object obj, Object obj2, Object obj3, Object obj4, float f, float f12, float f13, float f14, Object obj5);

    public native Object n1113333113(Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2);

    public native Object n111333313(Object obj, Object obj2, Object obj3, Object obj4, float f);

    public native Object n1113333133(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5);

    public native long n11133332(Object obj, Object obj2, Object obj3, Object obj4);

    public native Object n11133333(Object obj, Object obj2, Object obj3, Object obj4);

    public native void n111333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public native int n111333331(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public native void n111333331110(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3);

    public native void n1113333311110(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i, boolean z2, boolean z3);

    public native void n111333331330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, Object obj6, Object obj7);

    public native void n1113333320(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, long j);

    public native Object n111333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public native void n1113333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public native void n11133333311110(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z, int i, boolean z2, boolean z3);

    public native void n11133333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public native Object n11133333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public native void n111333333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public native void n1113333333313330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, boolean z, Object obj9, Object obj10, Object obj11);

    public static String getSoPath1() {
        return f7;
    }

    public static String getSoPath2() {
        return f8;
    }

    public static String getDir() {
        return f9;
    }

    public static Context getAppContext() {
        return f5;
    }

    public static Context getOrigApplicationContext(Context context) {
        if (context == f2) {
            return f3;
        }
        return context;
    }

    /* renamed from: ᵢˋ */
    private static Application m7(Context context) {
        try {
            if (f3 == null) {
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader != null) {
                    Class loadClass = classLoader.loadClass(strEntryApplication);
                    if (loadClass != null) {
                        f3 = (Application) loadClass.newInstance();
                    }
                }
            }
        } catch (Exception e) {
        }
        return f3;
    }

    public final void onCreate() {
        super.onCreate();
        try {
            interface7(f3, f2.getBaseContext());
        } catch (Exception e) {
        }
        if (f3 != null) {
            f3.onCreate();
        }
        interface21(f3);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        boolean r0;
        super.attachBaseContext(context);
        C0002.m6();
        f5 = context;
        if (f2 == null) {
            f2 = this;
        }
        if (f3 == null) {
            Boolean valueOf = Boolean.valueOf(C0002.m3());
            Boolean valueOf2 = Boolean.valueOf(false);
            Boolean valueOf3 = Boolean.valueOf(false);
            if (Build.CPU_ABI.contains("64") || Build.CPU_ABI2.contains("64")) {
                valueOf2 = Boolean.valueOf(true);
            }
            if (Build.CPU_ABI.contains("mips") || Build.CPU_ABI2.contains("mips")) {
                valueOf3 = Boolean.valueOf(true);
            }
            if (valueOf.booleanValue() && needX86Bridge) {
                System.loadLibrary("X86Bridge");
            }
            if (!loadFromLib) {
                String absolutePath = context.getFilesDir().getParentFile().getAbsolutePath();
                try {
                    absolutePath = context.getFilesDir().getParentFile().getCanonicalPath();
                } catch (Exception e) {
                }
                String str = absolutePath + "/.jiagu";
                f10 = m8(str, valueOf2.booleanValue(), valueOf3.booleanValue());
                f6 = m8(str, false, false);
                f7 = str + File.separator + f6;
                f8 = str + File.separator + f10;
                f9 = str;
                if (valueOf3.booleanValue()) {
                    C0002.m4(context, f4 + "_mips.so", str, f6);
                } else if (!valueOf.booleanValue() || needX86Bridge) {
                    C0002.m4(context, f4 + ".so", str, f6);
                } else {
                    C0002.m4(context, f4 + "_x86.so", str, f6);
                }
                if (!valueOf2.booleanValue() || valueOf3.booleanValue()) {
                    System.load(str + "/" + f6);
                } else {
                    if (!valueOf.booleanValue() || needX86Bridge) {
                        r0 = C0002.m4(context, f4 + "_a64.so", str, f10);
                    } else {
                        r0 = C0002.m4(context, f4 + "_x64.so", str, f10);
                    }
                    if (r0) {
                        System.load(str + "/" + f10);
                    } else {
                        System.load(str + "/" + f6);
                    }
                }
            } else if (!valueOf.booleanValue() || needX86Bridge) {
                System.loadLibrary("jiagu");
            } else {
                System.loadLibrary("jiagu_x86");
            }
        }
        interface5(f2);
        if (f3 == null) {
            f3 = m7(context);
            if (f3 != null) {
                try {
                    Method declaredMethod = Application.class.getDeclaredMethod("attach", new Class[]{Context.class});
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(f3, new Object[]{context});
                    }
                    interface8(f3, context);
                } catch (Exception e2) {
                    throw new RuntimeException("Failed to call attachBaseContext.", e2);
                }
            } else {
                System.exit(1);
            }
        }
    }

    /* renamed from: ᵢˋ */
    private static String m8(String str, boolean z, boolean z2) {
        String str2 = f4;
        if (VERSION.SDK_INT < 23) {
            str2 = str2 + str.hashCode();
        }
        if (!z || z2) {
            return str2 + ".so";
        }
        return str2 + "_64.so";
    }

    public static String getString2(int i) {
        String str = (String) f11.get(Integer.valueOf(i));
        if (str == null) {
            str = interface14(i);
            f11.put(Integer.valueOf(i), str);
        }
        if (str != null) {
            return str.intern();
        }
        return str;
    }

    public static String getString2(String str) {
        try {
            return getString2(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }
}
