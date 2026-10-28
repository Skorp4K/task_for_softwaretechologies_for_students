package org.softwaretechnologies.employee;

/**
 * Создайте классы, наследуемые от Employee и представляющие каждый из типов указанный в enum EmployeeType.
 * Для каждого из них реализуйте функцию getMonthSalary по следующим формулам:
 * Tester: baseSalary * количество дней в месяце в текущем году. Вычисление количества дней в месяце: YearMonth.of(LocalDate.now().getYear(), month).lengthOfMonth()
 * Manager: если месяц четный, то baseSalary, иначе baseSalary/2
 * Programmer: всегда baseSalary
 */
public class Employee {
    protected String name;
    protected int baseSalary;
    protected EmployeeType type; // Добавили тип

    public Employee(String name, int baseSalary, EmployeeType type) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.type = type;
    }

    public int getMonthSalary(int month) {
        // Делегируем расчет самому Enum
        return type.calculateSalary(baseSalary, month);
    }

    public String getName() {
        return name;
    }
}
