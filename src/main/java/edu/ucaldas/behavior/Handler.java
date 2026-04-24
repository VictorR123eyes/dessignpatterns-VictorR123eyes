package edu.ucaldas.behavior;

/**
 * Clase abstracta base para el patrón Chain of Responsibility.
 */
public abstract class Handler {
    protected Handler next;

    public void setNext(Handler nextHandler) {
        this.next = nextHandler;
    }

    public abstract String handleRequest(String request);
}
