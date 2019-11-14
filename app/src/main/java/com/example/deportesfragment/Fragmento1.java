package com.example.deportesfragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Fragmento1 extends Fragment {

    private ImageButton btRugby;
    private ImageButton btTenis;
    private ImageButton btArco;
    private ImageView ivDeporte;

    public static String rutaImagen;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista;
        vista = inflater.inflate(R.layout.fragmento1, container);

        btRugby = vista.findViewById(R.id.btRugby);
        btTenis = vista.findViewById(R.id.btTenis);
        btArco = vista.findViewById(R.id.btArco);

        btRugby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivDeporte = getActivity().findViewById(R.id.ivDeporte);
                ivDeporte.setImageResource(R.drawable.rugby);
                rutaImagen = "rugby";
                Log.v("xyz", rutaImagen);
            }
        });

        btTenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivDeporte = getActivity().findViewById(R.id.ivDeporte);
                ivDeporte.setImageResource(R.drawable.tenis);
                rutaImagen = "tenis";
                Log.v("xyz", rutaImagen);
            }
        });

        btArco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivDeporte = getActivity().findViewById(R.id.ivDeporte);
                ivDeporte.setImageResource(R.drawable.arco);
                rutaImagen = "arco";
                Log.v("xyz", rutaImagen);
            }
        });

        return vista;
    }
}
