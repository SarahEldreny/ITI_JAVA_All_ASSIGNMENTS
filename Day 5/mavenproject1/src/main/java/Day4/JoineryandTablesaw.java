package Day4;

import static Day4.JoineryandTablesaw.addColumns;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import joinery.DataFrame;
import tech.tablesaw.api.IntColumn;
import tech.tablesaw.api.Table;
import tech.tablesaw.columns.Column;

public class JoineryandTablesaw {

    public static void main(String[] args) {
        try {
            DataFrame<Object> df = DataFrame.readCsv("src\\main\\java\\ExtraSources\\titanic.csv");
            System.out.println(df.describe());
            DataFrame<Object> df1 = df.retain("pclass", "age", "survived");
            //System.out.println(df1.describe());
            DataFrame<Object> df2 = df.retain("body", "parch", "fare");
            df2 = AddColumns(df2);
            System.out.println(df2.describe());
            df1 = AddColumns(df1);
            System.out.println(df1.describe());

            //in python like numpy.hstack() which joining the fourth column in df1 and df2 that I've added above 
            DataFrame<Object> df3 = df1.joinOn(df2, DataFrame.JoinType.RIGHT, "New Column");
            System.out.println(df3.describe());
        } catch (IOException ex) {
            Logger.getLogger(JoineryandTablesaw.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Table titanicData = Table.read().csv("src\\main\\java\\ExtraSources\\titanic.csv");
            System.out.println(titanicData.structure());
            System.out.println(titanicData.summary());
            System.out.println(titanicData = addColumns(titanicData));
            Table table1 = titanicData.select("pclass", "age", "survived");
            Table table2 = titanicData.select("body", "parch", "fare");
            table1 = addColumns(table1);
            table2 = addColumns(table2);
            Table t = table1.joinOn("New Column").inner(table2);
            System.out.println(t.summary());

        } catch (IOException ex) {
            Logger.getLogger(JoineryandTablesaw.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static DataFrame AddColumns(DataFrame df) {
        List<Integer> addColumn = new ArrayList<Integer>();
        for (int i = 0; i < df.length(); i++) {
            addColumn.add(i + 1);
        }
        return df.add("New Column", addColumn);
    }

    public static Table addColumns(Table titanicData) {
        int rowCount = titanicData.rowCount();
        int[] arr = new int[rowCount];
        for (int i = 0; i < rowCount; i++) {
            arr[i] = i + 1;
        }
        IntColumn c = IntColumn.create("New Column", arr);
        titanicData.insertColumn(titanicData.columnCount(), c);

        return titanicData;
    }
}
