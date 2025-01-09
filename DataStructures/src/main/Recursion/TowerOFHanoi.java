package main.Recursion;

import java.util.Scanner;

public class TowerOFHanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n,"A","C", "B");
    }

    public static void towerOfHanoi(int n, String from_Rod, String to_Rod, String aux_Rod) {
        if(n==0) {
            return;
        }
        towerOfHanoi(n-1,from_Rod,aux_Rod,to_Rod);
        System.out.println("move disc "+ n + " from Rod "+ from_Rod +" to Rod "+to_Rod);
        towerOfHanoi(n-1,aux_Rod,to_Rod,from_Rod);
    }
}
