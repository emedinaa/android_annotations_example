package com.emedinaa.exampleannotations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.emedinaa.exampleannotations.entity.Persona;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensaje();

        Persona persona= new Persona();
        Class classPerson=persona.getClass();
        Field[] fields=classPerson.getDeclaredFields();
        for (Field field:fields) {
            Persistencia persistencia= field.getAnnotation(Persistencia.class);
            Log.v(TAG, "nombre "+persistencia.campo());
            Log.v(TAG, "tipo "+persistencia.tipo());
        }
        /*
          mensaje
          nombre edad
          tipo decimal
          nombre nombre
          tipo varchar
         */
    }

    @MetodoMarcado(description = "Hola Anotaciones")
    public void mensaje()
    {
        Log.v(TAG, "mensaje");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }
}
