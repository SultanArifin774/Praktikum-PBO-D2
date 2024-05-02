public class PartTimeEmployee extends Employee implements WorkSchedule {
    private double hourlyRate;
    private int hoursWorked;
  
    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
      super(id, name);
      this.hourlyRate = hourlyRate;
      this.hoursWorked = hoursWorked;
    }
  
    public double calculateSalary(){
      return this.hourlyRate * this.hoursWorked;
   }

    public void displaySchedule(){
      System.out.println("Part-Time Employee Schedule: Flexible hours");
    }

    public void cetakInfo(){
      System.out.println("ID karyawan: " + id);
      System.out.println("Nama: " + name);
      System.out.println("Hourly Rate: " + hourlyRate);
      System.out.println("Hours Worked: " + hoursWorked);
      System.out.println("Salary: " + calculateSalary());
      displaySchedule();
    }
  }
  