public class Main {
    public static void main(String[] args) {
        Player pla1 = new Player();
        pla1.name = "Kylian Mbappe" ;
        pla1.age = 24 ;
        pla1.post = "ST" ;
        pla1.rank = 1 ;
        pla1.club = "Paris Saint-Germain" ;
        pla1.nationality = "French" ;
        pla1.ovr = 91 ;
        pla1.pass() ;
        pla1.shoot() ;
        pla1.jump() ;
        pla1.info() ;
    }
}