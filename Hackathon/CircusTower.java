package com.java.Hackathon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
    int height;
    int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + height + ", " + weight + ")";
    }
}

public class CircusTower{

    // ==========================================
    // Part 1: Merge Sorted Arrays (Merge B into A)
    // ==========================================
    public static void mergeSortedArrays(int[] A, int[] B, int lastA, int lastB) {
        int indexA = lastA - 1;                // Pointer for last valid element in A
        int indexB = lastB - 1;                // Pointer for last element in B
        int indexMerged = lastA + lastB - 1;  // Pointer for back end of buffer in A

        // Compare elements starting from the end and place larger values at the back
        while (indexB >= 0) {
            if (indexA >= 0 && A[indexA] > B[indexB]) {
                A[indexMerged] = A[indexA];
                indexA--;
            } else {
                A[indexMerged] = B[indexB];
                indexB--;
            }
            indexMerged--;
        }
    }

    // ==========================================
    // Part 2: Circus Tower Routine
    // ==========================================
    public static List<Person> getLongestTower(List<Person> people) {
        if (people == null || people.isEmpty()) {
            return new ArrayList<>();
        }

        // Sort primarily by height ascending, then weight ascending
        Collections.sort(people, (p1, p2) -> {
            if (p1.height != p2.height) {
                return Integer.compare(p1.height, p2.height);
            }
            return Integer.compare(p1.weight, p2.weight);
        });

        int n = people.size();
        int[] dp = new int[n];      // Stores longest tower length ending at index i
        int[] prev = new int[n];    // Tracks index of person stacked above

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            prev[i] = -1;
        }

        int maxLength = 0;
        int bestEndIndex = -1;

        // Dynamic Programming: check valid stack pairs
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // Must be strictly taller and heavier to stand below person j
                if (people.get(i).height > people.get(j).height && 
                    people.get(i).weight > people.get(j).weight) {

                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        prev[i] = j;
                    }
                }
            }

            if (dp[i] > maxLength) {
                maxLength = dp[i];
                bestEndIndex = i;
            }
        }

        // Reconstruct sequence from bottom to top
        List<Person> tower = new ArrayList<>();
        int current = bestEndIndex;
        while (current != -1) {
            tower.add(people.get(current));
            current = prev[current];
        }

        // Reverse sequence to list from top to bottom
        Collections.reverse(tower);
        return tower;
    }
    public static void main(String[] args) {
        System.out.println("--- PART 1: MERGE SORTED ARRAYS ---");
        int[] A = {1, 3, 5, 7, 0, 0, 0}; // 0s represent buffered space at end
        int[] B = {2, 4, 6};

        mergeSortedArrays(A, B, 4, 3);

        System.out.print("Merged Array A: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("--- PART 2: CIRCUS TOWER ROUTINE ---");
        List<Person> people = new ArrayList<>();
        people.add(new Person(65, 100));
        people.add(new Person(70, 150));
        people.add(new Person(56, 90));
        people.add(new Person(75, 190));
        people.add(new Person(60, 95));
        people.add(new Person(68, 110));

        List<Person> tower = getLongestTower(people);

        System.out.println("The longest tower length is " + tower.size() + ".");
        System.out.println("Tower sequence (top to bottom):");
        for (Person p : tower) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}