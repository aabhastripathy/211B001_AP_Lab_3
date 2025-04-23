class LakeDuck extends Duck implements Flyable, Quackable {
   
    public void display() {
        System.out.println("I am a Lake Duck.");
    }
    public void fly() {
        System.out.println("I am flying over the lake!");
    }
    public void quack() {
        System.out.println("Quack! Quack! I am a Lake Duck.");
    }
}