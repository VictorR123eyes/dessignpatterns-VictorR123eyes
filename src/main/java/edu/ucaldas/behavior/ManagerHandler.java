package edu.ucaldas.behavior;

/**
 * Manejador concreto para solicitudes avanzadas.
 */
public class ManagerHandler extends Handler {

    @Override
    public String handleRequest(String request) {
        if (request != null && request.equalsIgnoreCase("avanzada")) {
            return "Atendido por Gerente";
        }

        if (next != null) {
            return next.handleRequest(request);
        }

        return "No se puede atender la solicitud.";
    }
}
