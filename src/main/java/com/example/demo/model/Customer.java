
package com.example.demo.model;

/**
 * @author shoujun
 *
 */
//@Entity
public class Customer {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    protected Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(Long id, String firstName, String lastName) {
        this(firstName, lastName);
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Customer (" + super.toString() + ") [id=%d, firstName='%s', lastName='%s']", id,
                firstName, lastName);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
