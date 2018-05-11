/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

/**
 *
 * @author STAN-PC
 */
public class Company {
    private String name_of_Company;
    private int max_employees;
    private Employee employees [];
    private int current_employees;
   
    Company(String name,int max_empl){ // 1
        this.name_of_Company = name;
        this.max_employees = max_empl;
        this.current_employees = 0;
        this.employees = new Employee[this.max_employees];
    }
    void hire_employee(Employee e,double sal){ // 2
        if(this.current_employees == this.max_employees){
            System.out.println("Can't hire " + e.getName() + " because " + this.name_of_Company + " is full !");
            return;
        }
        e.setSalary(sal);
        if(this.current_employees < this.max_employees){
            this.employees[this.current_employees] = e;
           
            this.current_employees++;
    }
    }
    void fire_employee(Employee e){ // 3
        if(this.current_employees == 0){
            System.out.println("Company: " + this.name_of_Company + " can't fire" + e.getName() + ", because they do not have anyone.");
            return;
        }
        
        int pos = 0;
        boolean found = false;
        for(int i = 0;i<this.current_employees;i++){
            if(this.employees[i] == e){
                pos = i;
                found = true;
                
               
                break;
            }
        }
        if(found == true){
            
            for(int i = pos;i < this.current_employees - 1;i++){
                this.employees[i] = this.employees[i+1];
            }
            Employee [] new_one = new Employee[this.current_employees - 1];
            System.arraycopy(this.employees, 0, new_one, 0, this.current_employees - 1);
            this.employees = new_one;
            //this.employees[this.current_employees - 1] = null;
            this.current_employees--;
        }
    }
    void print_salaries(){ // 5
        int sum = 0;
        for(int i = 0;i<this.current_employees;i++){
            sum += this.employees[i].getSalary();
        }
        System.out.println("The value of all salaries is: " + sum);
    }
    void print(){ // 4
        for(int i = 0;i<this.current_employees;i++){
            System.out.println(this.employees[i].toString());
        }
    }
    void increase_all_salaries_by_percentage(double percentage){ // 6
        for(int i = 0;i<this.current_employees;i++){
            this.employees[i].increase_salary_by_percent(percentage);
        }
    }
    void single_increment_of_a_employee(Employee e,double percentage){ // 7
            for(int i = 0;i<this.current_employees;i++){
                if(this.employees[i] == e){
                    this.employees[i].increase_salary_by_percent(percentage);
                    break;
                }
            }
    }
    void print_detail(){ // 8
        System.out.println("Name of company: " + this.name_of_Company + "\n" + "Maximum employees: " + this.max_employees + "\n" + "Hired employees: " + this.current_employees);
    }
}
