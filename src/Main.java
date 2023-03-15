public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Петушкова Марина Сергеевна", 1, 35700f);
        employees[1] = new Employee("Горелых Петр Васильевич", 2, 41850f);
        employees[2] = new Employee("Сушко  Михаил Семенович", 3, 50900f);
        employees[3] = new Employee("Бегунов Максим Анатольевич", 3, 40500f);
        employees[4] = new Employee("Серебрякова Екатерина Андреевна", 4, 45820f);
       printEmployees() ;
        System.out.println("====================================");
        System.out.println("Сумма зарплат : " + sum());
        System.out.println("====================================");
        System.out.println(findMinSalary());
        System.out.println("====================================");
        System.out.println(findMaxSalary());
        System.out.println("====================================");
        System.out.println("средняя зп: " + calculateAverageSalary());
        System.out.println("====================================");
        printFIO();
        System.out.println("====================================");
   }

    static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    static int sum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    static Employee findMinSalary() {
        Employee min = null;
        for (Employee employee : employees) {
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }
    static Employee findMaxSalary() {
        Employee max = null;
        for (Employee employee : employees) {
            if (max == null || employee.getSalary() < max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    double calculateAverageSalary() {
        return (double) sum() / employees.length;
    }

    void printFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName()+ "  " + employee.getFirstName()+ "  " + employee.getMiddleName());
        }
    }
    }














