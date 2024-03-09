package org.example;

public class MaasPrimHesaplama {

	static int maasPrimHesaplama(int calisilanGun) {
		int gunlukMaas = 200;
		int gunlukPrim = 1000;
		int hakEdilenPrim;
		int maasPrimToplam;

		int maas = calisilanGun * gunlukMaas;
		if (calisilanGun > 25) {
			hakEdilenPrim = (calisilanGun - 25) * gunlukPrim;

		} else {
			hakEdilenPrim = 0;

		}
		maasPrimToplam = maas + hakEdilenPrim;

		return maasPrimToplam;

	}

	static int primHesaplama(int calisilanGun) {

		int gunlukPrim = 1000;
		int hakEdilenPrim;

		if (calisilanGun > 25) {
			hakEdilenPrim = (calisilanGun - 25) * gunlukPrim;

		} else {
			hakEdilenPrim = 0;

		}
		return hakEdilenPrim;

	}

}
