import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI

{
  public static void main(String[] args) throws Exception
  {
    LocateRegistry.createRegistry(1099);
    String url = "rmi:/localhost/prueba";
    ClaseRMI obj = new ClaseRMI();

    // registra la instancia en el rmiregistry
    Naming.rebind(url,obj);
  }
}