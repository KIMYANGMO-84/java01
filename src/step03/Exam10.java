/* 주제 : String 주요 도구 사용법4 */
package step03;

public class Exam10 {
    public static void main(String[] args){
        String s1 = "ABCDEFGHIJKKMKNOP";
        char c = s1.charAt(6);
        System.out.println(c);

        int i = s1.indexOf('K'); // 첫 번째로 만난 문자의 인덱스를 리턴한다.
        System.out.println(i);

        i = s1.lastIndexOf('K'); // 뒤에서 부터 찾는다. 처음만난 문자의 인덱스를 리턴한다.
        System.out.println(i);

        i = s1.indexOf("HIJ");
        System.out.println(i);

        i = s1.lastIndexOf("HIJ");
        System.out.println(i);

        String str = s1.substring(6); // 6번 부터 끝까지 문자열 추출
        String str1 = s1.substring(6,10); // index6~index9
        System.out.println(str);
        System.out.println(str1);
    }
}

/*

*/
