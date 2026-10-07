package com.meteor.extrabotany.common.core.version;

public class ThreadUpdateChecker extends Thread {

    public ThreadUpdateChecker() {
        setName("ExtraBotany Version Checker Thread");
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        UpdateChecker.doneChecking = true;
    }

}
