package com.bptn.course.week1;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements: ");
int n = sc.nextInt();
int first = 0;
int second = 1;
System.out.println("fibonacci series up to " + n + " elements: ");
/*for (int i = 0; i < n; i++) {
    System.out.print(first + " ");
	}*/
if (n==1){
    System.out.println(first);
} else if(n == 0){
    System.out.println(first);
} else{
    System.out.println(first + " " + second + " ");
for(int i = 2; i < n; i++) {
        int num = first + second;
        System.out.println(num + " ");
        first = second;
        second = num;

}
}
	}
}
