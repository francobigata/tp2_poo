package ar.edu.unlu.tp2.punto1;

import static ar.edu.unlu.tp2.punto1.TipoSuscripcion.*;

public class Suscripcion {

    private TipoSuscripcion suscripcion;

    public Suscripcion(String suscripcion){
        if (suscripcion.equals("destacada")){
            this.suscripcion = DESTACADA;
        } else if (suscripcion.equals("intermedia")){
            this.suscripcion = TipoSuscripcion.INTERMEDIA;
        } else {
            this.suscripcion = TipoSuscripcion.BASICA;
        }

    }

    public void MostrarListadeActividades(){
        if (this.suscripcion == DESTACADA) {
            System.out.println(" (SOCIO DESTACADO)");
            System.out.println(" (SOCIO DESTACADO)");
            System.out.println(" (SOCIO DESTACADO)");
            System.out.println(" (SOCIO DESTACADO)");
            System.out.println(" (SOCIO DESTACADO)");
        }

        if ((this.suscripcion == DESTACADA)||(this.suscripcion == INTERMEDIA)){
            System.out.println(" (SOCIO )");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
        }

        if ((this.suscripcion == DESTACADA)||(this.suscripcion == INTERMEDIA)||(this.suscripcion == BASICA)){
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
        }
    }

    public TipoSuscripcion getSuscripcion() {
        return suscripcion;
    }

}
