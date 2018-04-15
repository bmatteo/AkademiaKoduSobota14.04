import java.util.ArrayList;
import java.util.Random;

public class RandomDataGenerator {

    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<String> surnames = new ArrayList<>();
    static ArrayList<String> nationalities = new ArrayList<>();

    public static void fillLists() {
        RandomDataGenerator.names.add("Mateusz");
        RandomDataGenerator.names.add("Kuba");
        RandomDataGenerator.names.add("Jan");
        RandomDataGenerator.names.add("Andrzej");
        RandomDataGenerator.names.add("Karol");
        RandomDataGenerator.names.add("Szymon");
        RandomDataGenerator.names.add("Janusz");


        RandomDataGenerator.surnames.add("Nowak");
        RandomDataGenerator.surnames.add("Kowalski");
        RandomDataGenerator.surnames.add("Wiśniewski");
        RandomDataGenerator.surnames.add("Bereda");
        RandomDataGenerator.surnames.add("Lewandowski");

        RandomDataGenerator.nationalities.add("Polska");
        RandomDataGenerator.nationalities.add("Anglia");
        RandomDataGenerator.nationalities.add("Niemcy");
        RandomDataGenerator.nationalities.add("Hiszpania");
        RandomDataGenerator.nationalities.add("Brazylia");
        RandomDataGenerator.nationalities.add("Chiny");
        RandomDataGenerator.nationalities.add("Rosja");
    }

    public static String randomName() {
        Random random = new Random();
        int number = random.nextInt(RandomDataGenerator.names.size());
        return RandomDataGenerator.names.get(number);
    }

    public static String randomSurname() {
        Random random = new Random();
        int number = random.nextInt(RandomDataGenerator.surnames.size());
        return RandomDataGenerator.surnames.get(number);
    }

    public static String randomNationality() {
        Random random = new Random();
        int number = random.nextInt(RandomDataGenerator.nationalities.size());
        return RandomDataGenerator.nationalities.get(number);
    }

    public static String randomNip() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            int number = random.nextInt(10);
            sb.append(number);
        }
        return sb.toString();
    }

    public static CustomerType randomCustomerType() {
        Random random = new Random();
        if(random.nextBoolean()) {
            return CustomerType.B2B;
        } else {
            return CustomerType.NORMAL;
        }
    }

}
