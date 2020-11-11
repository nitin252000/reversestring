import java.util.Arrays;
import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
    }}
