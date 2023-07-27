package Task_19th_July;

public class Duplicate_elements {
    public static void main(String[] args){
        int[] ar={1,2,3,4,5,6,1,2};
        for(int i=0; i<=ar.length ;i++){
            for( int j=i+1;j<ar.length; j++){
                if(ar[i]==ar[j]){
                    System.out.println("Print duplicate elements: " +ar[j]);
                }

            }
        }

    }
}


