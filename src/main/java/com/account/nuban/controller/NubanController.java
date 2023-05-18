package com.account.nuban.controller;

import com.account.nuban.service.NubanService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/nuban")
public class NubanController {

    @Autowired
    private NubanService nubanService;

    @PostMapping("/create-accountnumber")
    public ResponseEntity<Integer> accountNo (String bankCode, String serial) {
        Integer azza = Integer.valueOf(nubanService.createAccountNumber(bankCode, serial));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
