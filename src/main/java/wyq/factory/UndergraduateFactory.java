package wyq.factory;

/**
 * 具体的工厂（学雷锋的大学生）
 * 生产具体的产品
 *
 * @author WangYQ
 */
public class UndergraduateFactory implements Factory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
