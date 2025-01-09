package main.Recursion;

public class AllSubsetExample {

    public static void main(String[] args) {
        printAllSubset("abc", 0, "");
    }

    public static void printAllSubset(String str, int index, String current) {
        int length = str.length();
        if(index == length) {
            System.out.println(current);
            return;
        }
        printAllSubset(str, index+1, current+str.charAt(index));
        printAllSubset(str, index+1, current);
    }
}
