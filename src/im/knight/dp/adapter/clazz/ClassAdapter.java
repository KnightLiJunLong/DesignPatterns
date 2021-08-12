package im.knight.dp.adapter.clazz;

import im.knight.dp.adapter.common.Adapter;
import im.knight.dp.adapter.common.Target;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/8/12 9:26
 */
public class ClassAdapter extends Adapter implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
