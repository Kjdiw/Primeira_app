package nascimento.santos.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProximaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxima);
        Intent intent = getIntent();
        String texto = intent.getStringExtra("texto");
        TextView tvExibir = findViewById(R.id.tvExibir);
        tvExibir.setText(texto);
    }
}