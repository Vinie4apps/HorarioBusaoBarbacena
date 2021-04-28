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

public class Linha108 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("VALENTIM PRENASSI X VILELA HOSPITAL X VALENTIM PRENASSI");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Valentim Prenassi x Vilela – Via Hosp. Escola");
        semana.setText("(Segunda a Sexta -Feira)");
        semanaH.setText("Saida do Valentim Prenassi (Rua Arthur Otacílio Piscinin):\n06:00 – 06:30 – 07:00 – 07:30 -08:00 – 08:30 – 09:00 – 09:30 – 10:00 – 10:30 – 11:00 – 11:30 – 12:00 – 12:30 – 13:00 – 13:30 – 14:00 – 14:30 – 15:00 – 15:30 – 16:00 – 16:30 – 17:00 – 17:30 – 18:00 – 18:30 – 19:00 – 19:30 – 20:30 – 21:30 – 22:30\n\nSaida do Bairro ( Barbacena Shopping - Mineirão):\n05:55 – 06:25 – 06:55 -07:25 – 07:55 – 08:25 – 08:55 – 09:25 – 09:55 – 10:25 – 10:55 – 11:25 – 11:55 – 12:25 – 12:55 – 13:25 – 13:55 – 14:25 – 14:55 – 15:25 – 15:55 – 16:25 – 16:55 – 17:25 – 17:55 – 18:25 – 18:55 – 19:25- 20:25 – 21:25 – 22:25");
        sabado.setText("Sábados");
        sabadoH.setText("Saida do Valentim Prenassi (Rua Arthur Otacílio Piscinin):\n06:00 – 06:30 – 07:00 – 07:30 – 08:00 – 08:30 – 09:00 – 09:30 – 10:30 – 11:00 – 11:30 – 12:00 – 12:30 – 14:30 – 15:30 – 16:30 – 17:30 – 18:30 – 19:30 – 20:30 – 21:30 – 22:30\n\nSaida do Bairro ( Barbacena Shopping - Mineirão):\n05:55 – 06:25 – 06:55 – 07:25 – 07:55 – 08:25 – 08:55 – 09:25 – 09:55 – 10:25 – 10:55 – 11:25 – 11:55 – 12:25 – 13:25 – 14:25 – 15:25 – 16:25 – 17:25 – 18:25 – 19:25 – 20:25 – 21:25 – 22:25");
        domingo.setText("Domingos e Feriados");
        domingoH.setText("Saida do Valentim Prenassi (Rua Arthur Otacílio Piscinin):\n06:30 – 07:30 – 08:30 – 09:30 – 10:30 – 11:30 – 12:30 – 13:30 – 14:30 – 15:30 – 16:30 – 17:30 – 18:30 – 19:30 – 20:30 - 21:30 – 22:30\n\nSaida do Bairro ( Barbacena Shopping - Mineirão):\n09:25 – 10:25 – 11:25 – 12:25 – 13:25 – 14:25 – 15:25 – 16:25 – 17:25 – 18:25 – 19:25 – 20:25 – 21:25 – 22:25.");
        obs.setText("");
        obsH.setText("");
    }
}