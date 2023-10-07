package ar.edu.unlu.tp2.punto10;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de empleados
        Empleado empleadoAsalariado = new EmpleadoAsalariado("Juan", "Perez", "123456789", "123-456-789", 3000.0);
        Empleado empleadoComision = new EmpleadoComision("Maria", "Gomez", "987654321", "987-654-321", 0.10, 50000.0);
        Empleado empleadoComisionSalarioBase = new EmpleadoComisionSalarioBase("Carlos", "Lopez", "567890123", "567-890-123", 0.08, 60000.0, 2000.0);
        Empleado empleadoPorHora = new EmpleadoPorHora("Laura", "Martinez", "345678901", "345-678-901", 15.0, 45);
        Empleado empleadoPasante = new EmpleadoPasante("Pedro", "Ramirez", "234567890", "234-567-890");

        // Calcular sueldos y bonos de cumpleaños
        System.out.println("Sueldo de empleado asalariado: $" + empleadoAsalariado.calcularSueldo());
        System.out.println("Bono de cumpleaños de empleado asalariado: $" + empleadoAsalariado.calcularBonoCumpleaños());

        System.out.println("Sueldo de empleado por comision: $" + empleadoComision.calcularSueldo());
        System.out.println("Bono de cumpleaños de empleado por comision: $" + empleadoComision.calcularBonoCumpleaños());

        System.out.println("Sueldo de empleado por comision con salario base: $" + empleadoComisionSalarioBase.calcularSueldo());
        System.out.println("Bono de cumpleaños de empleado por comision con salario base: $" + empleadoComisionSalarioBase.calcularBonoCumpleaños());

        System.out.println("Sueldo de empleado por hora: $" + empleadoPorHora.calcularSueldo());
        System.out.println("Bono de cumpleaños de empleado por hora: $" + empleadoPorHora.calcularBonoCumpleaños());

        System.out.println("Sueldo de empleado pasante: $" + empleadoPasante.calcularSueldo());
        System.out.println("Bono de cumpleaños de empleado pasante: $" + empleadoPasante.calcularBonoCumpleaños());
    }
}