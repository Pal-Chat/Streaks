import java.util.*;
import java.lang.*;
import java.io.*;

class kthmax{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n,k;
            System.out.println("Enter the value of n ");
            n=in.nextInt();
            int[] arr = new int[n];
            System.out.println("Enetr the vaues of the array");
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            System.out.println("enter the value of k");
            k=in.nextInt();
            PriorityQueue<Integer>queue = new PriorityQueue<>();
            for(int i=0;i<n;i++){
                queue.add(arr[i]);
                if(queue.size()>k){
                    queue.poll();// pop the element

                }
            }
            System.out.println(queue.peek());
            
        }
}

