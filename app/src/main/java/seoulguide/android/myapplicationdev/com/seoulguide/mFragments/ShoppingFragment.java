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

public class ShoppingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_shopping,container,false);

        ListView lv = (ListView) rootView.findViewById(R. id. lvShopping);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getShopping());

        lv.setAdapter(adapter);

        return rootView;
    }

    private ArrayList<Data> getShopping() {
        ArrayList<Data> shopping = new ArrayList<>();

//        Data data = new Data("", "", R.drawable.korean);
//
//        shopping.add(data);

        Data data = new Data("MyeongDong", "Myeongdong-gil, Jung-gu, Seoul", R.drawable.myeongdong);
        shopping.add(data);

        data = new Data("Ewha Woman’s University Shopping Street", "52, Ewhayeodae-gil, Seodaemun-gu, Seoul", R.drawable.ewha);
        shopping.add(data);

        data = new Data("Lotte Department Store’s Main Branch", "30, Eulji-ro 11-gil, Jung-gu, Seoul", R.drawable.lotte);
        shopping.add(data);

        data = new Data("Namdaemun Market", "21 Namdaemunsijang 4-gil, Jung-gu, Seoul", R.drawable.namdaemun);
        shopping.add(data);

        return shopping;
    }

    @Override
    public String toString() {
        String title = "Shopping";
        return title;
//        return "Dining";
    }
}
