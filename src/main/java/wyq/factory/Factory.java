package wyq.factory;

/**
 * 工厂的抽象类
 * 所有的工厂都是该接口的实现类
 *
 * @author WangYQ
 */
public interface Factory {
    // 抽象接口生产抽象的产品(LeiFeng)
    LeiFeng createLeiFeng();
}
