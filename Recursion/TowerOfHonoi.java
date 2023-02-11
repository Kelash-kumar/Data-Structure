package Recursion;

public class TowerOfHonoi {
    public static void TowerOfHonoi(int number, String tower1, String tower2, String tower3) {
        if (number == 0)
            return;

        TowerOfHonoi(number - 1, tower1, tower3, tower2);
        System.out.println(number + " [ " + tower1 + " -> " + tower2 + " ]");
        TowerOfHonoi(number - 1, tower3, tower2, tower1);

    }

    public static void main(String[] args) {
        TowerOfHonoi(4, "A", "B", "C");
    }

}
