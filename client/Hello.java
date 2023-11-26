import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;

    double adicionar(double a, double b) throws RemoteException;
    
    double subtrair(double a, double b) throws RemoteException;
    
    double multiplicar(double a, double b) throws RemoteException;
    
    double dividir(double a, double b) throws RemoteException;
    
    double radificar(double a) throws RemoteException;

    double elevar(double a, double b) throws RemoteException;
}