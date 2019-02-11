package banana.digital.crypto;

import com.google.gson.annotations.Expose;

public class TxListResult {

    @Expose
    public String status;
    @Expose
    public String message;
    @Expose
    public Transaction transaction;
}
