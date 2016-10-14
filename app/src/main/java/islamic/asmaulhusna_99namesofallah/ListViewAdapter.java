package islamic.asmaulhusna_99namesofallah;

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

    public ListViewAdapter(Context context, String[] Names, String[] Meanings) {
        this.f47i = 0;
        this.nameId = new int[]{R.drawable.thumba0, R.drawable.thumba1, R.drawable.thumba2, R.drawable.thumba3, R.drawable.thumba4, R.drawable.thumba5, R.drawable.thumba6, R.drawable.thumba7, R.drawable.thumba8, R.drawable.thumba9, R.drawable.thumba10, R.drawable.thumba11, R.drawable.thumba12, R.drawable.thumba13, R.drawable.thumba14, R.drawable.thumba15, R.drawable.thumba16, R.drawable.thumba17, R.drawable.thumba18, R.drawable.thumba19, R.drawable.thumba20, R.drawable.thumba21, R.drawable.thumba22, R.drawable.thumba23, R.drawable.thumba24, R.drawable.thumba25, R.drawable.thumba26, R.drawable.thumba27, R.drawable.thumba28, R.drawable.thumba29, R.drawable.thumba30, R.drawable.thumba31, R.drawable.thumba32, R.drawable.thumba33, R.drawable.thumba34, R.drawable.thumba35, R.drawable.thumba36, R.drawable.thumba37, R.drawable.thumba38, R.drawable.thumba39, R.drawable.thumba40, R.drawable.thumba41, R.drawable.thumba42, R.drawable.thumba43, R.drawable.thumba44, R.drawable.thumba45, R.drawable.thumba46, R.drawable.thumba47, R.drawable.thumba48, R.drawable.thumba49, R.drawable.thumba50, R.drawable.thumba51, R.drawable.thumba52, R.drawable.thumba53, R.drawable.thumba54, R.drawable.thumba55, R.drawable.thumba56, R.drawable.thumba57, R.drawable.thumba58, R.drawable.thumba59, R.drawable.thumba60, R.drawable.thumba61, R.drawable.thumba62, R.drawable.thumba63, R.drawable.thumba64, R.drawable.thumba65, R.drawable.thumba66, R.drawable.thumba67, R.drawable.thumba68, R.drawable.thumba69, R.drawable.thumba70, R.drawable.thumba71, R.drawable.thumba72, R.drawable.thumba73, R.drawable.thumba74, R.drawable.thumba75, R.drawable.thumba76, R.drawable.thumba77, R.drawable.thumba78, R.drawable.thumba79, R.drawable.thumba80, R.drawable.thumba81, R.drawable.thumba82, R.drawable.thumba83, R.drawable.thumba84, R.drawable.thumba85, R.drawable.thumba86, R.drawable.thumba87, R.drawable.thumba88, R.drawable.thumba89, R.drawable.thumba90, R.drawable.thumba91, R.drawable.thumba92, R.drawable.thumba93, R.drawable.thumba94, R.drawable.thumba95, R.drawable.thumba96, R.drawable.thumba97, R.drawable.thumba98};
        this.context = context;
        this.Names = Names;
        this.Meanings = Meanings;
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
        this.inflater = (LayoutInflater) this.context.getSystemService("layout_inflater");
        View itemView = this.inflater.inflate(R.layout.listview_item, parent, false);
        TextView Meaning = (TextView) itemView.findViewById(R.id.LVmeaning);
        ImageView nameImage = (ImageView) itemView.findViewById(R.id.LVimg);
        ((TextView) itemView.findViewById(R.id.LVname)).setText(new StringBuilder(String.valueOf(Integer.toString(position + 1))).append(" - ").append(this.Names[position]).toString());
        Meaning.setText(this.Meanings[position]);
        nameImage.setImageResource(this.nameId[position]);
        this.f47i++;
        return itemView;
    }
}

