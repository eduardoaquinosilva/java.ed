package lista_02;

public class StackQueueException extends RuntimeException 
{
	private static final long serialVersionUID = 4652958143051993454L;

	private String description = "";
	
	public StackQueueException(String description)
	{
        super(description);
        this.description = description;
    }
	
	public String getDescription() {
		return description;
	}
}
