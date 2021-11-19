import java.io.FileNotFoundException;
import java.io.IOException;

public class User {

	private String nama;
	private String gender;
	private int umur;
	
	public User(String nama, String gender, int umur) throws IOException{			
		if (nama.length() >=5 ) {			
			this.nama = nama;
		} else {
			throw new IOException("nama must be more than 5 Char");
		}
		
		if ((gender.equals("Male") || gender.equals("Female"))) {			
			this.gender = gender;
		} else {
			throw new IOException("gender must be male or female Case sensitive");
		}
		
		if (umur >= 13) {
			this.umur = umur;
		} else {
			throw new IOException("Umur must be more than or 13 YO");
		}
	
		System.out.println("Nice");
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getUmur() {
		return umur;
	}

	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	


}
