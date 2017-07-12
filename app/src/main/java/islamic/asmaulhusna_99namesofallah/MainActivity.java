package islamic.asmaulhusna_99namesofallah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

public class MainActivity extends AppCompatActivity {

    ImageView iv1, iv2;

    public static String names[] = {"Ar-Rahman", "Ar-Raheem", "Al-Malik", "Al-Quddus", "As-Salam", "Al-Mu min", "Al-Muhaymin", "Al-Aziz", "Al-Jabbar", "Al-Mutakabbir", "Al-Khaaliq", "Al-Baari", "Al-Musawwir", "Al-Ghaffar", "Al-Qahhaar", "Al-Wahhaab", "Ar-Razzaaq", "Al-Fattaah", "Al- Alim", "Al-Qaabid", "Al-Basit", "Al-Khaafid",
            "Ar-Raafi", "Al-Mu izz", "Al-Muzil", "As-Sami", "Al-Basir", "Al-Hakam", "Al-Adl", "Al-Latif", "Al-Khabir", "Al-Halim", "Al- Azim", "Al-Ghafur", "Ash-Shakur", "Al- Ali", "Al-Kabir", "Al-Hafiz", "Al-Muqit", "Al-Hasib", "Al-Jalil", "Al-Karim", "Ar-Raqib", "Al-Mujib",
            "Al-Wasi", "Al-Hakim", "Al-Wadud", "Al-Majeed", "Al-Baa ith", "Ash-Shahid", "Al-Haqq", "Al-Wakil", "Al-Qawiyy", "Al-Matin", "Al-Wali", "Al-Hamid", "Al-Muhsi", "Al-Mubdi", "Al-Mu id", "Al-Muhyi", "Al-Mumit", "Al-Hayy", "Al-Qayyum", "Al-Waajid", "Al-Maajid", "Al-Waahid",
            "Al-Ahad", "As-Samad", "Al-Qadir", "Al-Muqtadir", "Al-Muqaddim", "Al-Mu akhkhir", "Al-Awwal", "Al-Akhir", "Az-Zahir", "Al-Batin", "Al-Wali", "Al-Muta ali", "Al-Barr", "At-Tawwaab", "Al-Muntaqim", "Al-Afuww", "Ar-Ra uf", "Malik al-Mulk", "Dhu al Jalal wa al Ikram", "Al-Muqsit", "Al-Jami", "Al-Ghani",
            "Al-Mughni", "Al-Mani", "Ad-Darr", "An-Nafi", "An-Nur", "Al-Hadi", "Al-Badi", "Al-Baaqi", "Al-Waarith", "Ar-Rashid", "As-Sabur"};

    public static String meaning[] = {"The Beneficent", "The Merciful", "The Eternal Lord", "The Most Sacred", "The Embodiment of Peace", "The Infuser of Faith",
            "The Preserver of Safety", "The Mighty One", "The Omnipotent One", "The Dominant One", "The Creator", "The Evolver",
            "The Flawless Shaper", "The Great Forgiver", "The All-Prevailing One", "The Supreme Bestower", "The Total Provider", "The Supreme Solver",
            "The All-Knowing One", "The Restricting One", "The Extender", "The Reducer", "The Elevating One", "The Honourer-Bestower",
            "The Abaser", "The All-Hearer", "The All-Seeing", "The Impartial Judge", "The Embodiment of Justice", "The Knower of Subtleties",
            "The All-Aware One", "The Clement One", "The Magnificent One", "The Great Forgiver", "The Acknowledging One", "The Sublime One",
            "The Great One", "The Guarding One", "The Sustaining One", "The Reckoning One", "The Majestic One", "The Bountiful One",
            "The Watchful One", "The Responding One", "The All-Pervading One", "The Wise One", "The Loving One", "The Glorious One",
            "The Infuser of New Life", "The All Observing Witness", "The Embodiment of Truth", "The Universal Trustee", "The Strong One", "The Firm One",
            "The Protecting Associate", "The Sole-Laudable One", "The All-Enumerating One", "The Originator", "The Restorer", "The Maintainer of life",
            "The Inflictor of Death", "The Eternally Living One", "The Self-Subsisting One", "The Pointing One", "The All-Noble One", "The Only One",
            "The Sole One", "The Supreme Provider", "The Omnipotent One", "The All Authoritative One", "The Expediting One", "The Procrastinator",
            "The Very First", "The Infinite Last One", "The Perceptible", "The Imperceptible", "The Holder of Supreme Authority", "The Extremely Exalted One",
            "The Fountain-Head of Truth", "The Ever-Acceptor of Repentance", "The Retaliator", "The Supreme Pardoner", "The Benign One", "The Eternal Possessor of Sovereignty",
            "The Possessor of Majesty and Honour", "The Just One", "The Assembler of Scattered Creations", "The Self-Sufficient One", "The Bestower of Sufficiency",
            "The Preventer", "The Distressor", "The Bestower of Benefits", "The Prime Light", "The Provider of Guidance", "The Unique One",
            "The Ever Surviving One", "The Eternal Inheritor", "The Guide to Path of Rectitude", "The Extensively Enduring One"};

    public static String description[] = {"He who wills goodness and mercy for all His creatures",
            "He who acts with extreme kindness",
            "The Sovereign Lord, The One with the complete Dominion, the One Whose Dominion is clear from imperfection",
            "The One who is pure from any imperfection and clear from children and adversaries",
            "The One who is free from every imperfection.",
            "The One who witnessed for Himself that no one is God but Him. And He witnessed for His believers that they are truthful in their belief that no one is God but Him",
            "The One who witnesses the saying and deeds of His creatures",
            "The Strong, The Defeater who is not defeated",
            "The One that nothing happens in His Dominion except that which He willed",
            "The One who is clear from the attributes of the creatures and from resembling them.",
            "The One who brings everything from non-existence to existence",
            "The Maker, The Creator who has the Power to turn the entities.",
            "The One who forms His creatures in different pictures.",
            "The Forgiver, The One who forgives the sins of His slaves time and time again.",
            "The Dominant, The One who has the perfect Power and is not unable over anything.",
            "The One who is Generous in giving plenty without any return. He is everything that benefits whether Halal or Haram.",
            "The Sustainer, The Provider.", "The Opener, The Reliever, The Judge, The One who opens for His slaves the closed worldly and religious matters.",
            "The Knowledgeable; The One nothing is absent from His knowledge",
            "The Constrictor, The Withholder, The One who constricts the sustenance by His wisdom and expands and widens it with His Generosity and Mercy.",
            "The Englarger, The One who constricts the sustenance by His wisdom and expands and widens it with His Generosity and Mercy.",
            "The Abaser, The One who lowers whoever He willed by His Destruction and raises whoever He willed by His Endowment.",
            "The Exalter, The Elevator, The One who lowers whoever He willed by His Destruction and raises whoever He willed by His Endowment.",
            "He gives esteem to whoever He willed, hence there is no one to degrade Him; And He degrades whoever He willed, hence there is no one to give Him esteem.",
            "The Dishonourer, The Humiliator, He gives esteem to whoever He willed, hence there is no one to degrade Him; And He degrades whoever He willed, hence there is no one to give Him esteem.",
            "The Hearer, The One who Hears all things that are heard by His Eternal Hearing without an ear, instrument or organ.",
            "The All-Noticing, The One who Sees all things that are seen by His Eternal Seeing without a pupil or any other instrument.",
            "The Judge, He is the Ruler and His judgment is His Word.",
            "The Just, The One who is entitled to do what He does.",
            "The Subtle One, The Gracious, The One who is kind to His slaves and endows upon them.",
            "The One who knows the truth of things.The Forebearing",
            "The One who delays the punishment for those who deserve it and then He might forgive them",
            "The Great One, The Mighty, The One deserving the attributes of Exaltment, Glory, Extolement, and Purity from all imperfection.",
            "The All-Forgiving, The Forgiving, The One who forgives a lot.",
            "The Grateful, The Appreciative, The One who gives a lot of reward for a little obedience.",
            "The Most High, The One who is clear from the attributes of the creatures.",
            "The Most Great, The Great, The One who is greater than everything in status.",
            "The Preserver, The Protector, The One who protects whatever and whoever He willed to protect.",
            "The Maintainer, The Guardian, The Feeder, The One who has the Power.",
            "The Reckoner, The One who gives the satisfaction.",
            "The Sublime One, The Beneficent, The One who is attributed with greatness of Power and Glory of status.",
            "The Generous One, The Gracious, The One who is attributed with greatness of Power and Glory of status.",
            "The Watcher, The One that nothing is absent from Him. Hence it’s meaning is related to the attribute of Knowledge.",
            "The Responsive, The Hearkener, The One who answers the one in need if he asks Him and rescues the yearner if he calls upon Him.",
            "The Vast, The All-Embracing, The Knowledgeable.",
            "The Wise, The Judge of Judges, The One who is correct in His doings.",
            "The One who loves His believing slaves and His believing slaves love Him. His love to His slaves is His Will to be merciful to them and praise them",
            "The Most Glorious One, The One who is with perfect Power, High Status, Compassion, Generosity and Kindness.",
            "The Resurrector, The Raiser (from death), The One who resurrects His slaves after death for reward and/or punishment.",
            "The Witness, The One who nothing is absent from Him.", "The Truth, The True, The One who truly exists.",
            "The Trustee, The One who gives the satisfaction and is relied upon.",
            "The Most Strong, The Strong, The One with the complete Power",
            "The One with extreme Power which is un-interrupted and He does not get tired.",
            "The Protecting Friend, The Supporter.",
            "The Praiseworthy, The praised One who deserves to be praised.",
            "The Counter, The Reckoner, The One who the count of things are known to him.",
            "The One who started the human being. That is, He created him.",
            "The Reproducer, The One who brings back the creatures after death",
            "The Restorer, The Giver of Life, The One who took out a living human from semen that does not have a soul. He gives life by giving the souls back to the worn out bodies on the resurrection day and He makes the hearts alive by the light of knowledge.",
            "The Creator of Death, The Destroyer, The One who renders the living dead.",
            "The Alive, The One attributed with a life that is unlike our life and is not that of a combination of soul, flesh or blood.",
            "The One who remains and does not end.",
            "The Perceiver, The Finder, The Rich who is never poor. Al-Wajd is Richness.",
            "The Glorious, He who is Most Glorious.",
            "The Unique, The One, The One without a partner",
            "The One",
            "The Eternal, The Independent, The Master who is relied upon in matters and reverted to in ones needs.",
            "The Able, The Capable, The One attributed with Power.",
            "The Powerful, The Dominant, The One with the perfect Power that nothing is withheld from Him.",
            "The Expediter, The Promoter, The One who puts things in their right places. He makes ahead what He wills and delays what He wills.",
            "The Delayer, the Retarder, The One who puts things in their right places. He makes ahead what He wills and delays what He wills.",
            "The First, The One whose Existence is without a beginning.",
            "The Last, The One whose Existence is without an end.",
            "The Manifest, The One that nothing is above Him and nothing is underneath Him, hence He exists without a place. He, The Exalted, His Existence is obvious by proofs and He is clear from the delusions of attributes of bodies.",
            "The Hidden, The One that nothing is above Him and nothing is underneath Him, hence He exists without a place. He, The Exalted, His Existence is obvious by proofs and He is clear from the delusions of attributes of bodies.",
            "The Governor, The One who owns things and manages them.",
            "The Most Exalted, The High Exalted, The One who is clear from the attributes of the creation.",
            "The Source of All Goodness, The Righteous, The One who is kind to His creatures, who covered them with His sustenance and specified whoever He willed among them by His support, protection, and special mercy.",
            "The Relenting, The One who grants repentance to whoever He willed among His creatures and accepts his repentance.",
            "The Avenger, The One who victoriously prevails over His enemies and punishes them for their sins. It may mean the One who destroys them.",
            "The Forgiver, The One with wide forgiveness.",
            "The Compassionate, The One with extreme Mercy. The Mercy of Allah is His will to endow upon whoever He willed among His creatures.",
            "The One who controls the Dominion and gives dominion to whoever He willed.",
            "The Lord of Majesty and Bounty, The One who deserves to be Exalted and not denied.",
            "The Equitable, The One who is Just in His judgment.",
            "The Gatherer, The One who gathers the creatures on a day that there is no doubt about, that is the Day of Judgment.",
            "The One who does not need the creation.",
            "The Enricher, The One who satisfies the necessities of the creatures.",
            "The Withholder.",
            "The One who makes harm reach to whoever He willed and benefit to whoever He willed.",
            "The Propitious, The One who makes harm reach to whoever He willed and benefit to whoever He willed.",
            "The Light, The One who guides.",
            "The Guide, The One whom with His Guidance His believers were guided, and with His Guidance the living beings have been guided to what is beneficial for them and protected from what is harmful to them.",
            "The Incomparable, The One who created the creation and formed it without any preceding example.",
            "The Everlasting, The One that the state of non-existence is impossible for Him.",
            "The Heir, The One whose Existence remains.",
            "The Guide to the Right Path, The One who guides.",
            "The Patient, The One who does not quickly punish the sinners."};

    public static int imagesSmall[] = {R.drawable.thumba1, R.drawable.thumba2, R.drawable.thumba3, R.drawable.thumba4, R.drawable.thumba5, R.drawable.thumba6, R.drawable.thumba7, R.drawable.thumba8, R.drawable.thumba9, R.drawable.thumba10, R.drawable.thumba11, R.drawable.thumba12, R.drawable.thumba13, R.drawable.thumba14, R.drawable.thumba15, R.drawable.thumba16, R.drawable.thumba17, R.drawable.thumba18, R.drawable.thumba19, R.drawable.thumba20, R.drawable.thumba21, R.drawable.thumba22, R.drawable.thumba23, R.drawable.thumba24, R.drawable.thumba25, R.drawable.thumba26, R.drawable.thumba27, R.drawable.thumba28, R.drawable.thumba29, R.drawable.thumba30, R.drawable.thumba31, R.drawable.thumba32, R.drawable.thumba33, R.drawable.thumba34, R.drawable.thumba35, R.drawable.thumba36, R.drawable.thumba37, R.drawable.thumba38, R.drawable.thumba39, R.drawable.thumba40, R.drawable.thumba41, R.drawable.thumba42, R.drawable.thumba43, R.drawable.thumba44, R.drawable.thumba45, R.drawable.thumba46, R.drawable.thumba47, R.drawable.thumba48, R.drawable.thumba49, R.drawable.thumba50, R.drawable.thumba51, R.drawable.thumba52, R.drawable.thumba53, R.drawable.thumba54, R.drawable.thumba55, R.drawable.thumba56, R.drawable.thumba57, R.drawable.thumba58, R.drawable.thumba59, R.drawable.thumba60, R.drawable.thumba61, R.drawable.thumba62, R.drawable.thumba63, R.drawable.thumba64, R.drawable.thumba65, R.drawable.thumba66, R.drawable.thumba67, R.drawable.thumba68, R.drawable.thumba69, R.drawable.thumba70, R.drawable.thumba71, R.drawable.thumba72, R.drawable.thumba73, R.drawable.thumba74, R.drawable.thumba75, R.drawable.thumba76, R.drawable.thumba77, R.drawable.thumba78, R.drawable.thumba79, R.drawable.thumba80, R.drawable.thumba81, R.drawable.thumba82, R.drawable.thumba83, R.drawable.thumba84, R.drawable.thumba85, R.drawable.thumba86, R.drawable.thumba87, R.drawable.thumba88, R.drawable.thumba89, R.drawable.thumba90, R.drawable.thumba91, R.drawable.thumba92, R.drawable.thumba93, R.drawable.thumba94, R.drawable.thumba95, R.drawable.thumba96, R.drawable.thumba97, R.drawable.thumba98, R.drawable.thumba99};
    public static int imageLarge[] = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20, R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27, R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40, R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48, R.drawable.a49, R.drawable.a50, R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55, R.drawable.a56, R.drawable.a57, R.drawable.a58, R.drawable.a59, R.drawable.a60, R.drawable.a61, R.drawable.a62, R.drawable.a63, R.drawable.a64, R.drawable.a65, R.drawable.a66, R.drawable.a67, R.drawable.a68, R.drawable.a69, R.drawable.a70, R.drawable.a71, R.drawable.a72, R.drawable.a73, R.drawable.a74, R.drawable.a75, R.drawable.a76, R.drawable.a77, R.drawable.a78, R.drawable.a79, R.drawable.a80, R.drawable.a81, R.drawable.a82, R.drawable.a83, R.drawable.a84, R.drawable.a85, R.drawable.a86, R.drawable.a87, R.drawable.a88, R.drawable.a89, R.drawable.a90, R.drawable.a91, R.drawable.a92, R.drawable.a93, R.drawable.a94, R.drawable.a95, R.drawable.a96, R.drawable.a97, R.drawable.a98, R.drawable.a99};

    public static Ads ads;
    public static GoogleAnalytics analytics;
    public static Tracker tracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ads = new Ads(this, true, true, false);

        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window statusBar = getWindow();
            statusBar.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            statusBar.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            statusBar.setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));
            statusBar.setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
        setContentView(R.layout.activity_main);

        RelativeLayout adViewContainer = (RelativeLayout) findViewById(R.id.adViewCon);

        ads.loadInterstitial();
        ads.loadBanner(adViewContainer);

        analytics = GoogleAnalytics.getInstance(this);
        analytics.setLocalDispatchPeriod(10);
        tracker = analytics.newTracker(getResources().getString(R.string.analytics_id));
        tracker.enableAutoActivityTracking(true);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        iv1 = (ImageView) findViewById(R.id.buttonAllNames);
        iv2 = (ImageView) findViewById(R.id.buttonList);

        Log.e("Name", String.valueOf(names.length));
        Log.e("Meaning", String.valueOf(meaning.length));
        Log.e("Description", String.valueOf(description.length));
        Log.e("Images Small", String.valueOf(imagesSmall.length));
        Log.e("Image Large", String.valueOf(imageLarge.length));

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Start.class));
                ads.showInterstitial(false);
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, List.class));
                ads.showInterstitial(false);

            }
        });

        ImageView shareImage = (ImageView) findViewById(R.id.shareImage);
        shareImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String shareBody = "https://play.google.com/store/apps/details?id=";
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.app_name));
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody + getPackageName());
                Log.e("Link", shareBody + getPackageName());
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
                ads.showInterstitial(false);

            }
        });
    }
}
