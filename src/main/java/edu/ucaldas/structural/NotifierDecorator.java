package edu.ucaldas.structural;

/**
 * Decorator abstracto - Implementa el patrón Decorator.
 * Delega las llamadas al objeto envuelto (wrappee).
 */
public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappee;

    protected NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String send(String message) {
        return wrappee.send(message);
    }
}
