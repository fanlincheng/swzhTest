import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 为了 方便进行插入操作使用linkedList
 * 使用二分查找寻找插入的位置
 */
public class Test3 {
    private static LinkedList<Raw> find(List<Raw> rawlist) {
        LinkedList<Raw> resRaw = new LinkedList<>();
        for (Raw raw : rawlist) {
            if (raw.getA() == 1000 || raw.getA() == 2000 || raw.getA() == 3000) {
                if (raw.getB() < 10) {
                    break;
                }
                if (raw.getB() < 50) {
                    binSearch(raw, resRaw);

                }
            }
        }
        return resRaw;
    }

    private static void binSearch(Raw raw, LinkedList<Raw> raws) {
        int b = raw.getB();
        int low = 0; //第一个下标
        if (raws.isEmpty()) {
            raws.add(raw);
            return;
        }
        int high = raws.size() - 1;
        int middle = 0;
        if (raws.get(low).getB() > b) {
            raws.add(0, raw);
            return;
        }
        if (raws.get(high).getB() < b) {
            raws.add(raw);
            return;
        }
        while (low <= high) {
            middle = (low + high) / 2;
            if (low == high) {
                raws.add(low, raw);
                return;
            } else if (raws.get(middle).getB() < b) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
    }

    public static void main(String[] args) {
        List<Raw> raws = new ArrayList<Raw>();
        raws.add(new Raw(1000, 12));
        raws.add(new Raw(1000, 30));
        raws.add(new Raw(2000, 16));
        raws.add(new Raw(2000, 11));
        raws.add(new Raw(2000, 9));
        LinkedList<Raw> resRaws = find(raws);
        for (Raw raw : resRaws) {
            System.out.println(raw);
        }
    }
}
