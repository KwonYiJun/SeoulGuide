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

public class StayFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_stay,container,false);

        ListView lv = (ListView) rootView.findViewById(R. id. lvStay);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getStay());

        lv.setAdapter(adapter);

        return rootView;
    }

    private ArrayList<Data> getStay() {
        ArrayList<Data> stay = new ArrayList<>();

//        Data data = new Data("", "", R.drawable.korean);
//
//        stay.add(data);

        Data data = new Data("Lotte Hotel Seoul", "30 Eulji-ro, Euljiro 1(il)-ga, Jung-gu, Seoul", R.drawable.lottehotel);
        stay.add(data);

        data = new Data("Sejong Hotel", "145 Toegye-ro, Chungmuro 2(i)-ga, Jung-gu, Seoul", R.drawable.sejong);
        stay.add(data);

        data = new Data("Somerset Palace Seoul", "7 Yulgok-ro 2-gil, Susong-dong, Jongno-gu, Seoul", R.drawable.somersethotel);
        stay.add(data);

        data = new Data("Hotel Manu Seoul", "84-16 Namdaemunno 5-ga, Jung-gu, Seoul", R.drawable.hotelmanu);
        stay.add(data);

        return stay;
    }

    @Override
    public String toString() {
        String title = "Stay";
        return title;
//        return "Dining";
    }
}
