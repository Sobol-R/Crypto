package banana.digital.crypto.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import banana.digital.crypto.model.BalanceResult;
import banana.digital.crypto.ui.EtherscanService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Services {

    public static EtherscanService etherscanService;

    public static EtherscanService getEtherscanService() {
        if (etherscanService == null) {
            final Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            final Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.etherscan.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            etherscanService = retrofit.create(EtherscanService.class);
        }

        return etherscanService;
    }
}
