public class FullTimeEmployee extends Employee implements WorkSchedule {
    private double monthlySalary;
  
    public FullTimeEmployee(int id, String name, double monthlySalary) {
      super(id, name);
      this.monthlySalary = monthlySalary;
    }

    public double calculateSalary(){
        return this.monthlySalary;
    }
  
    public void displaySchedule(){
      System.out.println("Full-Time Employee Schedule: Monday to Friday, 9:00 AM - 5:00 PM");
    }

    public void cetakInfo(){
      System.out.println("ID karyawan: " + id);
      System.out.println("Nama: " + name);
      System.out.println("Monthly Salary: " + monthlySalary);
      System.out.println("Salary: " + calculateSalary());
      displaySchedule();
    }
  }
  