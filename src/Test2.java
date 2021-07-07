import java.util.ArrayList;
import java.util.List;

/**
 * 按顺序输入，进行优化
 */
public class Test2 {
    private static ArrayList<Raw> find(List<Raw> rawlist) {
        ArrayList<Raw> resRaw=new ArrayList<>();
        for(Raw raw:rawlist){
            if(raw.getA()==1000||raw.getA()==2000||raw.getA()==3000){
                if(raw.getB()<10){
                    break;
                }
                if(raw.getB()<50){
                    resRaw.add(raw);
                }
                if(raw.getB()>=50){
                    break;
                }
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

