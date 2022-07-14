import java.util.Scanner;
class ReverseArray{
    static void swapArray(int arr[] , int start, int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[], int n)
    {
        int i;
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        Scanner  r =new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n= r.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the values");
        for(int i=0;i<n;i++){
            arr[i] =r.nextInt();
        }
        swapArray(arr,0,n-1);
        printArray(arr,n);
    }
}