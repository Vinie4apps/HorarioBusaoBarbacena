package com.vinie4apps.horariobusaobarbacena;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.vinie4apps.horariobusaobarbacena.Linhas.Linha101e200;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha105;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha106;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha107;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha108;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha109;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha112;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha117;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha118;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha124;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha137;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha148;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha150;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha160;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha210;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha220;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha230;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha240;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha250;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha260;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha270;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha301;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha302;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha303;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha400;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha400A;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha401;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha401A;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha402;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha403;
import com.vinie4apps.horariobusaobarbacena.Linhas.Linha513;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter{


    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;


    public ListViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.linhas);
            holder.mIconIv = view.findViewById(R.id.corbus);


            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }

        holder.mTitleTv.setText(modellist.get(postition).getTitle());


        holder.mIconIv.setImageResource(modellist.get(postition).getIcon());

        

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (modellist.get(postition).getTitle().equals("101 - RODOVIÁRIA")) {
                    Intent intent = new Intent(mContext, Linha101e200.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("105 - João Paulo II X Boa Vista /Caiçaras - Rivelli")) {
                    Intent intent = new Intent(mContext, Linha105.class);
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("106 - IPANEMA X EXPOSIÇÃO X NOVA SUÍÇA")) {
                    Intent intent = new Intent(mContext, Linha106.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("107 - VILELA MUSEU X PONTE DO COSME")) {
                    Intent intent = new Intent(mContext, Linha107.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("108 - VALENTIM PRENASSI X VILELA HOSPITAL X VALENTIM PRENASSI")) {
                    Intent intent = new Intent(mContext, Linha108.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("109 - VILA DOS SARGENTOS/RODOVIÁRIA")) {
                    Intent intent = new Intent(mContext, Linha109.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("112 - BANANAL")) {
                    Intent intent = new Intent(mContext, Linha112.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("117 - SANTA CECILIA")) {
                    Intent intent = new Intent(mContext, Linha117.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("124 - JOSÉ LUIZ")) {
                    Intent intent = new Intent(mContext, Linha124.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("118 - SÃO FRANCISCO")) {
                    Intent intent = new Intent(mContext, Linha118.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("137 - SANTA CECILIA | EUCISA | VIA MONTE MARIO")) {
                    Intent intent = new Intent(mContext, Linha137.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("148 - NOVE DE MARÇO")) {
                    Intent intent = new Intent(mContext, Linha148.class);
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("150 - VISTA ALEGRE | CENTRO TANCREDO ESTEVES")) {
                    Intent intent = new Intent(mContext, Linha150.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("160 - NOVA CIDADE")) {
                    Intent intent = new Intent(mContext, Linha160.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("210 - NOVO HORIZONTE / VIA SÃO PEDRO")) {
                    Intent intent = new Intent(mContext, Linha210.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("220 - SANTA EFIGÊNIA / VIA SÃO PEDRO")) {
                    Intent intent = new Intent(mContext, Linha220.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("230 - SANTO ANTONIO")) {
                    Intent intent = new Intent(mContext, Linha230.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("270 - PINHEIRO GROSSO")) {
                    Intent intent = new Intent(mContext, Linha270.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("301 - MONTE MARIO")) {
                    Intent intent = new Intent(mContext, Linha301.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("302 - MONTE MARIO | FARIA")) {
                    Intent intent = new Intent(mContext, Linha302.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("400 - CORREIA DE ALMEIDA")) {
                    Intent intent = new Intent(mContext, Linha400.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("303 - SANTA TEREZA | MONTE MARIO")) {
                    Intent intent = new Intent(mContext, Linha303.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("401 - SENHORA DAS DORES")) {
                    Intent intent = new Intent(mContext, Linha401.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("401A - SENHORA DAS DORES / VIA COSTAS")) {
                    Intent intent = new Intent(mContext, Linha401A.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("240 - SANTO ANTONIO | ROSELANCHE")) {
                    Intent intent = new Intent(mContext, Linha240.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("513 - LAVRINHA VIA COLONIA")) {
                    Intent intent = new Intent(mContext, Linha513.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("250 - ÁGUA SANTA | VIA SÃO PEDRO")) {
                    Intent intent = new Intent(mContext, Linha250.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("402 - TORRES")) {
                    Intent intent = new Intent(mContext, Linha402.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("260 - SÃO PEDRO")) {
                    Intent intent = new Intent(mContext, Linha260.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("403 - PADRE BRITO")) {
                    Intent intent = new Intent(mContext, Linha403.class);
                    mContext.startActivity(intent);
                }

                if (modellist.get(postition).getTitle().equals("400A - CAMPESTRE")) {
                    Intent intent = new Intent(mContext, Linha400A.class);
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("200 - RODOVIÁRIA")) {
                    Intent intent = new Intent(mContext, Linha101e200.class);
                    mContext.startActivity(intent);
                }

            }
        });


        return view;
    }

    //filtro

    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}