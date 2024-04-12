package self;

public class ClassFirstPractice {
    public static void main(String[] args) {
        Employee employee = new Employee();
        
        employee.setData(1234, "山田");
        System.out.println("社員番号：" + employee.getId());
        System.out.println("社員名：" + employee.getName());
    }
}


abstract class Employee {
    int id;
    String name;
    
    public void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
  
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
                
    }
    