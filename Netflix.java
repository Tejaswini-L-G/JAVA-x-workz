class Netflix {
    public static void main(String[] args) {

        // English Movies
        String[] englishMovies = {
            "Inception", "Interstellar", "The Dark Knight", "Titanic", "Avatar",
            "The Matrix", "Gladiator", "Jurassic Park", "Avengers", "Iron Man",
            "Spider-Man", "Doctor Strange", "The Batman", "Joker", "Tenet",
            "Shutter Island", "Forrest Gump", "The Godfather", "John Wick", "Dune"
        };

        // Hindi Movies
        String[] hindiMovies = {
            "3 Idiots", "Dangal", "PK", "Bajrangi Bhaijaan", "Chak De India",
            "Dilwale Dulhania Le Jayenge", "Kabir Singh", "Sultan", "War", "Tiger Zinda Hai",
            "Sanju", "Padmaavat", "Raees", "Andhadhun", "Drishyam",
            "Gully Boy", "Krrish", "Bhool Bhulaiyaa", "Tanhaji", "Shershaah"
        };

        // Tamil Movies
        String[] tamilMovies = {
            "Baahubali", "Vikram", "Master", "Jailer", "Enthiran",
            "Kabali", "Petta", "Bigil", "Thuppakki", "Kaithi",
            "Soorarai Pottru", "Jai Bhim", "Asuran", "Visaranai", "96",
            "Mersal", "Sivaji", "Darbar", "Thani Oruvan", "Doctor"
        };

        // Telugu Movies
        String[] teluguMovies = {
            "RRR", "Baahubali The Beginning", "Baahubali The Conclusion", "Pushpa", "Ala Vaikunthapurramuloo",
            "Arjun Reddy", "Magadheera", "Eega", "Jersey", "Rangasthalam",
            "Sye", "Athadu", "Pokiri", "Srimanthudu", "Temper",
            "Gabbar Singh", "Bharat Ane Nenu", "Fidaa", "Geetha Govindam", "Khaleja"
        };

        // Korean Movies
        String[] koreanMovies = {
            "Parasite", "Train to Busan", "Oldboy", "The Handmaiden", "Memories of Murder",
            "Burning", "Snowpiercer", "The Host", "I Saw the Devil", "The Chaser",
            "A Taxi Driver", "The Man from Nowhere", "Extreme Job", "Forgotten", "The Wailing",
            "Along with the Gods", "Peninsula", "Silenced", "Midnight Runners", "Broker"
        };
		for(String movieName: englishMovies){
			System.out.println(movieName);
		}
		for(String movieName:hindiMovies){
			System.out.println(movieName);
		}
		for(String movieName: tamilMovies){
			System.out.println(movieName);
		}
		for(String movieName: teluguMovies){
			System.out.println(movieName);
		}
		for(String movieName: koreanMovies){
			System.out.println(movieName);
		}
			}
}
