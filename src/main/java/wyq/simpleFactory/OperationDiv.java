package wyq.simpleFactory;

/**
 * 除法运算类
 *
 * @author WangYQ
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        if (numB == 0) {
            throw new RuntimeException("除数不可为0");
        }
        result = numA / numB;
        return result;
    }
}
