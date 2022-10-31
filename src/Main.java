import java.util.Scanner;

    //Given an array arr[] of N elements, the challenge is to write a function to find a given element x in arr[] .
       /* Шаг 1: Обход массива
        Шаг 2: Сопоставьте ключевой элемент с элементом массива
        Шаг 3: Если ключевой элемент найден, верните позицию индекса элемента массива.
        Шаг 4: Если ключевой элемент не найден, верните -1*/

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 6, 8, 1, 15};

        Scanner scan = new Scanner(System.in);
        int search = scan.nextInt();

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println(i);
            flag = true;
            }
        }

        if (!flag) {
            System.out.println(-1);
        }


        int[] myArray = new int[]{1, 1, 2, 4, 4, 5, 5}; // sozdaem massiv
        int myLength = myArray.length; // opredeljaem dlinu massiva
        int i = 0; // inicializiruem upravljauschchuju peremennuju
        int found = -1; // inicializiruem vozvrat - -1, esli ne najdeno
        while (i < myLength-1) { // perebor massiva, poka ne dostignem konca
            if (myArray[i] != myArray[i+1]) { // esli nashli neparnyj element massiva
                found = i; // vozvrat = nomer elementa
                i = myLength; // upravljauschchjaja peremennaja = razmeru massiva, zikl bolsche ne budet vypolnjnatsja
            } else { // elementy parnye
                i = i + 2; // - perehod k sledujuschemu elementu
            }
        }
        if (found!=-1) {// eslii najdeno - vyvodim nomer elementa i ego znachenie
            System.out.println(found+" - "+myArray[found]);}
        else if (myLength%2!=0) {System.out.println((myLength-1)+" - "+myArray[myLength-1]);} //ispravljaem oshibku OutOfBound
        else {System.out.println("Not found!");} // esli naideno - proverjaem poslednij element
    }

}
