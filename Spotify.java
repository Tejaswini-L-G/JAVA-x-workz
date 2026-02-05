class Spotify{

	public static void main(String[] args){
		
	String songs[]={"Usire Usire","Dwapara","Dilka Jo Har","Shape of you","Perfect","Faded","Moon","Believe","All ok","Beautiful"};
	
	int length=songs.length;
	System.out.println("Number of songs available are:"+length);
	String song1=songs[0];
	String song2=songs[1];
	String song3=songs[2];
	String song4=songs[3];
	String song5=songs[4];
	String song6=songs[5];
	String song7=songs[6];
	//System.out.println("The Songs are"+"\n "+song1+"\n  "+song2+"\n  "+song3+"\n  "+song4+"\n  "+song5+"\n  "+song6);
	
	
	for (String songName:songs){
		System.out.println(songName);
	}
	}


}