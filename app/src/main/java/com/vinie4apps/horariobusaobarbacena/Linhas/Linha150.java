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

public class Linha150 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("VISTA ALEGRE | CENTRO TANCREDO ESTEVES");


        TextView cabeca = (TextView) findViewById(R.id.textcabeça);
        TextView semana = (TextView) findViewById(R.id.semana);
        TextView semanaH = (TextView) findViewById(R.id.semanaHorario);
        TextView sabado = (TextView) findViewById(R.id.sabado);
        TextView sabadoH = (TextView) findViewById(R.id.sabadoHorario);
        TextView domingo = (TextView) findViewById(R.id.domingo);
        TextView domingoH = (TextView) findViewById(R.id.domingoHorario);
        TextView obs = (TextView) findViewById(R.id.observacoes);
        TextView obsH = (TextView) findViewById(R.id.observacoesHorario);



        cabeca.setText("Vista Alegre x Tancredo Esteves");
        semana.setText("(Segunda a Sexta- Feira)");
        semanaH.setText("Saída do Bairro ( Avenida Maria José Coelho):\n05:30 - 06:30 - 07:30 - 08:30 - 09:30 - 10:30 - 11:30 - 12:30 - 13:30 - 14:30 - 15:30 - 16:30 - 17:30 - 18:30 - 19:30 - 21:15.");
        sabado.setText("Sábado");
        sabadoH.setText("Saída do Bairro ( Avenida Maria José Coelho):\n05:30 - 06:30 - 07:30 - 08:30 - 09:30 - 10:30 - 11:30 - 12:30");
        domingo.setText("Centro X Vista Alegre");
        domingoH.setText("(Segunda a Sexta- Feira)\n\nSaída do Jardim Do Globo:\n06:05 - 07:05 - 08:05 - 09:05 - 10:05 - 11:05 - 12:05 - 13:05 - 14:05 - 15:05 - 16:05 - 17:05 - 18:05 - 19:05 - 20:05 - 21:45\n\nSábado\n\nSaída do Jardim Do Globo:\n06:05 - 07:05 - 08:05 - 09:05 - 10:05 - 11:05 - 12:05 - 13:05\n\nCentro X Tancredo Esteves\n\n(Segunda a Sexta- Feira)\n\nSaída do Jardim Do Globo:\n05:50 - 06:50 - 07:50 - 08:50 - 09:50 - 10:50 - 11:50 - 12:50 - 13:50 - 14:50 - 15:50 - 16:50 - 17:50 - 18:50 - 19:50 - 21:30.\n\n( Sábado)\n\nSaída do Jardim Do Globo:\n05:50 - 06:50 - 07:50 - 08:50 - 09:50 - 10:50 - 11:50 - 12:50\n\nCentro X Roman\n\n(Segunda a Sexta- Feira)\n\nSaída do Jardim Do Globo:\n05:50- 06:50 - 07:50 - 12:50 - 15:50 - 16:50 - 18:50\n\n(Sábado)\n\nSaída do Jardim Do Globo:\n05:50- 06:50 - 07:50 - 12:50");
        obs.setText("");
        obsH.setText("");
    }
}