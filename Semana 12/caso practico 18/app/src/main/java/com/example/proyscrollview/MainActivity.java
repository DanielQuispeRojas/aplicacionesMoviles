package com.example.proyscrollview;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    String fruta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tvtitulo);
        tv1.setText("seleccione la fruta:" + fruta);
        int num = (int)(Math.random()*8);

        switch(num){
            case 0: fruta="fresa"; break;
            case 1: fruta="guanabana"; break;
            case 2: fruta="piña"; break;
            case 3: fruta="sandia"; break;
            case 4: fruta="papaya"; break;
            case 5: fruta="banana"; break;
            case 6: fruta="manzana"; break;
            case 7: fruta="uva"; break;
        }
    }

    public void presionar(View view){

    }
}