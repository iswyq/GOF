package wyq.strategy.strategyExample;

/**
 * 维护Strategy对象的引用
 *
 * @author WangYQ
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    // 上下文接口
    public void ContextInterface() {
        strategy.algorithmInterface();
    }
}
