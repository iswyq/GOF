package wyq.strategy.strategyExample;

/**
 * 策略模式样例演示
 */
class ContextTest {
    public static void main(String[] args) {
        Context context;
        // 具体算法A的测试
        context = new Context(new ConcreteStrategyA());
        // 具体算法B的测试
        // context = new Context(new ConcreteStrategyB());
        // 具体算法A的测试
        // context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}