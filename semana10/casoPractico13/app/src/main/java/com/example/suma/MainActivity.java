package com.example.suma;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtNum1);
        et2 = (EditText) findViewById(R.id.txtNum2);
        tv1 = (TextView) findViewById(R.id.txtRtdo);
    }

    public void sumar(View view){
        tv1.setText(String.valueOf(
                (
                        Integer.parseInt(String.valueOf(et1.getText())) + Integer.parseInt(String.valueOf(et2.getText())))
                )
        );
    }

    public void restar(View view){
        tv1.setText(
                String.valueOf(
                        Integer.parseInt(String.valueOf(et1.getText())) - Integer.parseInt(String.valueOf(et2.getText()))
                )
        );
    }

    public void multiplicar(View view){
        tv1.setText(
                String.valueOf(
                        Integer.parseInt(String.valueOf(et1.getText())) * Integer.parseInt(String.valueOf(et2.getText()))
                )
        );
    }

    public void dividir(View view){
        if(Integer.parseInt(String.valueOf(et2.getText()))==0){
            throw new IllegalArgumentException("No se puede divir por cero");
        }

        tv1.setText(
                String.valueOf(
                        Float.parseFloat(String.valueOf(et1.getText())) / Float.parseFloat(String.valueOf(et2.getText()))
                )
        );
    }
}