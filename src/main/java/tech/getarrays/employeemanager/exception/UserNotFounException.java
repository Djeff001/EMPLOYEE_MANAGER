package tech.getarrays.employeemanager.exception;

public class UserNotFounException extends RuntimeException{
    public UserNotFounException(String message) {
        super(message);
    }
}
