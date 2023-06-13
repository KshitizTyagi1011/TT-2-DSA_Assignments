import java.util.ArrayList;

class DiceGameProblem {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        int[] dice = { 1, 2, 3, 4, 5, 6 };

        int goal = 7;

        possibleOutcomes(dice, "", goal, 0, list);

        System.out.println(list);
    }

    static void possibleOutcomes(int[] dice, String s, int goal, int sum, ArrayList<String> list) {

        if (sum > goal)
            return;

        if (sum == goal) {
            list.add(s);
        }
        for (int i = 0; i < dice.length; i++) {
            String t1 = s + Integer.toString(dice[i]);
            int t2 = sum + dice[i];

            possibleOutcomes(dice, t1, goal, t2, list);
        }
    }
}

