public class EmployeeSalary {

  public static double calculateYearlySalary(double weeklyHours, double hourlyPay, double daysOff, int numOfWeeks) {

    double grossYearSalary = (hourlyPay * weeklyHours) * numOfWeeks;

    System.out.println("Without any vacation, your yearly salary, based on the number of hours worked per week, is: $" + grossYearSalary); // $58069.44
    
    daysOff = hourlyPay * 8; // non-paid vacation days
    double yearSalary = (hourlyPay * weeklyHours) * numOfWeeks - daysOff;

    return yearSalary;
  }
  
  public static void main(String[] args) {

    double yearSalary = calculateYearlySalary(44, 25.38, 10, 52);

    System.out.println("With non-paid vacation, your yearly salary, based on the number of hours worked per week, is: $" + yearSalary); // $57866.40
  }
}
