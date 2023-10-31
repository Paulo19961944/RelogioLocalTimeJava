package com.mycompany.relogiotime;
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
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedTime = time.format(formatter);
            System.out.println("A Data e o Horario Atual é -> " + formattedTime);
        }
    }
}
