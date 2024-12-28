import java.util.Scanner;
import java.util.Arrays;
class Problem17{
    private Scanner input = new Scanner(System.in);
    public static void main (String[]args){
        new Problem17().initialize();
    }
    
    public void initialize(){
        System.out.println("Enter the range of the array:");
        int range = input.nextInt();
        int array[] = array(range);
        printArray(array);
        Arrays.sort(array);
        System.out.println("The array after alternate sorting is:");
        printArray(alternateSorting(array));
    }
    
    private int[] array(int range){
        int array[]=new int[range];
        System.out.println("Enter the array Elements:");
        for(int i=0;i<range;i++){
            array[i]=input.nextInt();
        }
        return array;
    }
    
    private void printArray(int array[]){
        System.out.println("The array is:");
        System.out.print("[");
        for(int i=0;i<array.length;i++){
            if(i!=0)
              System.out.print(","+array[i]);
            else 
              System.out.print(array[i]);
        }
        System.out.print("]");
        System.out.println();
    }
    
    private int[] alternateSorting(int array[]){
        int i=0,j=array.length-1,k=0;
        int result[]=new int[j+1];
        while(i<j){
            result[k++]= array[j--];
            result[k++] = array[i++];
            
        }
        if(i==j)
         result[k++]=array[i];
        return result;
    }
    
}