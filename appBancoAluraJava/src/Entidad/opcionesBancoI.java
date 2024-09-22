package Entidad;

public interface opcionesBancoI {
    String consultarSaldo();
    String retirarSaldo(double retirarS);
    String depositarSaldo(double depositarS);
}
