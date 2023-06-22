package academy.devdojo.maratonajava.javacore.ZZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZZFthreads.Service.EmailDeliveyService;
import academy.devdojo.maratonajava.javacore.ZZZFthreads.dominio.Members;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
         Members members = new Members();
         Thread henrique = new Thread(new EmailDeliveyService(members), "Henrique");
         Thread aleykson = new Thread(new EmailDeliveyService(members), "Aleykson");

        henrique.start();
        aleykson.start();
        while (true){
             String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null ||email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
