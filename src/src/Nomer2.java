package src;
public class Nomer2 {
    public  static void main(String[] args){
        int[] data = {25,7,9,13,3};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        int k=1;
        while (k<data.length){
            int j = data.length-1;
            while (j>=1){
                if (data[j-1]>data[j]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
                j = j-1;
            }
            k = k+1;
        }
        System.out.println("\n");
        System.out.println("* Bubble Sort *");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("\n");
        System.out.println("hafizauza");
    }
    
}