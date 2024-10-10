package logic;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	
	private List<PrintJob> jobs;
	private PrintQueue queue;

	public PrintService() {
		super();
		jobs = new ArrayList<PrintJob>(10);
		queue = new PrintQueue();
	}
	
	public void addJobsToQueue() {
		
	}
	
}
