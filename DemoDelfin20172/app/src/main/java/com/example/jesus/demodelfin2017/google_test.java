package com.example.jesus.demodelfin2017;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class google_test extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_test);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        agregarMarcadores(googleMap);
    }

    public void agregarMarcadores(GoogleMap googleMap)
    {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng biblioteca = new LatLng(19.597146, -99.226672);
        LatLng starbucks  = new LatLng(19.597583, -99.226554);
        LatLng borregos   = new LatLng(19.597688, -99.226549);
        LatLng centroEstudiantil1 = new LatLng(19.598444, -99.225836);
        LatLng centroEstudiantil2 = new LatLng(19.598439, -99.225615);
        LatLng centroEstudiantil3 = new LatLng(19.598312, -99.225750);
        LatLng piedritas1 = new LatLng(19.594751, -99.225983);
        LatLng piedritas2 = new LatLng(19.594799, -99.226049);
        LatLng piedritas3 = new LatLng(19.594811, -99.226069);
        LatLng piedritas4 = new LatLng(19.594441, -99.226589);
        LatLng piedritas5 = new LatLng(19.594435, -99.226574);
        LatLng piedritas6 = new LatLng(19.594426, -99.226538);
        LatLng piedritas7 = new LatLng(19.593869, -99.225901);
        LatLng plazaDelSol1 = new LatLng(19.591692, -99.229894);
        LatLng plazaDelSol2 = new LatLng(19.592166, -99.229983);
        LatLng plazaDelSol3 = new LatLng(19.592171, -99.229893);

        mMap.addMarker( new MarkerOptions().position(biblioteca).title("Biblioteca"));
        mMap.addMarker( new MarkerOptions().position(starbucks).title("Starbucks"));
        mMap.addMarker( new MarkerOptions().position(borregos).title("Borregos"));
        mMap.addMarker( new MarkerOptions().position(centroEstudiantil1).title("Centro Estudiantil 1"));
        mMap.addMarker( new MarkerOptions().position(centroEstudiantil2).title("Centro Estudiantil 2"));
        mMap.addMarker( new MarkerOptions().position(centroEstudiantil3).title("Centro Estudiantil 3"));
        mMap.addMarker( new MarkerOptions().position(piedritas1).title("Piedritas 1"));
        mMap.addMarker( new MarkerOptions().position(piedritas2).title("Piedritas 2"));
        mMap.addMarker( new MarkerOptions().position(piedritas3).title("Piedritas 3"));
        mMap.addMarker( new MarkerOptions().position(piedritas4).title("Piedritas 4"));
        mMap.addMarker( new MarkerOptions().position(piedritas5).title("Piedritas 5"));
        mMap.addMarker( new MarkerOptions().position(piedritas6).title("Piedritas 6"));
        mMap.addMarker( new MarkerOptions().position(piedritas7).title("Piedritas 7"));
        mMap.addMarker( new MarkerOptions().position(plazaDelSol1).title("Plaza del Sol 1"));
        mMap.addMarker( new MarkerOptions().position(plazaDelSol2).title("Plaza del Sol 2"));
        mMap.addMarker( new MarkerOptions().position(plazaDelSol3).title("Plaza del Sol 3"));

        mMap.moveCamera( CameraUpdateFactory.newLatLng(biblioteca) );
        mMap.moveCamera( CameraUpdateFactory.zoomTo(15));
    }
}
