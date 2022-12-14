package ict;

import java.util.Hashtable;

public class HashtableThings {
    public static void main(String[] args) {
        Hashtable<AnswerToUltimateQuestion, String> hashtable = new Hashtable<>();
        hashtable.put(new AnswerToUltimateQuestion(), "a");
        hashtable.put(new AnswerToUltimateQuestion(), "b");
        hashtable.put(new AnswerToUltimateQuestion(), "c");
        System.out.println(hashtable.get(new AnswerToUltimateQuestion()));

        AnswerToUltimateQuestion one = new AnswerToUltimateQuestion();
        hashtable.put(one, "one");
        System.out.println(hashtable.get(one));

    }
}

class AnswerToUltimateQuestion {
    @Override
    public int hashCode() {
        return 42;
    }
}
