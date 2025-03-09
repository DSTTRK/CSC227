
public class MemoryManger {
	
	private int AvailableSpace;
	private final int TotalSpace= 2048; //megabyte
	
	public MemoryManger() {
		AvailableSpace = TotalSpace;
	}
	
	
	public boolean AllocateSpace(PCB procces) {
		
		if(procces.getMemoryRequired() >= AvailableSpace) {
			AvailableSpace -= procces.getMemoryRequired();
			return true;
		}
		else {
			System.out.println("No Space Available");
			return false;
		}
	}
	
	public void FreeSpace(PCB procces) {
		AvailableSpace += procces.getMemoryRequired();
		
	}

}
