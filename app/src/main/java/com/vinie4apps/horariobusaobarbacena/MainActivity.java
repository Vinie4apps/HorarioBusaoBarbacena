package com.vinie4apps.horariobusaobarbacena;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SearchView;

import com.appodeal.ads.Appodeal;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Classes antes do OnCreate
    private AdView mAdView;

    ListView listView;
    ListViewAdapter adapter;
    String[] linhas;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




// Layout para MSG do Covid


        int orientation = this.getResources().getConfiguration().orientation;
        if ( orientation == Configuration.ORIENTATION_PORTRAIT) {
            showStartDialog();
        }
        Appodeal.initialize(this, "0944e37a9a5cb4dcf6d9679b98dc5556f28c901a8585f572", Appodeal.BANNER, true);
        Appodeal.setBannerViewId(R.id.appodealBannerView);
        Appodeal.show(this, Appodeal.BANNER_VIEW);

        // Actionbar Configurações

        Toolbar toolbar = findViewById(R.id.toobar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Horário Busão Barbacena");


        // Strings de Linhas e icones

        linhas = new String[]

                {"101 - RODOVIÁRIA", "105 - JOÃO PAULO II X BOA VISTA /CAIÇARAS - RIVELLI","106 - IPANEMA X EXPOSIÇÃO X NOVA SUÍÇA","107 - VILELA MUSEU X PONTE DO COSME","108 - VALENTIM PRENASSI X VILELA HOSPITAL X VALENTIM PRENASSI","109 - VILA DOS SARGENTOS/RODOVIÁRIA","112 - BANANAL","117 - SANTA CECILIA","118 - SÃO FRANCISCO","124 - JOSÉ LUIZ","137 - SANTA CECILIA | EUCISA | VIA MONTE MARIO","148 - NOVE DE MARÇO","150 - VISTA ALEGRE | CENTRO TANCREDO ESTEVES","160 - NOVA CIDADE","200 - RODOVIÁRIA","210 - NOVO HORIZONTE / VIA SÃO PEDRO","220 - SANTA EFIGÊNIA / VIA SÃO PEDRO","230 - SANTO ANTONIO","240 - SANTO ANTONIO | ROSELANCHE","250 - ÁGUA SANTA | VIA SÃO PEDRO","260 - SÃO PEDRO","270 - PINHEIRO GROSSO","301 - MONTE MARIO","302 - MONTE MARIO | FARIA","303 - SANTA TEREZA | MONTE MARIO","400 - CORREIA DE ALMEIDA","400A - CAMPESTRE","401 - SENHORA DAS DORES","401A - SENHORA DAS DORES / VIA COSTAS","402 - TORRES","403 - PADRE BRITO","513 - LAVRINHA VIA COLONIA",};



        icon = new int[]


                {R.drawable.ic_baseline_directions_bus_24, R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24,R.drawable.ic_baseline_directions_bus_24, };



        //Config da ListView

        listView = findViewById(R.id.lv);

        for (int i =0; i<linhas.length; i++){
            Model model = new Model(linhas[i],icon[i]);
            arrayList.add(model);
        }

        adapter = new ListViewAdapter(this, arrayList);

        listView.setAdapter(adapter);

    }

    private void showStartDialog() {
        new AlertDialog.Builder(this)
                .setTitle("AVISO")
                .setMessage("Por conta das medidas de prevenção causada pelo COVID-19 algumas linhas podem ter horários modificados ou cancelados sem aviso prévio, o App não se responsabiliza pelas alterações ou cancelamento excepcionais de horários de alguma linha. Obrigado pela compreensão !")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create().show();

    }

    // Config do Menu e da Searchview


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.searchView);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setQueryHint("Pesquise sua Linha Aqui !");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }

    // Config do botão Menu (Sobre App)


}
