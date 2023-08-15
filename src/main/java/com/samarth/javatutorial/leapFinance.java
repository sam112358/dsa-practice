//package main.java.com.samarth.javatutorial;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class leapFinance {
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> heights = new ArrayList<>();
//        ArrayList<Integer> currHeightPair = new ArrayList<>();
//        currHeightPair.add(7);
//        currHeightPair.add(0);
//        heights.add(currHeightPair);
//
//        currHeightPair.add(5);
//        currHeightPair.add(0);
//        heights.add(currHeightPair);
//
//        currHeightPair.add(3);
//        currHeightPair.add(1);
//        heights.add(currHeightPair);
//
//        System.out.println(solution(heights));
//    }
//
//    public static Integer solution(ArrayList<ArrayList<Integer>> heights){
//        HashMap<Integer, ArrayList<Integer>> heightPos = new HashMap<>();
//        ArrayList<Integer> sortedHeights = new ArrayList<>();
//        for(int i = 0; i < heights.size(); i++){
//            if(!heightPos.containsKey(heights.get(i).get(0))){
//                heightPos.put(heights.get(i).get(0), new ArrayList<Integer>());
//                sortedHeights.add(heights.get(i).get(0));
//            }
//            heightPos.put(heights.get(i).get(0), heightPos.get(heights.get(i).get(0)).add(heights.get(i).get(1)));
//
//        }
//
//        // Add sort
////        sortedHeights
//        //initialise to 0
//        int[] positions = new int[heights.size()];
//        int j;
//        for(int i = 0; i < sortedHeights.size(); i++){
//            // find out position to be filled from bottom
//            j = heights.size()-1;
//            ArrayList<Integer> temp = heightPos.get(sortedHeights[i]);
//        }
//
//    }
//}
