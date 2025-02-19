public class Main {
    public static void main(String[] args) {
        Calculette cal1 = new Calculette();
        Calculette cal2 = new Calculette(10, 4);
        Calculette cal3 = new Calculette(cal2);
        Calculette cal4 = new Calculette(4, 8);

        cal1.decrisToi();
        cal2.decrisToi();
        cal3.decrisToi();
        cal4.decrisToi();

        cal1.changerValeurs(10, 4);
        cal1.decrisToi();
    }
}
