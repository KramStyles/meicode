package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SpinnerList extends AppCompatActivity {
    private ListView lstCities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_list);

        lstCities = findViewById(R.id.lstCities);
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Zurich");
        cities.add("Lagos");
        cities.add("Benin");
        cities.add("Amsterdam");
        cities.add("Peru");
        cities.add("Togolese");
        cities.add("Kingston");
        cities.add("Kirkland");
        cities.add("Kirkwood");
        cities.add("Knox");
        cities.add("Kortright");
        cities.add("La Grange");
        cities.add("Lackawanna ©");
        cities.add("LaFayette");
        cities.add("Lake George");
        cities.add("Lake Luzerne");
        cities.add("Lake Pleasant");
        cities.add("Lancaster");
        cities.add("Lansing");
        cities.add("Lapeer");
        cities.add("Laurens");
        cities.add("Lawrence");
        cities.add("Le Ray");
        cities.add("Le Roy");
        cities.add("Lebanon");
        cities.add("Ledyard");
        cities.add("Lee");
        cities.add("Leicester");
        cities.add("Lenox");
        cities.add("Leon");
        cities.add("Lewis");
        cities.add("Lewis");
        cities.add("Lewisboro");
        cities.add("Lewiston");
        cities.add("Lexington");
        cities.add("Leyden");
        cities.add("Liberty");
        cities.add("Lima");
        cities.add("Lincklaen");
        cities.add("Lincoln");
        cities.add("Lindley");
        cities.add("Lisbon");
        cities.add("Lisle");
        cities.add("Litchfield");
        cities.add("Little Falls ©");
        cities.add("Little Falls");
        cities.add("Little Valley");
        cities.add("Livingston");
        cities.add("Livonia");
        cities.add("Lloyd");
        cities.add("Locke");
        cities.add("Lockport ©");
        cities.add("Lockport");
        cities.add("Lodi");
        cities.add("Long Beach ©");
        cities.add("Long Lake");
        cities.add("Lorraine");
        cities.add("Louisville");
        cities.add("Lowville");
        cities.add("Lumberland");
        cities.add("Lyme");
        cities.add("Lyndon");
        cities.add("Lyons");
        cities.add("Lyonsdale");
        cities.add("Lysander");
        cities.add("Macedon");
        cities.add("Machias");
        cities.add("Macomb");
        cities.add("Madison");
        cities.add("Madrid");
        cities.add("Maine");
        cities.add("Malone");
        cities.add("Malta");
        cities.add("Mamakating");
        cities.add("Mamaroneck");
        cities.add("Manchester");
        cities.add("Manheim");
        cities.add("Manlius");
        cities.add("Mansfield");
        cities.add("Marathon");
        cities.add("Marbletown");
        cities.add("Marcellus");
        cities.add("Marcy");
        cities.add("Marilla");
        cities.add("Marion");
        cities.add("Marlborough");
        cities.add("Marshall");
        cities.add("Martinsburg");
        cities.add("Maryland");
        cities.add("Masonville");
        cities.add("Massena");
        cities.add("Mayfield");
        cities.add("Mc Donough");
        cities.add("Mechanicville ©");
        cities.add("Mendon");
        cities.add("Mentz");
        cities.add("Meredith");
        cities.add("Mexico");
        cities.add("Middleburgh");
        cities.add("Middlebury");
        cities.add("Middlefield");
        cities.add("Middlesex");
        cities.add("Middletown");

//        Adapter required to pass in list of cities to list item with design
        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cities);
        lstCities.setAdapter(citiesAdapter);

        lstCities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SpinnerList.this, cities.get(position) + " Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}