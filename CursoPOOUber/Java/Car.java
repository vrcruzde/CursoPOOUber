
class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDatacar() {
        System.out.println("License:" + license + " Name driver:" + driver.name);
    }
}
