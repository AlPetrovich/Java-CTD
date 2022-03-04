package bimestreDos.exceptionControl;

public class ClienteException extends Exception{
    public ClienteException() {
    }

    public ClienteException(String message) {
        super(message);
    }
    @Override
    public String toString(){
        return "Se produjo la siguiente excepcion: "+ getMessage();
    }
}
