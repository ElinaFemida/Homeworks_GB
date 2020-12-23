package HOMEWORKS_GB.Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Employee[] emplArr = {
        new Employee("Иванов Иван Иванович", "разработчик", "ivan@bk.ru", "+79778888888", 100000, 42),
        new Employee("Петров Петр Петрович", "дизайнер", "petr@bk.ru", "+79775555555", 80000, 34),
        new Employee("Смирнов Иван Петрович", "бухгалтер", "smivan@bk.ru", "+79776666666", 900000, 43),
        new Employee("Михайлов Михайл Михайлович", "специалист 1-го разряда", "miha@bk.ru", "+79779999999", 10000, 20),
        new Employee("Шишкин Алексей Иванович", "кадровик", "leha@bk.ru", "+79770000000", 50000, 48)
    };
        System.out.println("Сотрудники старше 40 лет:");
        for (int i = 0; i < emplArr.length; i++) {
            if (emplArr[i].getAge() > 40) {
                emplArr[i].printInfo();
            }
        }
    }
}
