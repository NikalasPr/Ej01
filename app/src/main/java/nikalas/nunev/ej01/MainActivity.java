package nikalas.nunev.ej01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnPalabras;
    private Button btnCaracteres;
    private EditText txtFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVista();

        btnCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                int caracteres = frase.length();

                Toast.makeText(MainActivity.this, "La frase tiene "+caracteres+" caracteres.", Toast.LENGTH_SHORT).show();
            }
        });
        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                int palabras = 0;
                String[] temp = frase.split(" ");
                palabras = temp.length;
                Toast.makeText(MainActivity.this, "La frase tiene "+palabras+" palabras", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void inicializarVista() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnPalabras = findViewById(R.id.btnPalabrasMain);
        btnCaracteres = findViewById(R.id.btnCaracteresMain);
    }
}