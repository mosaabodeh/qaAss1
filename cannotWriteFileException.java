package edu.najah.cap;



public class cannotWriteFileException extends  Exception{
    public cannotWriteFileException(String errorMessage) {
        super(errorMessage);
    }
}
