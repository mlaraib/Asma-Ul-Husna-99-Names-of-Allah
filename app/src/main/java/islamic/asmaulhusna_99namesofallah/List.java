package islamic.asmaulhusna_99namesofallah;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class List extends Activity {
    String[] Meanings;
    ImageView NameImage;
    String[] Names;
    ListViewAdapter adapter;
    String[] allData;
    //InterstitialAd interstitial;
    ListView list;
    TextView meaning;
    TextView name;
    int[] nameId;


//    class C04841 extends AdListener {
//        C04841() {
//        }
//
//        public void onAdLoaded() {
//            if (List.this.interstitial.isLoaded()) {
//                List.this.interstitial.show();
//            }
//        }
//    }

    public List() {
        this.Names = new String[99];
        this.Meanings = new String[99];
        this.nameId = new int[]{R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20, R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27, R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40, R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48, R.drawable.a49, R.drawable.a50, R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55, R.drawable.a56, R.drawable.a57, R.drawable.a58, R.drawable.a59, R.drawable.a60, R.drawable.a61, R.drawable.a62, R.drawable.a63, R.drawable.a64, R.drawable.a65, R.drawable.a66, R.drawable.a67, R.drawable.a68, R.drawable.a69, R.drawable.a70, R.drawable.a71, R.drawable.a72, R.drawable.a73, R.drawable.a74, R.drawable.a75, R.drawable.a76, R.drawable.a77, R.drawable.a78, R.drawable.a79, R.drawable.a80, R.drawable.a81, R.drawable.a82, R.drawable.a83, R.drawable.a84, R.drawable.a85, R.drawable.a86, R.drawable.a87, R.drawable.a88, R.drawable.a89, R.drawable.a90, R.drawable.a91, R.drawable.a92, R.drawable.a93, R.drawable.a94, R.drawable.a95, R.drawable.a96, R.drawable.a97, R.drawable.a98};
        this.allData = new String[]{"Allah", "The Greatest Name", "Ar-Rahman", "The All-Compassionate", "Ar-Rahim", "The All-Merciful", "Al-Malik", "The Absolute Ruler", "Al-Quddus", "The Pure One", "As-Salam", "The Source of Peace", "Al-Mu'min", "The Inspirer of Faith", "Al-Muhaymin", "The Guardian", "Al-'Aziz", "The Victorious", "Al-Jabbar", "The Compeller", "Al-Mutakabbir", "The Greatest", "Al-Khaliq", "The Creator", "Al-Bari'", "The Maker of Order", "Al-Musawwir", "The Shaper of Beauty", "Al-Ghaffar", "The Forgiving", "Al-Qahhar", "The Subduer", "Al-Wahhab", "The Giver of All", "Ar-Razzaq", "The Sustainer", "Al-Fattah", "The Opener", "Al-'Alim", "The Knower of All", "Al-Qabid", "The Constrictor", "Al-Basit", "The Reliever", "Al-Khafid", "The Abaser", "Ar-Rafi'", "The Exalter", "Al-Mu'izz", "The Bestower of Honors", "Al-Mudhill", "The Humiliator", "As-Sami", "The Hearer of All", "Al-Basir", "The Seer of All", "Al-Hakam", "The Judge", "Al-'Adl", "The Just", "Al-Latif", "The Subtle One", "Al-Khabir", "The All-Aware", "Al-Halim", "The Forebearing", "Al-'Azim", "The Magnificent", "Al-Ghafur", "The Forgiver and Hider of Faults", "Ash-Shakur", "The Rewarder of Thankfulness", "Al-'Ali", "The Highest", "Al-Kabir", "The Greatest", "Al-Hafiz", "The Preserver", "Al-Muqit", "The Nourisher", "Al-Hasib", "The Accounter", "Al-Jalil", "The Mighty", "Al-Karim", "The Generous", "Ar-Raqib", "The Watchful One", "Al-Mujib", "The Responder to Prayer", "Al-Wasi'", "The All-Comprehending", "Al-Hakim", "The Perfectly Wise", "Al-Wadud", "The Loving One", "Al-Majeed", "The Majestic One", "Al-Ba'ith", "The Resurrector", "Ash-Shahid", "The Witness", "Al-Haqq", "The Truth", "Al-Wakil", "The Trustee", "Al-Qawi", "The Possessor of All Strength", "Al-Matin", "The Forceful One", "Al-Wali", "The Governor", "Al-Hamid", "The Praised One", "Al-Muhsi", "The Appraiser", "Al-Mubdi", "The Originator", "Al-Mu'id", "The Restorer", "Al-Muhyi", "The Giver of Life", "Al-Mumit", "The Taker of Life", "Al-Hayy", "The Ever Living One", "Al-Qayyum", "The Self-Existing One", "Al-Wajid", "The Finder", "Al-Majid", "The Glorious", "Al-Wahid", "The Only One", "As-Samad", "The Satisfier of All Needs", "Al-Qadir", "The All Powerful", "Al-Muqtadir", "The Creator of All Power", "Al-Muqaddim", "The Expediter", "Al-Mu'akhkhir", "The Delayer", "Al-Awwal", "The First", "Al-Akhir", "The Last", "Az-Zahir", "The Manifest One", "Al-Batin", "The Hidden One", "Al-Wali", "The Protecting Friend", "Al-Muta'ali", "The Supreme One", "Al-Barr", "The Doer of Good", "At-Tawwib", "The Guide to Repentance", "Al-Muntaqim", "The Avenger", "Al-Afu", "The Forgiver", "Ar-Ra'uf", "The Clement", "Malik al-Mulk", "The Owner of All", "Dhul-Jalali Wal-Ikram", "The Lord of Majesty and Bounty", "Al-Muqsit", "The Equitable One", "Al-Jami", "The Gatherer", "Al-Ghani", "The Rich One", "Al-Mughni", "The Enricher", "Al-Mani'", "The Preventer of Harm", "Ad-Darr", "The Creator of The Harmful", "An-Nafi", "The Creator of Good", "An-Nur", "The Light", "Al-Hadi", "The Guide", "Al-Badi", "The Originator", "Al-Baqi", "The Everlasting One", "Al-Warith", "The Inheritor of All", "Ar-Rashid", "The Righteous Teacher", "As-Sabur", "The Patient One"};
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(R.layout.activity_list);
        this.name = (TextView) findViewById(R.id.tvName);
        this.meaning = (TextView) findViewById(R.id.tvMeaning);
        this.NameImage = (ImageView) findViewById(R.id.ivName);
//        AdRequest adRequest = new Builder().build();
//        this.interstitial = new InterstitialAd(this);
//        this.interstitial.setAdUnitId("ca-app-pub-6019481068930174/5257522240");
//        this.interstitial.loadAd(adRequest);
//        this.interstitial.setAdListener(new C04841());
        int j = 0;
        for (int i = 0; i < 198; i += 2) {
            this.Names[j] = this.allData[i];
            this.Meanings[j] = this.allData[i + 1];
            j++;
        }
        this.list = (ListView) findViewById(R.id.ListView);
        this.adapter = new ListViewAdapter(this, this.Names, this.Meanings);
        this.list.setAdapter(this.adapter);
    }
}

