package com.vinie4apps.horariobusaobarbacena.Linhas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import com.appodeal.ads.Appodeal;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.vinie4apps.horariobusaobarbacena.R;

public class Linha260 extends AppCompatActivity {

    private AdView mAdView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horario);

        Appodeal.initialize(this, "0944e37a9a5cb4dcf6d9679b98dc5556f28c901a8585f572", Appodeal.BANNER, true);
        Appodeal.setBannerViewId(R.id.appodealBannerView);
        Appodeal.show(this, Appodeal.BANNER_VIEW);




        // Actionbar Configurações

        Toolbar toolbar = findViewById(R.id.toobar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("SÃO PEDRO");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Centro x São Pedro");
        semana.setText("(Segunda a Sexta)");
        semanaH.setText("Saida da Avenida Bias (Kasa kent):\n06:15 - 07:15 - 08:15 - 09:15 - 10:15 - 11:15 - 12:15  - 13;15 - 14:15 - 15:15 - 16:15 - 17:15 - 18:15 - 19:15.");
        sabado.setText("(Sabado)");
        sabadoH.setText("Saida da avenida bias (Kasa kent):\n06:15 - 07:15 - 08:15 - 09:15 -10:15 - 11:15 - 12:15 -  13:15");
        domingo.setText("São Pedro x Centro\n\n(Segunda – Sexta - Feira )");
        domingoH.setText("Saida do Bairro São Pedro (Avenida Ressaquinha):\n05:50 - 06:50 - 07:50 - 08:50 - 09:50 - 10;50 - 11:50 -12:50 - 13:50- 14:50- 15:50 -16:50 -17:50 -18:50");
        obs.setText("( Sabado )");
        obsH.setText("Saida do Bairro São Pedro (Avenida Ressaquinha):\n05:50 - 06:50 -  07:50 -  08:50 - 09:50 - 10;50 - 11:50 - 12:50.");
    }
}