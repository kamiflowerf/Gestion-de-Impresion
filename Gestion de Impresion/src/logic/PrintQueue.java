package logic;

import java.util.ArrayList;
import java.util.List;

public class PrintQueue {
	
	List<PrintJob> queue;

	public PrintQueue() {
		super();
		this.queue = new ArrayList<>(10);
	}

	public List<PrintJob> getQueue() {
		return queue;
	}

	public void setQueue(List<PrintJob> queue) {
		this.queue = queue;
	}
	
	public void addJobs(PrintJob job) {
		this.queue.add(job);
	}
	
	public void removeJobs(int jobInd) {
		this.queue.remove(jobInd);
	}
	/*algoritmo para ordenar la lista por prioridad*/
	public void sortByPriority(int pivIndex) {
		
		PrintJob pivot = queue.get(pivIndex);
		
		for (int i = 0; i < queue.size(); i++) {
			//intercambia la posicion del pivote y el trabajo con prioridad alta mas cercano
			if(!pivot.getPriority().contains("H") && queue.get(i).getPriority().contains("H")) {
				PrintJob temp = queue.get(i);
				queue.set(i, pivot);
				queue.set(0, temp);
				//se llama la funcion recursivamente para seguir ordenando
				if(pivIndex+1 < queue.size())
					sortByPriority(pivIndex+1);
			}
		}
		
		
	}
}
