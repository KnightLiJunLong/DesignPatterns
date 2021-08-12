package im.knight.dp.adapter.obj;

import im.knight.dp.adapter.common.Adapter;
import im.knight.dp.adapter.common.Target;

/**
 * 对象类型的是适配器和类适配器最大的区别就是，
 * 我们在调用时，需要自己去先创建适配器对象，
 * 然后在实例化目标对象时，需要将我们创建的适配器给目标对象，
 * 然后在目标对象中对其调用。这样就降低了耦合度，且更易读
 * @description:
 * @author: lijunlong
 * @date: 2021/8/12 9:55
 */
public class Client {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        Target target = new ObjectAdapter(adapter);
        target.request();
    }

}
