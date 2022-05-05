package com.EvreteTransaction.EvreteTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TransactionController {

    @Autowired
    private Commission commission;

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/")
    public Commission calculateCommission(@RequestBody Transaction transaction) throws IOException {
        return transactionService.calculateCommission(transaction);
    }

}

