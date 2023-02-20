//package frequency;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//    }
//
//    private static List<Integer> freqQuery(List<List<Integer>> queries) {
//            final int OPERATIONINDEX = 0;
//            final int ELEMENTINDEX = 1;
//            List<Integer> items = new ArrayList<Integer>();
//            List<Integer> output = new ArrayList<Integer>();
//            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//            for (int i=0; i<queries.size() - 1; i++) {
//                int element = queries.get(i).get(ELEMENTINDEX);
//                int operation = queries.get(i).get(OPERATIONINDEX);
//                switch(operation) {
//                    case 1:
//                        items.add(element);
//                        if (map.get(element) != null)
//                            map.put(element, map.get(element) + 1);
//                        else
//                            map.put(element, 1);
//                        break;
//                    case 2:
//                        for (int j=0; j<items.size() - 1; j++) {
//                            if (items.get(j) == element) {
//                                items.remove(j);
//                                break;
//                            }
//                        }
//                    case 3:
//                        for (int p=0; p<map.size()-1; p++) {
//                            if (map.get(p) == element)
//                                output.add(1);
//                            else
//                                output.add(0);
//                        }
//                }
//            }
//            return output;
//        }
//    }
//}
