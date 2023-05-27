/*
* * * * *
  * * * 
	  * *
	    *
*/
public class Pattern1{
    public static void main(String[] args){
        int rows =4;
        int cols =5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if((i==2&&j==5)||(i==3&&j==3)||(i==4&&j==4)||(i-j>=1&&(i-j<=3))){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    }