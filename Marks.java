public class Marks {
    
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};


        if (marks.length > 1) {
            marks[1] = 95; // Modifying the second element (index 1)
        }
        if (marks.length > 2) {
            marks[2] = 80; // changing 78 to 80
        }
        System.out.println("Marks of students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}

   