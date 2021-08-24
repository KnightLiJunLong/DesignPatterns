package im.knight.dp.template;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/8/24 10:40
 */
public class ConcreteClass extends AbstractClass {


    @Override
    public void abstractMethodOne() {
        System.out.println("子类中方法1");
    }

    @Override
    public void abstractMethodTwo() {
        System.out.println("子类中方法2");
    }
}
