public class DuckGame {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        ((Squeakable) rubberDuck).squeak(); 
        
        Duck woodenDuck = new WoodenDuck();
        woodenDuck.display();
        woodenDuck.swim();
        
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.swim();
        ((Flyable) redHeadDuck).fly();    
        ((Quackable) redHeadDuck).quack(); 
        
        Duck lakeDuck = new LakeDuck();
        lakeDuck.display();
        lakeDuck.swim();
        ((Flyable) lakeDuck).fly();    
        ((Quackable) lakeDuck).quack(); 
    }
}
