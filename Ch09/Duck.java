public class Duck {
    private int pounds=6;
    private float floatability = 2.1F;
    private String name="Generic";
    private long[] feathers = {1,2,3,4,5,6,7};
    private boolean canFly = true;
    private int maxSpeed = 25;

    public Duck() {
	System.out.println("Type 1 duck");
    }

    public Duck(boolean fly) {
        canFly = fly;
	System.out.println("Type 2 duck");
    }
  
    public Duck(String n, long[] f) {
	name = n;
	feathers = f;
	System.out.println("Type 3 duck");
    }

    public Duck(int w, float f) {
	pounds = w;
	floatability = f;
	System.out.println("Type 4 duck");
    }

    public Duck(float density, int max) {
	floatability = density;
	maxSpeed = max;
	System.out.println("Type 5 duck");
    }
}
