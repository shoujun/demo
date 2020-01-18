
package com.example.demo.web;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

/**
 * @author shoujun
 *
 */

@RestController
public class CustomerController {

    private final AtomicLong counter = new AtomicLong();

    //
    // API to create a new customer
    // http://localhost:8080/customer?firstName=ShouJun&lastName=Ni
    //
    @GetMapping("/customer")
    public Customer greetingCustomer(@RequestParam(value = "firstName") String firstName,
            @RequestParam(value = "lastName") String lastName) {

        return new Customer(counter.incrementAndGet(), firstName, lastName);
    }
}
