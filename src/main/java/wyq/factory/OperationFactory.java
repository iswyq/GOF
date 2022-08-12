package wyq.factory;

/**
 * 工厂类
 * 根据用户输入的操作符返回不同的对象
 *
 * @author WangYQ
 */
public class OperationFactory {
    public static Operation createOperation(String oper) {
        Operation op;
        switch (oper) {
            case "+":
                op = new OperationAdd();
                break;
            case "-":
                op = new OperationSub();
                break;
            case "*":
                op = new OperationMul();
                break;
            case "/":
                op = new OperationDiv();
                break;
            default:
                throw new RuntimeException("请选择正确的运算");
        }
        return op;
    }
}
