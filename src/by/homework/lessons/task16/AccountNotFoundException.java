package by.homework.lessons.task16;

public class AccountNotFoundException extends RuntimeException {
    private String errorCode;

    //Пользовательское непроверяемое исключение
    public AccountNotFoundException(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
