package loops;

public class WhileChallenge {

    public static void main(String[] args) {

        String quote = "We ave a large inventory of things in our warehouse falling in "
                + "the category:apperal and slilghtly "
                + "more in demand category:makeup along with the category:furniture and _.";

        printCategories(quote);
    }

    // Professor solution
    public static void printCategories(String string){
        int i = 0;
        while(true){
            int found = string.indexOf("category:", i);
            if (found == -1) break;
            int start = found + 9;
            int end = string.indexOf(" ", start);
            System.out.println(string.substring(start, end));
            i = end + 1;
        }
    }
}
