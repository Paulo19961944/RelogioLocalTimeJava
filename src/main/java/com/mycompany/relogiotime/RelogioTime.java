package oo.java ;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RelogioTime {
    public static void main(String[] args) {
        while(true){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            LocalDateTime time = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = time.format(formatter);
            System.out.println("O Horario Atual é -> " + formattedTime);
        }
    }
}
