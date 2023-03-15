package nascimento.santos.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProximaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxima); //cria a tela
        Intent intent = getIntent(); //pega intent
        String texto = intent.getStringExtra("texto"); //pega o texto salvo da outra tela
        TextView tvExibir = findViewById(R.id.tvExibir);//pega o campo de texto nessa tela
        tvExibir.setText(texto);//mete o texto na tela
    }
}