package com.grovelet.namesofAllah.asmaulhusna2017;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;




/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    View rootView;
    ImageView iv1, iv2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        iv1 = (ImageView) rootView.findViewById(R.id.buttonAllNames);
        iv2 = (ImageView) rootView.findViewById(R.id.buttonList);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // getFragmentManager().beginTransaction().replace(R.id.fragment_container, new Start()).addToBackStack(null).commit();
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  getFragmentManager().beginTransaction().replace(R.id.fragment_container, new List()).addToBackStack(null).commit();
            }
        });
        return rootView;

    }

}
