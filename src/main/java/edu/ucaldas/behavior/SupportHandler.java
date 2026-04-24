package edu.ucaldas.behavior;

/**
 * Clase utilitaria para crear la cadena de manejadores.
 * Implementa el patrón Chain of Responsibility.
 */
public class SupportHandler {
    public static Handler createChain() {
        Handler basic = new BasicSupportHandler();
        Handler supervisor = new SupervisorHandler();
        Handler manager = new ManagerHandler();

        basic.setNext(supervisor);
        supervisor.setNext(manager);

        return basic;
    }
}
