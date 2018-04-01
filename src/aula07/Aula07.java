package aula07;
public class Aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; 
                
        l[0] = new Lutador("Pretty Boy", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", 28, 1.93f, 81.7f, 13, 0, 2);
        l[4] = new Lutador("UFOcobol", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", 30, 1.81f, 105.7f, 12, 2, 4);
        
        
        //l[0].status();
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4],l[5]);
        UEC01.lutar();
    }
    
}
