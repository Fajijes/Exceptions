package Exceptions;

public class ParsingData extends Exception {
    String message;

    public ParsingData(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
