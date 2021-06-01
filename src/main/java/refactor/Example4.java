package refactor;

/****
 *Passing an entire object
 * When a method is called with parameters, you may sometimes see code like this:
 */
public class Example4 {
    public static void main(String[] args) {
        new Example4().employeeMethod(new Employee(1, 2200));
    }


    public void employeeMethod(Employee employee) {
        double yearlySalary = employee.getYearlySalary();
        double awards = employee.getAwards();
        double monthlySalary = getMonthlySalary(yearlySalary, awards);
        System.out.println(monthlySalary);
    }

    public double getMonthlySalary(double yearlySalary, double awards) {
        return yearlySalary / 12 + (awards * 1000);
    }
}

class Employee {
    double awards;
    double yearlySalary;

    public Employee(double awards, double yearlySalary) {
        this.awards = awards;
        this.yearlySalary = yearlySalary;
    }

    public double getAwards() {
        return awards;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }
}





/****
 * ***** Hint ****
 * Pass the employee object in the getMonthlySalary()
 * ****/