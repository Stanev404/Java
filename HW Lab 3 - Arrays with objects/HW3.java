/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw3;



 
 
 
 
 
 
 
 
 class HW3 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Employee ivan = new Employee("Ivan");
//        Employee peter = new Employee("Peter");
//        Employee nikola = new Employee("Nikola");
//        
//        ivan.setSalary(2500.50);
//        System.out.println(ivan.toString());
//        System.out.println(peter.toString()); // check if serial_number works
//        ivan.increase_salary_by_percent(30); // this means we increase the salary by 30 %
//        System.out.println("Ivans salary after increment: " + ivan.getSalary());
//        
//        Company metro = new Company("Metro",3);
//        metro.hire_employee(peter, 600);
//        metro.hire_employee(ivan, 2200);
//        metro.hire_employee(nikola, 1500);
//        metro.print();
//        metro.fire_employee(peter);
//        System.out.println();
//        metro.print();
//        System.out.println();
//        
//        metro.increase_all_salaries_by_percentage(30);
//        metro.print();
//        
//        metro.single_increment_of_a_employee(ivan, 30);
//        
//        metro.print();
//        metro.print_detail();
 
          Employee [] first_group_of_employees = new Employee[5]; // 1. Да се създадат два масива от по 5 служители
          double [] first_group_salaries = new double [5]; // 2. Да се създадат два масива от по 5 стойности за заплатите на служителите. 
          first_group_of_employees[0] = new Employee("Ivan");
          first_group_of_employees[1] = new Employee("Nikola");
          first_group_of_employees[2] = new Employee("Anton");
          first_group_of_employees[3] = new Employee("Hristo");
          first_group_of_employees[4] = new Employee("Fiki");
          for(int i = 0,sal=1000 ; i < 5;i++,sal+=1000){
              first_group_of_employees[i].setSalary(sal);
              first_group_salaries[i] = first_group_of_employees[i].getSalary(); // 2
          }
          
          Employee [] second_group_of_employees = new Employee[5]; // 1. Да се създадат два масива от по 5 служители
          double [] second_group_salaries = new double [5]; // 2. Да се създадат два масива от по 5 стойности за заплатите на служителите. 
          second_group_of_employees[0] = new Employee("Kiril");
          second_group_of_employees[1] = new Employee("Pavel");
          second_group_of_employees[2] = new Employee("Mehmet");
          second_group_of_employees[3] = new Employee("Angel");
          second_group_of_employees[4] = new Employee("Stilian");
          for(int i = 0,sal=2000 ; i < 5;i++,sal+=2000){
              second_group_of_employees[i].setSalary(sal);
              second_group_salaries[i] = second_group_of_employees[i].getSalary(); // 2
          }
          Company metro = new Company("Metro",10); // 3. Да се създадат два обекта от тип Компания. 
          Company alati = new Company("Alati",5);
          // hiring phase
          for(int i = 0;i<5;i++){ // 4. В първата компания да наемете служителите от първия масив, а във втората компания да наемете служителите от втория масив
              metro.hire_employee(first_group_of_employees[i], first_group_salaries[i]);
              alati.hire_employee(second_group_of_employees[i], second_group_salaries[i]);
          }
          alati.print();
         
          alati.print_detail(); // printira detailite po firmata
          // firing phase
          metro.fire_employee(first_group_of_employees[2]); // 5. Да се уволнят по един служител от всяка компания
          alati.fire_employee(second_group_of_employees[4]); // 5. Да се уволнят по един служител от всяка компания
          System.out.println();
          metro.print();
          System.out.println();
          metro.print_detail();
          System.out.println();
          alati.print_detail();
          System.out.println();
          // testing methods
          metro.print_salaries();
          metro.increase_all_salaries_by_percentage(30);
          metro.print_salaries();
          metro.single_increment_of_a_employee(first_group_of_employees[1], 20);
          metro.print();
          metro.print_salaries();
    }
   
}