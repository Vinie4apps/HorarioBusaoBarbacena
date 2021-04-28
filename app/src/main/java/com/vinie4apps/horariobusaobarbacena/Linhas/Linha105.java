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

public class Linha105 extends AppCompatActivity {
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
        getSupportActionBar().setTitle("JOÃO PAULO II X BOA VISTA /CAIÇARAS - RIVELLI");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("João Paulo II X Boa Vista /Caiçaras - Rivelli");
        semana.setText("(Segunda á Sexta -Feira)");
        semanaH.setText("Saída do Bairro João Paulo II (Praça do Cruzeiro):\n05:40 - 06:10 - 06:40 - 07:10 - 07:40 - 08:10 - 08:40 - 09:10 - 09:40 - 10:10 - 10:40 - 11:10 - 11:40 - 12:10 - 12:40 - 13:10 - 13:40 - 14:10 - 14:40 - 15:10 - 15:40 - 16:10 - 16:40 - 17:10 - 17:40 - 18:10 - 18:40 - 19:10 - 19:40 - 20:40 - 21:40 - 22:40.\n\nSaída da Rivelli:\n05:40 – 06:10 – 06:40 – 07:10 – 07:40 – 08:10 – 08:40 – 09:10 – 09:40 – 10:10 – 10:40 – 11:10 – 11:40 – 12:10 – 12:40 – 13:10 – 13:40 – 14:10 – 14:40 – 15:10 – 15:40 – 16:10 – 16:40 – 17:10 – 17:40 – 18:10 – 18:40 – 19:10 – 19:40 – 20:40 – 21:40 – 22:40.\n\nHORÁRIO ESPECIAL SAÍDA DO JOÃO PAULO (PRAÇA DO CRUZEIRO)\n - 03:50 - 05:05");
        sabado.setText("(Sábados)");
        sabadoH.setText("Saída do Bairro João Paulo II (Praça do Cruzeiro):\n05:40 – 06:10 – 06:40 – 07:10 – 07:40 – 08:10 – 08:40 – 09:10 – 09:40 – 10:10 – 10:40 – 11:10 – 11:40 – 12:10 – 12:40 – 13:10 – 14:10 – 15:10 - 16:10 – 17:10 – 18:10 – 19:10 – 20:10 – 21:10 – 22:10.\n\nHORÁRIO ESPECIAL SAÍDA DO JOÃO PAULO (PRAÇA DO CRUZEIRO):\n 03:50 - 05:05\n\nSaída da Rivelli:\n05:40 – 06:10 – 06:40 – 07:10 – 07:40 – 08:10 – 08:40 – 09:10 – 09:40 – 10:10- 10:40 – 11:10 – 11:40 – 12:10 – 12:40 – 13:10 – 14:10 – 15:10 – 16:10 – 17:10 – 18:10 – 19:10 – 20:10 – 21:10 – 22:10.");
        domingo.setText("(Domingos e Feriados )");
        domingoH.setText("Saída do Bairro João Paulo II (Praça do Cruzeiro):\n06:10 – 07:10 – 08:10 – 09:10 – 10:10 – 11:10 – 12:10 – 13:10 – 14:10 – 15:10 – 16:10 – 17:10 – 18:10 – 19:10 – 20:10 – 21:10 – 22:10\n\nSaída da Rivelli:\n06:10 – 07:10 – 08:10 – 09:10 – 10:10 – 11:10 – 12:10 – 13:10 – 14:10 – 15:10 – 16:10 – 17:10 – 18:10 – 19:10 – 20:10 – 21:10 – 22:10");
        obs.setText("Centro X  Boa vista /Caiçaras - Rivelli");
        obsH.setText("(Segunda a Sexta -Feira)\n\nSaída do Centro (Club Barbacenense):\n06:05 – 06:35 – 07:05 – 07:35 – 08:05 – 08:35 – 09:05 – 09:35 – 10:05 – 10:35 – 11:05 – 11:35 – 12:05 – 12:35 – 13:05 – 13:35 – 14:05 – 14:35 – 15:05 – 15:35 – 16:05 – 16:35 – 17:05 – 17:35 – 18:05 – 18:35 – 19:05 – 19:35 – 20:05 – 21:05 – 22:05 – 22:35\n\n(Sábados)\n\nSaída do centro (Club Barbacenense):\n06:35 - 07:05 - 07:35 - 08:05 - 08:35 - 09:05 - 09:35 - 10:05 - 10:35 - 11:05 - 11:35 - 12:05 - 12:35 - 13:05 - 13:35 - 14:35 - 15:35 - 16:35 - 17:35 - 18:35 - 19:35 - 20:35 - 21:35 - 23:05\n\n(Domingos e Feriados )\n\nSaída do centro (Club Barbacenense):\n06:35 - 07:35 - 08:35 - 09:35 - 10:35 - 11:35 - 12:35 - 13:35 - 14:35 - 15:35 - 16:35 - 17:35 - 18:35 - 19:35 - 20:35 - 21:35 - 22:35\n\nCENTRO x JOÃO PAULO II\n\n(Segunda a Sexta -Feira)\n\nSaída do centro Avenida Bias Fortes (Banco Mercantil :\n06:05 - 06:35 - 07:05 - 07:35 - 08:05 - 08:35 - 09:05 - 09:35 - 10:05 - 10:35 - 11:05 - 11:35 - 12:05 - 12:35 - 13:05 - 13:35 - 14:05 - 14:35 - 15:05 - 15:35 - 16:05 - 16:35 - 17:05 - 17:35 - 18:05 - 18:35 - 19:05 - 19:35 - 20:05 - 21:05 - 22:05 - 23:05.\n\n(Sábados)\n\nSaída do centro Avenida Bias Fortes (Banco Mercantil :\n06:35 – 07:05 – 07:35 – 08:05 – 08:35 – 09:05 – 09:35 – 10:05 – 10:35 – 11:05 – 11:35 – 12:05 – 12:35 – 13:05 – 13:35 – 14:35 – 15:35 – 16:35 – 17:35 – 18:35 – 19:35 – 20:35 – 21:35 – 22:35\n\n (Domingos e Feriados)\n\nSaída do centro Avenida Bias Fortes (Banco Mercantil :\n06:35 - 07:35 - 08:35 - 09:35 - 10:35 - 11:35 - 12:35 - 13:35 - 14:35 - 15:35 - 16:35 - 17:35 - 18:35 - 19:35 - 20:35 - 21:35 - 22:35");
    }
}