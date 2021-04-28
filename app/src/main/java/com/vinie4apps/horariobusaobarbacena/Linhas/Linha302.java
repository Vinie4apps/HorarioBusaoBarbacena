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

public class Linha302 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("MONTE MARIO | FARIA");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Rodoviária X Monte Mario /Faria");
        semana.setText("(Segunda a sexta -feira)");
        semanaH.setText("Saida do Terminal Rodoviário (Avenida Governador Bias Fortes):\n06:25 - 08:10 - 11:25 - 14:25 - 16:25 - 18:10");
        sabado.setText("(Sábados)");
        sabadoH.setText("Saida do Terminal Rodoviário (Avenida Governador Bias Fortes):\n06:25 - 08:10 - 11:25 - 13:00");
        domingo.setText("Faria /Monte Mario X Rodoviária");
        domingoH.setText("(Segunda a Sexta-Feira)\n\nSaida do Faria (Grupo escolar):\n07:10 - 09:10 - 12:10 - 15:10 - 17:10 -19:00");
        obs.setText("(Sábados)");
        obsH.setText("Saida do Faria (Grupo Escolar):\n07:10 - 09:10 - 512:10 - 13:40");
    }
}