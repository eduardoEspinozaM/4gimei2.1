package a4gcelulares.com.a4ginfoimei.view.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import a4gcelulares.com.a4ginfoimei.R;

/**
 * Created by 4g on 27/11/2017.
 */

public class RegistroImeiFragment extends Fragment {
private Button button;
    TextView textView;
    TelephonyManager manager;
    String IMEI;
    TextView textmesaje;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView;
        rootView = inflater.inflate(R.layout.fragment_registrar, container, false);
        return rootView;






    }}



//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_registrar);
//    }