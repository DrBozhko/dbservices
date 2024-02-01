package com.drbozhko.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
