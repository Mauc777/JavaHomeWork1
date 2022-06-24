package Lesson_of_Iliya.Point2dLesson;
public class Point {
    // Поля
    private double x;
    private double y;

    // Конструктор инициализации x и y
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Статический метод по просчету расстояния между 2-мя точками, который на вход
    // принимает 2 точки
    public  double getDistance(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;

        return Math.sqrt(dx * dx + dy * dy);
    }


    // Ниже приведен пример ИНКАПСУЛЯЦИИ МЕТОДА getDistance()!!
    public  double getDistance(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    
}