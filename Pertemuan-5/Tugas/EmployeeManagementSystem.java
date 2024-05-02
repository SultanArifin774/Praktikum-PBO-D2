public class EmployeeManagementSystem {
    public static void main(String[] args) {
        
      FullTimeEmployee JohnDoe = new FullTimeEmployee(101, "John Doe", 4000.0);
    
      PartTimeEmployee JaneSmith = new PartTimeEmployee(201, "Jane Smith", 15.0, 30);
    
      JohnDoe.cetakInfo();
      JaneSmith.cetakInfo();
    
      }
    
}
