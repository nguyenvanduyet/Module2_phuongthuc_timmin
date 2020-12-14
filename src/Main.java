import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập độ dài của mảng:");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int i =0;
        while (i<arr.length){
            System.out.println("nhập giá trị của mảng:");
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.println("giá trị nhỏ nhất của mảng:"+minArray(arr));
    }
    public static int minArray(int[]arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

}
