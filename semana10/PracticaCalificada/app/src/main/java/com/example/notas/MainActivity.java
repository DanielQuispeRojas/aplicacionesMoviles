package com.example.notas;

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
    private EditText n1;
    private EditText n2;
    private EditText n3;
    private EditText n4;
    private TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        n1 = (EditText)findViewById(R.id.nt1);
        n2 = (EditText) findViewById(R.id.nt2);
        n3 = (EditText) findViewById(R.id.nt3);
        n4 = (EditText) findViewById(R.id.nt4);
        res = (TextView) findViewById(R.id.txtRtdo);
    }

    private float val(EditText v){
        return Float.parseFloat(v.getText().toString());
    }

    public void calcularPromedio(View view){
        res.setText(
                String.valueOf((val(n1) + val(n2) + val(n3) + val(n4))/4)
        );
    }
}