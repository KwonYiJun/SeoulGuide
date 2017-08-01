package seoulguide.android.myapplicationdev.com.seoulguide.mFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import seoulguide.android.myapplicationdev.com.seoulguide.MainActivity;
import seoulguide.android.myapplicationdev.com.seoulguide.R;
import seoulguide.android.myapplicationdev.com.seoulguide.attraction1;
import seoulguide.android.myapplicationdev.com.seoulguide.mData.Data;
import seoulguide.android.myapplicationdev.com.seoulguide.mListView.CustomAdapter;

/**
 * Created by 15031795 on 5/5/2017.
 */

public class AttractionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_attraction, container, false);
        ListView lv = (ListView) rootView.findViewById(R.id.lvAttraction);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(), getAttraction());
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "Saved Successfully", Toast.LENGTH_LONG).show();
//                int itm= (int) adapterView.getItemAtPosition(i);
                switch (i) {
                    case 0:
                        Toast.makeText(getActivity(), "Saved Successfully", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getActivity(), attraction1.class);
                        getActivity().startActivity(intent);
                    case 1:
                        Toast.makeText(getActivity(), "Saved Successfully", Toast.LENGTH_LONG).show();
                        Intent intent1 = new Intent(getActivity(), MainActivity.class);
                        getActivity().startActivity(intent1);
                }
            }
        });
        return rootView;

    }

        private ArrayList<Data> getAttraction () {
            ArrayList<Data> attraction = new ArrayList<>();

            Data data = new Data("Namsan Seoul Tower", "04340  105, Namsangongwon-gil, Yongsan-gu, Seoul, Korea (Yongsan-dong 2-ga, YTN Seoul Tower)", R.drawable.nseoultower);
            attraction.add(data);

            data = new Data("Gyeongbokgung Palace", "03045  161, Sajik-ro, Jongno-gu, Seoul", R.drawable.gyeongbukdung);
            attraction.add(data);

            data = new Data("MyeongDong", "04536  27, Myeong-dong 8-gil, Jung-gu, Seoul", R.drawable.myeongdong);
            attraction.add(data);

            data = new Data("Namdaemun Market", "04529  21, Namdaemunsijang 4-gil, Jung-gu, Seoul", R.drawable.namdaemun);
            attraction.add(data);

            return attraction;


        }

        @Override
        public String toString () {
            String title = "Attraction";
            return title;
        }


    }
