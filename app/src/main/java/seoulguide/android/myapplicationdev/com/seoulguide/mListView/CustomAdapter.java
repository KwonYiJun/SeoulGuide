package seoulguide.android.myapplicationdev.com.seoulguide.mListView;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

import seoulguide.android.myapplicationdev.com.seoulguide.R;
import seoulguide.android.myapplicationdev.com.seoulguide.mData.Data;

/**
 * Created by 15031795 on 5/5/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context c;
    ArrayList<Data> data;
    LayoutInflater inflater;
    CardView cardView;

    public CustomAdapter(Context c, ArrayList<Data> data) {
        this.c = c;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView=inflater.inflate(R.layout.model,parent,false);
        }

        TextView nameTxt =(TextView) convertView.findViewById(R. id. tvName);
        TextView addrTxt =(TextView) convertView.findViewById(R. id. tvAddr);
        ImageButton img = (ImageButton) convertView.findViewById(R. id. image);

        String name = data.get(position).getName();
        String addr = data.get(position).getAddr();
        int image = data.get(position).getImg();

        nameTxt.setText(name);
        addrTxt.setText(addr);
        img.setImageResource(image);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });





        return convertView;
    }


}
