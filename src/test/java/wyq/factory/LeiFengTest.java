package wyq.factory;

/**
 * 学雷锋行为工厂模式测试
 * 优点：
 * 1.可以只改一行代码就可以完成对象的切换。从大学生志愿者切换到社区志愿者
 */
class LeiFengTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.freeMemory();
        // 大学生志愿者生产工厂
        UndergraduateFactory undergraduateFactory = new UndergraduateFactory();
        LeiFeng student = undergraduateFactory.createLeiFeng();
        student.buyRice();
        student.sweep();
        student.wash();
        // 社区志愿者
        VolunteerFactory volunteerFactory = new VolunteerFactory();
        LeiFeng volunteer = volunteerFactory.createLeiFeng();
        volunteer.buyRice();
        volunteer.wash();
        volunteer.sweep();
    }
}