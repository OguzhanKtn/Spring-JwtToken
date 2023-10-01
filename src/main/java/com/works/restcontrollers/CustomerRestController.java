package com.works.restcontrollers;

import com.works.entities.Customer;
import com.works.models.JwtLogin;
import com.works.services.CustomerService;
import com.works.services.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CustomerRestController {

    final CustomerService customerService;
    final JwtService jwtService;

    @PostMapping("/register")
    public Customer register(@RequestBody Customer customer) {
        return customerService.register(customer);
    }

    @PostMapping("/auth")
    public ResponseEntity auth(@RequestBody JwtLogin jwtLogin){
        return jwtService.auth(jwtLogin);
    }
}
