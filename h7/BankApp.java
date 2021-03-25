package h7;

public class BankApp {
    public static void main(String[] args) {
        Account tonny = new Account("Tonny", "Stark", 36, 12345, 2.5, 20000, 2018, 2018);
        Account borris = new Account("Borris", "Johnson", 58, 12245, 2.5, 1000, 2017, 2018);


        System.out.println("Naam: " + tonny.getVoorNaam() + " " + tonny.getAchterNaam());
        System.out.println("Leeftijd: " + tonny.getLeeftijd());
        System.out.println("Saldo: " + tonny.getSaldo());
        System.out.println("");

        System.out.println("Naam: " + borris.getVoorNaam() + " " + borris.getAchterNaam());
        System.out.println("Leeftijd: " + borris.getLeeftijd());
        System.out.println("Saldo: " + borris.getSaldo());


//        tonny.geldStorten(50);
//
//        tonny.geldPinnen(100);
//
//        borris.geldStorten(50);
//
//        borris.geldPinnen(1050);

        borris.geldOvermaken(32, tonny);
        System.out.println(borris.getSaldo());

    }


}
