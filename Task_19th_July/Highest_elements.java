package Task_19th_July;

public class Highest_elements {
    public static void main(String[] args) {

        int ar[] = {1, 2, 3, 4, 5, 6, 1, 2};
        int highest = findHighestElement(ar);

        System.out.println("Highest Element in the given array: " + highest);
    }
    public static int findHighestElement(int[] ar) {
        int highest = ar[0];
        for (int i = 0; i < ar.length; i++){
            if (ar[i] > highest){
                highest = ar[i];
            }
        }
        return highest;
    }
}


