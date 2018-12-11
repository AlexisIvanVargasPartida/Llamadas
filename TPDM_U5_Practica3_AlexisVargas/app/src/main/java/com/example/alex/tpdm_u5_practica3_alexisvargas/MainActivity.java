package com.example.alex.tpdm_u5_practica3_alexisvargas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText no;
    Button llamar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    //set icon
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    //set title
                    .setTitle("Bienvenido a la aplicación para hacer llamadas")
                    //set message
                    .setMessage("Disfruta tu estadía, se cuidadoso con los datos que des")
                    //set positive button
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(getApplicationContext(), "A comenzar!!", Toast.LENGTH_LONG).show();
                        }
                    })
                    //set negative button
                    .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //set what should happen when negative button is clicked
                            Toast.makeText(getApplicationContext(), "A comenzar!!", Toast.LENGTH_LONG).show();
                        }
                    })
                    .show();

            no = (EditText) findViewById(R.id.numero);
            llamar = (Button) findViewById(R.id.button);
            llamar.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent numero = new Intent(Intent.ACTION_CALL);
                    numero.setData(Uri.parse("tel:" + no.getText().toString()));
                    startActivity(numero);
                }
            });
        }
    }
