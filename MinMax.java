import java.util.Scanner;
public class MinMax {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number of integer n : ");
        n= in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers in array"); //Entering the elements of the array
        for(i=0;i< arr.length; i++){
            arr[i]=in.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Min is "+min+"And max is "+ max);
    }
}
