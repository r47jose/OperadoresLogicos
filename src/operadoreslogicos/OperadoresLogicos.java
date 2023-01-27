/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author Rodrigues
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        /*
        Operadores Lógicos
        && .E. true && false = false
        || .OU. false || true = true
        ^ .XOU. true ^ true = false
        ! .NAO. ! false = true
        Tabela verdade
        p q   |   p&&q  |  p || q  |  p ^ q     |     p  !p 
        V V   |     V   |    V     |    F       |     V   F
        V F   |     F   |    V     |    V       |     F   V
        F V   |     F   |    V     |    V       |
        F F   |     F   |    F     |    F       |
        */
        
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y && y<z) ?true:false;
        System.out.println(r);
        r = (x<y ^ y<z) ?true:false;
        System.out.println(r);
    }
    
}
