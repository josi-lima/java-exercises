public class Student {
    public static void main(String[] args) {
        String studentName = "Josie DeLima";
        char studentFirstInitial = studentName.charAt(0);
        char studentLastLetter = studentName.charAt(studentName.length() -1);
        int studentAge = 18;
        double studentGPA = 3.4;
        boolean hasPerfectAttendance = true;

        System.out.println("Student's name: " + studentName);
        System.out.println("First initial: " + studentFirstInitial);
        System.out.println("Last letter: " + studentLastLetter);
        System.out.println("Age: " + studentAge + " years old");
        System.out.println("The student has excellent attendance: " + hasPerfectAttendance + ".");
        System.out.println("Total GPA of: " + studentGPA);      
    }
}
