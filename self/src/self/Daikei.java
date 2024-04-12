package self;

public class Daikei {
    int jyotei;
    int katei;
    int takasa;
    
    
    public Daikei(int jyotei, int katei, int takasa) {
        this.jyotei = jyotei;
        this.katei = katei;
        this.takasa = takasa;
    }
    
    public int getMenseki() {
       return (jyotei + katei) * takasa / 2;
    }
        
}