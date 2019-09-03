package com.example.bottomnavigationbarfragment.Fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.bottomnavigationbarfragment.Adapter.ImageAndString;
import com.example.bottomnavigationbarfragment.Adapter.ImageAndStringArrayAdapter;
import com.example.bottomnavigationbarfragment.R;

import java.util.Arrays;

public class Cashiers extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_cashiers, container,false);

        ImageAndStringArrayAdapter adapter = new ImageAndStringArrayAdapter(
                this.getContext(),
                R.layout.grid_item,
                Arrays.asList(new ImageAndString(R.drawable.peter,"Peter"),
                        new ImageAndString(R.drawable.peter,"Peter"),
                        new ImageAndString(R.drawable.peter,"Peter"))
        );


        GridView gridView = view.findViewById(R.id.cashiers);
        gridView.setAdapter(adapter);
        return view;
    }
}
