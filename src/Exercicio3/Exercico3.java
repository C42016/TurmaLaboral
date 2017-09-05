

package Exercicio3;
public class Exercico3 {
    public static int Somatorio(int n){
        if(n==0)
            return n;
                    return (n%10)+Somatorio(n/10);
    }
    
    public static void main(String[] args) {
      
        System.out.println(Somatorio(123));
    }
}
