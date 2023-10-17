package com.security.springsecurity.rest;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableWebSecurity
public class BankController {

    @GetMapping("/home")
    public String welcomePage(){
        String msg = "Welcome to Laxmi Bank...Have a Nice day";
        return  msg;
    }
    @GetMapping("/contact")
    public String contactUs(){
        String msg = "Thanks for contacting Us...We will get back to you wthing 2 hours";
        return  msg;
    }

    @GetMapping("/getbalance")
    public String checkBalance(){
        String msg = "You have 500000 in your account...";
        return  msg;
    }

    @GetMapping("/getstatement")
    public String getBalanceStatement(){
        String msg = "The Bank statemnet has been mailed to you, Kindly check ur mail id...";
        return  msg;
    }



    @GetMapping("/loan")
    @RolesAllowed("ADMIN")
    public String applyLoan(){
        String msg = "Your Loan Application has been sanctioned and the same has been credited to your account...";
        return  msg;

    }




}
