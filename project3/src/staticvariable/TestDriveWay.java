package staticvariable;

public class TestDriveWay {

	public static void main(String[] args) {
		
		DriveWay dave = new DriveWay();
		dave.driveWaySize = 9;
		System.out.println("Dave "+dave.driveWaySize);
		
		DriveWay susan = new DriveWay();
		System.out.println("Susan " +susan.driveWaySize);
		
		System.out.println("After drive way size changes ");
		susan.driveWaySize = 12;
		
		System.out.println("Dave " + dave.driveWaySize);
		
		System.out.println("Susan " +susan.driveWaySize);
		

	}

}
