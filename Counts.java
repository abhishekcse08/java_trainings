 public static void main(String[] args) {
        String s = "This is a hyderabad and hyderabad is a good place";

        ArrayList<Counts> ob = new ArrayList<>();  //  use arraylist to tack of word occurrences
        StringTokenizer tk = new StringTokenizer(s);  /// use tokenizer to split the input string into individual words
        while (tk.hasMoreTokens()) {
            String word = tk.nextToken().toLowerCase();
            boolean found = false;

            for (Counts ob1 : ob) {    /// use to iterate through the elements of the counts arraylist
                if (ob1.word.equals(word)) {
                    ob1.count++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                ob.add(new Counts(word, 1));
            }
        }


        System.out.println("word counts: ");
        for (Counts ob1 : ob) {
            System.out.println(ob1.word + " : " + ob1.count);
        }
    }
}
    class Counts {
        String word;
        int count;

        public Counts(String word, int count) {
            this.word = word;
            this.count = count;
        }


    }