
class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passegenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDatacar() {
        if (license != null && driver.name != null && driver.document != null && passegenger != null) {
            System.out
                    .println("License: " + license + "  Name driver: " + driver.name + "  Document: " + driver.document
                            + "  Passenger: " + passegenger);
        } else {
            System.err.println("Asegurate de completar los campos");
        }
    }

    public Integer getPassenger() {
        return passegenger;
    }

    public void setPassenger(Integer passenger) {
        if (passenger == 4) {
            this.passegenger = passenger;
        } else {
            System.out.println("Se requiere asignar 4 pasajeros");
        }

    }

}
