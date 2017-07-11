package islamic.asmaulhusna_99namesofallah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class List extends Activity {
   // String[] Meanings;
    ImageView NameImage;
    //String[] Names;
    ListViewAdapter adapter;
    //String[] allData;
    //InterstitialAd interstitial;
    ListView list;
    TextView meaning;
    TextView name;
    //int[] nameId;


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
        //this.Names = new String[99];
        //this.Meanings = new String[99];
        //this.nameId = new int[]{R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20, R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27, R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40, R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48, R.drawable.a49, R.drawable.a50, R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55, R.drawable.a56, R.drawable.a57, R.drawable.a58, R.drawable.a59, R.drawable.a60, R.drawable.a61, R.drawable.a62, R.drawable.a63, R.drawable.a64, R.drawable.a65, R.drawable.a66, R.drawable.a67, R.drawable.a68, R.drawable.a69, R.drawable.a70, R.drawable.a71, R.drawable.a72, R.drawable.a73, R.drawable.a74, R.drawable.a75, R.drawable.a76, R.drawable.a77, R.drawable.a78, R.drawable.a79, R.drawable.a80, R.drawable.a81, R.drawable.a82, R.drawable.a83, R.drawable.a84, R.drawable.a85, R.drawable.a86, R.drawable.a87, R.drawable.a88, R.drawable.a89, R.drawable.a90, R.drawable.a91, R.drawable.a92, R.drawable.a93, R.drawable.a94, R.drawable.a95, R.drawable.a96, R.drawable.a97, R.drawable.a98};
        //this.allData = new String[]{

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(R.layout.activity_list);
        //name = (TextView) findViewById(R.id.tvName);
        //meaning = (TextView) findViewById(R.id.tvMeaning);
        //NameImage = (ImageView) findViewById(R.id.ivName);

        /*int j = 0;
        for (int i = 0; i < 198; i += 2) {
            this.Names[j] = this.allData[i];
            this.Meanings[j] = this.allData[i + 1];
            j++;
        }*/

        this.list = (ListView) findViewById(R.id.ListView);
        this.adapter = new ListViewAdapter(getApplicationContext());
        this.list.setAdapter(this.adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.e("Position", String.valueOf(i));
                Intent intent = new Intent(List.this, ListData.class);
                intent.putExtra("Position", i);
                startActivity(intent);
            }
        });
    }
}

