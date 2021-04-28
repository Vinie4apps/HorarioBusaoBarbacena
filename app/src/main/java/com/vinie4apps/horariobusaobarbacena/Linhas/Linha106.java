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

public class Linha106 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("IPANEMA X EXPOSIÇÃO X NOVA SUÍÇA");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("PONTE DO COSME X VILELA MUSEU");
        semana.setText("Segunda à sexta-feira");
        semanaH.setText("Saindo da Vila Sofia:\n06:00 -06:40- 07:30 - 08:35 - 09:35 - 10:35 - 11:35 - 12:35 -13:35 - 14:35 - 15:35 - 16:35 - 17:35 - 18:35 - 19:35 - 20:35 - 21:35 - 23:15\n\nSaindo do Jardim do Globo:\n05:30 - 06:20 - 07:05 - 08:05 - 09:05 - 10:05 - 11:05 - 12:05 - 13:05 - 14:05 - 15:05 -16:05 - 17:05 - 18:05 - 19:05 - 20:05 - 21:05 - 22:05");
        sabado.setText("Sábado");
        sabadoH.setText("06:00 - 06:35 - 07:30 - 08:35 - 09:35 - 10:35 - 11:35 - 12:35 - 13:35 - 14:35 -16:35 - 18:35 - 20:35\n\nSaindo do Jardim do Globo:\n05:30 - 06:20 - 07:05 - 08:05 - 09:05 - 10:05 - 11:05 - 12:05 - 13:05 - 14:05 - 16:05 - 18:05 - 20:05 - 22:05");
        domingo.setText("Domingo");
        domingoH.setText("06:35 - 08:35 - 10:35 - 12:35 - 14:35 - 16:35 - 18:35 - 20:35\n\nSaindo do Jardim do Globo:\n06:20 - 08:05 - 10:05 - 12:05 - 14:05 - 16:05 - 18:05 - 20:05 - 22:05");
        obs.setText("");
        obsH.setText("");
    }
}