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

public class Linha124 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("JOSÉ LUIZ");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Centro x José Luiz");
        semana.setText("(De segunda a sexta- feira)");
        semanaH.setText("Saída Avenida Bias Fortes( Em Frente a Kasa Kent):\n 07:30 via 040 - 11:15 via 040 - 15:00 via candian - 17:00 via 040");
        sabado.setText("Sábado");
        sabadoH.setText("Saída Avenida Bias Fortes( Em Frente a Kasa Kent):\n 15:00 via candian");
        domingo.setText("José Luiz x Centro\n\n(Segunda a sexta- Feira )");
        domingoH.setText("Saída Próximo ao Grupo Escolar:\n06:00 via 040 - 08:30 via candian - 12:15 via 040 - 16:00 via 040\n\nSábado\n\nSaída Próximo ao Grupo Escolar:\n07:00 via candian");
        obs.setText("Observação");
        obsH.setText("Toda quarta feira sai do centro as 14:30 candian via caieiro");
    }
}