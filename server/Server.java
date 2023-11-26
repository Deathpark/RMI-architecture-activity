import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.lang.Math;
        
public class Server implements Hello {
        
    public Server() {}

    public String sayHello() {
        return "Hello, world!";
    }

    public double adicionar(double a, double b) {
        return (double)(a + b);
    }

    public double subtrair(double a, double b) {
        return (double)(a - b);
    }

    public double multiplicar(double a, double b) {
        return (double)(a * b);
    }

    public double dividir(double a, double b) {
        return (double)(a / b);
    }

    public double radificar(double a) {
        return (double)Math.sqrt(a);
    }

    public double elevar(double a, double b) {
        return (double)Math.pow(a, b);
    }

    public static void main(String args[]) {
        
        try {
            //Create and export a remote object
            Server obj = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            //Register the remote object with a Java RMI registry
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9400);
            registry.bind("Hello", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}