package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView txtTitulo, txtDescripcion;
    private ImageView imgEmocion;
    private Button btnAnterior, btnSiguiente;

    private int paginaActual = 0;

    private final String[] titulos = {
            "ALEGRIA",
            "TRISTEZA",
            "MIEDO",
            "IRA",
            "AMOR"
    };

    private final String[] descripciones = {
            "La alegría es una de las emociones primarias del ser humano, caracterizada por una sensación agradable y efímera. A menudo se equipara con la felicidad, el bienestar o el placer. Expresiones como “estar alegre” o “estar contento” se entienden como sinónimos, y suelen interpretarse como emociones positivas y deseables.",
            "La tristeza es un estado emocional caracterizado por sentimientos de infelicidad, desánimo o desesperanza. Es una respuesta a situaciones que generan dolor o sufrimiento, y suele expresarse mediante el abatimiento, el llanto o la falta de energía y apetito, entre otros síntomas.",
            "El miedo es una de las emociones primarias en los seres humanos y muchos animales. Se trata de una respuesta instintiva que surge ante la percepción de un peligro, ya sea real o imaginario, y actúa como un mecanismo de defensa que permite anticipar y reaccionar ante posibles amenazas. En su grado más extremo, se manifiesta como terror, y está estrechamente vinculado con la ansiedad.",
            "Se conoce como ira, cólera, furia, rabia o enfado a una emoción que se expresa a través de la irritabilidad, la agresividad e incluso la violencia, y que se encuentra entre las más primitivas y primordiales del ser humano.  Su manifestación física se da, por un lado, a través de expresiones faciales y corporales, o del aumento del tono de voz, cambios que se asemejan al modo en que los animales reaccionan ante las amenazas. Por otro lado, provoca reacciones fisiológicas como el aumento de la presión sanguínea y del ritmo cardíaco, y la secreción de adrenalina y noradrenalina, en la medida en que el organismo se prepara para huir o defenderse.",
            "El amor es un sentimiento de afecto que una persona puede experimentar hacia alguien o algo. Amar implica sentir respeto, conexión y el deseo de acercarse a otros.  El sentimiento del amor se expresa como un vínculo positivo basado en elementos como el afecto, la posibilidad de expresar opiniones, la empatía, el compromiso y la libertad. Tiene un impacto importante en el bienestar de las personas y representa un motor motivacional. Se considera un valor universal porque promueve la paz y la convivencia en la diversidad."
    };

    private final int[] imagenes = {
            R.drawable.alegria,
            R.drawable.tristeza,
            R.drawable.miedo,
            R.drawable.ira,
            R.drawable.amor
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txtTitulo = findViewById(R.id.txtTitulo);
        txtDescripcion = findViewById(R.id.txtDescripcion);
        imgEmocion = findViewById(R.id.imgEmocion);
        btnAnterior = findViewById(R.id.btnAnterior);
        btnSiguiente = findViewById(R.id.btnSiguiente);

        mostrarPagina();

        btnSiguiente.setOnClickListener(v -> {
            if (paginaActual < titulos.length - 1) {
                paginaActual++;
                mostrarPagina();
            }
        });

        btnAnterior.setOnClickListener(v -> {
            if (paginaActual > 0) {
                paginaActual--;
                mostrarPagina();
            }
        });
    }

    private void mostrarPagina() {
        txtTitulo.setText(titulos[paginaActual]);
        txtDescripcion.setText(descripciones[paginaActual]);
        imgEmocion.setImageResource(imagenes[paginaActual]);

        btnAnterior.setEnabled(paginaActual > 0);
        btnSiguiente.setEnabled(paginaActual < titulos.length - 1);
    }
}