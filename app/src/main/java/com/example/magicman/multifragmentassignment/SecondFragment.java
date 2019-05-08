package com.example.magicman.multifragmentassignment;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.magicman.multifragmentassignment.R.drawable.cupcake;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment
{
    ImageView iv;
    TextView v1,v2;
    Bitmap bmp;


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_second, container, false);
        iv= (ImageView) view.findViewById(R.id.imageView);
        v1= (TextView) view.findViewById(R.id.textView);
        v2= (TextView) view.findViewById(R.id.textView2);




        return view;
    }
    public void showmessage(String msg)
    {
        v1.setText(msg);
    }
    public void showmessage2(String msg2)
    {
        v2.setText(msg2);
    }


}
