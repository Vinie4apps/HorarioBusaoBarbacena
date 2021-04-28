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

public class Linha400 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("CORREIA DE ALMEIDA");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Centro X Correia de Almeida");
        semana.setText("(Segunda a Sexta -feira)");
        semanaH.setText("Saída da avenida Bias Fortes (Kasa kent):\n05:30 - 06:15 - 06:40 - 07:00 - 07:30 - 08:00 -09:00 - 09:30 - 10:00 - 10:30 - 11:00 11:30 - 12:00 -12:30 - 13:00 - 13:30 – 14:00 -14:30 - 15:00 - 15:30 -16:00 - 16:30 - 17:00 - 17:30 - 18:00 - 18:30 - 19:00 - 19:30 - 21:00 - 22:40\n\nObservação : Os Horários de hora e trinta vão até faixa azul.");
        sabado.setText("(Sábados)");
        sabadoH.setText("Saída da Avenida Bias Fortes (Kasa kent):\n05:30 - 06:15 - 06:40 - 07:00 - 08:00 - 09:00 - 10:00 - 11:00 - 12:00 - 12:30 - 13:00 - 14:00 - 15:00 - 16:00 - 17:00 -18:00 - 19:30 - 21:00 - 22:40.");
        domingo.setText("(Domingos e Feriados)");
        domingoH.setText("Saída da Avenida Bias Fortes (Kasa kent):\n06:00 - 07:00 - 08:00 - 09:00 - 10:00 - 11:00 - 12:00 - 13:00 - 14:00 - 15:00 - 16:00 - 17:00 - 18:00 - 19:30 - 21:00 - 22:40");
        obs.setText("Correia de Almeida  X Centro");
        obsH.setText("(Segunda a Sexta-Feira )\n\nSaída de correia de Almeida :\n05:30 - 06:00 - 06:30 - 07:00 - 07:30 - 08:00 - 08:30 - 09:00 - 10:00 - 10:30 - 11:00 - 11:30 - 12:00 - 12:30 - 13:00 - 13:30 - 14:00 - 14:30 - 15:00 - 15:30 - 16:00 - 16:30 - 17:00 - 17:30 - 18:00 - 18:30 - 19:00 - 19:30 - 20:00 - 20:30 - 21:30 - 23:10.\n\n( Sabados )\n\nSaída de Correia de Almeida:\n06:00 - 07:00 - 08:00 - 09:00 - 10:00 - 11:00 - 12:00 - 13:00 - 14:00 - 15:00 - 16:00 - 17:00 - 18:00 - 19:00 - 21:30 - 23:10.\n\n(Domingos e Feriados)\n\nSaída de Correia de Almeida :\n06:00 - 07:00 - 08:00 - 09:00 - 10:00 - 11:00 - 12:00 - 13:00 - 14:00 - 15:00 - 16:00 - 17:00 - 18:00 - 19:00 - 21:30 - 23:10.\n");
    }
}