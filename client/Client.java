import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private Client() {}

    public static void main(String[] args) {
        try {
            int opcao = Integer.parseInt(args[0]);

            double pNumero = Double.parseDouble(args[1]);
            double sNumero = 0.0;
            if(args.length > 2) {
                sNumero = Double.parseDouble(args[2]);
            }
            
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9400);
            Hello stub = (Hello) registry.lookup("Hello");
            double response = 0.0;

            switch (opcao) {
                case 1:
                    response = stub.adicionar(pNumero, sNumero);
                    break;
                case 2:
                    response = stub.subtrair(pNumero, sNumero);
                    break;
                case 3:
                    response = stub.multiplicar(pNumero, sNumero);
                    break;
                case 4:
                    response = stub.dividir(pNumero, sNumero);
                    break;
                case 5:
                    response = stub.radificar(pNumero);
                    break;
                case 6:
                    response = stub.elevar(pNumero, sNumero);
                    break;
                default:
                    break;
            }
            
            
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}