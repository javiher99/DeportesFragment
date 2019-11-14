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
import android.widget.Button;
import android.widget.ImageView;

public class Fragmento2 extends Fragment {

    private Button btMostrar;
    private ImageView ivDeporteSeleccionado;
    private static final String A = "A";

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista;
        vista = inflater.inflate(R.layout.fragmento2, container);

        btMostrar = vista.findViewById(R.id.btMostrar);
        ivDeporteSeleccionado = vista.findViewById(R.id.ivDeporte);

        btMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Deportista.class);
                startActivity(intent);
            }
        });

        return vista;
    }
}
