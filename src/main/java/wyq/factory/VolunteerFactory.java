package wyq.factory;

/**
 * 具体的工厂（生产社区志愿者）
 * 负责生产具体的产品。
 *
 * @author WangYQ
 */
public class VolunteerFactory implements Factory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
