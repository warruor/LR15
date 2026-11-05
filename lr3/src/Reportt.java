public class Reportt {
    public static void generateReport(Employe[] employees) {
        System.out.println("Отчёт по зарплате:");
        for (int i = 0; i < employees.length; i++) {
            Employe emp = employees[i];
            System.out.printf("%-20s | %10.2f%n", emp.name, emp.salary);
        }
    }
}
