package ar.edu.unlu.tp2.punto3;
import java.util.Random;
public class Credencial {
    private String numCredencial;
    private String nombreAlumno;

    public Credencial(String nombreAlumno){
        this.nombreAlumno = nombreAlumno;
        generarNumeroCredencial();
    }

    public String getNumCredencial(){
        return numCredencial;
    }

    public String getNombreAlumno(){
        return nombreAlumno;
    }

    private void generarNumeroCredencial(){
        String num = "1234567890";
        Random r = new Random();
        StringBuilder numCredencialBuilder = new StringBuilder();
        for ( int i = 0; i < 8; i++){
            numCredencialBuilder.append(num.charAt(r.nextInt(num.length())));
        }
        numCredencial = numCredencialBuilder.toString(); // Asigna el número de credencial generado al atributo
    }
}
