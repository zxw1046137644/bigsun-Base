import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;

public class day1GenericityTest {


    /**
     * 泛型类
     * @param <T>
     */
    class order<T,Y>{
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setOrderT(T orderT) {
            this.orderT = orderT;
        }

        public order(String name, int age, T orderT) {
            this.name = name;
            this.age = age;
            this.orderT = orderT;
        }

        public order(){}
        String name;
        int age;
        T orderT;



    }


    class subOrder<T, Y> extends order<T,Y>{//继承泛型类

    }
    @Test
    public void test(){
        order<String,Object> or= new order();
        or.setOrderT("1");
    }
}
