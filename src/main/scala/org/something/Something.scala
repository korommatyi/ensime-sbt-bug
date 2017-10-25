import org.apache.spark.sql.DataFrame

object Counter {
  def count(df: DataFrame): Long = df.count
}
