package com.example.ipark;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.ipark.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback{

    private GoogleMap mMap, mMap2, mMap3, mMap4, mMap5;

    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



        Button book = findViewById(R.id.btn_book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BookActivity.class);
                startActivity(intent);
            }
        });


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap2 = googleMap;
        mMap3 = googleMap;
        mMap4 = googleMap;
        mMap5 = googleMap;

        // Add a marker in Sydney and move the camera 44.439663, 26.096306.
        LatLng bucharest = new LatLng(44.439663, 26.096306);
        mMap.addMarker(new MarkerOptions().position(bucharest).title("C.A. Rosseti Parking 8/15")).showInfoWindow();
        //44.435215, 26.102062 Universitate
        LatLng bucharest2 = new LatLng(44.435215, 26.102062);
        mMap2.addMarker(new MarkerOptions().position(bucharest2).title("University Square Parking 280/1000")).showInfoWindow();;
        //Edgar Q 44.438239, 26.098032
        LatLng bucharest3 = new LatLng(44.438239, 26.098032);
        mMap3.addMarker(new MarkerOptions().position(bucharest3).title("Edgar Quinet Parking 2/10")).showInfoWindow();
        //Piata Romana 44.446130, 26.095618
        LatLng bucharest4 = new LatLng(44.446130, 26.095618);
        mMap4.addMarker(new MarkerOptions().position(bucharest4).title("Roman Square Parking 49/50")).showInfoWindow();
        //Cocor 44.430409, 26.104641
        LatLng bucharest5   = new LatLng(44.430409, 26.104641);
        mMap5.addMarker(new MarkerOptions().position(bucharest5).title("Cocor Parking 30/50")).showInfoWindow();


        mMap.moveCamera(CameraUpdateFactory.newLatLng(bucharest));
        //mMap2.moveCamera(CameraUpdateFactory.newLatLng(bucharest2));
        //mMap3.moveCamera(CameraUpdateFactory.newLatLng(bucharest3));
        //mMap4.moveCamera(CameraUpdateFactory.newLatLng(bucharest4));
        //mMap5.moveCamera(CameraUpdateFactory.newLatLng(bucharest5));
    }
}