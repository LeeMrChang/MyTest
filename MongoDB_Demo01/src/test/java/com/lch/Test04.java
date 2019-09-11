package com.lch;

/**
 * @ClassName:Test04
 * @Author：Mr.lee
 * @DATE：2019/08/16
 * @TIME： 9:51
 * @Description: TODO
 */
public class Test04 extends Thread {

    public static void main(String[] args) {

        new Test04().start();
    }

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程开启");
        }
    }
}
