package wyq.simpleFactory;

/**
 * 工厂模式测试
 */
class OperationFactoryTest {
    public static void main(String[] args) {
        Operation op;
        // 测试加法
        // op = OperationFactory.createOperation("+");
        // op = OperationFactory.createOperation("-");
        // op = OperationFactory.createOperation("*");
        op = OperationFactory.createOperation("/");
        op.numA = 1;
        op.numB = 2;
        double result = op.getResult();
        System.out.println(result);
    }
}