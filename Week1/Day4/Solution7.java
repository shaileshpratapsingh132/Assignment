import java.util.*;

class Solution7 {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {

            for (int j = row.size() - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }

            row.add(1);
        }

        return row;
    }

    public static void main(String[] args) {

        Solution7 obj = new Solution7();

        System.out.println(obj.getRow(3));
    }
}