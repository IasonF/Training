public class RegularExpression {
    public static void main(String[] args) {

        String text = " Hello world fjoisdj";
        String regularExpression = "[! ]";

        String[] words = text.trim().split(regularExpression);
        for (String word : words) {
            System.out.println(word);
        }


    }
}
