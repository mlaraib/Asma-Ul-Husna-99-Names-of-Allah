package islamic.asmaulhusna_99namesofallah;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.PowerManager;

public class Start extends Activity {
    TextView Name;
    String[] allData;
    MediaPlayer audio;
    int currentTime;
    Handler handler;
    int f48i;
    int f49j;
    protected PowerManager.WakeLock mWakeLock;
    TextView meaning;
    int[] nameId;
    ImageView picture;
    int pivotX;
    boolean stop;
    TextView time;
    int[] timeDelay;

    /* renamed from: satsumadroid.asmaulhusna.allahnames.Start.1 */
    class C02331 implements Runnable {
        C02331() {
        }

        public void run() {
            if (!Start.this.stop) {
                if (Start.this.audio.getDuration() >= Start.this.audio.getCurrentPosition()) {
                    Start.this.currentTime = Start.this.audio.getCurrentPosition();
                    if (Start.this.audio.getCurrentPosition() >= Start.this.timeDelay[99]) {
                        Start.this.picture.setBackgroundResource(Start.this.nameId[98]);
                        Start.this.Name.setText(Start.this.allData[196]);
                        Start.this.meaning.setText(Start.this.allData[197]);
                    } else {
                        if (Start.this.picture.getLayoutParams().height < 550) {
                            Start.this.time.setText(Integer.toString(Start.this.picture.getLayoutParams().height));
                            Start.this.picture.getLayoutParams().height += 50;
                            Start.this.picture.getLayoutParams().width += 50;
                        }
                        changeImage(Start.this.currentTime);
                    }
                    Start.this.handler.postDelayed(this, 0);
                    return;
                }
                Start.this.startActivity(new Intent(Start.this, MainActivity.class));
            }
        }

        private void changeImage(int currentTime) {
            if (Start.this.f49j >= 99) {
                return;
            }
            if (currentTime < Start.this.timeDelay[Start.this.f49j + 1]) {
                if (Start.this.f49j == 98) {
                    //Toast.makeText(Start.this.getApplicationContext(), Start.this.allData[Start.this.f48i], 0).show();
                }
                Start.this.picture.setBackgroundResource(Start.this.nameId[Start.this.f49j]);
                Start.this.Name.setText(Start.this.allData[Start.this.f48i]);
                Start.this.meaning.setText(Start.this.allData[Start.this.f48i + 1]);
                return;
            }
            Start.this.picture.getLayoutParams().height = 0;
            Start.this.picture.getLayoutParams().width = 0;
            Start start = Start.this;
            start.f49j++;
            start = Start.this;
            start.f48i += 2;
        }
    }

    /* renamed from: satsumadroid.asmaulhusna.allahnames.Start.2 */
    class C02342 implements OnClickListener {
        C02342() {
        }

        public void onClick(View v) {
            Start.this.audio.seekTo(Start.this.audio.getCurrentPosition() + 20000);
        }
    }

    /* renamed from: satsumadroid.asmaulhusna.allahnames.Start.3 */
    class C02353 implements OnClickListener {
        private final /* synthetic */ Runnable val$checkTime;

        C02353(Runnable runnable) {
            this.val$checkTime = runnable;
        }

        public void onClick(View arg0) {
            if (Start.this.audio.isPlaying()) {
                Start.this.audio.pause();
                return;
            }
            Start.this.audio.start();
            Start.this.handler.postDelayed(this.val$checkTime, 0);
        }
    }

    public Start() {
        this.pivotX = 50;
        this.f49j = 0;
        this.timeDelay = new int[100];
        this.nameId = new int[]{R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20, R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27, R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40, R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48, R.drawable.a49, R.drawable.a50, R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55, R.drawable.a56, R.drawable.a57, R.drawable.a58, R.drawable.a59, R.drawable.a60, R.drawable.a61, R.drawable.a62, R.drawable.a63, R.drawable.a64, R.drawable.a65, R.drawable.a66, R.drawable.a67, R.drawable.a68, R.drawable.a69, R.drawable.a70, R.drawable.a71, R.drawable.a72, R.drawable.a73, R.drawable.a74, R.drawable.a75, R.drawable.a76, R.drawable.a77, R.drawable.a78, R.drawable.a79, R.drawable.a80, R.drawable.a81, R.drawable.a82, R.drawable.a83, R.drawable.a84, R.drawable.a85, R.drawable.a86, R.drawable.a87, R.drawable.a88, R.drawable.a89, R.drawable.a90, R.drawable.a91, R.drawable.a92, R.drawable.a93, R.drawable.a94, R.drawable.a95, R.drawable.a96, R.drawable.a97, R.drawable.a98};
        this.currentTime = 0;
        this.allData = new String[]{
                "Allah", "The Greatest Name",
                "Ar-Rahman", "The All-Compassionate",
                "Ar-Raheem", "The All-Merciful",
                "Al-Malik", "The Absolute Ruler",
                "Al-Quddus", "The Pure One",
                "As-Salam", "The Source of Peace",
                "Al-Mu'min", "The Inspirer of Faith",
                "Al-Muhaymin", "The Guardian",
                "Al-'Aziz", "The Victorious",
                "Al-Jabbar", "The Compeller",
                "Al-Mutakabbir", "The Greatest",
                "Al-Khaaliq", "The Creator",
                "Al-Baari'", "The Maker of Order",
                "Al-Musawwir", "The Shaper of Beauty",
                "Al-Ghaffar", "The Forgiving",
                "Al-Qahhaar", "The Subduer",
                "Al-Wahhaab", "The Giver of All",
                "Ar-Razzaaq", "The Sustainer",
                "Al-Fattaah", "The Opener",
                "Al-'Alim", "The Knower of All",
                "Al-Qaabid", "The Constrictor",
                "Al-Basit", "The Reliever",
                "Al-Khaafid", "The Abaser",
                "Ar-Raafi'", "The Exalter",
                "Al-Mu'izz", "The Bestower of Honors",
                "Al-Muzil", "The Humiliator",
                "As-Sami", "The Hearer of All",
                "Al-Basir", "The Seer of All",
                "Al-Hakam", "The Judge",
                "Al-'Adl", "The Just",
                "Al-Latif", "The Subtle One",
                "Al-Khabir", "The All-Aware",
                "Al-Halim", "The Forebearing",
                "Al-'Azim", "The Magnificent",
                "Al-Ghafur", "The Forgiver and Hider of Faults",
                "Ash-Shakur", "The Rewarder of Thankfulness",
                "Al-'Ali", "The Highest",
                "Al-Kabir", "The Greatest",
                "Al-Hafiz", "The Preserver",
                "Al-Muqit", "The Nourisher",
                "Al-Hasib", "The Accounter",
                "Al-Jalil", "The Mighty",
                "Al-Karim", "The Generous",
                "Ar-Raqib", "The Watchful One",
                "Al-Mujib", "The Responder to Prayer",
                "Al-Wasi'", "The All-Comprehending",
                "Al-Hakim", "The Perfectly Wise",
                "Al-Wadud", "The Loving One",
                "Al-Majeed", "The Majestic One",
                "Al-Baa'ith", "The Resurrector",
                "Ash-Shahid", "The Witness",
                "Al-Haqq", "The Truth",
                "Al-Wakil", "The Trustee",
                "Al-Qawiyy", "The Possessor of All Strength",
                "Al-Matin", "The Forceful One",
                "Al-Wali", "The Governor",
                "Al-Hamid", "The Praised One",
                "Al-Muhsi", "The Appraiser",
                "Al-Mubdi", "The Originator",
                "Al-Mu'id", "The Restorer",
                "Al-Muhyi", "The Giver of Life",
                "Al-Mumit", "The Taker of Life",
                "Al-Hayy", "The Ever Living One",
                "Al-Qayyum", "The Self-Existing One",
                "Al-Waajid", "The Finder",
                "Al-Maajid", "The Glorious",
                "Al-Waahid", "The Only One",
                "As-Samad", "The Satisfier of All Needs",
                "Al-Qadir", "The All Powerful",
                "Al-Muqtadir", "The Creator of All Power",
                "Al-Muqaddim", "The Expediter",
                "Al-Mu'akhkhir", "The Delayer",
                "Al-Awwal", "The First",
                "Al-Akhir", "The Last",
                "Az-Zahir", "The Manifest One",
                "Al-Batin", "The Hidden One",
                "Al-Wali", "The Protecting Friend",
                "Al-Muta'ali", "The Supreme One",
                "Al-Barr", "The Doer of Good",
                "At-Tawwaab", "The Guide to Repentance",
                "Al-Muntaqim", "The Avenger",
                "Al-Afuww", "The Forgiver",
                "Ar-Ra'uf", "The Clement",
                "Malik al-Mulk", "The Owner of All",
                "Dhu al Jalal wa al Ikram", "The Lord of Majesty and Bounty",
                "Al-Muqsit", "The Equitable One",
                "Al-Jami", "The Gatherer",
                "Al-Ghani", "The Rich One",
                "Al-Mughni", "The Enricher",
                "Al-Mani'", "The Preventer of Harm",
                "Ad-Darr", "The Creator of The Harmful",
                "An-Nafi", "The Creator of Good",
                "An-Nur", "The Light",
                "Al-Hadi", "The Guide",
                "Al-Badi", "The Originator",
                "Al-Baaqi", "The Everlasting One",
                "Al-Waarith", "The Inheritor of All",
                "Ar-Rashid", "The Righteous Teacher",
                "As-Sabur", "The Patient One"};
        this.f48i = 0;
        this.stop = false;
    }

    public void onBackPressed() {
        this.audio.stop();
        Start.this.finish();
        super.onBackPressed();
    }

    protected void onDestroy() {

//        this.mWakeLock.release();
        this.stop = true;
        if (this.audio.isPlaying()) {
            System.out.println("SUCCESS");
            this.audio.pause();
            this.audio.stop();
        }
        this.audio.release();
        System.out.println("SUCCESS");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Resume", "resume");
        audio.start();


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Pause", "Pause");
        audio.pause();

    }

    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(1);
        //getWindow().setFlags(1024, 1024);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        //getWindow().addFlags(128);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.audio = MediaPlayer.create(this, R.raw.audio);
        this.audio.getCurrentPosition();
        this.audio.start();


        this.timeDelay[0] = 0;
        this.timeDelay[1] = 11040;
        this.timeDelay[2] = 13040;
        this.timeDelay[3] = 14200;
        this.timeDelay[4] = 16170;
        this.timeDelay[5] = 18000;
        this.timeDelay[6] = 19250;
        this.timeDelay[7] = 20900;
        this.timeDelay[8] = 22150;
        this.timeDelay[9] = 24090;
        this.timeDelay[10] = 25020;
        this.timeDelay[11] = 28000;
        this.timeDelay[12] = 29200;
        this.timeDelay[13] = 31150;
        this.timeDelay[14] = 33050;
        this.timeDelay[15] = 34900;
        this.timeDelay[16] = 36220;
        this.timeDelay[17] = 38050;
        this.timeDelay[18] = 39200;
        this.timeDelay[19] = 41150;
        this.timeDelay[20] = 43090;
        this.timeDelay[21] = 44190;
        this.timeDelay[22] = 46200;
        this.timeDelay[23] = 48000;
        this.timeDelay[24] = 50000;
        this.timeDelay[25] = 51000;
        this.timeDelay[26] = 52000;
        this.timeDelay[27] = 54000;
        this.timeDelay[28] = 55140;
        this.timeDelay[29] = 56550;
        this.timeDelay[30] = 57670;
        this.timeDelay[31] = 59100;
        this.timeDelay[32] = 60740;
        this.timeDelay[33] = 61900;
        this.timeDelay[34] = 63100;
        this.timeDelay[35] = 64100;
        this.timeDelay[36] = 65100;
        this.timeDelay[37] = 67000;
        this.timeDelay[38] = 68130;
        this.timeDelay[39] = 70000;
        this.timeDelay[40] = 71010;
        this.timeDelay[41] = 72130;
        this.timeDelay[42] = 73150;
        this.timeDelay[43] = 75040;
        this.timeDelay[44] = 76200;
        this.timeDelay[45] = 78090;
        this.timeDelay[46] = 79170;
        this.timeDelay[47] = 81060;
        this.timeDelay[48] = 82100;
        this.timeDelay[49] = 83200;
        this.timeDelay[50] = 84350;
        this.timeDelay[51] = 87040;
        this.timeDelay[52] = 88050;
        this.timeDelay[53] = 89150;
        this.timeDelay[54] = 91000;
        this.timeDelay[55] = 92140;
        this.timeDelay[56] = 93280;
        this.timeDelay[57] = 95000;
        this.timeDelay[58] = 96100;
        this.timeDelay[59] = 97220;
        this.timeDelay[60] = 98250;
        this.timeDelay[61] = 99040;
        this.timeDelay[62] = 100500;
        this.timeDelay[63] = 101170;
        this.timeDelay[63] = 102160;
        this.timeDelay[64] = 104040;
        this.timeDelay[65] = 105240;
        this.timeDelay[66] = 107140;
        this.timeDelay[67] = 109030;
        this.timeDelay[68] = 110150;
        this.timeDelay[69] = 111240;
        this.timeDelay[70] = 113130;
        this.timeDelay[71] = 115000;
        this.timeDelay[72] = 116060;
        this.timeDelay[73] = 117100;
        this.timeDelay[74] = 118270;
        this.timeDelay[75] = 120160;
        this.timeDelay[76] = 121960;
        this.timeDelay[77] = 123160;
        this.timeDelay[78] = 124120;
        this.timeDelay[79] = 125020;
        this.timeDelay[80] = 127130;
        this.timeDelay[81] = 129000;
        this.timeDelay[82] = 130140;
        this.timeDelay[83] = 131500;
        this.timeDelay[84] = 133240;
        this.timeDelay[85] = 137210;
        this.timeDelay[86] = 138110;
        this.timeDelay[87] = 140100;
        this.timeDelay[88] = 141910;
        this.timeDelay[89] = 143010;
        this.timeDelay[90] = 144810;
        this.timeDelay[91] = 149010;
        this.timeDelay[92] = 150330;
        this.timeDelay[93] = 151220;
        this.timeDelay[94] = 153120;
        this.timeDelay[95] = 154580;
        this.timeDelay[96] = 156000;
        this.timeDelay[97] = 157608;
        this.timeDelay[98] = 158908;
        this.timeDelay[99] = 159030;
        this.picture = (ImageView) findViewById(R.id.picture);
        this.Name = (TextView) findViewById(R.id.Name);
        this.meaning = (TextView) findViewById(R.id.Meaning);
        this.time = (TextView) findViewById(R.id.time);
        this.time.setVisibility(View.GONE);
        //this.Name.setTextColor(-1);
        this.Name.setTextSize(20.0f);
        //this.meaning.setTextColor(-1);
        this.meaning.setTextSize(16.0f);
        this.Name.setText("Allah");
        this.meaning.setText("The Greatest Name");

        this.handler = new Handler();
        Runnable checkTime = new C02331();
        this.Name.setOnClickListener(new C02342());
        this.picture.setOnClickListener(new C02353(checkTime));
        this.handler.postDelayed(checkTime, 0);
//        final PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
//        this.mWakeLock = pm.newWakeLock(PowerManager.SCREEN_DIM_WAKE_LOCK, "My Tag");
//        this.mWakeLock.acquire();


        audio.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                startActivity(new Intent(Start.this, MainActivity.class));
                Start.this.finish();

            }
        });
    }

}

