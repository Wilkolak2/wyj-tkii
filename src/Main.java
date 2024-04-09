public class Main {
    public static void main(String[] args) {
        try{
            System.out.println(silnia(-1));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }


    public static int silnia(int n){
        if(n < 0){
            throw new IllegalArgumentException("n must be greater than zero");
        }
        int wynik = 1;
        for(int i = 1; i <= n; i++){
            wynik *= i;
        }
        return wynik;
    }
}