/* Write a program that reads an array of ints named a and cyclically shift the elements of the array to the right: a[0] goes to the place of a[1], a[1] goes to the place of a[2], ..., and the last element goes to the place of a[0]).

Input data format

The first line of the input contains the number of elements in the array. The second line contains the elements of the array.

Output data format

The single line should contain all shifted elements of the array. Elements must be separated by the space character.

 Report a typo
Sample Input 1:

5
1 2 3 4 5
Sample Output 1:

5 1 2 3 4
*/



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            int shifted = (i + 1) % arr.length;
            arr[shifted] = scanner.next();
        }
        System.out.println(String.join(" ", arr));
    }
}