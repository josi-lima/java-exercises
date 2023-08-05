public class StudentProfile {
    String firstName;
    String lastName;
    String university;
    int expectGraduationYear;
    boolean fail;
    double GPA;
    String major;  

    public StudentProfile (String firstName, String lastName, String university,
                            int expectGraduationYear, boolean fail, double GPA, String major) {
    
        this.firstName = firstName;
        this.lastName = lastName;
        this.university = university;
        this.expectGraduationYear = expectGraduationYear;
        this.fail = fail;
        this.GPA = GPA;
        this.major = major;
    }

    public int incrementGraduationYear() {
      int yearPlus = this.expectGraduationYear;
      if (this.fail) { yearPlus += 1; }
      return yearPlus;
    }
  }
    
  