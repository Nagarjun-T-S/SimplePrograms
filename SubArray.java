import java.util.*;
public class SubArray{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for(int k=1;k<arr.length;k++){
            for(int i=0;i<arr.length-k;i++){
                for(int j=i;j<k+i;j++)
                {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}