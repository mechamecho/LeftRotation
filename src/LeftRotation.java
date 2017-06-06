/**
 * Created by Engineer on 6/6/2017.
 */

import java.util.*;

public class LeftRotation {
    public static void main(String[] args){

            Scanner in=new Scanner(System.in);
            int size=in.nextInt();
            int rot=in.nextInt();
            int[] array=new int[size];
            for(int i=0;i<size;i++){
                array[i]=in.nextInt();
            }
            for(int i=rot;i<(size+rot);i++){
                System.out.print(array[i%size]+" ");
            }
    }
}


