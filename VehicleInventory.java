package TestingThings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ben Maxwell on 2/7/17.
 */
public class VehicleInventory {


    ArrayList<InventoryItem> items = new ArrayList<>();
    Scanner input = new Scanner(System.in);



    public void loadInv() {
        System.out.println("Welcome to the Music City Motors Inventory Tracker!");
        System.out.println("---------------------------------------------------");

        //Make existing vehicle inventory
        InventoryItem v1 = new InventoryItem("Honda", 5, "Car");
        InventoryItem v2 = new InventoryItem("Chevy", 10, "Truck");
        InventoryItem v3 = new InventoryItem("Ford", 25, "SUV");

        //Load existing vehicle inventory
        items.add(0, v1);
        items.add(1, v2);
        items.add(2, v3);

        //This prints out inventory items
        printInv();
    }


    public boolean promptAndProcess() throws Exception {


        while (true) {

            //Prompt user for input
            System.out.println("\nPlease select one of the following options: \n");
            System.out.println("[1] Create and add new item");
            System.out.println("[2] Remove an item");
            System.out.println("[3] Update an item's quantity");
            System.out.println("[4] View inventory list");
            System.out.println("[5] Exit");

            int option = input.nextInt();
            input.nextLine(); //consumes new line leftover by nextInt

            switch (option) {

                case 1:
                    //Create and add vehicle type to inventory
                    items.add(itemEntry());
                    break;

                case 2:
                    removeInv();
                    break;

                case 3:
                    changeQty();
                    break;

                case 4:
                    printInv();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please choose an item or press 4 to exit!");

            }
            if (option == 1 || option == 2 || option == 3 || option == 4 || option == 5);
            break;
        }

        return false;

    }


//    public void createItem() {
//        System.out.println("Please enter a vehicle type/make:");
//        String vType = input.nextLine();
//        System.out.println("Please select the category of this vehicle type: \n1. Car \n2. Truck \n3. SUV \n4. Van \n5. Motorcycle");
//        int categoryChoice = input.nextInt();
//
//        switch (categoryChoice) {
//
//            case 1:
//                Car car = new Car();
//                String categoryCar = car.vehicleCategory;
//                VehicleInventory invTypeCar = new VehicleInventory(vType, 0, categoryCar);
//                items.add(invTypeCar);
//                System.out.println("New vehicle item created successfully!");
//                break;
//
//            case 2:
//                Truck truck = new Truck();
//                String categoryTruck = truck.vehicleCategory;
//                VehicleInventory invTypeTruck = new VehicleInventory(vType, 0, categoryTruck);
//                items.add(invTypeTruck);
//                System.out.println("New vehicle item created successfully!");
//                break;
//
//            case 3:
//                SUV suv = new SUV();
//                String categorySUV = suv.vehicleCategory;
//                VehicleInventory invTypeSUV = new VehicleInventory(vType, 0, categorySUV);
//                items.add(invTypeSUV);
//                System.out.println("New vehicle item created successfully!");
//                break;
//
//            case 4:
//                Van van = new Van();
//                String categoryVan = van.vehicleCategory;
//                VehicleInventory invTypeVan = new VehicleInventory(vType, 0, categoryVan);
//                items.add(invTypeVan);
//                System.out.println("New vehicle item created successfully!");
//                break;
//
//            case 5:
//                Motorcycle motorcycle = new Motorcycle();
//                String categoryMotorcycle = motorcycle.vehicleCategory;
//                VehicleInventory invTypeCycle = new VehicleInventory(vType, 0, categoryMotorcycle);
//                items.add(invTypeCycle);
//                System.out.println("New vehicle item created successfully!");
//                break;
//
//            default:
//                System.out.println("Invalid Entry!");
//        }
//
//    }


    public InventoryItem itemEntry() throws Exception {
        System.out.println("Please enter a vehicle type/make:");
        String vType = input.nextLine();
        return createItem(vType, 0);
    }


    public InventoryItem createItem(String vType, int qty) throws Exception {
        System.out.println("Please select the category of this vehicle type: \n1. Car \n2. Truck \n3. SUV \n4. Van \n5. Motorcycle");
        int categoryChoice = input.nextInt();

        InventoryItem item;

        switch (categoryChoice) {

            case 1:
                item = new Car(vType, qty);
                break;

            case 2:
                item = new Truck(vType, qty);
                break;

            case 3:
                item = new SUV(vType, qty);
                break;

            case 4:
                item = new Van(vType, qty);
                break;

            case 5:
                item = new Motorcycle(vType, qty);
                break;

            default:
                throw new Exception("\nInvalid option. Please select an option 1 - 5");

        }

        return item;
    }




    public void removeInv() {
        System.out.println("Please select the item number of the vehicle that you would like to remove:");
        int itmNumb = input.nextInt();

        System.out.println("\nAre you sure that you would like to remove this item?");
        String rmvConfirm = input.next();

        if (rmvConfirm.toUpperCase().equals("Y")) {
            items.remove(itmNumb - 1);
            System.out.println("\nItem was removed!");

        } else {

            System.out.println("Returning to main menu...");
        }
    }

    public void changeQty() {
        System.out.println("\nPlease select the item number of the vehicle whose quantity you would like to update: ");
        int qNumb = input.nextInt(); //holds item number

        System.out.println("\nPlease enter the new quantity of this vehicle: ");
        int vQty = input.nextInt();

        String vType = items.get(qNumb - 1).vehicleType;
        String vCategory = items.get(qNumb - 1).vehicleCategory;
        items.set(qNumb - 1, new InventoryItem(vType, vQty, vCategory));

    }


    public void printInv() {
        int i = 1;
        for (InventoryItem vType : items) {
            //System.out.println(i + ". [" + vType.quantity + "] " + vType.vehicleType);
            System.out.printf("%d. \t[%d] \t%s \t\t%s\n", i, vType.quantity, vType.vehicleType, vType.vehicleCategory);
            i++;


        }
    }

}