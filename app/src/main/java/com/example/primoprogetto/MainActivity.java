package com.example.primoprogetto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btnReset; // creare un oggetto di tipo Button
    Button btnTest;
    Button btnPlay;

    TextView txtMessaggio;




    @Override
    protected void onCreate(Bundle savedInstanceState) // metodo onCreate(non ritorna nessun valore) è il primo metodo ad andare in esecuzione
    {
        super.onCreate(savedInstanceState); // si invoca il metodo del padre grazie alla chiamata super
        setContentView(R.layout.activity_main); // carica il file xml

        btnReset = (Button)findViewById(R.id.btnReset); // recuperare l'id del bottone Reset, eseguire il cast per assegnarlo ad un oggetto di tipo Bottone
        btnTest = (Button)findViewById(R.id.btnTest);
        btnPlay = (Button)findViewById(R.id.btnPlay);

        txtMessaggio = (TextView)findViewById(R.id.Messaggio);
    }

    public void reset(View v) // View v serve per riconoscere l' Activity
    {
        txtMessaggio.setText(" ");
    }

    public void test(View v)
    {
        Toast t = Toast.makeText(getApplicationContext(),"messaggio",Toast.LENGTH_LONG);// tre parametri(dove viene invocato,messaggio visualizzato,durata)
        // oggetto TOAST ha anche una gravity per posizionarlo
        t.show();
    }

    // oggetto intent per collegare due activity
    public void secondaact(View v)
    {
        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("messaggio",txtMessaggio.getText());
        startActivity(i);
    }

}