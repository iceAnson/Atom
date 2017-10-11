package com.meetyou.demo;

import android.util.Log;

import com.meiyou.atom.Atom;
import com.meiyou.atom.AtomBuilder;
import com.meiyou.atom.AtomTaskNode;
import com.meiyou.atom.converts.TaskConvert;
import com.meiyou.atom.converts.UIThreadConvert;

/**
 * Created by Linhh on 2017/10/11.
 */

public class Test {
    public static void init(){
        Atom.init(new AtomBuilder().setTaskConvert(new TaskConvert() {
            @Override
            public void submitTask(AtomTaskNode node, Runnable runnable) {
                Log.i("Test-Atom", "Atom is called " + node.taskName);
                runnable.run();
            }
        }).setUIThreadConvert(new UIThreadConvert() {
            @Override
            public void submitTask(AtomTaskNode node, Runnable runnable) {
                Log.i("Test-Atom", "Atom ui is called by ui" + node.taskName);
                runnable.run();
            }
        }));
    }
}
