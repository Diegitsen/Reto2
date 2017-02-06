package games.lancelot.reto2;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarValor(View v)
    {
        EditText nombre = (EditText) findViewById(R.id.etNombre);
        EditText contra = (EditText) findViewById(R.id.etContra);
        EditText apellido = (EditText) findViewById(R.id.etApellido);
        EditText dni = (EditText) findViewById(R.id.etDNI);
        EditText edad = (EditText) findViewById(R.id.etEdad);


       if(!(nombre.getText().toString().equals("") || contra.getText().toString().equals("") || apellido.getText().toString().equals("") ||
               dni.getText().toString().equals("") || edad.getText().toString().equals("")))
       {


           if (nombre.getText().toString().equals("diego") && contra.getText().toString().equals("reto2")) {
               Intent nuevoL = new Intent(MainActivity.this, SecondActivity.class);
               startActivity(nuevoL);
           } else
               Toast.makeText(getApplicationContext(), "Usuario incorrecto", Toast.LENGTH_SHORT).show();
       }

        else
           Toast.makeText(getApplicationContext(), "Debe de ingresar informacion en todos los campos", Toast.LENGTH_SHORT).show();

    }

    public  void mostrarAyuda(View v)
    {
        Toast.makeText(getApplicationContext(), "Para ingresar se debe de poner solo en: \nnombre: diego \ncontraseña: reto2 ", Toast.LENGTH_SHORT ).show();
    }

}
