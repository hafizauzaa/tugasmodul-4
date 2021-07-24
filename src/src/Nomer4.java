 package src;
public class Nomer4 {
    public static void main(String[] args) {
        int[] data = {25,7,9,13,3};
        printData(data);
        shellSort(data);
        System.out.println("\n");
        System.out.println("* Shell Sort *");
        printData(data);
    }
    public static void printData(int data[]){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
    public static void shellSort(int[] data){
        int jarak = data.length;
        int c = 0;
        boolean sudah = true;
        while (jarak >= 1){
            jarak = jarak/2;
            sudah = true;
            while (sudah){
                sudah = false;
                for (int j=0; j<data.length-jarak; j++){
                    int i = j+jarak;
                    c++;
                    if (data[j]>data[i]){
                        int temp = data[j];
                        data[j] = data[i];
                        data[i] = temp;
                        sudah = true;
                    }
                }
            }
        }
        System.out.println("\n");
        System.out.println("hafizauza");
    }
    
}