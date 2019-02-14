package banana.digital.crypto.ui.fragments;

import android.content.Context;

import org.web3j.utils.Convert;

import java.math.BigDecimal;

import banana.digital.crypto.model.BalanceResult;
import banana.digital.crypto.service.Services;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static banana.digital.crypto.service.Services.etherscanService;

public class BalancePresenter {

    private BalanceFragment balanceFragment;

    public BalancePresenter(BalanceFragment balanceFragment) {
        this.balanceFragment = balanceFragment;
    }

    public void sendBalanceRequest() {
        Services.getEtherscanService().getBalance("0x13AD7A82533A41ec68c759145BAF79a01c6F41E7")
                .enqueue(new Callback<BalanceResult>() {
                    @Override
                    public void onResponse(Call<BalanceResult> call, Response<BalanceResult> response) {
                        BigDecimal value = new BigDecimal(response.body().result);
                        balanceFragment.showBalance(Convert.fromWei(value, Convert.Unit.ETHER).setScale(8, BigDecimal.ROUND_HALF_UP).toPlainString());
                    }

                    @Override
                    public void onFailure(Call<BalanceResult> call, Throwable t) {

                    }
                });
    }

}
