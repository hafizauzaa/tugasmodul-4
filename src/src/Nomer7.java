package src;

import java.util.Scanner;

public class Nomer7 {
    public static void printData(int[] data){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
    public static void selectionSort(int[] data){
        for (int i=0; i<data.length-1; i++){
            int indexSmall = i;
            for (int j=i+1; j<data.length; j++){
                if (data[j] < data[indexSmall]){
                    indexSmall = j;
                }
            }
            int temp = data[i];
            data[i] = data[indexSmall];
            data[indexSmall] = temp;
        }
    }
    public static void binarySearch(int[] data, int key){
        int indexAwal = 0;
        int indexAkhir = data.length-1;
        int middle = 0;
        int found = 0;
        while((indexAwal<=indexAkhir) && (found == 0)){
            middle = (indexAwal+indexAkhir)/2;
            System.out.println("nilai tengah = "+middle);
            if (key == data[middle]){
                System.out.println("nilai "+key+", berada di indeks ke-"+middle);
                found = 1;
            }
            else{
                if (key < data[middle]){
                    System.out.println("<- kiri");
                    indexAkhir = middle-1;
                }
                else{
                    System.out.println("kanan ->");
                    indexAwal = middle+1;
                }
            }
        }
        if (found == 1){
            System.out.println("data telah ditemukan");
        }
        else{
            System.out.println("data tidak ditemukan");
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] nilai = {25,7,9,13,3};
        System.out.println("--- before ---");
        printData(nilai);
        selectionSort(nilai);
        System.out.println("\n--- after ---");
        printData(nilai);
        
        System.out.println("\nmasukan data yang ingin di cari:");
        int key = input.nextInt();
        System.out.println("\n");
        System.out.println("hafizauza");

        binarySearch(nilai, key);
    }
}
