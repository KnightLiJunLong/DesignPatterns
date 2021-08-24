package im.knight.dp.template;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/8/24 10:38
 */
public abstract class AbstractClass {

    public void templateMethod() {
        specificMethod();
        abstractMethodOne();
        abstractMethodTwo();
    }

    public void specificMethod() {
        System.out.println("abs中的具体方法");
    }

    public abstract void abstractMethodOne();

    public abstract void abstractMethodTwo();
}
