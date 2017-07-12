package islamic.asmaulhusna_99namesofallah;


import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.RelativeLayout;

import com.facebook.FacebookSdk;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.startapp.android.publish.adsCommon.StartAppSDK;

/**
 * Created by anees on 6/5/2017.
 */

public class Ads {
    Boolean facebook = false, startapp = false, admob = false;
    Context context;

    InterstitialAd interstitialAd;
    com.google.android.gms.ads.InterstitialAd mInterstitialAd;
    com.google.android.gms.ads.AdView adMobBanner;
    AdView fbBanner;

    public Ads(Context context, Boolean admob, Boolean startapp, Boolean facebook) {
        this.context = context;
        this.admob = admob;
        this.startapp = startapp;
        this.facebook = facebook;
        setupSdks(context, admob, startapp, facebook);
    }

    public void setupSdks(Context context, Boolean admob, Boolean startapp, Boolean facebook) {
        if (startapp) {
            StartAppSDK.init((Activity) context, context.getResources().getString(R.string.startApp));
        }
        if (facebook) {


            FacebookSdk.sdkInitialize(context, new FacebookSdk.InitializeCallback() {
                @Override
                public void onInitialized() {
                    Log.d("FacebookSdk", "Initialized");
                }
            });
        }
        if (admob) {
            MobileAds.initialize(context, context.getResources().getString(R.string.admob_appID));
        }

    }


    public void loadInterstitial() {
        interstitialAd = new InterstitialAd(context, context.getResources().getString(R.string.inter_fb));
        mInterstitialAd = new com.google.android.gms.ads.InterstitialAd(context);
        mInterstitialAd.setAdUnitId(context.getResources().getString(R.string.ad_unit_id_interstitial));
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                if (facebook) {
                    interstitialAd.loadAd();
                }
            }

            @Override
            public void onAdFailedToLoad(int i) {
                if (facebook) {
                    interstitialAd.loadAd();
                }
            }
        });
        if (facebook) {
            interstitialAd.loadAd();
            interstitialAd.setAdListener(new InterstitialAdListener() {
                @Override
                public void onInterstitialDisplayed(Ad ad) {

                }

                @Override
                public void onInterstitialDismissed(Ad ad) {

                    if (admob) {
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());

                    }
                }

                @Override
                public void onError(Ad ad, AdError adError) {

                    if (admob) {
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                }

                @Override
                public void onAdLoaded(Ad ad) {

                }

                @Override
                public void onAdClicked(Ad ad) {

                }

                @Override
                public void onLoggingImpression(Ad ad) {

                }
            });
        } else if (admob && !facebook) {
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        }

    }


    public void loadBanner(final RelativeLayout relativeLayout) throws IllegalStateException {
        Log.e("Relative layout 1", String.valueOf(relativeLayout.getChildCount()));
        relativeLayout.removeAllViews();


        adMobBanner = new com.google.android.gms.ads.AdView(context);
        adMobBanner.setAdUnitId(context.getResources().getString(R.string.banner_AdMob));
        adMobBanner.setAdSize(AdSize.SMART_BANNER);
        fbBanner = new AdView(context, context.getResources().getString(R.string.banner_fb), com.facebook.ads.AdSize.BANNER_HEIGHT_50);

        if (facebook) {
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();

            }
            fbBanner.loadAd();
            fbBanner.setAdListener(new com.facebook.ads.AdListener() {

                @Override
                public void onError(Ad ad, AdError adError) {

                    relativeLayout.removeAllViews();
                    Log.e("Relative layout 2", String.valueOf(relativeLayout.getChildCount()));

                    if (admob) {
                        adMobBanner.loadAd(new AdRequest.Builder().build());

                        if (relativeLayout.getChildCount() == 0) {
                            relativeLayout.addView(adMobBanner);
                        } else {
                            relativeLayout.removeAllViews();
                        }

                    }
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    if (relativeLayout != null) {

                        relativeLayout.removeAllViews();
                        Log.e("Relative layout 3", String.valueOf(relativeLayout.getChildCount()));

                    }
                    if (relativeLayout.getChildCount() == 0) {

                        relativeLayout.addView(fbBanner);
                    } else {
                        relativeLayout.removeAllViews();

                    }


                }

                @Override
                public void onAdClicked(Ad ad) {

                }

                @Override
                public void onLoggingImpression(Ad ad) {

                }
            });
        } else if (admob && !facebook) {
            if (relativeLayout != null) {

                relativeLayout.removeAllViews();
                Log.e("Relative layout 4", String.valueOf(relativeLayout.getChildCount()));


            }
            adMobBanner.loadAd(new AdRequest.Builder().build());


            if (relativeLayout.getChildCount() == 0) {
                relativeLayout.addView(adMobBanner);
            } else {
                relativeLayout.removeAllViews();
            }


        }

    }


    public void showInterstitial(boolean backpress) {
        if (backpress) {
            if (facebook) {
                if (interstitialAd != null) {
                    interstitialAd.destroy();
                }
                if (fbBanner != null) {
                    fbBanner.destroy();
                }
            }
            ((Activity) context).finish();

        } else {
            if (facebook) {
                if (interstitialAd.isAdLoaded()) {
                    interstitialAd.show();
                } else if (admob) {
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    }
                }
            } else if (admob && !facebook) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
            }
        }
    }

}

