package com.example.cristiantello.appdevelop;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Cristian Tello on 29-09-2017.
 */

public class FragmentA extends Fragment {
    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){ //Estos nombres son los que habitualmente se utilizan.

        rootView = inflater.inflate(R.layout.fragmenta,container,false);

        return rootView; //Si tira error es porque hay que devolver algo y se llama generalmente como "rootView"

    }

}
