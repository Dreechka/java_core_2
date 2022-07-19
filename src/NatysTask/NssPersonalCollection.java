package NatysTask;

import java.math.BigDecimal;
import java.util.List;

public class NssPersonalCollection {
    public List<MyPrecious> nss;

    public NssPersonalCollection(List<MyPrecious> nss) {
        this.nss = nss;
    }

    public NssPersonalCollection(NssPersonalCollection np) {
        this(np.nss);
    }

    public void add(MyPrecious myPrecious) {
        nss.add(myPrecious);
    }

    public MyPrecious get(int i) {
        return nss.get(i);
    }

    public int size() {
        return nss.size();
    }

    public BigDecimal getCollectionValue() {
        BigDecimal counter = new BigDecimal(0);
        for (MyPrecious mp : nss) {
            counter = counter.add(mp.getValue());
        }
        return counter;
    }
}
