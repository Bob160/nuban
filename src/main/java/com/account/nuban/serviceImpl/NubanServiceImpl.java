package com.account.nuban.serviceImpl;

import com.account.nuban.model.Nuban;
import com.account.nuban.repository.NubanRepository;
import com.account.nuban.service.NubanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.UUID;

@Service
@AllArgsConstructor
public class NubanServiceImpl implements NubanService {

    private final NubanRepository nubanRepository;
    @Override
    public String createAccountNumber(String bankCode, String serial) {
        String nubanId = Arrays.toString(UUID.randomUUID().toString().substring(0, 10).getBytes());
        return nubanId;
    }
}
