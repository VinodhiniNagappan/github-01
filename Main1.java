import java.util.*;
 public class Main1{
    public static void main(String[] args){
    int array[] = { 1,2,3,4,5};
    Arrays.sort(array);
    reverse(array);
    System.out.println(Arrays.toString(array));
    }
    public static void  reverse (int[] array) {
        int n = array.length;
        for(int i=0; i< n/2; i++){
        int t= array[i];
        array[i] = array[n -i- 1];
        array[n-i-1]=t;
    }
}

}
    
    