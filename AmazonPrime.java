class AmazonPrime {
    public static void main(String[] args) {

        String[] englishMovies = {
            "The Tomorrow War", "Without Remorse", "Sound of Metal", "Manchester by the Sea", "The Big Sick",
            "Borat", "Coming 2 America", "Air", "The Covenant", "Jack Ryan",
            "The Terminal List", "The Aeronauts", "No Time to Die", "The Report", "One Night in Miami",
            "Greyhound", "The Accountant", "Sicario", "The Prestige", "The Gentlemen"
        };

        String[] hindiMovies = {
            "Shershaah", "Jai Bhim", "Sardar Udham", "Toofaan", "Coolie No 1",
            "Drishyam 2", "Gehraiyaan", "Ram Setu", "Bawaal", "Farzi",
            "Tandav", "Gulabo Sitabo", "Raazi", "Madgaon Express", "Article 15",
            "Bhoot Police", "Ludo", "Udaan", "Chhalaang", "Sherni"
        };

        String[] tamilMovies = {
            "Jai Bhim", "Vikram Vedha", "Kaithi", "Asuran", "Soorarai Pottru",
            "96", "Thani Oruvan", "Viswasam", "Karnan", "Vada Chennai",
            "Doctor", "Darbar", "Master", "Petta", "Etharkkum Thunindhavan",
            "Sivaji", "Bigil", "Mersal", "Sarkar", "Kabali"
        };

        String[] teluguMovies = {
            "Sita Ramam", "Major", "Jersey", "Fidaa", "Geetha Govindam",
            "Athadu", "Rangasthalam", "Eega", "Ala Vaikunthapurramuloo", "Pushpa",
            "Temper", "Gabbar Singh", "Magadheera", "Srimanthudu", "Khaleja",
            "Leader", "Tagore", "Happy Days", "Bommarillu", "Arya"
        };

        String[] malayalamMovies = {
            "Drishyam", "Premam", "Bangalore Days", "Charlie", "Kumbalangi Nights",
            "Jallikattu", "Uyare", "Lucifer", "Virus", "Joji",
            "Maheshinte Prathikaaram", "Sudani from Nigeria", "Thondimuthalum Driksakshiyum", "Android Kunjappan", "Take Off",
            "Joseph", "Home", "Great Indian Kitchen", "Minnal Murali", "Kurup"
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
