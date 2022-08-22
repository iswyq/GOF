package wyq.decorator;

/**
 * T恤衫
 * 继承了服饰类
 *
 * @author WangYQ
 */
public class Tshirts extends Finery {
    public Tshirts(Person component) {
        super(component);
    }

    public Tshirts() {
    }

    @Override
    public void show() {
        System.out.println("T恤衫");
        super.show();
    }
}
