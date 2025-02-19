public class Calculette {
    private int a;
    private int b;

    private static int nbre = 0;    //Pour compter le nombre de calculateur
    private final int position;   //Pour specifier a chaque calculateur un nombre qui lui est propre

    //Constructeur par defaut
    public Calculette() {++nbre; this.position = nbre;}
    //Constructeur surcharge
    public Calculette(int a, int b) {this.a = a; this.b = b; ++nbre; this.position = nbre;}
    //Constructeur par recopie
    public Calculette(Calculette cal) {this.a = cal.a; this.b = cal.b; ++nbre; this.position = nbre;}

    //Getters & Setters
    public int getA() {return a;}
    public int getB() {return b;}
    public void setA(int a) {this.a = a;}
    public void setB(int b) {this.b = b;}

    //Methodes
    public void addition(){
        this.decrireOperations(this.a, this.b, '+');
    }
    public void soustraction(){
        this.decrireOperations(this.a, this.b, '-');
    }
    public void multiplication(){
        this.decrireOperations(this.a, this.b, '*');
    }
    public void division() {
        this.decrireOperations(this.a, this.b, '/');
    }

    public void calculator(){
        this.addition();
        this.soustraction();
        this.multiplication();
        this.division();
        System.out.println("****************************************************************");
    }

    public void decrireOperations(int a, int b, char op){
        System.out.println();
        //System.out.print("" + a + op + b + " = ");
        switch (op){
            case '+':
                System.out.println(this.getA() + " + " + this.getB() + " = " + (a + b));
                break;
            case '-':
                System.out.println(this.getA() + " - " + this.getB() + " = " + (a - b));
                //System.out.print(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(this.getA() + " * " + this.getB() + " = " + (a * b));
                //System.out.print(a + " * " + b + " = " + (a * b));
                break;

            case '/':
                if (b == 0)
                    System.out.println(this.getA() + " / " + this.getB() + " est impossible");
                else
                    System.out.println(this.getA() + " / " + this.getB() + " = " + (double)a/(double)b);
                //System.out.print(a + " / " + b + " = " + (double)a/(double)b);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }

    public void decrisToi(){
        System.out.println("Le calculateur N =  " + this.position + " a pour argument A = " + this.a + " et B = " + this.b);
        this.calculator();
    }

    public void changerValeurs(int a, int b){
        this.setA(a);
        this.setB(b);
    }
}