package com.example.medbot;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.medbot.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
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

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));



        LatLng sydney12 = new LatLng(12.9451, 80.1296);
        mMap.addMarker(new MarkerOptions().position(sydney)

                .title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney12));

        LatLng sydney2 = new LatLng(12.9051, 80.1590);
        mMap.addMarker(new MarkerOptions().position(sydney2)
               // .icon(BitmapDescriptorFactory.fromResource(R.drawable.bunk))
                .title("SAIRAM BLOOD CENTRE - 9942694615 "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney2));

        LatLng sydney3 = new LatLng(12.7051, 80.0296);
        mMap.addMarker(new MarkerOptions().position(sydney3)
               // .icon(BitmapDescriptorFactory.fromResource(R.drawable.bunk))
                .title("TAMILNADU BLOODUNIT CENTRE - 9043197299"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney3));

        LatLng sydney4 = new LatLng(12.8408, 80.2396);
        mMap.addMarker(new MarkerOptions().position(sydney4)
               // .icon(BitmapDescriptorFactory.fromResource(R.drawable.bunk))
                .title("APOLLO BLOOD HUB - 9934567892"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney4));


        LatLng sydney5 = new LatLng(12.8158, 79.2896);
        mMap.addMarker(new MarkerOptions().position(sydney5)
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.bunk))
                .title("KAMACHI HOSPITAL BLOOD CENTRE - 99567547812"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney5));



        LatLng sydney6 = new LatLng(12.8158, 79.0890);
        mMap.addMarker(new MarkerOptions().position(sydney6)
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.bunk))
                .title("UNO BLOOD BUS - 99567547812"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney6));


        LatLng sydney7 = new LatLng(12.8658, 80.0140);
        mMap.addMarker(new MarkerOptions().position(sydney7)
                .title("CHENNAI BLOOD BUS - 99567547812"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney7));
    }
}