class MovieTheatre {
    public static void main(String[] args) {

        // Normal Variables
        String theatreName = "PVR Cinemas";
        String movieName = "Inception";
        String location = "Bangalore";
        int totalScreens = 5;
        double ticketPrice = 250.00;

        // Array 
        String[] snacks = {
            "Popcorn", "Nachos", "French Fries", "Hot Dog", "Burger",
            "Soft Drink", "Ice Cream", "Chocolate", "Samosa", "Sandwich"
        };

       
        System.out.println("Theatre Name: " + theatreName);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Location: " + location);
        System.out.println("Total Screens: " + totalScreens);
        System.out.println("Ticket Price: " + ticketPrice);

        
        System.out.println("\nAvailable Snacks:");
        for (String item : snacks) {
            System.out.println(item);
        }
    }
}

