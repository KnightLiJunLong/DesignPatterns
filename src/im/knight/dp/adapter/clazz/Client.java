package im.knight.dp.adapter.clazz;

import im.knight.dp.adapter.common.Target;

/**
 * 一个适配器adapter，一个目标接口target，一个中转站ClassAdapter 中转站继承适配器，实现目标接口，在适配器中有他自己适配器该有的逻辑， 在中转站中，我们只需要实现目标接口的方法，在其方法里调用适配器的方法
 *
 * @description:
 * @author: lijunlong
 * @date: 2021/8/12 9:23
 */
public class Client {

    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }

}
