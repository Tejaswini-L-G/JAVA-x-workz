class Hospital {
    public static void main(String[] args) {

        // Normal Variables
        String hospitalName = "Apollo Hospital";
        String location = "Chennai";
        int totalBeds = 500;
        boolean emergencyAvailable = true;
        String director = "Dr. Ramesh";

        // Array 
        String[] departments = {
            "Cardiology", "Neurology", "Orthopedics", "Pediatrics",
            "Dermatology", "ENT", "Radiology", "Oncology"
        };

       
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
        System.out.println("Total Beds: " + totalBeds);
        System.out.println("Emergency Available: " + emergencyAvailable);
        System.out.println("Director: " + director);

        
        System.out.println("\nDepartments:");
        for (String dept : departments) {
            System.out.println(dept);
        }
    }
}
