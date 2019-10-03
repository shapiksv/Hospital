import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;

public class Shop {
    static Customer[] customers = new Customer[10];
    public static void main(String[] args) {
        //        Создать массив объектов. Вывести:
        Random random = new Random();

        for (int i = 0; i < 10 ; i++) {
            int f = random.nextInt();
            Customer customer = new Customer(1 + i, "Sergey" +f, "Shaps" + i, "Mechurina" + i, 683653 + i ,6474358 + i, 764796 + i);
            customers[i] = customer;
        }



//        a) список покупателей в алфавитном порядке;
        Arrays.sort(customers);
        for (Customer customer1 : customers) {
            System.out.println(customer1.toString());

        }

        //        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
        int minNum = 6474358;
        int maxNum = 6474360;
        for (Customer customer1 : customers) {
            if(customer1.getCreditCardNumber() >= minNum && customer1.getCreditCardNumber()<= maxNum){
                System.out.println(customer1.toString());

        }


    }





    }





}
