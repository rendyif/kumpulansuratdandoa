package kumpulansuratdandoadoa.kumpulansuratpendekdandoa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class SuratActivity extends AppCompatActivity {
    public DataAdapter dataAdapter;
    public RecyclerView recyclerView;
    public ArrayList<DataModel> dataModelArrayList=new ArrayList<DataModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surat);

        //membuat data yang akan ditampilkan dalam list
        //file .html mengambil di folder assets
        inputData("Surat An-Nas","artikel_1.html");
        inputData("Surat AL-Falaq","artikel_2.html");
        inputData("Surat Al-Ikhlas","artikel_3.html");
        inputData("Surat Al-Lahab","artikel_4.html");
        inputData("Surat An-Nashr","artikel_5.html");
        inputData("Surat Al-Kafirun","artikel_6.html");
        inputData("Surat Al-Kautsar","artikel_7.html");
        inputData("Surat Al-Ma'un","artikel_8.html");
        inputData("Surat Al-Quraisy","artikel_9.html");
        inputData("Surat Al-Fill","artikel_10.html");
        inputData("Surat Al-Humazah","artikel_11.html");
        inputData("Surat Al-Ashr","artikel_12.html");
        inputData("Surat At-Takasur","artikel_13.html");
        inputData("Surat Al-Qari'ah","artikel_14.html");
        inputData("Surat Al-'Adhiyat","artikel_15.html");
        inputData("Surat Al-Zalzalah","artikel_16.html");
        inputData("Surat Al-Bayyinah","artikel_17.html");
        inputData("Surat Al-Qadr","artikel_18.html");
        inputData("Surat Al-'Alaq","artikel_19.html");
        inputData("Surat At-Tiin","artikel_20.html");
        inputData("Surat Al-Insyirah","artikel_21.html");
        inputData("Surat Ad-Dhuhaa","artikel_22.html");
        inputData("Surat Al-Lail","artikel_23.html");
        inputData("Surat Asy-Syams","artikel_24.html");
        inputData("Surat Al-Balad","artikel_25.html");
        inputData("Surat Al-Fajr","artikel_26.html");
        inputData("Surat Al-Ghasiyahh","artikel_27.html");
        inputData("Surat Al-A'laa","artikel_28.html");
        inputData("Surat Ath-Thaariq","artikel_29.html");
        inputData("Surat Al-Buruuj","artikel_30.html");
        inputData("Surat Al-Insyiqaq","artikel_31.html");
        inputData("Surat Al-Muthaffifin","artikel_32.html");
        inputData("Surat Al-Infithaar","artikel_33.html");
        inputData("Surat At-Takwiir","artikel_34.html");
        inputData("Surat 'Abasa","artikel_35.html");
        inputData("Surat An-Naziat","artikel_36.html");
        inputData("Surat An-Naba","artikel_37.html");
        inputData("Surat Al-Fatihah","artikel_38.html");
        //inputData("Artikel 16","artikel_16.html");

        //menampilkan data ke dalam recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new DataAdapter(this,dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);

        //menambahakan header
        DataModel headerModel = new DataModel();
        headerModel.setViewType(2);
        dataModelArrayList.add(0,headerModel);

        //menambahkan footer
        DataModel footerModel = new DataModel();
        footerModel.setViewType(3);
        dataModelArrayList.add(footerModel);
    }

    //fungsi input
    public void inputData(String judul,String konten){
        DataModel dataModel = new DataModel();
        dataModel.setJudul(judul);
        dataModel.setKonten(konten);
        dataModel.setViewType(1);
        dataModelArrayList.add(dataModel);
    }

}
