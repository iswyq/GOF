package wyq.factory;

/**
 * @author WangYQ
 */
public abstract class Operation {
    public double numA = 0;
    public double numB = 0;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public abstract double getResult();
}
