package deitel.com.jurado_villacres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TercerActivity extends AppCompatActivity {

    private EditText editTextNombre;
    private EditText editTextApellido;
    private EditText editTextBase;
    private EditText editTextExponente;
    private EditText editTextPotencia;
    private EditText editTextNumeroFactorial;
    private Button btnCerrar;

    private TextView tv1;
    private TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);

        btnCerrar=findViewById(R.id.buttonCerrar2);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextExponente = findViewById(R.id.editTextExponente);
        editTextBase = findViewById(R.id.editTextBase);
        editTextPotencia = findViewById(R.id.editTextPotencia);
        editTextNumeroFactorial = findViewById(R.id.editTextNumeroFactorial);
        // bloqueo
        editTextPotencia.setEnabled(false);
        editTextNombre.setEnabled(false);
        editTextBase.setEnabled(false);


        String nom = getIntent().getStringExtra("nombre");
        editTextNombre.setText(nom);

        String base = getIntent().getStringExtra("base");
        editTextBase.setText(base);

    }


    public double Potencia(double base, double exponente){
        return Math.pow(base,exponente);
    }

    public double Factorial(int numero){
        if (numero==0)
            return 1;
        else
            return numero * Factorial(numero-1);
    }

}