package Clases;

public class Cliente extends Persona{
    int credito;

    public Cliente (int edad, String nombre, String telefono, int credito){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.credito = credito;
    }
}
