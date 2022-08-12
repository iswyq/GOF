package wyq.factory;

/**
 * 乘法运算类
 *
 * @author WangYQ
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = numA * numB;
        return result;
    }
}
