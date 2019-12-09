
package java2;


public class Java2 {
public int java2(int a){
    int rows=4;
    for(int i=1; i<= rows; ++i){
        for(int j = 1; j<=i; ++j){
            System.out.print("* ");
        }
        System.out.println();
    }
    int line =3;
    for (int i = line; i >= 1; --i) {
        for(int j = 1; j <=i; ++j){
            {
                System.out.print("* ");
            }
        }
        System.out.println();                     
    }
    return 0;
}
    public void java2(){
        int rows=4;
        int q=1;
        int w=1;
        while(q<=rows){
            System.out.println();
            ++q;
        }
        int lines=3;
        while(w<=rows){
        System.out.println();
        w--;
        }
        return ;
    }
        public void java2 (byte a){
            int rows=4;
            int z=1;
            do {
                System.out.println();
                z++;
                 }while(z<=rows);
            
            int lin=3;
            int x=1;
            do{
                System.out.println();
                x--;
            } while (x<=rows);
        }
    public static void main(String[] args) {
       Java2 p = new Java2();
       System.out.println(p.java2(0));
       System.out.println(p.java2(1));
       System.out.println(p.java2(2));
    }
    }
    

