package interfaces;

public class cars implements Engine, Brakes, media {

	@Override
	public void brake() {
		System.out.println("Stopping Car");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting Engine");
		
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Lowering RPM");
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Increasing RPM");
		
	}

}
