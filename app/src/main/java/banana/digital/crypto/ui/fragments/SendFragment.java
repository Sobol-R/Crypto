package banana.digital.crypto.ui.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.web3j.crypto.RawTransaction;
import org.web3j.utils.Convert;

import java.math.BigInteger;

import banana.digital.crypto.R;

public class SendFragment extends Fragment {

    Button sendB;

    public SendFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_send, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sendB = view.findViewById(R.id.send);
        sendB.setOnClickListener(view1 -> send());
    }

    private void send() {
        RawTransaction.createTransaction(BigInteger.ZERO,
                Convert.toWei("10",
                        Convert.Unit.GWEI).toBigInteger(),
                BigInteger.valueOf(21000),
                        "0x13AD7A82533A41ec68c759145BAF79a01c6F41E7",
                        BigInteger.valueOf(0));
    }
}
