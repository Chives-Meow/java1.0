package pack1;

public class PC {
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU cpu){
		this.cpu = cpu;
	}
	void setHardDisk(HardDisk HD){
		this.HD = HD;
	}
	void show(){
		System.out.println("CPU�ٶȣ�"+cpu.getSpeed());
		System.out.println("Ӳ���ٶȣ�"+HD.getAmount());
	}

}
