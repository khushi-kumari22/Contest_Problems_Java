import java.util.*;
public class evenOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int arrsize = input.nextInt();
        System.out.println("Enter" + arrsize + "number of Integers");

        int[] ans = new int[arrsize];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arrsize; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            ans[i] = input.nextInt();
        }

        for (int i = 0; i < arrsize; i++) {
            if (i % 2 == 0) {
                even.add(ans[i]);
            } else {
                odd.add(ans[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        int evenSum = 0;
        int oddSum = 0;

        if (even.size() >= 2) {
            evenSum = even.get(even.size() - 2);
        }
        if (odd.size() >= 2) {
            oddSum = odd.get(odd.size() - 2);
        }

        System.out.println("Sorted even array: " + even);
        System.out.println("Sorted odd array: " + odd);
        System.out.println("The sum of the second largest numbers from both arrays is " + (evenSum + oddSum));

    }
}
