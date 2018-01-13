package kumpulansuratdandoadoa.kumpulansuratpendekdandoa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import kumpulansuratdandoadoa.kumpulansuratpendekdandoa.slider.FragmentSlider;
import kumpulansuratdandoadoa.kumpulansuratpendekdandoa.slider.SliderIndicator;
import kumpulansuratdandoadoa.kumpulansuratpendekdandoa.slider.SliderPagerAdapter;
import kumpulansuratdandoadoa.kumpulansuratpendekdandoa.slider.SliderView;

public class MainActivity extends AppCompatActivity {

    private SliderPagerAdapter mAdapter;
    private SliderIndicator mIndicator;

    private SliderView sliderView;
    private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sliderView = (SliderView) findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) findViewById(R.id.pagesContainer);
        setupSlider();
    }


    private void setupSlider() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(FragmentSlider.newInstance("http://res.cloudinary.com/dmatqx7gf/image/upload/v1515845455/d2_h5t8dq.jpg"));
        fragments.add(FragmentSlider.newInstance("http://res.cloudinary.com/dmatqx7gf/image/upload/v1515845455/d1_d39ouk.jpg"));
        fragments.add(FragmentSlider.newInstance("http://res.cloudinary.com/dmatqx7gf/image/upload/v1515845455/d3_z9a6bz.jpg"));
        mAdapter = new SliderPagerAdapter(getSupportFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new SliderIndicator(this, mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, Doa2Activity.class);
        startActivity(intent);
    }

    public void suratpendek(View view) {
        Intent intent = new Intent(MainActivity.this, SuratActivity.class);
        startActivity(intent);
    }
}

