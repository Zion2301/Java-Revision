package org.example.exceptions;

public class EmployeeInvalidDataException extends RuntimeException {
    public EmployeeInvalidDataException() {
        super("Invalid employee data provided");
    }
}
