package com.example.jesus.demodelfin2017;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;


public class NotifiFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_notifi, container, false);

        ListView lista;
        ArrayAdapter<String> adaptador;

        lista = (ListView)rootView.findViewById(R.id.listaVacia);
        adaptador = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1);
        lista.setAdapter(adaptador);

        String[] camaras = { "Borregos", "Piedritas", "Cafeteria", "Todas" };
        ArrayAdapter adapterCamaras = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_dropdown_item, camaras);
        Spinner spCamaras = (Spinner)rootView.findViewById(R.id.camarasSpinner);
        spCamaras.setAdapter(adapterCamaras);

        String[] alertas = { "Multitud", "Auto en mal sentido", "Peleas", "Asalto", "Todas" };
        ArrayAdapter adapterAlertas = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_dropdown_item, alertas);
        Spinner spAlertas = (Spinner)rootView.findViewById(R.id.alertasSpinner);
        spAlertas.setAdapter(adapterAlertas);

        return rootView;
    }
}
