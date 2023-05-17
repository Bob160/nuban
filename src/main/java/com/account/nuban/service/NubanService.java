package com.account.nuban.service;

import com.account.nuban.model.Nuban;

public interface NubanService {
    Nuban createAccountNumber(String bankCode, String serial);
}
