package org.example.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(int id) {
        super("Employee not found with id: " + id);
    }
}
