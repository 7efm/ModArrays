
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

    }

    public void remove(int index){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
            System.out.println();
        }
        for(int i = index; i <= array.length; i++){
            System.out.println(i);
            System.out.print(array[i] = array[i+1]);
        }

    }
}
