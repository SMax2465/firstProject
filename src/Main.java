//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println(somme(2,3));
        System.out.println(multiplication(2,3));
    }

    public static int somme(int a, int b){
        return a+b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }

    public static int soustraction(int a, int b){
        return a-b;
    }

}
