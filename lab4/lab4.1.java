// Employee.java
public class Employee {
    private String name;
    private double salary;  
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }  
    // Геттеры/сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }  
    public void displaySalary() {
        System.out.printf("Сотрудник %s: зарплата %.2f%n", name, salary);
    }    
    @Override
    public String toString() {
        return String.format("Employee{name='%s', salary=%.2f}", name, salary);
    }
}
// Manager.java
public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }    
    public void increaseSalary() {
        setSalary(getSalary() * 1.2); // +20%
        System.out.printf("Менеджер %s получил надбавку%n", getName());
    }   
    @Override
    public String toString() {
        return "Manager{" + super.toString() + "}";
    }
}
// Intern.java  
public class Intern extends Employee {
    public Intern(String name, double salary) {
        super(name, salary);
    }    
    public void study() {
        System.out.printf("Стажер %s учится%n", getName());
    }    
    @Override
    public String toString() {
        return "Intern{" + super.toString() + "}";
    }
}
// Director.java
public class Director extends Employee {
    public Director(String name, double salary) {
        super(name, salary);
    }    
    public void makeDecision() {
        System.out.printf("Директор %s принял решение%n", getName());
    }
    @Override
    public String toString() {
        return "Director{" + super.toString() + "}";
    }
}
// Company.java
import java.util.ArrayList;
import java.util.List;
public class Company {
    private List<Employee> employees = new ArrayList<>();   
    public boolean addEmployee(Employee emp) {
        return employees.add(emp);
    }    
    public Employee popEmployee() {
        if (employees.isEmpty()) return null;
        return employees.remove(employees.size() - 1);
    }
    public int countManagers() {
        return (int) employees.stream().filter(e -> e instanceof Manager).count();
    }
    public int countInterns() {
        return (int) employees.stream().filter(e -> e instanceof Intern).count();
    }
    public int countDirectors() {
        return (int) employees.stream().filter(e -> e instanceof Director).count();
    }    
    public void manage() {
        for (Employee emp : employees) {
            if (emp instanceof Manager manager) {
                manager.increaseSalary();
            } else if (emp instanceof Intern intern) {
                intern.study();
            } else if (emp instanceof Director director) {
                director.makeDecision();
            }
        }
    }    
    @Override
    public String toString() {
        return "Company{employees=" + employees.size() + 
               ", managers=" + countManagers() + 
               ", interns=" + countInterns() + 
               ", directors=" + countDirectors() + "}";
    }
}
