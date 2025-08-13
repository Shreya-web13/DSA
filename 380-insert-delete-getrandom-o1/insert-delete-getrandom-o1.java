import java.util.*;

class RandomizedSet {
     private Set<Integer> set ;
     private Random random;

    public RandomizedSet() {
       set = new HashSet<>();
       random = new Random();
    }
    
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }
         set.add(val);
         return true;
    }
    
    public boolean remove(int val) {
         if(!set.contains(val)){
            return false;
        }
            set.remove(val);
            return true;
        
        
    }
    
    public int getRandom() {
       if(set.isEmpty()){
         throw new NoSuchElementException("Set is empty");
       }
       int index = random.nextInt(set.size());
       int i=0;
       for(int j : set){
        if(i==index){
            return j;
        }
        i++;
       } 
        throw new RuntimeException("Unexpected error");
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */