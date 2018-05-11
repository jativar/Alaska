package com.jativa.ramiro.alaska;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {


    private static final LatLng PERTH = new LatLng(-31.952854, 115.857342);
    private static final LatLng SYDNEY = new LatLng(-33.87365, 151.20689);
    private static final LatLng BRISBANE = new LatLng(-27.47093, 153.0235);

    private GoogleMap mMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }


    /*

    Display Map types:

    There are many types of maps available within the Maps SDK for Android.
    A map's type governs the overall representation of the map.
    For example, an atlas usually contains political maps that focus on showing boundaries,
    and road maps that show all of the roads for a city or region.

    The Maps SDK for Android offers four types of maps, as well as an option to have no map at all:

    Normal:

    Typical road map. Shows roads, some features built by humans,
    and important natural features like rivers. Road and feature labels are also visible.

    Hybrid:

    Satellite photograph data with road maps added. Road and feature labels are also visible.

    Satellite:

    Satellite photograph data. Road and feature labels are not visible.

    Terrain:

    Topographic data. The map includes colors, contour lines and labels, and perspective shading.
    Some roads and labels are also visible.

    None:

    No tiles. The map will be rendered as an empty grid with no tiles loaded.

    For more information, please look at:
    https://developers.google.com/maps/documentation/android-sdk/map

     */

    public void display_normal_type_map (View v) {
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

    }

    public void display_hybrid_type_map (View v) {
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

    }

    public void display_satellite_type_map (View v) {
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

    }

    public void display_terrain_type_map (View v) {
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

    }

    /**
     * Called when the map is ready.
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

        // Date: Sun 29 Apr 2018
        // Purpose: Add some markers to the map, and add a data object to each marker

        // Add a marker in Sydney Opera House and move the camera
        LatLng sydney = SYDNEY;
        mMap.addMarker(new MarkerOptions()
                .position(sydney)
                .title("Marker in Sydney.")
                .draggable(true)
                .snippet("Population: 5 Million People.")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        // Add a marker in Brisbane and move the camera
        LatLng perth = PERTH;
        mMap.addMarker(new MarkerOptions()
                .position(perth)
                .title("Marker in Perth.")
                .draggable(true)
                .snippet("Population: 2.0 million.")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(perth));

        // Add a marker in Brisbane and move the camera
        LatLng brisbane = BRISBANE;
        mMap.addMarker(new MarkerOptions()
                .position(brisbane)
                .title("Marker in Brisbane.")
                .draggable(true)
                .snippet("Population of more than 3.5 million.")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(brisbane));

        // Next to code: research how to implement Polyline.

        // Change the Map Type. Other supported types include:
        // MAP_TYPE_NORMAL, MAP_TYPE_TERRAIN, MAP_TYPE_HYBRID AND MAP_TYPE_NONE
        //mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        //mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        // Here add buttons at top of map fragment API V2
        // layout.  This will help to change the MAP_TYPE
        // as we wish.
        // The button was added. Next Steps is to add a onClickListerner.
        // So, when the user click on the button the action to select the
        // type of map will take place.
        /* to do this we need to probably implement a onClickListener
        by extending the class MapsActivity. Not Sure.  Or simply by
        implementing the OnClick method.
        For more examples check it out:
        https://stackoverflow.com/questions/29128892/android-extends-two-classes-in-same-activity
         or

         */
    }



}
