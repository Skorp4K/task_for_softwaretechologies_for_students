package org.softwaretechnologies.employee;
import java.time.LocalDate;
import  java.time.YearMonth;
/**
 * Тип сотрудника
 */
public enum EmployeeType {
    /*
    Формула вычисления зп: если месяц четный, то baseSalary, иначе baseSalary/2
     */
    Manager {
        @Override
        public int calculateSalary(int baseSalary, int month){
            return (month % 2 == 0) ? baseSalary : baseSalary / 2;
        }

    },

    /*
    Формула вычисления зп: всегда baseSalary
     */
    Programmer{
        @Override
        public int calculateSalary(int baseSalary, int month){
            return baseSalary;
        }
    },
    /*
    Формула вычисления зп: baseSalary * количество дней в месяце в текущем году
    Вычисление количества дней в месяце: YearMonth.of(LocalDate.now().getYear(), month).lengthOfMonth()
     */
    Tester{
        @Override
        public int calculateSalary(int baseSalary, int month) {
            int daysInMonth = YearMonth.of(LocalDate.now().getYear(), month).lengthOfMonth();
            return baseSalary * daysInMonth;
        }
    };

    public abstract int calculateSalary(int baseSalary, int month);
}
