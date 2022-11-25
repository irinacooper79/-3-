package Transport;

import java.util.ArrayList;
import java.util.Random;

public class CashRegistry{

    private final static Random RANDOM = new Random();
    private final list <Queue<String>>registries;
    public CashRegistry(){
        int initialCapacity;
        this.registries = new ArrayList<>(initialCapacity: В);

        for (int i=0; i<3; i++){
            this.registries.add(new LinkedList<>());}


    }

    public void addPerson(String name){
        if (allRegistriesFull()){
            System.out.ptintln("Зовем Галю");
            Queue<String>newQueue = newLinkedList<>();
            newQueue.add(name);
            this.registries.add(newQueue);
        } else {
            Queue<String> minQueue = selectMinQueue();
            minQueue.add(name);
        }
    }
    public void remove(){ this.registries.get(RANDOM.nextInt(origin:0, registries.size()).poll();
    }

    private Queue<String> selectMinQueue(){
        int min = Integer.MAX_VALUE;
        Queue <String> target=null;
        for ( Queue <String> queue:registries){
            if (queue.size() < min){
                min = queue.size();
                target = queue;
            }
        }
        return target;

        private boolean allRegistriesFull(){
            for (Queue <String> queue: registries){
                if (queue.size ()<5){
                    return false;
                }
            }
            return true;
        }
    }
}