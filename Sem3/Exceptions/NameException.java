package Exceptions;

public class NameException extends Exception{
    String inputString;

    public NameException(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String getMessage() {
        return "Неправильный формат ФИО '" + inputString + "'. ФИО могут состоять только из букв.\n";
    }
}
