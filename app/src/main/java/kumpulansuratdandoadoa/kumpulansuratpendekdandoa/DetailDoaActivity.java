package kumpulansuratdandoadoa.kumpulansuratpendekdandoa;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailDoaActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView gambarDoa;
    TextView judulDoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_doa);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        gambarDoa = (ImageView) findViewById(R.id.imageView);
        judulDoa = (TextView) findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            mToolbar.setTitle(bundle.getString("NamaDoa"));
            if(mToolbar.getTitle().toString().equalsIgnoreCase("Doa Sapu Jagad")){
                gambarDoa.setImageDrawable(ContextCompat.getDrawable(DetailDoaActivity.this, R.drawable.doa_1 ));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Doa Mohon Ampunan Bagi Orangtua")){
                gambarDoa.setImageDrawable(ContextCompat.getDrawable(DetailDoaActivity.this, R.drawable.doa_11 ));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Doa Kesabaran dan Minta Pertolongan")){
                gambarDoa.setImageDrawable(ContextCompat.getDrawable(DetailDoaActivity.this, R.drawable.doa_2 ));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Doa Diterima Amalan")){
                gambarDoa.setImageDrawable(ContextCompat.getDrawable(DetailDoaActivity.this, R.drawable.doa_3 ));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Doa Keluarga Bahagia")){
                gambarDoa.setImageDrawable(ContextCompat.getDrawable(DetailDoaActivity.this, R.drawable.doa_4 ));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Doa Perlindungan dari Kesesatan")){
                gambarDoa.setImageDrawable(ContextCompat.getDrawable(DetailDoaActivity.this, R.drawable.doa_5 ));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Doa Mohon Anugerah Kekuatan, Kekuasaan, dan Rezeki")){
                gambarDoa.setImageDrawable(ContextCompat.getDrawable(DetailDoaActivity.this, R.drawable.doa_6 ));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Doa Mohon Pertolongan")){
                gambarDoa.setImageDrawable(ContextCompat.getDrawable(DetailDoaActivity.this, R.drawable.doa_7 ));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Doa Curahan Rizki")){
                gambarDoa.setImageDrawable(ContextCompat.getDrawable(DetailDoaActivity.this, R.drawable.doa_8 ));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Doa Mohon Ampunan dan Rahmat")){
                gambarDoa.setImageDrawable(ContextCompat.getDrawable(DetailDoaActivity.this, R.drawable.doa_9 ));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Doa Diberikan Kemampuan Bersyukur")){
                gambarDoa.setImageDrawable(ContextCompat.getDrawable(DetailDoaActivity.this, R.drawable.doa_10 ));
            }
        }


//        //Initialize the view
//        TextView doasTitle = (TextView) findViewById(R.id.titleDetail);
//        ImageView doasImage = (ImageView) findViewById(R.id.doaImageDetail);
//
//        //Get the drawable
//        Drawable drawable = ContextCompat.getDrawable
//                (this,getIntent().getIntExtra(Doas.IMAGE_KEY, 0));
//
//        //Create a placeholder gray scrim while the image loads
//        GradientDrawable gradientDrawable = new GradientDrawable();
//        gradientDrawable.setColor(Color.GRAY);
//
//        if(drawable!=null) {
//            gradientDrawable.setSize(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
//        }
//
//        //Set the text from the Intent extra
//        doasTitle.setText(getIntent().getStringExtra(Doas.TITLE_KEY));
//
//        //Load the image using the glide library and the Intent extra
//        Glide.with(this).load(getIntent().getIntExtra(Doas.IMAGE_KEY,0)).placeholder(gradientDrawable).into(doasImage);
    }
}
