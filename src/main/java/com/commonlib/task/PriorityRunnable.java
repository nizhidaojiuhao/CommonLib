package com.commonlib.task;

/**
 * Created by songdehuai on 19/04/12.
 * 带有优先级的Runnable类型(仅在task包内可用)
 */
/*package*/ class PriorityRunnable implements Runnable {

    /*package*/ long SEQ;

    public final Priority priority;
    private final Runnable runnable;

    public PriorityRunnable(Priority priority, Runnable runnable) {
        this.priority = priority == null ? Priority.DEFAULT : priority;
        this.runnable = runnable;
    }

    @Override
    public final void run() {
        this.runnable.run();
    }
}
