package com.grovelet.namesofAllah.asmaulhusna2017;

/**
 * Created by iamla on 10/13/2016.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class ListViewAdapter extends BaseAdapter {
    String[] Meanings;
    String[] Names;
    Context context;
    Typeface font;
    int f47i;
    LayoutInflater inflater;
    int[] nameId;

    public ListViewAdapter(Context context) {
        this.context = context;
//        this.f47i = 0;
//
//        this.context = context;
//        this.Names = Names;
//        this.Meanings = Meanings;
    }

    public int getCount() {
        return Integer.valueOf(99).intValue();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        this.inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = this.inflater.inflate(R.layout.listview_item, parent, false);

        TextView Meaning = (TextView) itemView.findViewById(R.id.LVmeaning);
        ImageView nameImage = (ImageView) itemView.findViewById(R.id.LVimg);
        TextView name = (TextView)itemView.findViewById(R.id.LVname);

        name.setText(MainActivity.names[position]);
        Meaning.setText(MainActivity.meaning[position]);
        nameImage.setImageResource(MainActivity.imagesSmall[position]);
        //((TextView) itemView.findViewById(R.id.LVname)).setText(new StringBuilder(String.valueOf(Integer.toString(position + 1))).append(" - ").append(this.Names[position]).toString());
        //Meaning.setText(this.Meanings[position]);
        //nameImage.setImageResource(this.nameId[position]);
        //this.f47i++;
        return itemView;
    }
}

