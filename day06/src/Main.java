public class Main {
  public static void main(String[] args) {

    StudentProfile studentA = new StudentProfile("Amy", "Sulivan", "Stanford", 2028, false, 3.5, "French Literature");

    StudentProfile studentB = new StudentProfile("Oliver", "Matzubara", "Harvard", 2025, true, 3.4, "Computing Systems");

    int gradYearStudentA = studentA.incrementGraduationYear();

    System.out.println("Has the student failed a period? " + studentA.fail + "." + " Expected year of graduation for " + studentA.firstName + " " + studentA.lastName + " is " + gradYearStudentA + ".");

    int gradYearStudentB = studentB.incrementGraduationYear();

    System.out.println("Has the student failed a period? " + studentB.fail + "." + " Expected year of graduation for " + studentB.firstName + " " + studentB.lastName + " is " + gradYearStudentB + ".");
  }
}
