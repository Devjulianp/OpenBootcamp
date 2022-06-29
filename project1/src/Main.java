public class Main {
    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.poner_puertas();
        System.out.println(micoche.num_puertas);
    }
}

class coche {
    public int num_puertas = 4;

    public void poner_puertas() {
        this.num_puertas++;
    }
}
