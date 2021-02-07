import java.util.Scanner;

public class StorageSimulator {

    ## method returns a database of type chosen by the customer.
    public static Database setStorage(){
        System.out.println("Choose a default database type: \n");
        System.out.println("1. NoSQL.      Data storage method: Document Store.");
        System.out.println("2. Relational. Data storage method: Table Store.");
        System.out.println("3. Graph.      Data storage method: Node Store.");

        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        if (userChoice == 1) {
            Database ndatabase = new NoSQLDatabase();
            System.out.println("NoSQL selected.");
            return ndatabase;
        } else if (userChoice == 2) {
            Database rdatabase = new RelationalDatabase();
            System.out.println("Relational selected.");
            return rdatabase;
        } else {
            Database gdatabase = new GraphDatabase();
            System.out.println("Graph selected.");
            return gdatabase;
        }

    }

    public static void addData(String data, Database database) {
        database.storeData(data);

    }

    public static void main(String[] args) {

        Database database = setStorage();

        System.out.println("Would you like to read data or store more data?");
        System.out.println("1. Store new data.");
        System.out.println("2. Switch data storage method.");
        System.out.println("3. Exit program.");

        Scanner input2 = new Scanner(System.in);
        int nextStep = input2.nextInt();

        while(nextStep != 3){


            if(nextStep == 1){
                System.out.println("Please type whatever data you would like to add");
                Scanner input = new Scanner(System.in);
                String userChoice = input.nextLine();
                addData(userChoice, database);
                System.out.println("You added '" + userChoice + "' to the database");
            }
            else if(nextStep == 2){
                database = setStorage();
            }

            else {
                System.out.println("Not a valid choice.");


            }

            System.out.println("Would you like to read data or store data?");
            System.out.println("1. Store data.");
            System.out.println("2. Switch data storage method.");
            System.out.println("3. Exit program.");
            nextStep = input2.nextInt();
        }
        }
    }

