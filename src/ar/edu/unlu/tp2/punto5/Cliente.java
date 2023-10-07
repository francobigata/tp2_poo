package ar.edu.unlu.tp2.punto5;
import java.time.LocalDate;

public class Cliente {
    private LocalDate fechaInversion;
    private String nombre;
    private double saldo;
    private double limiteGiro;
    protected double montoInvertido;


    public Cliente(String nombre, double saldo, double limiteGiro, double montoInvertido) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.limiteGiro = limiteGiro;
        this.montoInvertido = montoInvertido;
        this.fechaInversion = null;
    }

    public Cliente(String nombre, double saldo, double limiteGiro) {
        this(nombre, saldo, limiteGiro, 0); // Llamamos al constructor con montoInvertido = 0
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteGiro() {
        return limiteGiro;
    }

    public void setLimiteGiro(double limiteGiro) {
        this.limiteGiro = limiteGiro;
    }

    public double getMontoInvertido() {
        return montoInvertido;
    }

    public void setMontoInvertido(double montoInvertido) {
        montoInvertido = montoInvertido;
    }

    public double getSaldoDeudor(){
        return saldo < 0 ? -saldo : 0;
    }

    public void realizarInversion ( double monto, int dias){
        if ( monto <= 0 || dias <= 0 ){
            System.out.println("Error: Monto y dias deben ser mayores que cero:");
            return;
        }

        if (montoInvertido  > 0) {
            System.out.println("Error: Ya tiene una inversion en curso");
        }

        double interes = calcularInteres(monto, dias);
        fechaInversion = LocalDate.now();
        saldo += monto;
        montoInvertido = monto;
        System.out.println("Inversion realizada. Interes acumulado: " + interes);

    }

    public void realizarCompra(double monto){
        if (monto <= 0){
            System.out.println("Error: el monto de compra debe ser mayor que cero.");
            return;
        }

        if (verificarGiroEnDescubierto(monto)) {
            if (montoInvertido > 0) {
                System.out.println("Precancelación de inversión debido a compra que excede el saldo.");
                cancelarInversion();
            }
            else {
                System.out.println("Error: Esta compra te hará girar en descubierto.");
                return;
            }
        }

        saldo -= monto;
        System.out.println("Compra realizada por $" + monto);
    }

    public void realizarPago(double monto){
        if (monto <= 0){
            System.out.println("Error: El monto de pago debe ser mayor que cero.");
            return;
        }

        if (monto > getSaldoDeudor()){
            System.out.println("Error: No puedes pagar más de tu deuda.");
            return;
        }

        saldo += monto;
        System.out.println("Pago realizado por $" + monto);
    }

    public boolean verificarGiroEnDescubierto (double monto){
        double saldoTotal = saldo + limiteGiro;
        return monto > saldoTotal;
    }

    private double calcularInteres(double monto, long dias){
        double tasaInteres = 0.40;
        double interes = (monto * tasaInteres * dias) / 365;
        return interes;
    }
    public void cancelarInversion() {
        if (montoInvertido > 0) {
            double interes = calcularInteres((double) montoInvertido, obtenerDiasDesdeInversion());

            saldo -= montoInvertido;
            montoInvertido = 0;
            fechaInversion = null; // Resetea la fecha de inversión

            System.out.println("Inversión cancelada. Interés devuelto: " + interes);
        } else {
            System.out.println("Error: No hay inversión para cancelar.");
        }
    }


    private long obtenerDiasDesdeInversion() {
        if (fechaInversion != null){
            return LocalDate.now().toEpochDay() -  fechaInversion.toEpochDay();
        }
        return 0;
    }


}
