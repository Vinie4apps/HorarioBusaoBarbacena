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

public class Linha220 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("SANTA EFIGÊNIA / VIA SÃO PEDRO");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Centro x São Pedro (via Santa Efigênia)");
        semana.setText("( Segunda á Sexta- feira)");
        semanaH.setText("Saída da Avenida Bias Fortes ( Kasa Kent ):\n06:55 - 07:55 - 08:55 - 09:55 - 10:55 - 11:55 - 12:55 - 13:55 - 14:55 - 15:55 - 16:55 - 17:55 - 18:55 - 19:55 - 20:55 - 21:55 - 22:55.");
        sabado.setText("Sábado - Domingo - Feriado");
        sabadoH.setText("Saída da Avenida Bias Fortes ( Kasa Kent ):\n06:55 - 07:55 - 08:55 - 09:55 - 10:55 - 11:55 - 12:55 - 13:55 - 14:55 - 15:55 - 16:55 - 17:55 - 18:55 - 19:55 - 20:55 - 21:55 .");
        domingo.setText("Santa Efigênia x Centro\n\n( Segunda á Sexta- feira)");
        domingoH.setText("Saída do Bairro Santa Efigênia ( CAIC ):\n06:30 - 07:30 - 08:30 - 09:30 - 10:30 - 11:30 - 12:30 - 13:30 - 14:30 - 15:30 - 16:30 - 17:30 - 18:30 - 19:30 - 20:30 - 21:30 - 22:30.");
        obs.setText("Sábado - Domingo - Feriado");
        obsH.setText("Saída do Bairro Santa Efigênia ( CAIC ):\n06:30 - 07:30 - 08:30 - 09:30 - 10:30 - 11:30 - 12:30 - 13:30 - 14:30 - 15:30 - 16:30 - 17:30 - 18:30 - 19:30 - 20:30 - 21:30.");
    }
}