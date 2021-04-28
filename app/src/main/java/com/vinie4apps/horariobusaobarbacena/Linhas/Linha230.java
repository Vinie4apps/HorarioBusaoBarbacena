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

public class Linha230 extends AppCompatActivity {
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
        getSupportActionBar().setTitle("SANTO ANTONIO");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Santo Antonio X Centro");
        semana.setText("(Diário)");
        semanaH.setText("Saída do Bairro Sto Antonio ( Av Demétrio Ribeiro):\n06:10 - 06:55 - 07:55 - 08:55 - 09:55 - 10:55 - 11:55 - 12:55 - 13:55 - 14:55 - 15:55 - 16:55 - 17:55 - 18:55 - 19:55 - 20:55 - 21:55");
        sabado.setText("Centro X Santo Antonio");
        sabadoH.setText("");
        domingo.setText("(Diário)");
        domingoH.setText("Saída da Avenida Bias Fortes:\n06:30 - 07:15 - 08:15 - 09:15 - 10:15 - 11:15 - 12:15 - 13:15 - 14:15 - 15:15 - 16:15 - 17:15 - 18:15 - 19:15 - 20:15 - 21:15 - 22:15");
        obs.setText("");
        obsH.setText("");
    }
}