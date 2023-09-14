package com.example.fragments_sala;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragmento_1 extends Fragment {
    private Button btCount;
    private Button btHello;
    private int count;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fragmento_1, container, false);
        btCount = (Button) view.findViewById(R.id.countXML);
        btHello = (Button) view.findViewById(R.id.activityXML);
        btCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                Toast.makeText(getActivity(),"contagem em: "+count, Toast.LENGTH_SHORT).show();
            }
        });

        btHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.hello();
            }
        });
        return view;
    }
}