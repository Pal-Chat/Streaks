import java.util.Scanner;
class array012{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n,i,count0=0,count1=0,count2=0;

        System.out.println("Enter the number of array elements : ");
        n= in.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the value of array in only 0,1 and 2 : ");

        for(i=0;i< arr.length;i++){ // Enetering the elements in the array
            arr[i]=in.nextInt();
        }
        
        for(i=0;i< arr.length; i++){
            switch(arr[i]){
                case 0: count0++;
                break;
                case 1: count1++; 
                break;
                case 2: count2++;
                break;
            }
        }
        System.out.println("0: "+count0);
        System.out.println("1: "+count1);
        System.out.println("2: "+count2);

        i=0;

        while(count0>0){
            arr[i++]=0;
            count0--;
        }
        while(count1>0){
            arr[i++]=1;
            count1--;
        }
        while(count2>0){
            arr[i++]=2;
            count2--;
        }
        for(i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]); 

        }
       
    }
}