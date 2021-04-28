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

public class Linha210 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("NOVO HORIZONTE / VIA SÃO PEDRO");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Centro X  Novo Horizonte (via São Pedro)");
        semana.setText("(Diário)");
        semanaH.setText("Saída da Avenida Bias Fortes( Kasa Kent ):\n06:25 - 07:25 - 08:25 - 09:25 - 10:25 - 11:25 - 12:25 - 13:25 - 14:25 - 15:25 - 16:25 - 17:25 - 18:25 - 19:25 - 20:25 - 21:25 - 22:25.");
        sabado.setText("Novo Horizonte via São Pedro  X  Centro");
        sabadoH.setText("");
        domingo.setText("(Diário)");
        domingoH.setText("Saída do Bairro Novo Horizonte ( Av.. Eliezer Henrique):\n06:00 - 07:00 - 08:00 - 09:00 - 10:00 - 11:00 - 12:00 - 13:00 - 14:00 - 15:00 - 16:00 - 17:00 - 18:00 - 19:00 - 20:00 - 21:00 - 22:00");
        obs.setText("");
        obsH.setText("");
    }
}