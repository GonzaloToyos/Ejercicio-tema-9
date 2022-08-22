package Clases;

public class Trabajador extends Persona{
    int salario;

    public Trabajador (int edad, String nombre, String telefono, int salario){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.salario = salario;
    }

    public int getSalario() {
		return this.salario;
	};

    public void imprimirTrabajador(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Teléfono: " + this.getTelefono());
        System.out.println("Salario: $" + this.getSalario());
    }
}
