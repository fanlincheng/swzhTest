import java.util.ArrayList;
import java.util.List;

public class Raw {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Raw() {
    }

    public Raw(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + "," + b;
    }

}
class main{
    private static ArrayList<Raw> find(List<Raw> rawlist) {
        ArrayList<Raw> resRaw=new ArrayList<>();
        for(Raw raw:rawlist){
            if (raw.getB() >= 10 && raw.getB() < 50 && (raw.getA() == 1000 || raw.getA() == 2000 || raw.getA() == 3000)) {
                resRaw.add(raw);
            }
        }
        return resRaw;
    }

    public static void main(String[] args) {
        ArrayList<Raw> raws=new ArrayList<Raw>();
        raws.add(new Raw(1000,20));
        raws.add(new Raw(1000,20));
        raws.add(new Raw(2000,16));
        ArrayList<Raw> resRaws = find(raws);
        for(Raw raw:resRaws){
            System.out.println(raw);
        }

    }
}





