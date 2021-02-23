package sample;

/**
 * Created by orcad on 23.02.2021.
 */
public class Invalid extends Allowance {
    private Integer groupNumber;

    public Invalid(double ratio, double minAllowance, Integer groupNumber) {
        super(ratio, minAllowance);
        this.groupNumber = groupNumber;
    }

    Invalid() {
        groupNumber = 1;
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public double getAllowance() {
        if (groupNumber == 1) {
            return super.getAllowance() * 1.3;
        } else if (groupNumber == 2) {
            return super.getAllowance() * 1.2;
        }
        return super.getAllowance();
    }
}

