package model;

public class TaskClass {

	private String title;
	private String description;
	private String priority;
	private String date;
	
	public TaskClass(String title, String description, String priority, String date) {
		super();
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
