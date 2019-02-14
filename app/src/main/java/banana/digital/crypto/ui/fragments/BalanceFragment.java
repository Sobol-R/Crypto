package banana.digital.crypto.ui.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import banana.digital.crypto.R;

public class BalanceFragment extends Fragment {

    TextView balanceText;
    BalancePresenter presenter;

    public BalanceFragment() {
       presenter =  new BalancePresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_balance, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        balanceText = view.findViewById(R.id.balance);
    }

    public void showBalance(String balance) {
        balanceText.setText(balance);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.sendBalanceRequest();
    }
}
