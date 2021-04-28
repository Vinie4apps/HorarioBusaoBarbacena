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

public class Linha401 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("SENHORA DAS DORES");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Senhora das Dores X Centro");
        semana.setText("(Segunda a sexta-feira)");
        semanaH.setText("Saida de Senhora das Dores (Drogaria Borges):\n06:00 - 07:00 - 08:00 - 09:00 - 10:00 - 12:00 - 13:00 - 14:00 - 16:00 - 17:00 - 18:00 - 19:00 - 20:00 - 23:00\n\nObservação: Alto da Serra 08:00 -13:00 -18:00 Estiva 09:00 - 16:00");
        sabado.setText("(Sabados)");
        sabadoH.setText("Saida de Senhora das Dores (Drogaria Borges):\n06:00 - 07:00 - 08:00 - 09:00 - 10:00 - 12:00 - 13:00 - 14:00 - 16:00 - 18:00 - 20:00 - 23:00\n\nObservação :Alto da Serra 08:00 -14:00 Estiva 10:00 -16:00");
        domingo.setText("(Domingos e Feriados)");
        domingoH.setText("Saida de Senhora das Dores (Drogaria Borges):\n06:00 - 08:00 - 10:00 -12:00 - 14:00 - 16:00 - 18:00 - 20:00 - 23:00\n\nObservação : Alto da Serra 08:00 -18:00 Estiva 10:00 -16:00 ");
        obs.setText("Centro X Senhora da Dores");
        obsH.setText("(Segunda a Sexta-Feira )\n\n(Segunda a Sexta-Feira):\n06:00 - 07:00 - 08:00 - 09:00 - 11:00 - 12:00 - 13:00 - 15:00 - 16:00 - 17:00 - 18:00 - 19:00 - 21:00 - 22:45\n\nObservação : Alto da Serra 07:00 -12:00 -17:00 Estiva 09:00 - 16:00\n\n(Sabados)\n\nSaida da Avenida Bias Fortes (Kasa kent):\n06:00 - 07:00 - 08:00 - 09:00 - 10:00 - 11:00 - 12:00 - 13:00 - 15:00 - 17:00 - 19:00 - 21:00 - 22:45\n\nObservação : Alto da Serra 07:00 - 13:00 Estiva 09:00 - 15:00\n\n(Domingos e Feriados)\n\nSaida da Avenida Bias Fortes (Kasa kent):\n07:00 - 09:00 - 11:00 - 13:00 - 15:00 - 17:00 - 19:00 - 21:00 - 22:45\n\nObservação :Alto da Serra 07:00 - 17:00 Estiva 09:00 - 15:00");
    }
}