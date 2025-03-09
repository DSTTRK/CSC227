import java.util.LinkedList;

public class JobQueue {
	
	LinkedList<PCB> JobQ = new LinkedList<>();
	
	
	public void AddProcess(PCB process) {
		JobQ.add(process);
	}
	
	public void RemoveProcess(PCB process) {
		JobQ.remove(process);
	}
	
}
