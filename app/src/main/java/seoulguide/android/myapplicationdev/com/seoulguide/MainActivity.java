package seoulguide.android.myapplicationdev.com.seoulguide;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import seoulguide.android.myapplicationdev.com.seoulguide.mFragments.AttractionFragment;
import seoulguide.android.myapplicationdev.com.seoulguide.mFragments.DiningFragment;
import seoulguide.android.myapplicationdev.com.seoulguide.mFragments.MyPagerAdapter;
import seoulguide.android.myapplicationdev.com.seoulguide.mFragments.ShoppingFragment;
import seoulguide.android.myapplicationdev.com.seoulguide.mFragments.StayFragment;


public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    ViewPager vp;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        //viewpager
        vp = (ViewPager) findViewById(R. id. viewPager);
        this.addPages();

        //tablayout
        tabLayout = (TabLayout) findViewById(R. id. tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(this);
    }

    private void addPages() {
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(this.getSupportFragmentManager());
        pagerAdapter.addFragment(new AttractionFragment());
        pagerAdapter.addFragment(new DiningFragment());
        pagerAdapter.addFragment(new ShoppingFragment());
        pagerAdapter.addFragment(new StayFragment());

        //Set adapter to viewpager
        vp.setAdapter(pagerAdapter);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        vp.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
