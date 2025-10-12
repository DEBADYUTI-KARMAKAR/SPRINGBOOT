package in.sigma.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
//    @Autowired
//    @Qualifier("mysqlDao")
    private ReportDao reportDao;

//    @Autowired
    public void setReportDao(ReportDao reportDao){
        this.reportDao = reportDao;
    }
//    @Autowired
    public  ReportService(ReportDao reportDao){
        System.out.println("Cons injection");
        this.reportDao = reportDao;
    }
//    public  ReportService(){
//        System.out.println("Cons injection 2");
//        this.reportDao = reportDao;
//    }

    public void generateReport(){
        reportDao.getData();
        System.out.println("Report generated...");
    }

}
