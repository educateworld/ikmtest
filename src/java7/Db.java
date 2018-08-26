package java7;

import java.sql.Connection;
import java.sql.ResultSet;

public interface Db {
ResultSet getData(String query);
void executeProcedure(String p);
Connection getConnection();
}
