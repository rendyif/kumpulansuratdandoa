package kumpulansuratdandoadoa.kumpulansuratpendekdandoa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Doa2Activity extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;

    String[] namaDoa = {
            "Doa Sapu Jagad", "Doa Mohon Ampunan Bagi Orangtua",
            "Doa Kesabaran dan Minta Pertolongan",
            "Doa Diterima Amalan", "Doa Keluarga Bahagia", "Doa Perlindungan dari Kesesatan",
            "Doa Mohon Anugerah Kekuatan, Kekuasaan, dan Rezeki", "Doa Mohon Pertolongan",
            "Doa Curahan Rizki", "Doa Mohon Ampunan dan Rahmat",
            "Doa Diberikan Kemampuan Bersyukur"};
    int[] gambarDoa = {
            R.drawable.g1,
            R.drawable.g2,
            R.drawable.g3,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa2);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        listView = (ListView) findViewById(R.id.listView);
        //MyAdapter myAdapter = new MyAdapter(Doa2Activity.this, namaDoa, gambarDoa);
        //listView.setAdapter(myAdapter);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Doa2Activity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.doa2));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Doa2Activity.this, DetailDoaActivity.class);
                intent.putExtra("NamaDoa", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

        listView.setAdapter(mAdapter);

        //listView.setAdapter(myAdapter);




//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace bla bla bla", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void showDoa_1(View view){
        showDoaDetail("Ini detail doa 1");
    }

    public void showDoa_2(View view){
        showDoaDetail("Ini detail doa 2");
    }

    public void showDoa_3(View view){
        showDoaDetail("Ini detail doa 3");
    }

    public void showDoaDetail(String message) {
        Intent intent = new Intent(this, DetailDoaActivity.class);
        startActivity(intent);
    }


}
