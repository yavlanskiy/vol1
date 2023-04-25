import groovy.sql.Sql
def sql = Sql.newInstance("url", "user", "pass")
def result = sql.rows("SELECT VERSION FROM VERSIONLIST")
result.each { row ->
  println row
}
sql.close()
