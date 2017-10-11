package com.meiyou.atom;

import com.meiyou.atom.converts.TaskConvert;
import com.meiyou.atom.converts.UIThreadConvert;

/**
 * Created by Linhh on 2017/10/11.
 */

public final class AtomBuilder {
    public TaskConvert taskConvert;
    public UIThreadConvert uiThreadConvert;

    public AtomBuilder setTaskConvert(TaskConvert taskConver){
        this.taskConvert = taskConver;
        return this;
    }

    public AtomBuilder setUIThreadConvert(UIThreadConvert uiThreadConvert){
        this.uiThreadConvert = uiThreadConvert;
        return this;
    }
}
