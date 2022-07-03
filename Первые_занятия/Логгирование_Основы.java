// Использование

// Logger logger = Logger.getLogger()

// Уровни важности

// INFO, DEBUG, ERROR, WARNING и др.



// Вывод
// ConsoleHandler info = new ConsoleHandler();

// log.addHandler(info);



// Формат вывода: структурированный, абы как*

// XMLFormatter, SimpleFormatter


// _________________________________________
// import java.util.logging.*;

// public class Ex0043 {

//    public static void main(String[] args) {

//        Logger logger = Logger.getLogger(Ex0043.class.getName());

//        logger.setLevel(Level.INFO);

//        ConsoleHandler ch = new ConsoleHandler();

//        logger.addHandler(ch);

//        SimpleFormatter sFormat = new SimpleFormatter();

//        ch.setFormatter(sFormat);

//        logger.log(Level.WARNING, "Тестовое логирование");

//        logger.info("Тестовое логирование");

//    }

// }