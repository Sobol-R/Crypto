package banana.digital.crypto.ui;

import banana.digital.crypto.model.BalanceResult;
import banana.digital.crypto.model.TxListResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EtherscanService {

    String API_KEY = "RZMUNUREM7EKV1W1UVGP9G3X3466G7ZWPM";

    @GET("api?module=account&action=balance&tag=latest&apikey=" + API_KEY)
    Call<BalanceResult> getBalance(@Query("address") String address);

    @GET("api?module=account&action=txlist&startblock=0&endblock=99999999&sort=asc&apikey=" + API_KEY)
    Call<TxListResult> getTransaction(@Query("address") String address);

    @GET("api?module=proxy&action=eth_sendRawTransaction&apikey=" + API_KEY)
}
