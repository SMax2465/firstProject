//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome everyone!");
        System.out.println("How are you to day?");
        System.out.println("Hello and welcome! Maxime");
        System.out.println("Hello and welcome! Smax");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println(somme(2,3));
        System.out.println(soustraction(2,3));
        System.out.println(somme(12,3));
        System.out.println(somme(10,2));

        // coucou ça va


        System.out.println("test");

        System.out.println("Salut toi !");


    }

    public static int somme(int a, int b){
        return a+b;
    }


    public static int soustraction(int a, int b){
        return a-b;
    }

}
