package com.example.cadastromedico.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.cadastromedico.model.Especialidade;

import java.util.List;

import androidx.annotation.NonNull;

public class EspecialidadeAdapter extends ArrayAdapter<Especialidade>{
    private int rId;

    public EspecialidadeAdapter(Context context, int resource, List<Especialidade> objects) {
        super(context, resource, objects);
        rId = resource;
    }

     @Override
     public View getView(int position, View currentView, ViewGroup parent){
         Especialidade especialidade= getItem(position);

         TextView textEspecialidade = (TextView)super.getView(position,currentView,parent);
         textEspecialidade.setText(especialidade.getNome());

         return textEspecialidade ;
     }

    @Override
    public View getDropDownView(int position, View currentView, ViewGroup parent) {
        Especialidade especialidade = getItem(position);
        TextView label = (TextView) super.getDropDownView(position, currentView, parent);
        label.setText(especialidade.getNome());

        return label;
    }
}
