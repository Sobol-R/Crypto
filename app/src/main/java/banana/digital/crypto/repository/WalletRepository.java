package banana.digital.crypto.repository;

import org.web3j.crypto.Credentials;

public class WalletRepository {

    private static final String PRIVATE_KEY = "0x3b66d7ff7425d99793f47c74cdb3bddb342f4b7e507cabe19828e836fac19d16";

    private Credentials credentials;

    private WalletRepository() {
        credentials = Credentials.create(PRIVATE_KEY);
    }

    private static WalletRepository sInstance;

    public static WalletRepository getSInstance() {
        if (sInstance == null)
            sInstance = new WalletRepository();
        return sInstance;
    }

    public String getAddress() {
        return credentials.getAddress();
    }
}
