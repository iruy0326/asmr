package com.example.asmr;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;


/**
 * A simple {@link Fragment} subclass.
 */
public class Alarm extends Fragment {


    static final String[] LIST_MENU = {
            "Sweet Carol  https://www.youtube.com/user/sweetcarol11",
            "rappeler하쁠리  https://www.youtube.com/channel/UCa_ZCXMQ57PDcpE_3tPOW1g",
            "VIVA ASMR  https://www.youtube.com/channel/UCiorb8zE67MvrBQGagNWutQ",
            "Dana ASMR  https://www.youtube.com/user/dahampark",
            "hatomugi ASMR  https://www.youtube.com/channel/UCue0AhOm8SARARIcT-0mE1w",
            "ASMR Cherry Crush  https://www.youtube.com/channel/UCp5oSl262QFMOsjKj_kYILA",
            "MassageASMR  https://www.youtube.com/user/MassageASMR",
            "FredsVoice ASMR  https://www.youtube.com/user/WhisperMister1",
            "RoseASMR  https://www.youtube.com/channel/UCGVV7XI1shSNCaF4dmYsOCg",
            "ASMR PPOMO 뽀모  https://www.youtube.com/user/PPOMODOLI",
            "ASMRSurge  https://www.youtube.com/user/ASMRSURGE",
            "ASMR KittyKlaw  https://www.youtube.com/channel/UCo-gAYrvd7WIrCRsNueddtQ"
    };

    public Alarm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.fragment_alarm,container,false);
        ImageView sleep = (ImageView) rootView.findViewById(R.id.gif_image);
        GlideDrawableImageViewTarget gifImage = new GlideDrawableImageViewTarget(sleep);
        Glide.with(this).load(R.drawable.sleep).into(gifImage);

        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_selectable_list_item, LIST_MENU);
        ListView listview = (ListView) rootView.findViewById(R.id.listview1);
        listview.setAdapter(adapter) ;


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // 코드 계속 ...

            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {

                // get TextView's Text.
                String strText = (String) parent.getItemAtPosition(position) ;

                // TODO : use strText
            }
        }) ;
        listview.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        // Inflate the layout for this fragment

        return rootView;
    }

}
