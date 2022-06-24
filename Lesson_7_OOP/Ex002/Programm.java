package Lesson_7_OOP.Ex002;

public class Programm {
// Был сначала данный метод
    static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2 - x1, 2)+ Math.pow(y2 - y1,2));
    }

//  В JAVA не допускается ПЕРЕГРУЗКА ПО ИМЕНИ АРГУМЕНТОВ! пример под комментом!!
    // static double distance(int a, int b, int c, int d){
    //     return 0;
    // }

    // При новом написаннии с Использ Классов метод выглядит так, 
    //  Причем Метож distance() ниже является ПЕРЕГРУЗКОЙ метода   distance() Выше!!!!!
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        a.setX(12);
        System.out.println(a.getX());

        Point2D b = new Point2D(10);
        // b.x =0;
        // b.y = 10;
        System.out.println(b.getY());
        System.out.println(distance(a, b));
        Point2D.distance(a,b);

    }
}
