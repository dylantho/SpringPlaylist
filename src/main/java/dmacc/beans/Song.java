/**
 * @author Dylan Thomas - djthomas4
 * CIS175 - Fall 2021
 * Nov 3, 2021
 */

package dmacc.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String artist;
	private String album;
	private String length;
	
	public Song( ) {
		super();
	}
		
	public Song(String name) {
		this.name = name;
	}
	
	public Song(String name, String artist) {
		this.name = name;
		this.artist = artist;
	}
	
	public Song(String name, String artist, String album) {
		this.name = name;
		this.artist = artist;
		this.album = album;
	}
		
	public Song(int id, String name, String album, String length) {
		this.id = id;
		this.name = name;
		this.album = album;
		this.length = length;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", artist=" + artist + ", album=" + album + ", length=" + length + "]";
	}
	
	

}
