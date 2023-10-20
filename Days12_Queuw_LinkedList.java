

package com.mycompany.days12_queuelinkedlistt;

import java.util.LinkedList;
import java.util.Queue;


public class Days12_QueueLinkedlistt {

    public static void main(String[] args) {
        Queue<Double>ifaQueue = new LinkedList<>();
        
        System.out.println("ifaQueue");
        
        ifaQueue.offer(34.47);
        ifaQueue.offer(56.68);
        ifaQueue.offer(125.347);
        System.out.println("ifaQueue");
        
        double value = ifaQueue.poll();
        System.out.println("POLL:" + value);
        System.out.println("ifaQueue");
        
        value = ifaQueue.peek();
        System.out.println(ifaQueue);
        
        ifaQueue.offer(2.34);
        System.out.println(ifaQueue);
    }
}

