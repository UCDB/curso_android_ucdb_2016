package br.ucdb.appmensagem;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Define o layout
        setContentView(R.layout.activity_main);

        //Acessa o botao do layout
        Button btnOK = (Button) findViewById(R.id.btnOk);

        //Envento on click do botao - O que fazer ao clicar no botao
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Acessa o campo de texto
                EditText campo1 =  (EditText) findViewById(R.id.campo1);

                //Acessa o texto do campo
                String texto = campo1.getText().toString();

                //Exibe Mensagem
                Toast.makeText(MainActivity.this, texto, Toast.LENGTH_SHORT).show();


            }
        });
    }
}
