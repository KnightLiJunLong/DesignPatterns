package im.knight.dp.adapter.obj;

import im.knight.dp.adapter.common.Adapter;
import im.knight.dp.adapter.common.Target;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/8/12 9:56
 */
public class ObjectAdapter implements Target {

    private final Adapter adapter;

    @Override
    public void request() {
        adapter.specificRequest();
    }

    public ObjectAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

}
