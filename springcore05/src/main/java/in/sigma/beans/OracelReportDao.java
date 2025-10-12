package in.sigma.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracelDao")
//@Primary
public class OracelReportDao implements ReportDao{
    @Override
    public void getData() {
        System.out.println("Getting Data from Oracel DB");
    }
}
