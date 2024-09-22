package Entidad;

public class Usuario implements opcionesBancoI {
    private String nombreUser;
    private String tipoCuenta;
    private double saldoCuenta;

    public Usuario() {
    }
    public Usuario(String nombreUser, String tipoCuenta, double saldoCuenta) {
        this.nombreUser = nombreUser;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("***********************************").append('\n');
        sb.append("\nNombre del cliente: ").append(nombreUser).append('\n');
        sb.append("Tipo de Cuenta: ").append(tipoCuenta).append('\n');
        sb.append("Saldo disponible: ").append(saldoCuenta).append('$').append('\n');
        sb.append("\n***********************************");
        return sb.toString();
    }

    @Override
    public String consultarSaldo() {
        return "Tu saldo es: "+this.saldoCuenta;
    }

    @Override
    public String retirarSaldo(double retirarS) {
        String mensaje="Saldo insuficiente";
        if(this.saldoCuenta > retirarS){
            mensaje = "Saldo nuevo es: "+ (this.saldoCuenta-=retirarS) ;
        }
        return mensaje;
    }

    @Override
    public String depositarSaldo(double depositarS) {
        String mensaje = "Tu saldo actualizado es: "+(this.saldoCuenta += depositarS);
        if(depositarS<0){
            mensaje = "Errror al depositar! Saldo negativo";
        }
        return mensaje;
    }
}
