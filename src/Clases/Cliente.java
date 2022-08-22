package Clases;

public class Cliente extends Persona{
    int credito;

    public Cliente (int edad, String nombre, String telefono, int credito){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.credito = credito;
    }

    public int getCredito() {
		return this.credito;
	};

    public void imprimirCliente(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Teléfono: " + this.getTelefono());
        System.out.println("Crédito: $" + this.getCredito());
    }
}
