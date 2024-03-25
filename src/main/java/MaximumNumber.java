//10 | Java Program To Find Maximum Number Out of Three Numbers | Java Boolean Operator

public class MaximumNumber {
    public static void main(String[] args) {
        int numA = 5;
        int numB = 10;
        int numC = 2;

        if (numA > numB && numA > numC) {
            System.out.println(numA);
        } else if (numA < numB && numB > numC) {

            System.out.println(numB);
        } else if (numA < numC && numB < numC) {
            System.out.println(numC);
        } else {
            System.out.println("Invalid Comparision");

        }
    }
}

