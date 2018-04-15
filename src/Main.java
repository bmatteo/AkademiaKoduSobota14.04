import javax.crypto.spec.DHGenParameterSpec;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*DBHandler.connect();
        RandomDataGenerator.fillLists();
        Random random = new Random();



        for(int i = 0; i < 10; i++) {
            DBHandler.insertCustomer(RandomDataGenerator.randomName(),
                    RandomDataGenerator.randomSurname(),
                    RandomDataGenerator.randomNationality());

            DBHandler.insertCustomerB2B(RandomDataGenerator.randomName(),
                    RandomDataGenerator.randomNip(),
                    RandomDataGenerator.randomNationality());


            DBHandler.insertOrder(random.nextInt(10)+1,
                    RandomDataGenerator.randomCustomerType(),
                    random.nextDouble());
        }*/
        XMLEx.xmlTest();
    }
}
