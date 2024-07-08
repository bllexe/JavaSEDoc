package org.tigris.typeConversion;

public class Application {

    public static void main(String[] args) {

        //numeric primitives can be cast two different ways IMPLICIT casting happens when the source type has smaller range than the target type.

        byte byteValue=12;
        short shortValue=byteValue;
        int intValue=shortValue;
        long longValue=intValue;
        float floatValue=longValue;
        double doubleValue=floatValue;

        //EXPLICIT casting happens when the source type has larger range than the target type

        double dValue=12.0d;
        float fValue= (float) dValue;
        long lValue=(long) fValue;
        int iValue=(int) lValue;
        short sValue=(short) iValue;
        byte bValue=(byte) sValue;

        //object casting
        Object object =new String("hello world");
        String content=(String) object;
        System.out.println(content);   //-> Object -> String(DownCasting)



    }
}
