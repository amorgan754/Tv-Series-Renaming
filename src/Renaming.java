import java.util.*;
import java.io.*;
import java.nio.file.*;


public class Renaming {
	
	public String location;
	public String name;
	public String season;
	
	
	
	
	public Renaming(String location, String name, String season) {
		this.location = location;
		this.name = name;
		this.season = season;

	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setSeason(String season) {
		this.season = season;
	}
	public String getSeason() {
		return season;
	}
	
	/*private String name() {
		for(int x = 1; x < f.length(); x++)
		if (f.getName().toLowerCase().endsWith(".mkv"))
			newName = name + " S" + "E" + x + ".mkv";
		else if (f.getName().toLowerCase().endsWith(".mp4"))
			newName = name + " S" + season + "E" + x + ".mp4";
		else if (f.getName().toLowerCase().endsWith(".mov"))
			newName = name + " S" + season + "E" + x + ".mov";
		else if (f.getName().toLowerCase().endsWith(".avi"))
			newName = name + " S" + season + "E" + x + ".avi";
		else if (f.getName().toLowerCase().endsWith(".m4v"))
			newName = name + " S" + season + "E" + x + ".m4v";
	
		return newName;
	}*/
	

	
	
	public void Rename() {
		//newName = name();
		Path source = Paths.get(location);
		String newName = null;
		File f = new File(location);
		
		
		for(int x = 1; x < f.length(); x++) {
			
			if(f.getName().toLowerCase().endsWith(".mkv")) {
				newName = name + " S" + "E" + x + ".mkv";
				//f.renameTo(newFile);
			}
			else if(f.getName().toLowerCase().endsWith(".mp4")) {
				newName = name + " S" + season + "E" + x + ".mp4";
				//f.renameTo(newFile);
			}
			else if(f.getName().toLowerCase().endsWith(".mov")) {
				newName = name + " S" + season + "E" + x + ".mov";
				//f.renameTo(newFile);
			}
			else if(f.getName().toLowerCase().endsWith(".avi")) {
				newName = name + " S" + season + "E" + x + ".avi";
				//f.renameTo(newFile);
			}
			else if(f.getName().toLowerCase().endsWith(".mv4")) {
				newName = name + " S" + season + "E" + x + ".m4v";
				//f.renameTo(newFile);
			}
			File newFile = new File(source + "/" + newName);
			f.renameTo(newFile);
		}
	}
	
				
			
			
			
		
		
			
		
	

}
