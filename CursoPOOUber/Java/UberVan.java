import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    // protected Integer passenger; // se agrega como atributo de uberVan

    public UberVan(String license, Account driver)
    // ArrayList<String> seatsMaterial,
    // Map<String, Map<String, Integer>> typeCarAccepted)
    {
        super(license, driver);
        // this.typeCarAccepted = typeCarAccepted;
        // this.seatsMaterial = seatsMaterial;
    }

    @Override // se escribe setpassenger y trae todo para polimorfismo
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passegenger = passenger;
        } else {
            System.out.println("Se requiere asignar 6 pasajeros");
        }
    }
}
