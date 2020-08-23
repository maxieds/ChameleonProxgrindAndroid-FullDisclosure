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
The officially sanctioned [proxgrind firmware fork](https://github.com/RfidResearchGroup/ChameleonMini) has been known to be rife with [Bluetooth stack related issues](https://github.com/RfidResearchGroup/ChameleonMini/issues/12) from the onset of the first generation of their RevG replacement hardware. There is now another variant known as the [Proxgrind Tiny Professional](http://chameleontiny.com/product/chameleontiny-professional-with-bluetooth/) device that comes with Bluetooth enabled. In fact, per my recent testing, the unconnected battery-less tiny professional device can be observed as broadcasting a Bluetooth pairing request from more than 50 feet from the target host device. These Bluetooth-enabled devices have a default Android controller application listed on the 
[Google Play Store (com.proxgrind.chameleon)](https://play.google.com/store/apps/details?id=com.proxgrind.chameleon) [(store listing screenshot)](https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/blob/master/images/Screenshot_20200823-062601.png). 

## The vulnerability (clear instance of malware), and how it was noticed

[my best attempts at BT (BLE) functionality](https://github.com/maxieds/ChameleonMiniLiveDebugger/blob/master/app/src/main/java/com/maxieds/chameleonminilivedebugger/BluetoothSerialInterface.java)

<img src="https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/blob/master/images/Screenshot_20200823-081808.png" width="225" /><img src="https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/blob/master/images/Screenshot_20200823-081814.png" width="225" /><img src="https://github.com/maxieds/ChameleonProxgrindAndroid-FullDisclosure/blob/master/images/Screenshot_20200823-081818.png" width="225" />

**(DtcLoader.java)**
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
**(.appkey)**
```bash
126f4673b551a692
```

My opinion: proliferation by broken BLE stack and intentional supression of documentation for their devices... 

