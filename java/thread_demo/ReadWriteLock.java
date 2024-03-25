package thread_demo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();

        Thread t1 = new Thread(() -> {
            readLock.lock();
            System.out.println(Thread.currentThread().getName() + " read lock ok");
            LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(1));
            readLock.unlock();
        });

        Thread t2 = new Thread(() -> {
            readLock.lock();
            System.out.println(Thread.currentThread().getName() + " read lock ok");
            LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(1));
            readLock.unlock();
        });

        Thread t3 = new Thread(() -> {
            writeLock.lock();
            System.out.println(Thread.currentThread().getName() + " write lock ok");
            writeLock.unlock();
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
