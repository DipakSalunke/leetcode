import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

class Solution {
    public static int findLongestChain(int[][] pairs) {
        if (pairs.length == 1) return 1;
        Pair[] pairArr = new Pair[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            pairArr[i] = new Pair(pairs[i][0], pairs[i][1]);
        }
        Arrays.sort(pairArr, (pair1, pair2) -> {
            Integer abs = Math.abs(pair1.end - pair1.start);
            Integer abs2 = Math.abs(pair2.end- pair2.start);
            return abs.equals(abs2)
                    ? pair1.start.compareTo(pair2.start)
                    : abs.compareTo(abs2);
        });
        System.out.println(Arrays.toString(pairArr));
        int count = 1;
        int currentEnd = pairArr[0].end;
        for (int i = 0; i < pairArr.length; i++) {
            if (pairArr[i].start > currentEnd) {
                count++;
                currentEnd = pairArr[i].end;
            }
        }
        return count;
    }

    static class Pair {
        Integer start, end = 0;

        Pair(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "start=" + start +
                    ", end=" + end +
                    '}' + '\n';
        }
    }

    public static void main(String[] args) {
        int a = findLongestChain(new int[][]{{-6,9},{1,6},{8,10},{-1,4},{-6,-2},{-9,8},{-5,3},{0,3}});
        System.out.println(a);
    }
}