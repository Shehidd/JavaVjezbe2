package DrugaNedeljaV;

public class Zaposleni {

    private String ime;
    private String prezime;
    private int godine_staza;
    private double plata;

    public Zaposleni(String ime, String prezime, int godine_staza, double plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine_staza = godine_staza;
        this.plata = plata;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodine_staza() {
        return godine_staza;
    }

    public void setGodine_staza(int godine_staza) {
        if (godine_staza < 0) {
            System.out.println("Ne moze biti negativno");
            this.godine_staza = 0;
        } else {
            this.godine_staza = godine_staza;
        }
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public void ispisZaposlenog() {
        System.out.println("Ime i prezime: " + ime + " " + prezime);
        System.out.println("Godine staza: " + godine_staza);
    }

    public static void main(String[] args) {

        Zaposleni z1 = new Zaposleni("Marko", "Markovic", 5, 850.50);
        Zaposleni z2 = new Zaposleni("Petar", "Petrovic", 10, 1200.00);
        Zaposleni z3 = new Zaposleni("Jovan", "Jovanovic", 2, 700.00);

        System.out.println("ZAPOSLENI:");
        z1.ispisZaposlenog();
        z2.ispisZaposlenog();
        z3.ispisZaposlenog();

        System.out.println();

        System.out.println("TEST GETTERA:");
        System.out.println("Ime prvog: " + z1.getIme());
        System.out.println("Plata prvog: " + z1.getPlata());
        System.out.println("Staz drugog: " + z2.getGodine_staza());
        System.out.println("Prezime treceg: " + z3.getPrezime());

        System.out.println();

        System.out.println("TEST SETTERA:");

        z1.setPlata(1000.00);
        z2.setGodine_staza(11);
        z3.setIme("Nikola");

        System.out.println("Nakon izmjene:");

        z1.ispisZaposlenog();
        z2.ispisZaposlenog();
        z3.ispisZaposlenog();
    }
}

