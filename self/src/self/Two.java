package self;

public class Two {
    String name;
    int koku;
    int suu;
    int eng;
    
    
    public Two(String name, int koku, int suu, int eng) {
        this.name = name;
        this.koku = koku;
        this.suu = suu;
        this.eng = eng;
    }
    
    public Two(String name) {
        this(name,0,0,0);        
    }
   
    public void show() {
        System.out.println(name + ":" + koku + "," + suu + ","+ eng);
    }
}