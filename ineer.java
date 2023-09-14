public class ineer{
    public static void main(String[] args) {

        ABC abc = new ABC();

        ABC.XYZ xyz = abc.new XYZ();

        System.out.println(abc.a);
        
        xyz.setdata();
    }
}

class ABC {
    int a =1000;

    class XYZ{
        void setdata(){
            System.out.println("ineer class XYZ");
        }
    }
}
