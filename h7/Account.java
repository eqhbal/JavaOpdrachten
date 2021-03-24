package h7;

public class Account {

    private String voorNaam;
    private String achterNaam;
    private int leeftijd;
    private int rekeningNummer;
    private double rentePercentage;
    private double saldo;

    public Account(String voorNaam, String achterNaam, int leeftijd, int rekeningNummer, double rentePercentage, double saldo) {

        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.leeftijd = leeftijd;
        this.rekeningNummer = rekeningNummer;
        this.rentePercentage = rentePercentage;
        this.saldo = saldo;

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

    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public int getRekeningNummer() {
        return rekeningNummer;
    }

    public void setRekeningNummer(int rekeningNummer) {
        this.rekeningNummer = rekeningNummer;
    }


    public double getRentePercentage() {
        return rentePercentage;
    }

    public void setRentePercentage(double rentePercentage) {
        this.rentePercentage = rentePercentage;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
