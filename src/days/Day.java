package days;

public enum Day {
    Monday("Понедельник"),
    Tuesday("Вторник"),
    Wednesday("Среда"),
    Thursday("Четверг"),
    Friday("Пятница"),
    Saturday("Суббота"),
    Sunday("Воскресенье");

    String russian;

    Day(String russian){
        this.russian = russian;
    }
}
