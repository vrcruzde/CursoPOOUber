class Main {
    public static void main(String[] args) {
        System.out.println("HOLA JAVA ++30 AÑOS");
        UberX uberX = new UberX("HTG23E", new Account("DIANA HUERTAS", "495612"), "KIA", "SONIC");
        uberX.setPassenger(4);
        uberX.printDatacar();

        UberVan uberVan = new UberVan("HYT456", new Account("JOSE HURTADO", "485196"));
        uberVan.setPassenger(5);
        uberVan.printDatacar();

        // Car car2 = new Car("JYF44D", new Account("RICHAR MALON", "14587956",
        // "rm@unico.com"));
        // car2.passegenger = 4;
        // car2.printDatacar();
    }
}
