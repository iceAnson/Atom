package com.meiyou.atom.converts;

import com.meiyou.atom.AtomTaskNode;

/**
 * Created by Linhh on 2017/10/11.
 */

public interface UIThreadConvert {
    public void submitTask(AtomTaskNode node, Runnable runnable);
}
