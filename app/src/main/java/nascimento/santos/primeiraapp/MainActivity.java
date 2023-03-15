package nascimento.santos.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnviar=findViewById(R.id.btnEnviar); //acha o botão pelo id
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);//acha o campo de texto pelo id
                String texto = etDigiteAqui.getText().toString(); //cria uma variável com o conteúdo que está escrito no campo de texto
                Intent intent = new Intent(MainActivity.this, ProximaActivity.class); //cria uma variável que funciona como função para mudar de tela
                intent.putExtra("texto", texto); //salva o texto do campo de texto na variável intent
                startActivity(intent); //inicializa a "função" intent que muda de tela
            }
        });
    }
}