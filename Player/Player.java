public class Player {
    String name;
    int age ;
    String  post ;
    int rank ;
    String club ;
    String  nationality ;
    int ovr ;

    void pass(){
        System.out.println(name + " Passing...") ;
    }

    void shoot(){
        System.out.println(name + " Shooting...") ;
    }

    void jump(){
        System.out.println(name + " Jumping...") ;
    }

    void info(){
        System.out.println(name +", aged " + age + ", plays as a " + post + ", currently with " + club + ". The " + nationality + " player boasts an impressive overall " + ovr +" rating, and his ranking is " + rank + ".") ;
    }
}