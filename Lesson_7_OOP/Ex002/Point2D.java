package Lesson_7_OOP.Ex002;
/*
 * это точка 2D
 */

public class Point2D {
    // Ниже это уже не переменные , а ПОЛЯ!! переменная в контексте класса наз =
    // ПОЛЕМ
    private int x;
    private int y;

    /**
     * это конструктор точек
     * @param valueX это коорд X
     * @param valueY это коорд Y
     */
    // Ниже НЕ МЕТОД, а КОНСТРУКТОР(т.к нет никакого возвращаемоего типа!!!)
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
        // this.x = value;
        // this.y = value;
    }

    public Point2D() {
        this(10, 11);
    }


    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int value) {
        this.x = value;
    } 
    public void setY(int value) {
        this.y = value;
    } 




   
   
   
   
   
   
   
    // public - это индикатор доступа
    private String getInfo() {
        return String.format("x: %d;  y: %d", x, y);
    }
    // Переопределение классов под себя!
    // Но не частить с этим, показано для наглядности
    @Override
    public String toString() {
        return getInfo();
    }

}
