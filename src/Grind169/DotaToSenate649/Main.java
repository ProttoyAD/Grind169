package Grind169.DotaToSenate649;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RDDRD"));
    }

    public static String predictPartyVictory(String senate) {
        Queue<Integer> radiants = new LinkedList<>();
        Queue<Integer> dires=new LinkedList<>();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R') radiants.offer(i);
            else dires.offer(i);
        }
        while(!radiants.isEmpty() && !dires.isEmpty()){
            if(radiants.peek()<dires.peek()){
                dires.poll();
                int x=radiants.poll();
                radiants.offer(x+senate.length());
            }
            else {
                radiants.poll();
                int x=dires.poll();
                dires.offer(x+senate.length());
            }
        }
        if(radiants.isEmpty()) return "Dire";
        else return "Radiant";
    }
}
