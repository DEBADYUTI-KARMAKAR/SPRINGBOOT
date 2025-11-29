package in.sigma.generators;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.query.Query;
import java.io.Serializable;
public class StudentIdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session,Object object){
        String prefix = "STU_";
        Query<String>  query = session.createQuery(
                "select s.studentId from Student s order by s.studentId desc",
                String.class
        );
        query.setMaxResults(1);
        String lastIndex =  query.uniqueResult();
        System.out.println(lastIndex);
        int suffix=1;
        if(lastIndex != null){
            suffix = Integer.parseInt(lastIndex.replace(prefix,""))+1;
        }
        return prefix+suffix;
    }
}
