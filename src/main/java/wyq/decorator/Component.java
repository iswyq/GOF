package wyq.decorator;

/**
 * 被装饰的类抽象接口，在其中包含了最基本操作方法
 */
public interface Component {
    /**
     * 主体可以执行的操作
     */
    void operation();
}
