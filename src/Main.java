import com.sun.source.tree.WhileLoopTree;


import  java.lang.reflect.Array;


import java.util.*;

public class Main {
    private static ArrayList<Integer> wylosujListe(int ileElementow) {
        ArrayList<Integer> lista_liczb_wylosowanych_bez_powtorzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int) (Math.random() * 100 + 1);
            while (lista_liczb_wylosowanych_bez_powtorzen.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
            lista_liczb_wylosowanych_bez_powtorzen.add(liczba);
        }
        return lista_liczb_wylosowanych_bez_powtorzen;
    }

    private static void wypiszListe(List<Integer> lista_do_wypisania) {
        System.out.println("wpisywane lista;");
        for (int i = 0; i < lista_do_wypisania.size(); i++) {
            System.out.println(lista_do_wypisania.get(i));
        }
    }

    private static ArrayList<Integer> wstawLiczbyDoListy(int ileELementow){
        ArrayList <Integer> listaLiczbZKlawiatury= new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj 6 liczb");
        for (int i = 0; i < 6; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbZKlawiatury.add(liczba);
        }
        return listaLiczbZKlawiatury;
    }
    private static LinkedList<Integer> zwrocElementyZObuList(ArrayList<Integer>lista_liczb_z_klawiatury, ArrayList<Integer>lista_liczb_wylosowanych_bez_powtorzen){
        LinkedList<Integer> trafione = new LinkedList<>();
        for (Integer wpisana:lista_liczb_z_klawiatury) {
            if (lista_liczb_wylosowanych_bez_powtorzen.contains(wpisana)) {
                trafione.add(wpisana);
            }
        }
        return trafione;
    }

    public static void main(String[] args) {
        ArrayList<Integer> losowe=wylosujListe(6);
        wypiszListe(losowe);
        ArrayList<Integer> wpisane=wstawLiczbyDoListy(6);
        wypiszListe(wpisane);
        LinkedList<Integer> trafione=zwrocElementyZObuList(losowe,wpisane);
        wypiszListe(trafione);
    }
}