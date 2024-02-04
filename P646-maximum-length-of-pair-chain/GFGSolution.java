import java.util.Arrays;
import java.util.Comparator;

class GFGSolution {
    public static int findLongestChain(int[][] pairs) {
        if (pairs.length == 1) return 1;
        Pair[] pairArr = new Pair[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            pairArr[i] = new Pair(pairs[i][0], pairs[i][1]);
        }
        Arrays.sort(pairArr, Comparator.comparing(pair -> pair.end));
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

    public static void main(String[] args) {
        System.out.println(findLongestChain(new int[][]{{-6, 9}, {1, 6}, {8, 10}, {-1, 4}, {-6, -2}, {-9, 8}, {-5, 3}, {0, 3}}));
    }

    static class Pair {
        Integer start, end;
        Pair(int s, int e) {
            start = s;
            end = e;
        }
    }
}