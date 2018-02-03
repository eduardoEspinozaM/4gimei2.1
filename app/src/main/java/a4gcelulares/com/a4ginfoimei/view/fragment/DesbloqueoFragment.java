package a4gcelulares.com.a4ginfoimei.view.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import a4gcelulares.com.a4ginfoimei.R;

/**
 * Created by 4g on 27/11/2017.
 */

public class DesbloqueoFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView;
        rootView = inflater.inflate(R.layout.fragment_desbloqueos,container,false);
        return rootView;
    }

}
