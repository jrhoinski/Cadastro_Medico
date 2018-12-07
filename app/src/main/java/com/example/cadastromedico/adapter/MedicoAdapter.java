package com.example.cadastromedico.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.cadastromedico.DAO.MedicoDAO;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MedicoAdapter extends ArrayAdapter<MedicoDAO.MedicoJoin> {

    private int rId;

    public MedicoAdapter(@NonNull Context context, int resource, @NonNull List<MedicoDAO.MedicoJoin> objects) {
        super(context, resource, objects);
        rId = resource;
    }


    @NonNull
    @Override
    public View getView(int position, View currentView,  ViewGroup parent) {
        View mView = currentView;

        if(mView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(rId,null);
        }

        MedicoDAO.MedicoJoin medicoJoin = getItem(position);

        TextView textNomeMedico = mView.findViewById(R.id.textNomeMedico);
        TextView textEspecialidadeMedico = mView.findViewById(R.id.textEspecialidadeMedico);
        TextView textCrmMedico = mView.findViewById(R.id.textCrmMedico);


        textNomeMedico.setText(medicoJoin.medico.getNome().toUpperCase());
        textEspecialidadeMedico.setText(medicoJoin.especialidade.getNome());
        textCrmMedico.setText("Ano: " + String.valueOf(medicoJoin.medico.getCrm()));


        return mView;


    }
}
