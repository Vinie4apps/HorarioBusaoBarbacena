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

public class Linha301 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("MONTE MARIO");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Centro X  Monte Mario");
        semana.setText("(Diário)");
        semanaH.setText("Saida do Jardim do Globo:\n06:15 - 06:45 - 07:15 - 07:45 - 08:15 - 08:45 - 09:15 - 09:45 - 10:15 -10:45 - 11:15 - 11:45 - 12:15 - 12:45 - 13:15 - 13:45 - 14:15 - 14:45 - 15:15 - 15:45 - 16:15 - 16:45 - 17:15 - 17:45 - 18:15 - 18:45 - 19:15 - 19:45 - 20:15 -20:45 - 21:15 -21:45 - 22:15 - 22:45.");
        sabado.setText("Monte Mario X Centro");
        sabadoH.setText("");
        domingo.setText("(Diário)");
        domingoH.setText("Saida do Bairro Monte Mario (Rua das Gardenias) :\n06:00 - 06:30 - 07:00 - 07:30 - 08:00 - 08:30 - 09:00 -  09:30 - 10:00 - 10:30 - 11:00 - 11:30 - 12:00 - 12:30 - 13:00 - 13:30 - 14:00 - 14:30 - 15:00 - 15:30 - 16:00 - 16:30 - 17:00 - 17:30 - 18:00 - 18:30 - 19:00 - 19:30 - 20:00 - 20:30 - 21:00 - 21:30 - 22:00 - 22:30.");
        obs.setText("");
        obsH.setText("");
    }
}