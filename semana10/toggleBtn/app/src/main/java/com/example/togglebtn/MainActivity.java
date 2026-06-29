package com.example.togglebtn;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout fondo;
    private ToggleButton btn;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        fondo = (ConstraintLayout) findViewById(R.id.main);
        btn = (ToggleButton) findViewById(R.id.tgBtn);
        txt = (TextView) findViewById(R.id.txtD);
    }

    public void cambiarFondo(View view){
        if (btn.isChecked()){
            fondo.setBackgroundColor(Color.GREEN);
            txt.setText("Encendido");
        }else {
            fondo.setBackgroundColor(Color.RED);
            txt.setText("Apagado");
        }
    }
}