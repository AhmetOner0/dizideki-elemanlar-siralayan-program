package patikadev;
import java.util.Scanner;
import java.util.Arrays;
public class ArraySiralama {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int lenght;
        int a;

        System.out.print("dizinin eleman sayısını giriniz: ");
        a= input.nextInt();

        int[]list=new int[a];

        for (int i=0;i< a;i++){
            System.out.print(i+1 + " numaralı elemanı giriniz: ");
            list[i]=input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
