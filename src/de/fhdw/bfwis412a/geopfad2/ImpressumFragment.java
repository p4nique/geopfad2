package de.fhdw.bfwis412a.geopfad2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ImpressumFragment extends Fragment {
	
	public ImpressumFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_impressum, container, false);
         
        return rootView;
    }
}
