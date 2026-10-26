package org.softwaretechnologies.employee;

/**
 * Тип сотрудника
 */
public enum EmployeeType {
    /*
    Формула вычисления зп: если месяц четный, то baseSalary, иначе baseSalary/2
     */
    Manager {
        @Override
        public Employee create() {
            return new org.softwaretechnologies.employee.Manager(null, 20);
        }

    },

    /*
    Формула вычисления зп: всегда baseSalary
     */
    Programmer{
        @Override
        public Employee create() {
            return new org.softwaretechnologies.employee.Programmer(null, 20);
        }
    },
    /*
    Формула вычисления зп: baseSalary * количество дней в месяце в текущем году
    Вычисление количества дней в месяце: YearMonth.of(LocalDate.now().getYear(), month).lengthOfMonth()
     */
    Tester{
        @Override
        public Employee create() {
            return new org.softwaretechnologies.employee.Tester(null, 20);
        }
    };

    public abstract Employee create();

}
