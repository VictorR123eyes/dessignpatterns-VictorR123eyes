package edu.ucaldas.structural;

/**
 * Implementación concreta de Notifier - Envía notificaciones por email.
 */
public class EmailNotifier implements Notifier {
    @Override
    public String send(String message) {
        return "Email enviado: " + message;
    }
}

