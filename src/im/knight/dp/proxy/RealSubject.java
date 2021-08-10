package im.knight.dp.proxy;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/8/10 14:14
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("这个是真的主题");
    }
}
