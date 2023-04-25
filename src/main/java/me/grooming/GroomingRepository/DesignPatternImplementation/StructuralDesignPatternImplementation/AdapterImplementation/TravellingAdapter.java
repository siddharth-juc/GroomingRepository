package me.grooming.GroomingRepository.DesignPatternImplementation.StructuralDesignPatternImplementation.AdapterImplementation;

public class TravellingAdapter implements SocketAdapter {
	
	private Socket travellingAdapterSocket;
	
	public TravellingAdapter() {
		
		travellingAdapterSocket = new Socket();
		
	}

	@Override
	public void setVoltage_127V() {
		
		adaptToVoltage(127);
		
	}

	@Override
	public void setVoltage_220V() {

		adaptToVoltage(220);
		
	}

	@Override
	public void setVoltage_100V() {

		adaptToVoltage(100);
		
	}
	
	private void adaptToVoltage(int availableVoltage) {
		
		travellingAdapterSocket.setVoltageSpec(new Voltage(availableVoltage)); 
		
	}

}