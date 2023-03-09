package PrakTikum;
public class Segitiga <A, T> {
    private A a;
    private T t;

    public A getA(){
        return a;
    }

    public T geT(){
        return t;
    }

    public void setSegitiga(A Alas, T Tinggi){
        this.a = Alas;
        this.t = Tinggi;
    }


    public int getResultAsInt(){
        return (int) a * (int) t / 2;
    }
    
    public double getResultAsDouble(){
        return (double) a * (double) t / 2;
    }
    
}
