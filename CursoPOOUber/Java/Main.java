class Main {
    public static void main(String[] args) {
        System.out.println("HOLA JAVA ++30 AÑOS");
        Car car = new Car("YHG23U", new Account("JULIAN ROJAS", "1205469", "jr@unico.com"));
        car.passegenger = 7;
        car.printDatacar();

        Car car2 = new Car("JYF44D", new Account("RICHAR MALON", "14587956", "rm@unico.com"));
        car2.passegenger = 4;
        car2.printDatacar();
    }
}
