package com.salmanwahed.dotslider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ScreenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScreenFragment extends Fragment {
    private static final String ARG_PARAM = "position";

    private Integer mParam;

    public ScreenFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param position Parameter.
     * @return A new instance of fragment ScreenFragment.
     */
    public static ScreenFragment newInstance(int position) {
        ScreenFragment fragment = new ScreenFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam = getArguments().getInt(ARG_PARAM);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_screen, container, false);
        TextView textView = (TextView) view.findViewById(R.id.tvPage);
        textView.setText(String.format(Locale.US, "Page: %d", mParam+1));
        return view;
    }
}
