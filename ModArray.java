
/**
 * Write a description of class ModArray here.
 *
 * @author Jacinto Garcia
 * @version 1.7.19
 */
public class ModArray
{
    int[] array = {4,7,8,9,3,0};
    public void add(int num, int index){
        printArray(); 
        for(int i = array.length-1; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = num; 
        printArray(); 
    }

    public void remove(int index){
        printArray(); 
        for(int i = index; i <= array.length-2; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;
        printArray();
    }

    public void printArray(){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
