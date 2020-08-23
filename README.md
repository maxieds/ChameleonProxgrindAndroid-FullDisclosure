# ChameleonProxgrindAndroid-FullDisclosure

## Prior disclosure to the vendor

In accordance with the guidelines for reporting to BugTraq [here](https://www.securityfocus.com/archive/1/description#0.1.8), I will first point out that a clear detailed report of the problem in this vulnerability has been made to the [vendor's contact point](mailto:dennis@rfidresearchgroup.com). Their response after I gave them a clear window to respond was to make the following comments to me quickly:
>Re: Concerns with the Proxgrind Android app (com.proxgrind.chameleon)
>
>So what am I suppose to do or what can I do to help with your problem ?
>
>I think it is better you state your concerns and bulletin it so I can go to my CTO with a more details on your concerns and how we can achieve more together ?
With a lacking response now days after my initial point of contact email, I feel that it is pertinent to warn users of the malware they have unwittingly purchased and installed on their Android phones to control it. 

## The proxgrind series of Chameleon Mini devices

The [Chameleon Mini (RevG)](https://github.com/emsec/ChameleonMini) devices originally manufactured by Kasper and Oswald are an affordable entry point for many users into the NFC pentesting game. More recently, thanks to an [effort on KickStarter](https://www.indiegogo.com/projects/chameleonmini-rev-g-chameleontiny-by-proxgrind#/) a family of physically sturdier, cheaper and (mostly) Bluetooth enhanced port of these devices has been introduced into the NFC tools market under the Proxgrind Chameleon Mini label. These devices have from the get-go touted an [insane list of features](https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/blob/master/docs/D-Appendix-ChameleonMiniAndChameleonTinyByProxGrind-Archived-2020.08.23-v1.pdf) and supported NFC tags for emulation, including premature claims about bidirectional sniffing and Mifare DESFire tag support.
The officially sanctioned [proxgrind firmware fork](https://github.com/RfidResearchGroup/ChameleonMini) has been known to be rife with [Bluetooth stack related issues](https://github.com/RfidResearchGroup/ChameleonMini/issues/12) from the onset of the first generation of their RevG replacement hardware. There is now another variant known as the [Proxgrind Tiny Professional](http://chameleontiny.com/product/chameleontiny-professional-with-bluetooth/) device that comes with Bluetooth enabled. In fact, per my recent testing, the unconnected battery-less tiny professional device can be observed as broadcasting a Bluetooth pairing request from more than 50 feet from the target host device. These Bluetooth-enabled devices have a default, manufacturer endorsed Android controller application listed on the 
[Google Play Store (com.proxgrind.chameleon)](https://play.google.com/store/apps/details?id=com.proxgrind.chameleon) [(store listing screenshot)](https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/blob/master/images/Screenshot_20200823-062601.png). 

## The vulnerability (clear instance of malware), and how it was noticed

After a generous user of my GPL-licensed open source Android logger and controller application for the Chameleon Mini devices offered me free hardware in exchange for hacking Bluetooth functionality for the Proxgrind devices, I begain to seriously look into how to make the Proxgrind Bluetooth stack work in non-manufacturer-endorser code. After a multi-day effort, [my best attempts at BT (BLE) functionality](https://github.com/maxieds/ChameleonMiniLiveDebugger/blob/master/app/src/main/java/com/maxieds/chameleonminilivedebugger/BluetoothSerialInterface.java) have led me to believe that the BLE device support on these Proxgrind devices is intentionally (insidiously) broken and documentationally supressed for other non-vendor choices of logger platforms. The next images document the Bluetooth BLE scheme on the Proxgrind RevG devices:

<img src="https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/blob/master/images/Screenshot_20200823-081808.png" width="225" /><img src="https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/blob/master/images/Screenshot_20200823-081814.png" width="225" /><img src="https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/blob/master/images/Screenshot_20200823-081818.png" width="225" />

One possible solution that turned out not to be viable was the possibility of an undocumented set of UUID strings for these Proxgrind devices. Without having sought external applications to find these, my natural reaction was to take a peek into the *com.proxgrind.chameleon* APK installed by Google Play Store on my personal phone. Consultation with [this standardized online tool](http://www.javadecompilers.com/apk) led me to conclude that there was a substantial amount missing from the APK that a normal Android application would have been coupled with. Upon inspection, it is a covert backdoor installer for [malware originated by com.qihoo](https://en.wikipedia.org/wiki/Qihoo_360), a Chinese internet security company. The reverse engineered sources are found in the [files listings](https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/tree/master/files), however, a few short notes as to how relatively unsophisticated the tracking for this can be is suggested below:

**(com/qihoo/util/DtcLoader.java)**
```java
package com.qihoo.util;

import android.content.Context;

public class DtcLoader {
    static {
        try {
            System.loadLibrary("jgdtc");
        } catch (Throwable th) {
            System.load(m0());
        }
    }

    /* renamed from: ᵢˋ */
    private static String m0() {
        try {
            Class cls = Class.forName(C0002.m1("q~tbyt>q``>QsdyfydiDxbuqt"));
            return ((Context) cls.getDeclaredMethod(C0002.m1("wudCicdu}S~duhd"), null).invoke(cls.getDeclaredMethod(C0002.m1("sebbu~dQsdyfydiDxbuqt"), null).invoke(null, new Object[0]), new Object[0])).getPackageManager().getApplicationInfo("PACKAGENAME", 0).nativeLibraryDir + "/libjgdtc.so";
        } catch (Throwable th) {
            return "/data/data/PACKAGENAME/lib/libjgdtc.so";
        }
    }

    public static void init() {
    }
}
```
**(com/qihoo/util/C0002.java -- snippets)**
```java
 /* renamed from: ᵢˎ */
    public static void m6() {
        if (VERSION.SDK_INT == 28) {
            try {
                Class.forName(m1("q~tbyt>s~du~d>`}>@qs{qwu@qbcub4@qs{qwu")).getDeclaredConstructor(new Class[]{String.class}).setAccessible(true);
            } catch (Throwable th) {
            }
            try {
                Class cls = Class.forName(m1("q~tbyt>q``>QsdyfydiDxbuqt"));
                Method declaredMethod = cls.getDeclaredMethod(m1("sebbu~dQsdyfydiDxbuqt"), new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField(m1("}Xyttu~Q`yGqb~y~wCxg~"));
                declaredField.setAccessible(true);
                declaredField.setBoolean(invoke, true);
            } catch (Throwable th2) {
            }
        }
    }

```

**(.appkey)**
```bash
126f4673b551a692
```
The [StubApp.java](https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/blob/master/files/StubApp.java) and [AndroidManifest.xml](https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/blob/master/files/AndroidManifest.xml) bundled with the *com.proxgrind.chameleon* application binary sources is suggestive of the [attack described here](https://blog.zimperium.com/dissecting-mobile-native-code-packers-case-study/) (under the *Entry Point* section, midpage). 

The next listing of undocumented USB devices authorized by the application is also concerning, though I have been unable corroborate any malfeasance by the hardware manufacturer using these covert device profiles:

**(/res/xml/device_filter.xml)**
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources xmlns:android="http://schemas.android.com/apk/res/android" xmlns:app="http://schemas.android.com/apk/res-auto" xmlns:aapt="http://schemas.android.com/aapt">
    <usb-device product-id="24577" vendor-id="1027"/>
    <usb-device product-id="24597" vendor-id="1027"/>
    <usb-device vendor-id="9025"/>
    <usb-device product-id="1155" vendor-id="5824"/>
    <usb-device product-id="60000" vendor-id="4292"/>
    <usb-device product-id="8963" vendor-id="1659"/>
    <usb-device product-id="29987" vendor-id="6790"/>
</resources>
```

The actual Bluetooth firmware embedded into the application at ``/res/raw/ota_app_enc.zip`` is [archived here](https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/blob/master/files/ota_app_enc.zip).

