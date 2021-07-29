package jupai.dataprep;

import joinery.DataFrame;

import java.io.IOException;
import java.util.Date;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

public class JoineryExample {
    public static void main(String args[]){
        try {
            
          // readCSV Describe vgsales Data GroubBy Year Using Joinery
          DataFrame<Object>  df1= DataFrame.readCsv ("src/main/resources/data/vgsales.csv")
                    .retain("Year", "NA_Sales","EU_Sales","JP_Sales")
                    .describe ();
           System.out.println (df1.toString ());
            System.out.println ("=========================================================================================");
            // readCSV vgsales Data GroupBy Year and get mean  Using Joinery
           DataFrame<Object>  df= DataFrame.readCsv ("src/main/resources/data/vgsales.csv")
                    .retain("Year", "NA_Sales","EU_Sales","JP_Sales")
                    .groupBy(row ->row.get(0))
                    .mean ();
            df.iterrows ().forEachRemaining (System.out::println);
            
            
            System.out.println ("=========================================================================================");
            
            // readCSV vgsales Data  and  GetSummaryStatistics
            SummaryStatistics statistics = new SummaryStatistics();
      
            DataFrame.readCsv("src/main/resources/data/vgsales.csv")
                    .col("EU_Sales")
                    .stream()
                    .map(obj -> (Double)obj)
                    .forEach(statistics::addValue);

            System.out.println(statistics.getSummary()); 

            System.out.println ("=========================================================================================");
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
