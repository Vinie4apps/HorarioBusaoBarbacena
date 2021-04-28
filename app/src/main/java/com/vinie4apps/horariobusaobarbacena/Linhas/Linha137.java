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

public class Linha137 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("SANTA CECILIA | EUCISA | VIA MONTE MARIO");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Centro  X  Eucisa  X  Monte Mario");
        semana.setText("(Diário)");
        semanaH.setText("Saída do Club Barbacenense:\n06:35 - 07:35 - 08:35 - 09:35 - 10:35 - 11:35 - 12:35 - 13:35 - 14:35 - 15:35 - 16:35 - 17:35 - 18:35 - 19:35 - 21:35 - 22:35");
        sabado.setText("Monte Mario  X  Eucisa  X  Centro");
        sabadoH.setText("");
        domingo.setText("(Diário)");
        domingoH.setText("Saída do Bairro Monte Mario ( Igreja):\n06:10 - 07:10 - 08:10 - 09:10 - 10:10 - 11:10 - 12:10 - 13:10 - 14:10 - 15:10 - 16:10 - 17:10 - 18:10 - 19:10 - 21:10 - 22:10");
        obs.setText("");
        obsH.setText("");
    }
}