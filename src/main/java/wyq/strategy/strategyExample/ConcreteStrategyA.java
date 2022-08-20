package wyq.strategy.strategyExample;

/**
 * 具体算法A
 *
 * @author WangYQ
 */
public class ConcreteStrategyA extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法A的实现");
    }
}
