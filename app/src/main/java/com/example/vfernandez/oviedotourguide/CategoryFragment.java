package com.example.vfernandez.oviedotourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {

    private ArrayList<Location> mLocations;

    public CategoryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.location_list, container, false);

        mLocations = new ArrayList<Location>();

        //Check which category is active and load its items
        Bundle b = this.getArguments();
        switch (b.getString("category")) {
            case "History":
                mLocations.add(new Location(getContext(),
                        R.string.santamaria_title,
                        R.string.santamaria_info,
                        R.string.santamaria_timetable,
                        R.drawable.santamaria,
                        R.drawable.santamaria_icon));
                mLocations.add(new Location(getContext(),
                        R.string.catedralsansalvador_title,
                        R.string.catedralsansalvador_info,
                        R.string.catedralsansalvador_timetable,
                        R.drawable.catedralsansalvador,
                        R.drawable.catedralsansalvador_icon));
                mLocations.add(new Location(getContext(),
                        R.string.monasteriosanpelayo_title,
                        R.string.monasteriosanpelayo_info,
                        R.string.monasteriosanpelayo_timetable,
                        R.drawable.monasteriosanpelayo,
                        R.drawable.monasteriosanpelayo_icon));
                mLocations.add(new Location(getContext(),
                        R.string.camarasanta_title,
                        R.string.camarasanta_info,
                        R.string.camarasanta_timetable,
                        R.drawable.camarasanta,
                        R.drawable.camarasanta_icon));
                mLocations.add(new Location(getContext(),
                        R.string.cascohistorico_title,
                        R.string.cascohistorico_info,
                        R.string.cascohistorico_timetable,
                        R.drawable.cascohistorico,
                        R.drawable.cascohistorico_icon));
                mLocations.add(new Location(getContext(),
                        R.string.universidadoviedo_title,
                        R.string.universidadoviedo_info,
                        R.string.universidadoviedo_timetable,
                        R.drawable.universidadoviedo,
                        R.drawable.universidadoviedo_icon));
                mLocations.add(new Location(getContext(),
                        R.string.basilicasanjuan_title,
                        R.string.basilicasanjuan_info,
                        R.string.basilicasanjuan_timetable,
                        R.drawable.basilicasanjuan,
                        R.drawable.basilicasanjuan_icon));
                mLocations.add(new Location(getContext(),
                        R.string.sanjuliandelosprados_title,
                        R.string.sanjuliandelosprados_info,
                        R.string.sanjuliandelosprados_timetable,
                        R.drawable.sanjuliandelosprados,
                        R.drawable.sanjuliandelosprados_icon));
                mLocations.add(new Location(getContext(),
                        R.string.teatrocampoamor_title,
                        R.string.teatrocampoamor_info,
                        R.string.teatrocampoamor_timetable,
                        R.drawable.teatrocampoamor,
                        R.drawable.teatrocampoamor_icon));
                mLocations.add(new Location(getContext(),
                        R.string.balneariocaldas_title,
                        R.string.balneariocaldas_info,
                        R.string.balneariocaldas_timetable,
                        R.drawable.balneariocaldas,
                        R.drawable.balneariocaldas_icon));
                break;
            case "Museums":
                mLocations.add(new Location(getContext(),
                        R.string.museobellasartes_title,
                        R.string.museobellasartes_info,
                        R.string.museobellasartes_timetable,
                        R.drawable.museobellasartes,
                        R.drawable.museobellasartes_icon));
                mLocations.add(new Location(getContext(),
                        R.string.museoarqueologico_title,
                        R.string.museoarqueologico_info,
                        R.string.museoarqueologico_timetable,
                        R.drawable.museoarqueologico,
                        R.drawable.museoarqueologico_icon));
                mLocations.add(new Location(getContext(),
                        R.string.centroprerromanico_title,
                        R.string.centroprerromanico_info,
                        R.string.centroprerromanico_timetable,
                        R.drawable.centroprerromanico,
                        R.drawable.centroprerromanico_icon));
                break;
            case "Nature":
                mLocations.add(new Location(getContext(),
                        R.string.parqueinvierno_title,
                        R.string.parqueinvierno_info,
                        R.string.parqueinvierno_timetable,
                        R.drawable.parqueinvierno,
                        R.drawable.parqueinvierno_icon));
                mLocations.add(new Location(getContext(),
                        R.string.sendaverde_title,
                        R.string.sendaverde_info,
                        R.string.sendaverde_timetable,
                        R.drawable.sendaverde,
                        R.drawable.sendaverde_icon));
                mLocations.add(new Location(getContext(),
                        R.string.montenaranco_title,
                        R.string.montenaranco_info,
                        R.string.montenaranco_timetable,
                        R.drawable.montenaranco,
                        R.drawable.montenaranco_icon));
                mLocations.add(new Location(getContext(),
                        R.string.rutacascadasguanga_title,
                        R.string.rutacascadasguanga_info,
                        R.string.rutacascadasguanga_timetable,
                        R.drawable.rutacascadasguanga,
                        R.drawable.rutacascadasguanga_icon));
                mLocations.add(new Location(getContext(),
                        R.string.priorio_title,
                        R.string.priorio_info,
                        R.string.priorio_timetable,
                        R.drawable.priorio,
                        R.drawable.priorio_icon));
                mLocations.add(new Location(getContext(),
                        R.string.camposanfrancisco_title,
                        R.string.camposanfrancisco_info,
                        R.string.camposanfrancisco_timetable,
                        R.drawable.camposanfrancisco,
                        R.drawable.camposanfrancisco_icon));
                mLocations.add(new Location(getContext(),
                        R.string.campogolflascaldas_title,
                        R.string.campogolflascaldas_info,
                        R.string.campogolflascaldas_timetable,
                        R.drawable.campogolflascaldas,
                        R.drawable.campogolflascaldas_icon));
                break;
            case "Food":
                mLocations.add(new Location(getContext(),
                        R.string.rutavinos_title,
                        R.string.rutavinos_info,
                        R.string.rutavinos_timetable,
                        R.drawable.rutavinos,
                        R.drawable.rutavinos_icon));
                mLocations.add(new Location(getContext(),
                        R.string.gascona_title,
                        R.string.gascona_info,
                        R.string.gascona_timetable,
                        R.drawable.gascona,
                        R.drawable.gascona_icon));
                mLocations.add(new Location(getContext(),
                        R.string.mercadofontan_title,
                        R.string.mercadofontan_info,
                        R.string.mercadofontan_timetable,
                        R.drawable.mercadofontan,
                        R.drawable.mercadofontan_icon));
                break;
        }

        LocationAdapter adapter = new LocationAdapter(getActivity(), mLocations);

        GridView gridView = (GridView) rootview.findViewById(R.id.list);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Location currentLocation = mLocations.get(i);


                        Intent intent = new Intent(getActivity(), LocationDetailActivity.class);

                        //Pass the location details to a new activity in order to show them
                        intent.putExtra("title", currentLocation.getName());
                        intent.putExtra("info", currentLocation.getInfo());
                        intent.putExtra("timetable", currentLocation.getTimetable());
                        intent.putExtra("image", currentLocation.getImage());

                        startActivity(intent);
                    }
                });

        return rootview;
    }

}
