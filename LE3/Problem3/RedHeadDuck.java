class RedHeadDuck extends Duck implements Flyable, Quackable {
   
    public void display() {
        System.out.println("I am a RedHead Duck.");
    }
    public void fly() {
        System.out.println("I am flying high!");
    }
    public void quack() {
        System.out.println("Quack! Quack! I am a RedHead Duck.");
    }
}