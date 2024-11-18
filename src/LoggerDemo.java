import java.util.*;
class logger{
    private static logger instance;
    private logger(){}

    public static logger getInstance(){
        if(instance==null){
            synchronized (logger.class){
                if(instance==null){
                    instance= new logger();
                }
            }
        } return instance;
    }
    public void log(String message){
        System.out.println("LOG: "+message);
    }
}
public class LoggerDemo {
    public static void main(String[] args) {
        logger log= logger.getInstance();
        log.log("Application started");
        log.log("Processing data...");
        log.log("Application finished");
    }
}
