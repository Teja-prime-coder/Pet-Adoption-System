package Animal;

import java.util.Scanner;

public class PetAdoptionSystem {
    private static void displayResponsibilities() {
        System.out.println("\n================= Responsibilities of Pet Ownership =================");
        System.out.println("1. Providing food and water.");
        System.out.println("2. Providing exercise and playtime.");
        System.out.println("3. Providing medical care.");
        System.out.println("4. Providing shelter.");
        System.out.println("5. Providing socialization.");
        System.out.println("6. Providing training and enrichment.");
        System.out.println("7. Meeting legal requirements.");
        System.out.println("8. Cleaning and maintenance.");
        System.out.println("=====================================================================");
    }
    private static void displayExpectations() {
        System.out.println("\n===================== Expectations of Pet Owners =====================");
        System.out.println("1. Commitment to care for the pet throughout its life.");
        System.out.println("2. Provide a safe, loving, and nurturing environment.");
        System.out.println("3. Ensure the pet’s health, safety, and well-being.");
        System.out.println("======================================================================");
    }
    private static void displayPetTypes() {
        System.out.println("\n========================== Pet Types ==========================");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Fish");
        System.out.println("4. Bird");
        System.out.println("5. Rodent");
        System.out.println("===============================================================");
    }
    private static void displayBreedsAndPrices(String petType) {
        switch (petType.toLowerCase()) {
            case "dog":
                System.out.println("\n===================== Dog Breeds and Prices ======================");
                System.out.println("1. Labrador Retriever - ₹30,000");
                System.out.println("2. Golden Retriever - ₹40,000");
                System.out.println("3. German Shepherd - ₹20,000");
                System.out.println("4. French Bulldog - ₹75,000");
                System.out.println("5. Bulldog - ₹22,000");
                System.out.println("6. Poodle - ₹1,00,000");
                System.out.println("7. Beagle - ₹40,000");
                System.out.println("8. Dachshund - ₹7,000");
                System.out.println("9. Husky - ₹60,000");
                break;
            case "cat":
                System.out.println("\n===================== Cat Breeds and Prices ======================");
                System.out.println("1. Siamese - ₹40,000");
                System.out.println("2. Persian - ₹60,000");
                System.out.println("3. Maine Coon - ₹80,000");
                System.out.println("4. Ragdoll - ₹1,00,000");
                System.out.println("5. Sphynx - ₹1,20,000");
                System.out.println("6. British Shorthair - ₹60,000");
                break;
            case "fish":
                System.out.println("\n===================== Fish Breeds and Prices ======================");
                System.out.println("1. Betta (Common: ₹50-₹200, Show/Rare: ₹200-₹1000+)");
                System.out.println("2. Guppy (Common: ₹10-₹50 per fish, Endler's: ₹50-₹150 per fish)");
                System.out.println("3. Goldfish (Common: ₹20-₹100, Fancy: ₹100-₹500+)");
                System.out.println("4. Tetras (Common: ₹15-₹50 per fish, Rare: ₹50-₹150 per fish)");
                break;
            case "bird":
                System.out.println("\n===================== Bird Breeds and Prices ======================");
                System.out.println("1. Budgie (Parakeet) - ₹500-₹3000+");
                System.out.println("2. Cockatiel - ₹2000-₹10,000+");
                System.out.println("3. Lovebird - ₹2000-₹8000+");
                System.out.println("4. Conure - ₹8000-₹30,000+");
                break;
            case "rodent":
                System.out.println("\n===================== Rodent Breeds and Prices ======================");
                System.out.println("1. Syrian Hamster - ₹300-₹800");
                System.out.println("2. Dwarf Hamster - ₹200-₹600");
                System.out.println("3. Gerbil - ₹200-₹500");
                System.out.println("4. Guinea Pig - ₹800-₹2000");
                break;
            default:
                System.out.println("Invalid pet type selected.");
        }
    }
    private static double getPrice(String petType, String breed) {
        switch (petType.toLowerCase()) {
            case "dog":
                switch (breed.toLowerCase()) {
                    case "labrador retriever": return 30000;
                    case "golden retriever": return 40000;
                    case "german shepherd": return 20000;
                    case "french bulldog": return 75000;
                    case "bulldog": return 22000;
                    case "poodle": return 100000;
                    case "beagle": return 40000;
                    case "dachshund": return 7000;
                    case "husky": return 60000;
                }
                break;
            case "cat":
                switch (breed.toLowerCase()) {
                    case "siamese": return 40000;
                    case "persian": return 60000;
                    case "maine coon": return 80000;
                    case "ragdoll": return 100000;
                    case "sphynx": return 120000;
                    case "british shorthair": return 60000;
                }
                break;
            case "fish":
                if (breed.toLowerCase().contains("betta")) return 200; // Example default price
                else if (breed.toLowerCase().contains("guppy")) return 50;
                else if (breed.toLowerCase().contains("goldfish")) return 100;
                else if (breed.toLowerCase().contains("tetras")) return 50;
                break;
            case "bird":
                if (breed.toLowerCase().contains("budgie")) return 3000;
                else if (breed.toLowerCase().contains("cockatiel")) return 10000;
                else if (breed.toLowerCase().contains("lovebird")) return 8000;
                else if (breed.toLowerCase().contains("conure")) return 30000;
                break;
            case "rodent":
                if (breed.toLowerCase().contains("syrian")) return 800;
                else if (breed.toLowerCase().contains("dwarf")) return 600;
                else if (breed.toLowerCase().contains("gerbil")) return 500;
                else if (breed.toLowerCase().contains("guinea")) return 2000;
                break;
        }
        return 0; 
    }
    private static void displayTermsAndConditions() {
        System.out.println("\n=================== Terms and Conditions =====================");
        System.out.println("1. The pet adoption fee is non-refundable.");
        System.out.println("2. Adopters must ensure the pet receives proper care, food, and shelter.");
        System.out.println("3. Adopters must comply with all local regulations regarding pet ownership.");
        System.out.println("4. Health insurance for the pet is optional but recommended.");
        System.out.println("5. The adoption center reserves the right to check on the pet's welfare.");
        System.out.println("6. Any violation of the above terms may lead to termination of adoption rights.");
        System.out.println("==============================================================");
        System.out.print("\nDo you accept the terms and conditions? (yes/no): ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************************************");
        System.out.println("************** WELCOME TO THE PET ADOPTION SYSTEM ********");
        System.out.println("**********************************************************");
        System.out.println("\nPet adoption involves welcoming a homeless animal into your family.");
        System.out.println("It provides a loving home for animals in need, often from shelters or rescue organizations.");
        System.out.println("By adopting, you save a life and gain a loyal companion.");
        System.out.println("Adoption fees typically cover vaccinations, spaying/neutering, and microchipping.");
        System.out.println("======================================================================");
        displayResponsibilities();
        displayExpectations();
        System.out.print("\nEnter your name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter your occupation: ");
        String customerOccupation = scanner.nextLine();
        displayPetTypes();
        System.out.print("Choose your pet type (dog, cat, fish, bird, rodent): ");
        String petType = scanner.nextLine();
        displayBreedsAndPrices(petType);
        System.out.print("\nChoose your breed: ");
        String breed = scanner.nextLine();
        double price = getPrice(petType, breed);
        double tax = price * 0.18;
        double totalPrice = price + tax;
        System.out.print("\nEnter your pet's name: ");
        String petName = scanner.nextLine();
        System.out.println("\n=================== Adoption Details =====================");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Occupation: " + customerOccupation);
        System.out.println("Pet Type: " + petType);
        System.out.println("Breed: " + breed);
        System.out.println("Base Price: ₹" + price);
        System.out.println("Tax (18%): ₹" + tax);
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("Pet Name: " + petName);
        System.out.println("==========================================================");
        displayTermsAndConditions();
        String acceptance = scanner.nextLine();
        if (acceptance.equalsIgnoreCase("yes")) {
            System.out.println("\nThank you for adopting a pet! We hope you have a great time with your new companion.");
        } else {
            System.out.println("\nAdoption process canceled. Thank you for visiting the Pet Adoption System.");
        }

        scanner.close();
    }
}
