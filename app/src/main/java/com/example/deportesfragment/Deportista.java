package com.example.deportesfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Deportista extends AppCompatActivity {

    ImageView ivDeportista;
    TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportista);

        ivDeportista = findViewById(R.id.ivDeportista);
        tvInfo = findViewById(R.id.tvInfo);

        if (Fragmento1.rutaImagen == "rugby"){
            ivDeportista.setImageResource(R.drawable.jaimerugby);
            tvInfo.setText(R.string.infoRugby);
        } else if (Fragmento1.rutaImagen == "tenis"){
            ivDeportista.setImageResource(R.drawable.nadal);
            tvInfo.setText(R.string.infoTenis);
        } else{
            ivDeportista.setImageResource(R.drawable.eliasarco);
            tvInfo.setText(R.string.infoArco);
        }
    }
}
