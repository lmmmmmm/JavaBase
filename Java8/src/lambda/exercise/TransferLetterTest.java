package lambda.exercise;

/**
 * 使用Lambda将一个字符串转换为大写,去空格,截取字符串(2,4)
 *
 * @author lming.41032@gmail.com
 * @date 18-12-13 下午5:52
 */
public class TransferLetterTest {

    public static void main(String[] args) {
        String upperStr = TransferLetterTest.trans("hello world", (str) -> str.toUpperCase());
        System.out.println("将字符串转为大写:" + upperStr);
        String trimStr = TransferLetterTest.trans("\t\t\tabcde", (str) -> str.trim());
        System.out.println("将字符串去空格:" + trimStr);
        String subStr = TransferLetterTest.trans("真是开心的一天", (str) -> str.substring(2, 4));
        System.out.println("截取字符串:" + subStr);
    }

    public static String trans(String str, TransferLetter<String> transferLetter) {
        return transferLetter.getValue(str);
    }
}
