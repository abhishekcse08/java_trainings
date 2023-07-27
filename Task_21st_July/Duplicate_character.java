package Task_21st_July;

public class Duplicate_character {
    public static void main(String[] args){
            String str="HYDERABAD";
            char[] ch=str.toCharArray();
            for(int i=0;i<str.length(); i++){
                for(int j=i+1;j<str.length();j++){
                    if(ch[i]==ch[j]){
                        System.out.println("Print duplicate characters: " +ch[j]);
                    }
                }
            }
        }

    }

