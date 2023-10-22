package jsonparser;

public class Article {
	private int id;
	private String title;
	private String content;
	private String regDate;
	
	public Article() {}
	
	public Article(int id, String title, String content, String regDate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String toJson() {
		//String rs = "hill-State";
		String rs = String.format("{\"id\":%d,\"title\":%s,\"content\":%s,\"regDate\":%s}", 
					id, title, content, regDate);
		return rs;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", regDate=" + regDate + "]";
	}
}
