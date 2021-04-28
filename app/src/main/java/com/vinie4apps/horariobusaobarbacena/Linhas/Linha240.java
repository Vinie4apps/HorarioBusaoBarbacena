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

public class Linha240 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("SANTO ANTONIO | ROSELANCHE");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Centro X Roselanche");
        semana.setText("Saída da Avenida Bias Fortes( Kasa Kent)");
        semanaH.setText("06:45 - 07:45 - 08:45 - 09:45 - 10:45 - 11:45 - 12:45 - 13:45 - 14:45 - 15:45 - 16:45 - 17:45 - 18:45 - 19:45 - 20:45 - 21:45 22:45.\n\n Observação :Os  Horários de 11:45 / 14:45 / 17:45 (vão até as Margaridas )");
        sabado.setText("Roselanche X Centro");
        sabadoH.setText("");
        domingo.setText("Saída do bairro (Restaurante Roselanche ):");
        domingoH.setText("06:20 - 07:20 -08:20- 09:20 -10:20 -11:20 12:20 – 13:20 – 14:20 -15:20 – 16:20 – 17:20 -18:20-19:20 – 20:20 -21:20-22:20");
        obs.setText("Observação :");
        obsH.setText("Os Horários e 06:20 -12:20 -15:20 -18:20 Saída das Margaridas ");
    }
}