import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

/**
 * description:
 *
 * @author zgw
 * date 2019/7/22
 */
public class TestUUID {

    @Test
    public void uuidTest(){
        //
        UUID uuid1 = UUID.randomUUID();
        System.out.println(uuid1.toString());

        //指定高64位和低64位生成id
        UUID uuid2 = new UUID(10, 10);
        System.out.println(uuid2.toString());
    }

    @Test
    public void randomTest() {
        for (int i=0;i<10;i++) {
            System.out.println(Math.random());
        }


    }

    /**
     * 内置两种随机数算法，NativePRNG和SHA1PRNG
     */
    @Test
    public void testSecureRandom() {
        SecureRandom secureRandom = new SecureRandom();
        int i = secureRandom.nextInt();
        System.out.println(i);
    }


}
