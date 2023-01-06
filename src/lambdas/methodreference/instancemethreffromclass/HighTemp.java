package lambdas.methodreference.instancemethreffromclass;

public class HighTemp {
    private int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    public boolean sameTemp(HighTemp hTemp2) {
        return this.hTemp == hTemp2.hTemp;
    }

    public boolean lessThanTemp (HighTemp hTemp2) {
        return this.hTemp < hTemp2.hTemp;
    }

    public int gethTemp() {
        return hTemp;
    }

    public void sethTemp(int hTemp) {
        this.hTemp = hTemp;
    }
}
