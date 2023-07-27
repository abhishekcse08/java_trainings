package Task_19th_July;

public class Sum_of_elements {
    public static void main(String[] args) {

        int ar[] = {1, 2, 3, 4, 5, 6, 1, 2};
        int Sum = SumOfElements(ar);
        System.out.println("Find the Sum of all Elements: " + Sum);
    }
    public static int SumOfElements(int ar[]) {
        int sum = 0;

        for (int num : ar) {
            sum += num;
        }
        return sum;
    }
}

