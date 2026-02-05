class SonyLiv {
    public static void main(String[] args) {

        String[] hindiMovies = {
            "Tanhaji", "Chandramukhi 2", "Rocketry", "Rang De Basanti", "Barfi",
            "Uri", "Pad Man", "Kesari", "Airlift", "Raazi",
            "Article 15", "Andhadhun", "Drishyam", "Shershaah", "Bhuj",
            "Dangal", "Lagaan", "Bajrangi Bhaijaan", "Sultan", "Veer Zaara"
        };

        String[] englishMovies = {
            "Spider-Man", "Batman", "Superman", "Wonder Woman", "Justice League",
            "Aquaman", "Man of Steel", "The Flash", "Joker", "Suicide Squad",
            "Avengers", "Iron Man", "Thor", "Captain America", "Doctor Strange",
            "Ant-Man", "Guardians of the Galaxy", "Deadpool", "Logan", "Venom"
        };

        String[] tamilMovies = {
            "Vikram", "Jailer", "Master", "Doctor", "Asuran",
            "96", "Jai Bhim", "Soorarai Pottru", "Thani Oruvan", "Kaithi",
            "Bigil", "Mersal", "Sarkar", "Darbar", "Petta",
            "Kabali", "Sivaji", "Kaththi", "Etharkkum Thunindhavan", "Don"
        };

        String[] teluguMovies = {
            "RRR", "Pushpa", "Baahubali", "Magadheera", "Athadu",
            "Pokiri", "Rangasthalam", "Fidaa", "Geetha Govindam", "Jersey",
            "Khaleja", "Srimanthudu", "Gabbar Singh", "Temper", "Bharat Ane Nenu",
            "Leader", "Tagore", "Sye", "Happy Days", "Arya"
        };

        String[] malayalamMovies = {
            "Drishyam", "Premam", "Bangalore Days", "Charlie", "Kumbalangi Nights",
            "Lucifer", "Joji", "Virus", "Uyare", "Take Off",
            "Joseph", "Home", "Minnal Murali", "Kurup", "Android Kunjappan",
            "Great Indian Kitchen", "Maheshinte Prathikaaram", "Sudani from Nigeria", "Jallikattu", "Thondimuthalum Driksakshiyum"
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
		for(String movieName: malayalamMovies){
			System.out.println(movieName);
		}
    }
}
