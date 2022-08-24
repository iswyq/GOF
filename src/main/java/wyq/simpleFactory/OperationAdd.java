package wyq.simpleFactory;

/**
 * 加法运算类
 *
 * @author WangYQ
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = numA + numB;
        return result;
    }
}
