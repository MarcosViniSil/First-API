package br.com.primeirapi.handler;

public class AppilcationException extends RuntimeException {

    public AppilcationException(String message){
        super(message);
    }
    public AppilcationException(String message, Object ... para) {
        super(String.format(message,para));
    }
}
