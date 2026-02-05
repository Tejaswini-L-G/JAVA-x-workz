class RailwayStation {
    public static void main(String[] args) {

        // Normal Variables
        String stationName = "Bangalore City";
        String stationCode = "SBC";
        String city = "Bangalore";
        int platforms = 10;
        boolean isWifiAvailable = true;

        // Array 
        String[] trains = {
            "Rajdhani Express", "Shatabdi Express", "Duronto Express", "Mysuru Express",
            "Udyan Express", "Karnataka Express", "Hampi Express", "Gol Gumbaz Express"
        };

        
        System.out.println("Station Name: " + stationName);
        System.out.println("Station Code: " + stationCode);
        System.out.println("City: " + city);
        System.out.println("Platforms: " + platforms);
        System.out.println("WiFi Available: " + isWifiAvailable);

        
        System.out.println("\nTrains Passing Through:");
        for (String train : trains) {
            System.out.println(train);
        }
    }
}
