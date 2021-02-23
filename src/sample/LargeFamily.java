package sample;

/**
 * Created by orcad on 23.02.2021.
 */
public class LargeFamily extends Allowance {
    private int numberOfChildren;

    public LargeFamily(double ratio, double minAllowance, int numberOfChildren) {
        super(ratio, minAllowance);
        this.numberOfChildren = numberOfChildren;
    }

    LargeFamily() {
        this.numberOfChildren = 3;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    @Override
    public double getAllowance() {
        if (numberOfChildren > 2 && numberOfChildren < 6) {
            return super.getAllowance() * 1.1;
        } else if (numberOfChildren > 5) {
            return super.getAllowance() * 1.2;
        }
        return super.getAllowance();
    }
}
