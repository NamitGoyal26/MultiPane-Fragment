package com.example.magicman.multifragmentassignment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment
{
    ListView lv;
    String list[];


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_first, container, false);
        lv = (ListView) view.findViewById(R.id.listView);
        list=getResources().getStringArray(R.array.List_Name);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,list);
        lv.setAdapter(adapter);
       /* lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if (position==0)
                {
                    String s1="Cupcake";
                    String s2="Version 1.5";
                    //String s3="R.drawable.cupcake.png";
                    FragmentManager fm=getFragmentManager();
                    SecondFragment frg= (SecondFragment) fm.findFragmentById(R.id.fragment4);
                    frg.showmessage(s1);
                    frg.showmessage2(s2);


                }


            }
        });*/
        return view;
    }

}
