import com.gzk.dao.EmployeeMapper;
import com.gzk.pojo.Employee;
import com.gzk.utils.MybatisUtils;
import com.gzk.utils.UUIDUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.UUID;

public class MyTest {
    public static void main(String[] args) {

    }

    @Test
    public void test(){
        for (int i = 0; i < 6; i++) {
            System.out.println(UUIDUtils.getUUID());
        }
    }

    @Test
    public void getEmployeeById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        System.out.println(mapper.getEmployeeById("3aa1491a4adb47f89b0f7dab804bd9d9"));

        sqlSession.close();
    }
}
