package Clases;
public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente(35, "Juan", "4631-8974", 10000);
        cliente1.imprimirCliente();

        Trabajador trabajador1 = new Trabajador(48, "Pepe", "4798-1364", 28000);
        trabajador1.imprimirTrabajador();
    }
}
