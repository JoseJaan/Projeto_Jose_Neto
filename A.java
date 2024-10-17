public class A {
    int A1;
    float A2;

    public A(){
        A1 = 0;
        A2 = 0.0f;
    }

    public int getA1(){
        return A1;
    }

    public void setA1(int value){
        A1 = value;
    }

    public float getA2(){
        return A2;
    }

    public void setA2(float value){
        A2 = value;
    }

    public void MA1(){
        System.out.println("MA1");
    }

    public void MA2(){
        System.out.println("MA2");
    }

    public void MA3(){
        System.out.println("Alteração a classe A partir do clone");
    }
    public int getSoma(int x, int y){
        int z = x + y;
        return z;
    }
}
