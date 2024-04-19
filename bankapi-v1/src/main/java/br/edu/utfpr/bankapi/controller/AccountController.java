package br.edu.utfpr.bankapi.controller;

import br.edu.utfpr.bankapi.dtos.CreateAccountDTO;
import br.edu.utfpr.bankapi.model.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody CreateAccountDTO createAccountDTO) {
        return ResponseEntity.ok().build();
    }

}
