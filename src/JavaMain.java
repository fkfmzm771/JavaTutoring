public class JavaMain {
    public static void main(String[] args) {

        //논리형
        boolean p_bool = true;   // true or false (1byte)

        //정수형
        char p_char = '한';       //\u0000 ~ \uffff (0~65,535)   유니코드 저장(쉽게 한글자)  (2byte)
        byte p_byte = -128;      //-128 ~ 127  (1byte)
        short p_short = 32700;    //-32,768 ~ 32,767   (2byte)
        int p_int = 554545544;    //-2,147,483,648 ~ 2,147,483,647   (4byte)
        long p_long = 8888888888878787L;  //-9223372036854775808 ~ 9223372036854775807 (끝자리에 L,l)   (8byte)

        //실수형
        float p_float = 12.12121f;   //1.4E-45 ~ 3.4028235E38   (끝자리에 F,f) (4byte)
        double p_double = 232323.23223244244;    //4.9E-324 ~ 1.7976931348623157E308    (끝자리에 D,d - 생략가능) (8byte)


//        자동형변환이 가능한 방향
//        byte(1byte) -> short(2byte) -> int(4byte) -> long(8byte) -> float(4byte) -> double(8byte)
//        char(2byte) -> int(4byte)

        System.out.println((int)p_char);



    }
}
