package wyq.factory;

/**
 * @author WangYQ
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = numA - numB;
        return result;
    }
}
