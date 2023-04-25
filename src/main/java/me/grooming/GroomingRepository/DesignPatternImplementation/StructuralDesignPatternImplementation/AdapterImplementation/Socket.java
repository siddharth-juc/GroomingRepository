package me.grooming.GroomingRepository.DesignPatternImplementation.StructuralDesignPatternImplementation.AdapterImplementation;

public class Socket {
	
	private Voltage voltageSpec;
	
	public Socket() {
		
		this.voltageSpec = new Voltage(230);
		
	}
	
	public Voltage getVoltageSpec() {
		
		return this.voltageSpec;
		
	}
	
	public void setVoltageSpec(Voltage availableVoltage) {
		
		this.voltageSpec = availableVoltage;
		
	}

}