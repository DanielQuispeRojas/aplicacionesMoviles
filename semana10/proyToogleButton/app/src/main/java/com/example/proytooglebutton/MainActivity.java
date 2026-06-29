package com.example.proytooglebutton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ToggleButton tgb;
    TextView txtRsdo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tgb = (ToggleButton) findViewById(R.id.tgb2);
        txtRsdo = (TextView) findViewById(R.id.txtRdo);
    }

    public void onclick(View view){
        if(view.getId()==R.id.tgb2){
            if(tgb.isChecked()){
                txtRsdo.setText("Boton ON");
            }else{
                txtRsdo.setText("Boton OFF");
            }
        }
    }
}