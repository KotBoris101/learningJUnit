public class Numbers {
    public int sum(int n){
        int rez = 0;
        for (int i = 1; i<n; i++){
            rez+=i;
        }
        return rez;
    }
    public double factorial(int n){
        double rez = 0.0d;
        for (int i = 1; i<n; i++){
            rez*=i;
        }
        return rez;
    }

    public void noneTestMetod(){
        System.out.println("Этот метод не тестируется");
    }
}
