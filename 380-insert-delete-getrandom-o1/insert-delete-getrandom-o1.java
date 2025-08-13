class RandomizedSet {
    private List<Integer> list ;
    private Map<Integer,Integer> ind;
    private Random random;


    public RandomizedSet() {
        list = new ArrayList<>();
        ind = new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(ind.containsKey(val)) return false;
        ind.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
         Integer i = ind.get(val);
         if (i == null) return false;
         int lastint = list.size()-1;
         int lastvalue = list.get(lastint);

         list.set(i,lastvalue);
         ind.put(lastvalue,i);

         list.remove(lastint);
         ind.remove(val);
         return true;
    }
    
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */