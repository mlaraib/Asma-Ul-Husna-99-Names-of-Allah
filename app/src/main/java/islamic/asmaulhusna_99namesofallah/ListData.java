package islamic.asmaulhusna_99namesofallah;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by anees on 7/11/2017.
 */

public class ListData extends AppCompatActivity{

    int pos;
    ImageView image;
    TextView name, meaning, description;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_data);

        image = (ImageView)findViewById(R.id.imageShow);
        name = (TextView)findViewById(R.id.textName);
        meaning = (TextView)findViewById(R.id.textMeaning);
        description = (TextView)findViewById(R.id.textDescription);

        pos = getIntent().getIntExtra("Position", -1);
        Log.e("position", String.valueOf(pos));

        image.setImageResource(MainActivity.imageLarge[pos]);
        name.setText(MainActivity.names[pos]);
        meaning.setText(MainActivity.meaning[pos]);
        description.setText(MainActivity.description[pos]);


    }
}
