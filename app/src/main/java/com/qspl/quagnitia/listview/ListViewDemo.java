package com.qspl.quagnitia.listview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewDemo extends AppCompatActivity {
    ListView lvList;
    Context context=this;
    String cities[]={"Nashik","Mumbai","Pune","Ahemednagar","Aurangabad","Satara","Kolhapur","Dhule","Nandurbar","Sangali","Shirdi","Jalgaon","Nandgaon","Malegaon","Bhusaval","Akola","Nanded","Katraj"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_demo);
        lvList=findViewById(R.id.lvList);

        ArrayAdapter<String> myArray=new ArrayAdapter<>(context,android.R.layout.simple_list_item_1,cities);
        lvList.setAdapter(myArray);




    }
}
