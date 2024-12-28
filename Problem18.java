import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Problem18 {
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new Problem18().initialize();
    }

    public void initialize() {
        System.out.println("Enter the range of the array:");
        int range = input.nextInt();
        int[] array = array(range);

        // Sort the array and print it
        sortArray(array);
        printArray(array);
    }

    private int[] array(int range) {
        int[] array = new int[range];
        System.out.println("Enter the array Elements:");
        for (int i = 0; i < range; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    private void printArray(int[] array) {
        System.out.println("The array is:");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print("," + array[i]);
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    private void sortArray(int[] array) {
        List<Integer> list1=new ArrayList();
        List<Integer> list2=new ArrayList();
        int i,j=0;
        
        for(i=0;i<array.length/2;i++){
            list1.add(array[j++]);
            list2.add(array[j++]);
        }
        if(array.length%2==1)
            list1.add(array[j]);
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        i=list1.size()-1;j=0;int k=0;
        
        while (j<list2.size()) {
            array[k++]=list1.get(i--);
            array[k++]=list2.get(j++);
        }
        if(array.length/2!=list1.size())
            array[k]=list1.get(i);
    }
}