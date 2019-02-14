package banana.digital.crypto.model;

import com.google.gson.annotations.Expose;

public class TxListResult {

    @Expose
    public String status;
    @Expose
    public String message;
    @Expose
    public Transaction transaction;
}
