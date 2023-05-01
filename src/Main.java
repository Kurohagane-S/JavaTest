import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int altura = 10;
        //christmasTree(h);
        //invertedTree(h);
        //normalDoubleTree(h);
        //normalSquare(h);

        System.out.println("Hello world!");
        treeNormal(altura);
        christmasTree(altura);
    }



    public static Integer Sum(int number1, int number2){
        return number1+number2;
    }

    public static void treeNormal(int height){

        for(int i=0;i<height;i++){
            //no need
            //System.out.print("");
            for(int j=height-i;j>0;j--){
                System.out.print("");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void christmasTree(int h){

        //beginning of upper part
        //for(variable; condition; change)
        for(int i = 1;i <= h;i++){

            for(int j = h-i;j > 0;j--){
                System.out.print("-");
            }

            for(int k = 1;k <= i;k++){
                System.out.print(k+" ");
            }

            System.out.println();
        }//end of upper part

        //beginning of lower part
        for(int i = 1;i <= 3-1;i++){

            System.out.print(" ");

            for(int j = h-3;j > 0;j--){
                System.out.print(" ");
            }

            for(int k = 2;k > 0;k--){
                System.out.print("| ");
            }

            System.out.println();
        }// end of lower part

    }

    public static void invertedTree(int h){


        for(int i = 1;i <= h;i++){

            for(int k = 1;k <= i;k++){
                System.out.print("*");
            }

            for(int j = h-i;j > 0;j--){
                //System.out.println("*");
                System.out.print(" ");
            }

            for(int j = h-i;j > 0;j--){
                //System.out.println("*");
                System.out.print(" ");
            }

            for(int k = 1;k <= i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void normalDoubleTree(int h){


        //beginning of upper part
        //for(variable; condition; change)
        for(int i = 1;i <= h;i++){

            for(int j = h-i;j > 0;j--){
                System.out.print(" ");
            }

            for(int k = 1;k <= i;k++){
                System.out.print("*");
            }

            for(int k = 1;k <= i;k++){
                System.out.print("*");
            }

            System.out.println();
        }//end of upper part
    }

    public static void normalSquare(int h){

        for(int i=1; i <= h; i++){

            for (int j=h;j>=1;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }


}