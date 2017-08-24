package com.achalkias.dagger211.main;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.achalkias.dagger211.R;
import com.achalkias.dagger211.service.MainFragmentHelloService;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.AndroidSupportInjection;

public class MainFragment extends Fragment {

    @Inject
    MainFragmentHelloService mainFragmentHelloService;


    private View view;
    /**
     * Hello blank fragment
     */
    private TextView mMainFragmentHello;

   // private Unbinder unbinder;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_main, container, false);

        initView(view);
        sayFragmentHello();

        return view;
    }


    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


    private void initView(View view) {
        mMainFragmentHello = (TextView) view.findViewById(R.id.main_fragment_hello);
    }

    private void sayFragmentHello() {
        mMainFragmentHello.setText(mainFragmentHelloService.sayHello());
    }

}
