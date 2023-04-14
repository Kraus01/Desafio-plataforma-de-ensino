package entities;

public class Task extends Lesson {
	
	private String description;
	private Integer questionCount;
	private final int QUESTION_DURATION = 5;
	private final int DURATION_SECONDS = 60;
	
	public Task () {
		super();
	}
	
	public Task (String title, String description, int questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}

	@Override
	public int duration() {
		return questionCount * QUESTION_DURATION * DURATION_SECONDS;
	}

}
