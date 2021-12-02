package deitel.com.jurado_villacres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;


public class SegundoActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnCerrar;
    private EditText txtBase;
    private Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        btnCerrar = (Button) findViewById(R.id.buttonCerrar);
        //btnCerrar.setEnabled(false);
        txtNombre = (EditText) findViewById(R.id.editTextNombre);
        txtBase = (EditText) findViewById(R.id.editTextBase);
        btnSiguiente = (Button) findViewById(R.id.buttonSiguiente2);
    }

    public void Enviar(View view){
        Intent i = new Intent(this, TercerActivity.class);
        i.putExtra( "Nombre" ,txtNombre.getText().toString());
        i.putExtra( "Base", txtBase.getText().toString());
        startActivity(i);
    }
    public void Prueba(View view){
        Intent i = new Intent(this, TercerActivity.class);

        startActivity(i);
    }

}