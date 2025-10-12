package in.sigma.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
@Primary
public class MySqlDao implements ReportDao{
    @Override
    public void getData() {
        System.out.println("Getting data from MySQL DB");
    }
}
