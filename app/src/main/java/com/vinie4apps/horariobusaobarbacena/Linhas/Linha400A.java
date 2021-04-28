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

public class Linha400A extends AppCompatActivity {

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
        getSupportActionBar().setTitle("CAMPESTRE");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Centro X Campestre I");
        semana.setText("(Segunda a sexta -feira)");
        semanaH.setText("Saída da avenida Bias fortes (Kasa kent):\n06:50 - 16:00");
        sabado.setText("Campestre I X Centro\n\n(Segunda a Sexta-Feira)");
        sabadoH.setText("Saída Campestre I:\n07:30 - 17:00");
        domingo.setText("Centro X Campestre II Via faixa Azul");
        domingoH.setText("(Segunda a Sexta -Feira)\n\nSaída da Avenida Bias Fortes (kasa kent):\n07:00 - 10:00 - 12:30 - 16:00 -18:30\n\n(Sabados)\n\nSaída da Avenida Bias Fortes (kasa kent):\n07:00 -10:00 -12:30 - (16:00  Correia de Almeida).\n\n(Domingos e Feriados)\n\nSaída da Avenida Bias Fortes (kasa kent):\n( 07:00 - 16:00 Correia de Almeida ).");
        obs.setText("Campestre II Via Faixa Azul X Centro");
        obsH.setText("(Segunda a Sexta-Feira)\n\nSaída Campestre II(Igreja):\n06:00 -07:50 - 10:50 -13:20 - 16:50\n\n(Sabados)\n\nSaída Campestre II (Igreja):\n06:00 - 07:50 -10:50 -13:20 -16:50\n\n(Domingos e Feriados)\n\nSaída Campestre II(Igreja):\n07:50 - 16:50");
    }
}