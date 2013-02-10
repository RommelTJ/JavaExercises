abstract class Animal {
    private int picture=0;
    private int food=0;
    private int hunger=0;
    private int boundaries=0;
    private int location=0;

    public abstract void makeNoise();
    public abstract void eat();
    public void sleep() {
	System.out.println("This animal is sleeping.");
    }
    public abstract void roam();
}
