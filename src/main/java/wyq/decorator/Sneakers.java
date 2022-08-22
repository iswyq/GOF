package wyq.decorator;

/**
 * T恤衫
 * 继承了服饰类
 *
 * @author WangYQ
 */
public class Sneakers extends Finery {
    public Sneakers(Person component) {
        super(component);
    }

    public Sneakers() {

    }

    @Override
    public void show() {
        System.out.println("穿破鞋");
        super.show();
    }
}
