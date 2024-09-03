public class Main {
    public static void main(String[] args) {
        Organization devDept = new Department("Development");
        Organization hrDept = new Department("HR");

        Organization emp1 = new Employee("Alice", 50000);
        Organization emp2 = new Employee("Bob", 60000);
        Organization emp3 = new Employee("Charlie", 55000);
        Organization emp4 = new Employee("David", 70000);

        devDept.add(emp1);
        devDept.add(emp2);
        hrDept.add(emp3);
        hrDept.add(emp4);

        Organization company = new Department("Company");
        company.add(devDept);
        company.add(hrDept);

        System.out.println("Total Salary of Organization before removal: " + company.getSalary());

        StringBuilder xmlBuilderBefore = new StringBuilder();
        company.printStructure(xmlBuilderBefore);
        System.out.println("Organizational Structure before removal:");
        System.out.println(xmlBuilderBefore.toString());

        devDept.remove(emp2);
        company.remove(hrDept);

        System.out.println("Total Salary of Organization after removal: " + company.getSalary());

        StringBuilder xmlBuilderAfter = new StringBuilder();
        company.printStructure(xmlBuilderAfter);
        System.out.println("Organizational Structure after removal:");
        System.out.println(xmlBuilderAfter.toString());
    }
}