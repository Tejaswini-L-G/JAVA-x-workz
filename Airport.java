class Airport {
    public static void main(String[] args) {

        // Normal Variables
        String airportName = "Kempegowda International Airport";
        String city = "Bangalore";
        String airportCode = "BLR";
        int terminals = 2;
        boolean internationalFlights = true;

        // Array 
        String[] airlines = {
            "IndiGo", "Air India", "Vistara", "Emirates",
            "Qatar Airways", "Lufthansa", "Singapore Airlines"
        };

        
        System.out.println("Airport Name: " + airportName);
        System.out.println("City: " + city);
        System.out.println("Airport Code: " + airportCode);
        System.out.println("Terminals: " + terminals);
        System.out.println("International Flights: " + internationalFlights);

        
        System.out.println("\nAirlines Operating:");
        for (String airline : airlines) {
            System.out.println(airline);
        }
    }
}
