package deitel.com.jurado_villacres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNombre;
    private EditText editTextApellido;
    private EditText editTextBase;
    private EditText editTextExponente;
    private EditText editTextPotencia;
    private EditText editTextFactorial;
    private Button btnSiguiente;
    private Button btnMostrarResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSiguiente=findViewById(R.id.buttonSiguiente);
        btnMostrarResultado=findViewById(R.id.buttonMostrarResultados);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextExponente = findViewById(R.id.editTextExponente);
        editTextBase = findViewById(R.id.editTextBase);
        editTextPotencia = findViewById(R.id.editTextPotencia);
        editTextFactorial = findViewById(R.id.editTextNumeroFactorial);
        // bloqueo
        editTextFactorial.setEnabled(false);
        editTextPotencia.setEnabled(false);
        editTextApellido.setEnabled(false);
        editTextNombre.setEnabled(false);
        editTextBase.setEnabled(false);
        editTextExponente.setEnabled(false);

    }

    public void siguente(View view){
        Intent intent = new Intent(this,SegundoActivity.class);
        startActivity(intent);
    }

    public void mostrarResultados(View view){

    }


}