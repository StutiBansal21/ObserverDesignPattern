package youtube;
//this class which has getters and setters method that is used to carry the info is called POJO class Plain old java object 
public class Video {
	private String title,author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "Video [title=" + title + ", author=" + author + "]";
	}

	public Video(String author, String title) {
		super();
		this.author = author;
		this.title = title;
	}
	
}
