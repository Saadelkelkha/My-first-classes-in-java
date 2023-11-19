public class Rectangle {
    float longueur ;
    float largeur ;
    
    public float Perimetre () {
        float P = (this.largeur + this.longueur) * 2 ;
        return P ; 
    }

    public float Aire () {
        float A = this.largeur * this.longueur ;
        return A ;
    }

    
    public boolean IsCarre () {
        if ( this.largeur == this.longueur ) {
            return true ;
        }else {
            return false ;
        }
    }

    void AfficheRectangle () {
        System.out.println("longueur :" + longueur ) ;
        System.out.println("largeur :" + largeur ) ;
        System.out.println("Perimetre :" + Perimetre() ) ;
        System.out.println("Aire :" + Aire() ) ;
        if (IsCarre() == true ) {
            System.out.println("Il s'agit d'un carre") ;
        } else {
            System.out.println("Il ne s'agit pas d'un carre") ;
        }
    }

    
}
