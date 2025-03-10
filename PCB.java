
public class PCB {
	
    private int Id;
    private int burstTime;
    private int priority;
    private int memoryRequired;
    // note
    private int waitingTime;
    private int turnaroundTime;
    private int arrivalTimeToReadyQueue;
    private String state;

    public PCB(int processId, int burstTime, int priority, int memoryRequired) {
        this.Id = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.memoryRequired = memoryRequired;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.state = "new";
    }

    // Getters and setters
    public int getProcessId() {
        return Id;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getPriority() {
        return priority;
    }

    public int getMemoryRequired() {
        return memoryRequired;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }
    

    public int getArrivalTimeToReadyQueue() {
        return arrivalTimeToReadyQueue;
    }

    public void setArrivalTimeToReadyQueue(int arrivalTimeToReadyQueue) {
        this.arrivalTimeToReadyQueue = arrivalTimeToReadyQueue;
    }

    @Override
    public String toString() {
        return "Process " + Id + 
               " [Burst: " + burstTime + 
               ", Priority: " + priority + 
               ", Memory: " + memoryRequired + 
               ", State: " + state + "]";
    }
}
