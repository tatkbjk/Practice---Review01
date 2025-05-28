package com.connectors;

import com.thaianhthu.models.models.Account;
import com.thaianhthu.models.models.ListAccount;

public class AccountConnector {
    public Account login(String username, String password) {
        ListAccount la = new ListAccount();
        la.generate_sample_dataset();
        for (Account acc : la.getAccounts()) {
            if (acc.getUsername().equalsIgnoreCase(username)
                    && acc.getPassword().equals(password)) {
                return acc;
            }
        }
        return null;
    }
}
