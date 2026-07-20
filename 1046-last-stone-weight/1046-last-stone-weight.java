class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> hp=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            hp.offer(stone);
        }
        while(hp.size()>1){
            int x=hp.poll();
            int y=hp.poll();
            if(x!=y){
                hp.offer(x-y);
            }
        }
        return hp.isEmpty()?0:hp.poll();
    }
}