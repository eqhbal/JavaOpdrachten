package h7;

public class Account {
    private String voorNaam;
    private String achterNaam;
    private int leeftijd;
    private int rekeningNummer;
    private double rentePercentage;
    private double saldo;
    private int startJaar;
    private int huidigeJaar;


    public Account(String voorNaam, String achterNaam, int leeftijd, int rekeningNummer, double rentePercentage, double saldo, int startJaar, int huidigeJaar) {

        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.leeftijd = leeftijd;
        this.rekeningNummer = rekeningNummer;
        this.rentePercentage = rentePercentage;
        this.saldo = saldo;
        this.startJaar = startJaar;
        this.huidigeJaar = huidigeJaar;
        int lidmaatschapJaar = this.huidigeJaar - this.startJaar;

            double rente = (this.saldo / 100) * (this.rentePercentage * lidmaatschapJaar);
            if (lidmaatschapJaar > 0){
                this.saldo = saldo + rente;
            }
    }


    public void geldStorten(double bedragStorten) {

        this.saldo += bedragStorten;
        System.out.println("U heeft: " + bedragStorten + " uw nieuwe saldo is: " + this.saldo);

    }

    public void geldPinnen(double bedragPinnen) {

        if (this.saldo - bedragPinnen < 0) {
            System.out.println("Uw kunt niet meer pinnen dan: " + this.saldo);
        } else {
            this.saldo -= bedragPinnen;
            System.out.println("Uw heeft: " + bedragPinnen + " gepind. Uw huidige saldo is: " + this.saldo);

        }

    }

    public String getVoorNaam() {
        return voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public double getSaldo() {
        return saldo;
    }


}
