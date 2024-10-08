import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Gra {

    private static ArrayList<Integer> wylosowanee = new ArrayList<>();
    private ArrayList<Integer> wpisane = new ArrayList<>();
    private LinkedList<Integer> trafione = new LinkedList<>();
    private void wylosujLiczby(int ile) {
        while(wylosowanee.size()<6){
            int liczba = (int) (Math.random() * 100 + 1);
            while (wylosowanee.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
            wylosowanee.add(liczba);
        }
    }
        private void wpiszZKlawiatury(int ile){
            Scanner klawiatura = new Scanner(System.in);
            System.out.println("podaj 6 liczb");
            for (int i = 0; i < ile; i++) {
                int liczba = klawiatura.nextInt();
                wpisane.add(liczba);
            }
        }
        private void wypiszKolekcje(List<Integer> lista){
            System.out.println("wpisywane lista;");
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(i)+", ");
            }

        }
        private void sprawdz(){
            for (Integer wpisana:wpisane) {
                if (wylosowanee.contains(wpisana)) {
                    trafione.add(wpisana);
                }
            }
        }
        public void zagraj(){
            wylosujLiczby(6);
            wpiszZKlawiatury(6);
            sprawdz();
            System.out.println("Wylosowane");
            wypiszKolekcje(wylosowanee);
            System.out.println("wpisane");
            wypiszKolekcje(wpisane);
            System.out.println("trafione");
            wypiszKolekcje(trafione);
        }


}
