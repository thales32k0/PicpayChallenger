package thales.dev.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thales.dev.demo.repositories.services.TransactionService;
import thales.dev.demo.user.transactions.TransactionDTO;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public <T> ResponseEntity<T> createTransaction(@RequestBody TransactionDTO transaction) throws Exception {
        var newTransaction = this.transactionService.createTransaction(transaction);
        ResponseEntity<T> responseEntity;
        responseEntity = (ResponseEntity<T>) new ResponseEntity<>(newTransaction, CREATED);
        return responseEntity;

    }
}
