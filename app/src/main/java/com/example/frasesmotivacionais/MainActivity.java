package com.example.frasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudarFrase(View view) {
        TextView textFrases;

        textFrases = findViewById(R.id.textFrases);

        String frases[] = {"Nem todas as tempestades vêm para atrapalhar a sua vida." +
                " Algumas vêm para limpar seu caminho.", "A persistência realiza o impossível.",
                "Não se desespere quando a caminhada estiver difícil," +
                        " é sinal de que você está no caminho certo.", "Seus sonhos não precisam de plateia," +
                " eles só precisam de você.", "A persistência é o caminho do êxito.", "No meio da " +
                "dificuldade encontra-se a oportunidade.", "Lute. Acredite. Conquiste. Perca." +
                " Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas," +
                " acima de tudo, seja você sempre.", "Eu faço da dificuldade a minha motivação." +
                " A volta por cima vem na continuação."};

        int aleatorio = new Random().nextInt(frases.length);

        textFrases.setText(frases[aleatorio]);
    }
}