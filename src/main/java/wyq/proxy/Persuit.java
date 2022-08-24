package wyq.proxy;

/**
 * 追求者
 * 追求者要做的动作通过实现接口来进行
 *
 * @author WangYQ
 */
public class Persuit implements GiveGift {
    SchoolGirl mm;

    public Persuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.printf("%s,送你洋娃娃", mm.getName());
    }

    @Override
    public void giveFlowers() {
        System.out.printf("%s,送你鲜花", mm.getName());
    }

    @Override
    public void giveChocolate() {
        System.out.printf("%s,送你巧克力", mm.getName());
    }
}
