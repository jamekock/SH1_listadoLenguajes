package com.sh1.listadolenguajes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listView ;
    ArrayList<String> arrayList = new ArrayList<>();
    HashMap<String, String> map = new HashMap<String, String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList.add("PHP");
        arrayList.add("Java");
        arrayList.add("GO");
        arrayList.add("Kotlin");
        arrayList.add("JavaScript");
        arrayList.add("CSharp");
        arrayList.add("VB");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList);

        listView = findViewById(R.id.ListView);
        listView.setAdapter(arrayAdapter);

        map.put("PHP","PHP fue desarrollado por Rasmus Lerdorf en 1994.");
        map.put("Java","Java fue desarrollado por James Gosling y Sun Microsystems en 1996.");
        map.put("GO","GO fue desarrollado por Google en 1996.");
        map.put("Kotlin","Kotlin fue desarrollado por JetBrains en 2016.");
        map.put("JavaScript", "JavaScript fue desarrollado por Netscape en 1995.");
        map.put("CSharp","CSharp fue desarrollado por Microsoft en 2000.");
        map.put("VB","Visual Basic fue desarrollado por Microsoft en 1992.");

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),map.get(parent.getAdapter().getItem(position)),Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }
}