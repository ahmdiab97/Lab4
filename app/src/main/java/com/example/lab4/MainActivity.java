package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] travel={"cairo","aswan", "Alexandria", "Restaurants page"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main,R.id.travel,travel));
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position){
            case 0:
                startActivity(new Intent(MainActivity.this, cairo.class));
                break;

            case 1:
                startActivity(new Intent(MainActivity.this, aswan.class));
                break;

            case 2:
                startActivity(new Intent(MainActivity.this, alex.class));
                break;

            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/remood.places?igshid=pk7w6r16kulz")));
                break;

        }
    }
}
