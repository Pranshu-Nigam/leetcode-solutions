
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> final_ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int num: nums){
            int size = ans.size();
            for(int i = 0; i<size; i++){
                List<Integer> l = new ArrayList<>(ans.get(i));
                l.add(num);
                ans.add(l);
            }
        }

        Set<List> set = new HashSet<>();
        for(List i : ans){
            set.add(i);
        }
        for(List i : set){
            final_ans.add(i);
        }
        return final_ans;
    }

}