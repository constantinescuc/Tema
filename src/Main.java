
import java.util.Scanner;



public class Main {

    // 1.Scrieti un program care afiseaza “Imi place Java”
    public static void afiseazaPropozitiePeEcran() {

        System.out.println("Imi place Java");
    }

    // 2.Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
    public static void repetaTextulDeMaiMulteori() {
        for (int i = 1; i <= 6; i++) {
            System.out.println("Cursul acesta este foarte fain");
        }
    }

    // 3.Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.

    public static int returneazaVarstaDavid() {

        int nr1 = 24;
        int nr2 = nr1 - 6;

        return nr2;
    }
    //4. Scrieti un program in care cititi o propozitie de la tastatura
    public static String citimTextDeLaTastatura(){

        System.out.println("Va rog introduceti un text la tastatura");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    /*
    5.Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un String si un boolean,
    apoi apelati metoda din metoda “main”
                 */
    public static void myVariables(){
        int a = 10;
        System.out.println( "variabila int a" + a);
        String carName = "Volvo";
        System.out.println("Variabila String carName" + carName);
        boolean z = true;
        System.out.println("Variabila boolean z" + z);
    }
    /*
     6. Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le stocati in variabile, si
     dupa ce le-ati citit, afisati-le pe ecran.
     */
    public static void citireNumereDeLaTastatura(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti primul numar la tastatura");
        int nr1 = scanner.nextInt();
        System.out.println("introduceti al doilea numar la tastatura");
        int nr2 = scanner.nextInt();
        System.out.println("Primul numar este"+ nr1 + "al doilea numar este" + nr2);
    }
    /*
     7. Scrieti un program incare cititi de la tastatura un numar, si calculati:
        - rezultatul sumei cu 5
        - rezultatul scaderii cu 12.3
        - rezultatul inmultirii cu -3.2
        - rezultatul impartirii cu 4
        - rezultatul modulului cu 6
     */
     public static void calculeCuNumarDeLaTastaura(){
       System.out.println("introduceti un numar la tastatura");
       Scanner scanner = new Scanner(System.in);
       int x = scanner.nextInt();
       System.out.println(x + 5);
       System.out.println(x - 12.3);
       System.out.println(x * (-3.2));
       System.out.println(x / 4);
       System.out.println(x  % 6 );
     }



    public static void main(String[] args) {

         afiseazaPropozitiePeEcran();

          repetaTextulDeMaiMulteori();

       System.out.println("varsta lui David este " + returneazaVarstaDavid());

      String textcitit =  citimTextDeLaTastatura();
       System.out.println("Textulcitit de la tastatura este " + textcitit);
        myVariables();
        citireNumereDeLaTastatura();
        calculeCuNumarDeLaTastaura();
    }

}











