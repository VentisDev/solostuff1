package Reas;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//       var a = new int[][]{
//               {1, 2, 3},
//               {4, 5, 6},
//               {7, 8, 9},
//       };
//        System.out.println(a.length);

        var s = new Stringparse();
        var list = s.partitionLabels("properlyengagetheteamfight");
        System.out.println(list);
    }

    public int minReorder(int n, int[][] connections) {
        final int LOCATION = 0;
        final int DESTINATION = 1;
        int edgesChanged = 0;
        int nextToZero = 0;
        var list = new LinkedList<>();

        for (int i = 0; i< connections.length; i++) {
            if (connections[i][LOCATION] == 0 || connections[i][DESTINATION] == 0) {
                if (connections[i][DESTINATION] == 0)
                    edgesChanged+=1;
                else
                    nextToZero = connections[i][DESTINATION];
            }
        }
        return edgesChanged;
    }
}
