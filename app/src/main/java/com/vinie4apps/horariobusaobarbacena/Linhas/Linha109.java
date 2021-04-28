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

public class Linha109 extends AppCompatActivity {
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
        getSupportActionBar().setTitle("VILA DOS SARGENTOS/RODOVIÁRIA");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Rodoviária X Centro");
        semana.setText("(Diário)");
        semanaH.setText("Saída da Avenida Governador Bias Fortes ( Rodoviária):\n06:40 - 07:40 - 08:40 - 09:40 - 10:40 - 11:40 - 12:40 - 13:40 - 14:40 - 15:40 - 16:40 - 17:40 - 18:40 - 19:40 - 20:40.");
        sabado.setText("Subway  X   Vila dos Sargentos Bairro Jardim");
        sabadoH.setText("");
        domingo.setText("(Diário)");
        domingoH.setText("Saída da Rua Virgílio Melo Franco (Subway):\n06:00 - 07:00 - 08:00 - 09:00 - 10:00 - 11:00 - 12:00 - 13:00 - 14:00 - 15:00 - 16:00 - 17:00 - 18:00 - 19:00 - 20:00 - 21:00. ");
        obs.setText("");
        obsH.setText("");
    }
}