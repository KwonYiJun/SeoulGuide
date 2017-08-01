package seoulguide.android.myapplicationdev.com.seoulguide.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import seoulguide.android.myapplicationdev.com.seoulguide.R;
import seoulguide.android.myapplicationdev.com.seoulguide.mData.Data;
import seoulguide.android.myapplicationdev.com.seoulguide.mListView.CustomAdapter;

/**
 * Created by 15031795 on 5/5/2017.
 */

public class DiningFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_dining,container,false);

        ListView lv = (ListView) rootView.findViewById(R. id. lvDining);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getDining());

        lv.setAdapter(adapter);

        return rootView;
    }

    private ArrayList<Data> getDining() {
        ArrayList<Data> dining = new ArrayList<>();
//
//        Data data = new Data("", "", R. drawable.korean);
//
//        dining.add(data);

        Data data = new Data("Cheong-Nyun Tteokbokki (청년떡볶이)", "Express Bus Terminal (Goto Mall), 1-9 Banpo 2(i)-dong, Seocho-gu, Seoul", R.drawable.deokboki);
        dining.add(data);

        data = new Data("Palsaek Samgyeopsal (팔색삼겹살)", "18, Baekbeom-ro, Mapo-gu, Seoul", R.drawable.yoogane);
        dining.add(data);

        data = new Data("Migal Maeki-sal (미갈매기살)", "7-1 Donui-dong, Jongno-gu, Seoul", R.drawable.samgyeopsal);
        dining.add(data);

        data = new Data("Yoogane Chicken Galbi (유가네 닭갈비)", "3-1 Myeongdong 2(i)-ga, Seoul or 66-6 Chungmuro 2(i)-ga, Seoul", R.drawable.migalmaekisal);
        dining.add(data);

        return dining;
    }

    @Override
    public String toString() {
        String title = "Dining";
        return title;
//        return "Dining";
    }
}
