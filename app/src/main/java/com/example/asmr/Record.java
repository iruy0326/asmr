package com.example.asmr;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Record extends Fragment implements View.OnClickListener{

    SoundPool pool;
    int d1;
    int d2;
    int re;
    int mi;
    int pa;
    int sol;
    int ra;
    int si;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        pool=new SoundPool(4, AudioManager.STREAM_MUSIC,0);
        d1=pool.load(requireContext(),R.raw.d1,1);
        d2=pool.load(requireContext(),R.raw.d2,1);
        re=pool.load(requireContext(),R.raw.re,1);
        mi=pool.load(requireContext(),R.raw.mi,1);
        pa=pool.load(requireContext(),R.raw.pa,1);
        sol=pool.load(requireContext(),R.raw.sol,1);
        ra=pool.load(requireContext(),R.raw.ra,1);
        si=pool.load(requireContext(),R.raw.si,1);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_record, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button22).setOnClickListener(this);
        view.findViewById(R.id.button23).setOnClickListener(this);
        view.findViewById(R.id.button24).setOnClickListener(this);
        view.findViewById(R.id.button25).setOnClickListener(this);
        view.findViewById(R.id.button26).setOnClickListener(this);
        view.findViewById(R.id.button27).setOnClickListener(this);
        view.findViewById(R.id.button28).setOnClickListener(this);
        view.findViewById(R.id.button29).setOnClickListener(this);
        view.findViewById(R.id.button30).setOnClickListener(this);
        view.findViewById(R.id.button32).setOnClickListener(this);
        view.findViewById(R.id.button34).setOnClickListener(this);
        view.findViewById(R.id.button35).setOnClickListener(this);
        view.findViewById(R.id.button36).setOnClickListener(this);
        view.findViewById(R.id.button37).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.button22:
                pool.play(d1,1,1,0,0,1);
                break;
            case R.id.button23:
                pool.play(d2,1,1,0,0,1);
                break;
            case R.id.button24:
                pool.play(si,1,1,0,0,1);
                break;
            case R.id.button25:
                pool.play(ra,1,1,0,0,1);
                break;
            case R.id.button26:
                pool.play(sol,1,1,0,0,1);
                break;
            case R.id.button27:
                pool.play(pa,1,1,0,0,1);
                break;
            case R.id.button28:
                pool.play(mi,1,1,0,0,1);
                break;
            case R.id.button29:
                pool.play(re,1,1,0,0,1);
                break;
            case R.id.button30:
                pool.play(re,1,1,0,0,1);
                break;
            case R.id.button32:
                pool.play(d2,1,1,0,0,1);
                break;
            case R.id.button34:
                pool.play(si,1,1,0,0,1);
                break;
            case R.id.button35:
                pool.play(ra,1,1,0,0,1);
                break;
            case R.id.button36:
                pool.play(pa,1,1,0,0,1);
                break;
            case R.id.button37:
                pool.play(mi,1,1,0,0,1);
                break;
        }
    }
}

