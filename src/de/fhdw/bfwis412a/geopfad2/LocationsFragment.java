package de.fhdw.bfwis412a.geopfad2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("ValidFragment")
public class LocationsFragment extends Fragment {
	String filter;

	public LocationsFragment() {
	}

	public LocationsFragment(String filter) {
		this.filter = filter;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_locations,
				container, false);

		return rootView;
	}
}
