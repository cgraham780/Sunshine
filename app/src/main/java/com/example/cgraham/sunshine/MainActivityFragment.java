package com.example.cgraham.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> m_ForecastAdapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        String[] MyStringArray = {  "Today - Sunny - 28/18",
                                    "Tomorrow - Rain - 23/15",
                                    "Friday - Sunny - 25/13",
                                    "Saturday - Sunny - 26/19",
                                    "Sunday - Sunny - 25/16",
                                    "Monday - Sunny - 25/18"};
        List<String> forecast = new ArrayList<>(Arrays.asList(MyStringArray));
        m_ForecastAdapter = new ArrayAdapter<>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                forecast
        );

        ListView m_view = (ListView) rootView.findViewById(R.id.listview_forecast);
        m_view.setAdapter(m_ForecastAdapter);

        return rootView;
    }
}
