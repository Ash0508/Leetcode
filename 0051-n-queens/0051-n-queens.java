import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {

        char[][] b = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();
        nqueen(b, 0, ans);
        return ans;
    }

    private boolean issafe(char[][] b, int row, int col) {
        int n = b.length;
        for (int j = 0; j < n; j++) {
            if (b[row][j] == 'Q') return false;
        }
        for (int i = 0; i < n; i++) {
            if (b[i][col] == 'Q') return false;
        }
        int i = row;
        int j = col;
        while (i >= 0 && j < n) {
            if (b[i][j] == 'Q') return false;
            i--;
            j++;
        }
        i = row;
        j = col;
        while (i < n && j < n) {
            if (b[i][j] == 'Q') return false;
            i++;
            j++;
        }
        i = row;
        j = col;
        while (i < n && j >= 0) {
            if (b[i][j] == 'Q') return false;
            i++;
            j--;
        }
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (b[i][j] == 'Q') return false;
            i--;
            j--;
        }
        return true;
    }

    private void nqueen(char[][] b, int row, List<List<String>> ans) {
        int n = b.length;
        if (row == n) {
            List<String> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String str = "";
                for (int j = 0; j < n; j++) {
                    str += b[i][j];
                }
                l.add(str);
            }
            ans.add(l);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (issafe(b, row, j)) {
                b[row][j] = 'Q';
                nqueen(b, row + 1, ans);
                b[row][j] = '.';
            }
        }
    }
}
